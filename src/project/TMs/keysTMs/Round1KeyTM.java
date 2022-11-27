package project.TMs.keysTMs;

import project.KeyExpander;

import javax.swing.table.AbstractTableModel;

public class Round1KeyTM extends AbstractTableModel {
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
        return Integer.toHexString(KeyExpander.getRoundKeys()[rowIndex][columnIndex+4]);
    }
}
