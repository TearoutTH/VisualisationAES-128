package project.TMs.statesTMs.endRound4;

import project.states.AllStates;

import javax.swing.table.AbstractTableModel;

public class EndRound4ShiftRowsTM extends AbstractTableModel {
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
        String value = Integer.toHexString(AllStates.getEnd4ShiftRows()[rowIndex][columnIndex]);
        if (value.length() == 1) {
            return "0" + value;
        } else {
            return value;
        }
    }
}
