package dev.mior.esconsultorio.gui.renderer;

import dev.mior.esconsultorio.defaults.Defaults;
import dev.mior.esconsultorio.entity.Produto;
import java.awt.Component;
import java.util.Collection;
import java.util.List;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Mior
 */
public class ValorProdutosRenderer extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        setHorizontalAlignment(CENTER);
        if (value instanceof Collection) {
            List<Produto> produtos = (List<Produto>) value;
            Double valorProdutos = 0D;
            for (Produto produto : produtos)
                valorProdutos += produto.getValor();
            setValue(Defaults.M_FORMAT.format(valorProdutos));
        }
        return this;
    }

}