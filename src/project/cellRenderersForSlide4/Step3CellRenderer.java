package project.cellRenderersForSlide4;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class Step3CellRenderer extends DefaultTableCellRenderer {
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
            case 2: {
                switch (col) {
                    case 0: {
                        l.setBackground(new Color(62, 161, 255));
                        break;
                    }
                    case 1: {
                        l.setBackground(new Color(0, 102, 255));
                        break;
                    }
                    case 2: {
                        l.setBackground(new Color(204, 255, 255));
                        break;
                    }
                    case 3: {
                        l.setBackground(new Color(118, 205, 255));
                        break;
                    }
                }
                break;
            }
            case 3: {
                switch (col) {
                    case 0: {
                        l.setBackground(new Color(0, 102, 255));
                        break;
                    }
                    case 1: {
                        l.setBackground(new Color(204, 255, 255));
                        break;
                    }
                    case 2: {
                        l.setBackground(new Color(118, 205, 255));
                        break;
                    }
                    case 3: {
                        l.setBackground(new Color(62, 161, 255));
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
//        switch (row) {
//            case 0: {
//                switch (col) {
//                    case 0: {
//                        l.setBackground(new Color(255, 255, 204));
//                        break;
//                    }
//                    case 1: {
//                        l.setBackground(new Color(255, 255, 153));
//                        break;
//                    }
//                    case 2: {
//                        l.setBackground(new Color(255, 255, 102));
//                        break;
//                    }
//                    case 3: {
//                        l.setBackground(new Color(255, 255, 0));
//                        break;
//                    }
//                }
//                break;
//            }
//            case 1: {
//                switch (col) {
//                    case 0: {
//                        l.setBackground(new Color(255, 153, 153));
//                        break;
//
//                    }
//                    case 1: {
//                        l.setBackground(new Color(255, 102, 102));
//                        break;
//                    }
//                    case 2: {
//                        l.setBackground(new Color(253, 66, 66));
//                        break;
//                    }
//                    case 3: {
//                        l.setBackground(new Color(255, 204, 204));
//                        break;
//                    }
//                }
//                break;
//            }
//            case 2: {
//                switch (col) {
//                    case 0: {
//                        l.setBackground(new Color(102, 255, 102));
//                        break;
//                    }
//                    case 1: {
//                        l.setBackground(new Color(51, 204, 51));
//                        break;
//                    }
//                    case 2: {
//                        l.setBackground(new Color(204, 255, 204));
//                        break;
//                    }
//                    case 3: {
//                        l.setBackground(new Color(153, 255, 153));
//                        break;
//                    }
//                }
//                break;
//            }
//            case 3: {
//                switch (col) {
//                    case 0: {
//                        l.setBackground(new Color(0, 102, 255));
//                        break;
//
//                    }
//                    case 1: {
//                        l.setBackground(new Color(204, 255, 255));
//                        break;
//
//                    }
//                    case 2: {
//                        l.setBackground(new Color(118, 205, 255));
//                        break;
//
//                    }
//                    case 3: {
//                        l.setBackground(new Color(62, 161, 255));
//                        break;
//                    }
//                }
//                break;
//            }
//        }
        //Return the JLabel which renders the cell.
        return l;
    }
}
