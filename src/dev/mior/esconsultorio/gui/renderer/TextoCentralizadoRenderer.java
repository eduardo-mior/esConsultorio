package dev.mior.esconsultorio.gui.renderer;

import java.awt.Component;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mior
 */
public class TextoCentralizadoRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setHorizontalAlignment(CENTER);
        return this;
    }

}