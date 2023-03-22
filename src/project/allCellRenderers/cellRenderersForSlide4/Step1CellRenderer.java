package project.allCellRenderers.cellRenderersForSlide4;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class Step1CellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        //Cells are by default rendered as a JLabel.
        JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

        switch (row) {
            case 1: {
                switch (col) {
                    case 0: {
                        l.setBackground(new Color(118, 205, 255));
                        break;
                    }
                    case 1: {
                        l.setBackground(new Color(62, 161, 255));
                        break;
                    }
                    case 2: {
                        l.setBackground(new Color(0, 102, 255));
                        break;
                    }
                    case 3: {
                        l.setBackground(new Color(204, 255, 255));
                        break;
                    }
                }
                break;
            }
            default: {
                switch (col) {
                    case 0: {
                        l.setBackground(new Color(204, 255, 255));
                        break;
                    }
                    case 1: {
                        l.setBackground(new Color(118, 205, 255));
                        break;
                    }
                    case 2: {
                        l.setBackground(new Color(62, 161, 255));
                        break;
                    }
                    case 3: {
                        l.setBackground(new Color(0, 102, 255));
                        break;
                    }
                }
            }
        }

        //Return the JLabel which renders the cell.
        return l;

    }
}
