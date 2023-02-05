package com.dgnsi.serac.controllers;



import com.dgnsi.serac.model.FileU;
import com.dgnsi.serac.utils.Utils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.Model;
import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.ElementSelectors;

import javax.xml.bind.*;
import java.io.File;
import java.io.IOException;

import com.dgnsi.serac.model.generated.*;


@Controller
public class XmlFile {

    @Value("${spring.path}")
    private String pathFile;

    @GetMapping(value = "ok")
    public String uploadFile() {
        return "upload";
    }

    @PostMapping(value = "upload")
    public String uploadImage(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        String name = file.getName();
        String ss = file.getSize() + " - "+ file.getOriginalFilename();
        System.out.println("**************** " + name + " - "+ss);

        FileU file2 = new FileU();
        file2.setName(file.getOriginalFilename());
        file2.setExtension(FilenameUtils.getExtension(file.getOriginalFilename()));
        String size = Utils.sizeFormat(file.getSize());
        file2.setSize(size);
        String path = pathFile+file.getOriginalFilename();
        file.transferTo(new File(path));
        //file2.setSize(FilenameUtils.);
        model.addAttribute("file", file2);

        System.out.println(pathFile);
        return "upload";
    }

    @GetMapping(value = "compare")
    public String compare() {
        String testXml = "<widget><id>1</id><name>demo</name></widget>";
        String nonIdenticalXml = "<widget><name>demo</name><id>2</id><ok><id>a</id></ok></widget>";

        Diff diffForSimilarity = DiffBuilder
                .compare(testXml)
                .withTest(nonIdenticalXml)
                .checkForSimilar()
                .withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byName))
                .build();

        System.out.println(diffForSimilarity.toString());
        return "upload";
    }

    @GetMapping(value = "compare2")
    public String compare2()  {
        String fileName= "UPMI-MUS_BIEN.2023.01.23.11.16.32.xml";


        File file = new File(pathFile+fileName);
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(MUSBIENSType.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            //MUSBIENSType mus_biens= (MUSBIENSType) jaxbUnmarshaller.unmarshal(file);

            ObjectFactory factory = new ObjectFactory();
            MUSBIENSType musbienType2 = factory.createMUSBIENSType();
            //jaxbUnmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Object result = jaxbUnmarshaller.unmarshal(file);
            System.err.println(result.getClass());



            musbienType2 = (MUSBIENSType) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException ex) {
            ex.printStackTrace();

        } catch (Exception exception) {
            exception.printStackTrace();
            exception.getCause();
        }

        return "upload";
    }
}
