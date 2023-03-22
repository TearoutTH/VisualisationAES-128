package project.TMs.columnsForSlide7;

import project.states.ColumnsForSlide7;

import javax.swing.table.AbstractTableModel;

public class Slide7Column3TM extends AbstractTableModel {
    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String value = ColumnsForSlide7.getColumn3()[rowIndex];
        if (value.length() == 1) {
            return "0" + value;
        } else {
            return value;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex != -1 || columnIndex != -1) {
            String[] matrix = ColumnsForSlide7.getColumn3();
            matrix[rowIndex] = (String) aValue;
            ColumnsForSlide7.setColumn3(matrix);
        }
        this.fireTableDataChanged();
    }
}
