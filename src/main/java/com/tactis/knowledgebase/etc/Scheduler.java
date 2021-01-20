package com.tactis.knowledgebase.etc;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.TimerTask;

public class Scheduler extends TimerTask {
    private static final DecimalFormat ROUNDED_DOUBLE_DECIMALFORMAT;

    static {
       
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
        otherSymbols.setDecimalSeparator('.');
        otherSymbols.setGroupingSeparator(',');
        ROUNDED_DOUBLE_DECIMALFORMAT = new DecimalFormat("####0.00", otherSymbols);
        ROUNDED_DOUBLE_DECIMALFORMAT.setGroupingUsed(false);
    }

    public Scheduler() {
        
    }

    public static long getMaxMemory() {
      
        return Runtime.getRuntime().maxMemory();
    }

    public static long getUsedMemory() {
      
        return getTotalMemory() - getFreeMemory();
    }

    public static long getTotalMemory() {
    
        return Runtime.getRuntime().totalMemory();
    }

    public static long getFreeMemory() {
   
        return Runtime.getRuntime().freeMemory();
    }

    public static void main(String[] args) {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
    }

    public void run() {
       
        System.out.println("MEMORY USED: " + getUsedMemory() / 1024L / 1024L + "Mb | MEMORY FREE: " + getFreeMemory() / 1024L / 1024L + "Mb");
    }
}
