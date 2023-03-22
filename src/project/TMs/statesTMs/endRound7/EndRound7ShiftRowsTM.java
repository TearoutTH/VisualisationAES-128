package project.TMs.statesTMs.endRound7;

import project.states.AllStates;

import javax.swing.table.AbstractTableModel;

public class EndRound7ShiftRowsTM extends AbstractTableModel {
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
        String value = Integer.toHexString(AllStates.getEnd7ShiftRows()[rowIndex][columnIndex]);
        if (value.length() == 1) {
            return "0" + value;
        } else {
            return value;
        }
    }
}
