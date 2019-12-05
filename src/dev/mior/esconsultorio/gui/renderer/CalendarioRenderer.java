package dev.mior.esconsultorio.gui.renderer;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mior
 */
public class CalendarioRenderer extends DefaultTableCellRenderer {
        
    int realDay, realMonth, realYear, currentMonth, currentYear;
    
    public CalendarioRenderer(int realDay, int realMonth, int realYear, int currentMonth, int currentYear) {
        this.realDay = realDay;
        this.realMonth = realMonth;
        this.realYear = realYear;
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column){
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        if (value != null && !value.toString().trim().isEmpty() && selected) {
            setBackground(new Color(200, 200, 200));
        } else if (value != null && Integer.parseInt(value.toString().trim()) == realDay && currentMonth == realMonth && currentYear == realYear){ // Hoje
            setBackground(new Color(65, 180, 255));
        } else if (column == 0 || column == 6){ // Fim de semana
            setBackground(new Color(240, 255, 130));
        } else { // Dia normal
            setBackground(new Color(255, 255, 255));
        }
        return this;
    }

}