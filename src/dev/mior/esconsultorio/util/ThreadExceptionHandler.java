package dev.mior.esconsultorio.util;

import java.lang.Thread.UncaughtExceptionHandler;
import javax.swing.JOptionPane;

public class ThreadExceptionHandler implements UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        JOptionPane.showMessageDialog(null, "Ocorreu um erro desconhecido!", "Erro", JOptionPane.ERROR_MESSAGE);
        Logger.save(e);
    }

}
