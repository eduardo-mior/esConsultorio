package dev.mior.esconsultorio.gui.renderer;

/**
 *
 * @author Mior
 */
public class ListaRenderer extends AreaDeTextoRenderer {

    @Override
    public String getValue(Object value) {
        if (value == null) 
            return "";
        String text = value.toString().trim();
        return text.length() < 3 ? "" : text.substring(1, text.length() - 1);
    }

}