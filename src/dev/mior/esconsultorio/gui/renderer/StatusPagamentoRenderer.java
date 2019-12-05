package dev.mior.esconsultorio.gui.renderer;

import dev.mior.esconsultorio.defaults.Defaults;
import dev.mior.esconsultorio.entity.ParcelaPagamento;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mior
 */
public class StatusPagamentoRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setHorizontalAlignment(CENTER);
        if (value instanceof ParcelaPagamento) {
            ParcelaPagamento pp = (ParcelaPagamento) value;
            String status;
            if (pp.getDataPagamento() != null) {
                if (pp.getDataVencimento() != null && pp.getDataPagamento().getTime() > pp.getDataVencimento().getTime()) {
                    status = "PAGO COM ATRASO";
                } else {
                    status = "PAGO";
                }
                setBackground(Color.GREEN);
            } else if (pp.getDataVencimento() != null && new Date().getTime() > pp.getDataVencimento().getTime()) {
                status = "ATRASADO";
                setBackground(Color.RED);
            } else {
                status = "PENDENTE";
                setBackground(Color.LIGHT_GRAY);
            }
            setValue(status);
        }
        return this;
    }

}