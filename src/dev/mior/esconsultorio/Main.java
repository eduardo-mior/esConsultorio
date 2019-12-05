package dev.mior.esconsultorio;

import dev.mior.esconsultorio.database.Database;
import dev.mior.esconsultorio.defaults.Defaults;
import dev.mior.esconsultorio.gui.FramePrincipal;
import dev.mior.esconsultorio.gui.login.FrameDeLogin;
import dev.mior.esconsultorio.util.Logger;
import dev.mior.esconsultorio.util.ThreadExceptionHandler;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Mior
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicializarCapturadorDeExcecoes();
        inicializarBancoDeDados();
        inicializarInterfaceGrafica();
    }

    private static void inicializarCapturadorDeExcecoes() {
        Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler());
    }

    private static void inicializarBancoDeDados() {
        try {
            Database.init();
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar o banco de dados.", "Erro x001", 0);
            Logger.save(ex);
            System.exit(0);
        }
    }

    private static void inicializarInterfaceGrafica() {
        try {
            javax.swing.UIManager.setLookAndFeel(Defaults.THEME);
            new FramePrincipal().setVisible(true);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível iniciar a interface gráfica.", "Erro x002", 0);
            Logger.save(ex);
            System.exit(0); 
        }
    }

}
