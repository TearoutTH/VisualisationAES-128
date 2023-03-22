package project.TMs;

import project.calculations.AESEncrypter;

import javax.swing.table.AbstractTableModel;

public class SboxTM extends AbstractTableModel {

    String[] columns = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }

    @Override
    public int getRowCount() {
        return 16;
    }

    @Override
    public int getColumnCount() {
        return 16;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return Integer.toHexString(AESEncrypter.getsBox()[rowIndex][columnIndex]);
    }
}
