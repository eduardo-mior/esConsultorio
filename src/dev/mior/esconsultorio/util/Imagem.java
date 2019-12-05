package dev.mior.esconsultorio.util;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Mior
 */
public final class Imagem {

    public static Image get(String nome) {
        return Toolkit.getDefaultToolkit().getImage(Imagem.class.getResource("/resources/" + nome));
    }
    
}