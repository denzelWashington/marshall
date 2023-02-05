package com.dgnsi.serac.utils;

import java.text.DecimalFormat;

public class Utils {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static String sizeFormat(long size) {
        double bytes = size;
        double kilobytes = (bytes / 1024);
        double megabytes = (kilobytes / 1024);
        return df.format(megabytes);
    }
}
