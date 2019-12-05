package dev.mior.esconsultorio.gui.renderer;

import dev.mior.esconsultorio.defaults.Defaults;
import java.awt.Component;
import java.util.Date;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mior
 */
public class HorarioRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setHorizontalAlignment(CENTER);
        if (value instanceof Date) {
            setValue(Defaults.H_FORMAT.format(value));
        }
        return this;
    }

}