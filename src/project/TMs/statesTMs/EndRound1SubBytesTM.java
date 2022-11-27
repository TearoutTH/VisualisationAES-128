package project.TMs.statesTMs;

import project.states.AllStateStates;

import javax.swing.table.AbstractTableModel;

public class EndRound1SubBytesTM extends AbstractTableModel {
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
        return Integer.toHexString(AllStateStates.getEnd1SubBytes()[rowIndex][columnIndex]);
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (rowIndex != -1 || columnIndex != -1) {
            short[][] matrix = AllStateStates.getEnd1SubBytes();
            matrix[rowIndex][columnIndex] = (short) aValue;
            AllStateStates.setEnd1SubBytes(matrix);
        }
        this.fireTableDataChanged();
    }
}
