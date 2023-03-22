package project.helpfulStaff;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class TableWithRowHeader  extends JTable{

    protected JTable mainTable;

    public TableWithRowHeader(JTable table)
    {
        super();
        mainTable = table;
        setModel(new RowNumberTableModel());
        setPreferredScrollableViewportSize(new Dimension(20,20));
        getColumnModel().getColumn(0).setMinWidth(20);
        getColumnModel().getColumn(0).setPreferredWidth(20);
        getColumnModel().getColumn(0).setMaxWidth(20);
        setFocusable(false);
        setEnabled(false);
        getColumnModel().getColumn(0).setCellRenderer( mainTable.getTableHeader().getDefaultRenderer() );
    }

    public int getRowHeight(int row)
    {
        return mainTable.getRowHeight();
    }

    class RowNumberTableModel extends AbstractTableModel
    {
        String[] rowHeader={"0", "1", "2", "3", "4", "5", "6", "7","8", "9", "a", "b", "c", "d", "e", "f"};
        public int getRowCount()
        {
            return mainTable.getModel().getRowCount();
        }

        public int getColumnCount()
        {
            return 1;
        }

        public Object getValueAt(int row, int column)
        {
            return rowHeader[row];
        }
    }
}