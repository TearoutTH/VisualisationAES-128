package project.TMs.statesTMs;

import project.states.AllStateStates;

import javax.swing.table.AbstractTableModel;

public class EndRound1ShiftRowsTM extends AbstractTableModel {
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
        return Integer.toHexString(AllStateStates.getEnd1ShiftRows()[rowIndex][columnIndex]);
    }
}
