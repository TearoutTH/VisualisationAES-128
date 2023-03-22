package project.TMs.keysTMs;

import project.calculations.KeyExpander;

import javax.swing.table.AbstractTableModel;

public class Round9KeyTM extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String value = Integer.toHexString(KeyExpander.getRoundKeys()[rowIndex][columnIndex+36]);
        if (value.length() == 1) {
            return "0" + value;
        } else {
            return value;
        }
    }
}
