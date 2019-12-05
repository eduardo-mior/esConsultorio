package dev.mior.esconsultorio.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Mior
 */
public final class Logger {
    
    public static void save(Throwable e) {
        try {
            e.printStackTrace(new PrintStream(getFile()));
        } catch (FileNotFoundException ex) {}
    }
    
    private static File getFile() {
        File directory = new File("logs");
        if (!directory.exists()) 
            directory.mkdir();
        return new File(directory, getDate());
    }

    private static String getDate() {
        return DateFormat.getDateTimeInstance(2, 2).format(new Date()).replace('/', '-').replace(':', ';').concat(".log");
    }
    
}