package project.TMs;

import project.calculations.KeyExpander;

import javax.swing.table.AbstractTableModel;

public class RconTM extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return Integer.toHexString(KeyExpander.getRCon()[rowIndex][columnIndex]);
    }
}
