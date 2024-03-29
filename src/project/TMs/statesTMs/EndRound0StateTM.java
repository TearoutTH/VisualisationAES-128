package project.TMs.statesTMs;

import project.states.AllStates;

import javax.swing.table.AbstractTableModel;

public class EndRound0StateTM extends AbstractTableModel {
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
        String value = Integer.toHexString(AllStates.getEnd0round()[rowIndex][columnIndex]);
        if (value.length() == 1) {
            return "0" + value;
        } else {
            return value;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex != -1 || columnIndex != -1) {
            short[][] matrix = AllStates.getEnd0round();
            matrix[rowIndex][columnIndex] = (short) aValue;
            AllStates.setEnd0round(matrix);
        }
        this.fireTableDataChanged();
    }
}
