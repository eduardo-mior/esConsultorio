package dev.mior.esconsultorio.defaults;

import dev.mior.esconsultorio.util.Imagem;
import java.awt.Image;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 *
 * @author Mior
 */
public final class Defaults {
    
    public static final Image ICON = Imagem.get("icon.png");
    public static final String THEME = "javax.swing.plaf.metal.MetalLookAndFeel"; //"javax.swing.plaf.nimbus.NimbusLookAndFeel";
    public static final String NAME = "Gerenciador de Consultórios";
    public static final Locale LOCALE = new Locale("pt", "BR");
    public static final SimpleDateFormat DH_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm", LOCALE);
    public static final SimpleDateFormat  H_FORMAT = new SimpleDateFormat("HH:mm", LOCALE);
    public static final SimpleDateFormat  D_FORMAT = new SimpleDateFormat("dd/MM/yyyy", LOCALE);
    public static final NumberFormat      M_FORMAT = DecimalFormat.getCurrencyInstance(LOCALE);
    
    static {
        H_FORMAT.setLenient(false);
        D_FORMAT.setLenient(false);
    }
    
}