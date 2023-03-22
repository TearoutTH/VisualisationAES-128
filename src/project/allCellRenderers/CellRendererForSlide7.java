package project.allCellRenderers;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class CellRendererForSlide7 extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

        //Cells are by default rendered as a JLabel.
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        if (col <= 3) {
            l.setBackground(new Color(62, 161, 255));
        }

        if (col > 3 && col < 8) {
            l.setBackground(new Color(118, 205, 255));
        }
        if (col >= 8) {
            l.setBackground(new Color(204, 255, 255));
        }
        //Return the JLabel which renders the cell.
        return l;
    }
}
