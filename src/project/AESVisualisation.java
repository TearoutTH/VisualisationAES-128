package project;

import project.TMs.SBoxTM.SboxTM;
import project.cellRenderersForSlide4.BaseCellRenderer;
import project.cellRenderersForSlide4.Step1CellRenderer;
import project.cellRenderersForSlide4.Step2CellRenderer;
import project.cellRenderersForSlide4.Step3CellRenderer;
import project.helpfulStaff.SVGImage;
import project.helpfulStaff.TableColumnManager;
import project.helpfulStaff.TableWithRowHeader;
import project.TMs.keysTMs.InitialKeyTM;
import project.states.AllStateCopy;
import project.states.AllStateStates;
import project.TMs.statesTMs.EndRound0StateTM;
import project.TMs.statesTMs.EndRound1ShiftRowsTM;
import project.TMs.statesTMs.EndRound1SubBytesTM;
import project.TMs.statesTMs.InitialStateTM;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.*;

public class AESVisualisation extends JFrame {

    private static String[] data = new String[2];
    private JPanel mainPanel;
    private JTabbedPane tabs;
    private JTable slide1table1;
    private JTable slide1table2;
    private JLabel slide1label1;
    private JLabel slide1label2;
    private JPanel slide1main;
    private JPanel slide1left;
    private JPanel slide1right;
    private JPanel slide2main;
    private JPanel slide2left;
    private JTable slide2table1;
    private JTable slide2table2;
    private JTable slide2table3;
    private JTable slide2table4;
    private JPanel slide2plus;
    private JPanel slide2center;
    private JPanel slide2equal;
    private JPanel slide2resultTable;
    private JButton slide2Button;
    private JTable slide2table5;
    private JLabel slide2Plus;
    private JLabel slide2Equals;
    private JLabel slide2Arrow1;
    private JLabel slide2Arrow2;
    private JTable slide2tableResult;
    private JLabel slide2newStateLabel;
    private JTable slide3table2;
    private JTable slide3table1;
    private JScrollPane slide3ScrollPane;
    private JTextField slide1TextField1;
    private JTextField slide1TextField2;
    private JButton slide1button;
    private SVGImage slide1SVG;
    private JPanel main03;
    private JPanel left03;
    private JTextField slide3textField;
    private JLabel slide3label1;
    private JPanel right03;
    private JButton slide3Button2;
    private JButton slide3Button1;
    private JLabel slide3labelDone;
    private JPanel main04;
    private JPanel left04;
    private JPanel right04;
    private JTable slide4table;
    private JLabel slide4label1;
    private JLabel slide4label2;
    private JLabel slide4label3;
    private JLabel slide4label4;
    private JLabel slide4LabelResult;
    private JPanel main05;
    private JPanel top05;
    private JPanel middle05;
    private JPanel bot05;
    private JTable slide5table1;
    private JLabel slide1Numbers1;

    private int slide2Step = 0;

    private int slide3Step = 0;
    private int slide3ByteRow = 0;
    private int slide3ByteColumn = 0;

    private int slide4Step = 0;

    private void leftOnlyOneColumn(TableColumnManager tcm, int columnNum) {
        if (tcm.getTcm().getColumnCount() == 1 && tcm.getTcm().getColumns().nextElement().getModelIndex() != columnNum) {
            tcm.showColumn(columnNum);
        }
        for (int i = 0; i < 4; i++) {
            if (columnNum != i) {
                tcm.hideColumn(i);
            }
        }
    }

    private void createAllListeners() {
        TableColumnManager tcmSlide2table1 = new TableColumnManager(slide2table1);
        TableColumnManager tcmSlide2table2 = new TableColumnManager(slide2table2);
        TableColumnManager tcmSlide2table3 = new TableColumnManager(slide2table3);
        TableColumnManager tcmSlide2table4 = new TableColumnManager(slide2table4);
        TableColumnManager tcmSlide2table5 = new TableColumnManager(slide2table5);
        TableColumnManager tcmSlide2tableResult = new TableColumnManager(slide2tableResult);
        slide1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                slide1label1.setVisible(false);
                slide1label2.setVisible(false);
                tabs.setVisible(false);
                inputData();
                AESEncrypter.main(data);
                slide1TextField1.setText(data[0]);
                slide1TextField2.setText(data[1]);
                tabs.setVisible(true);
            }
        });
        slide3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                short[][] matrix = new short[4][4];
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matrix[i][j] = AllStateStates.getEnd1SubBytes()[i][j];
                    }
                }
                AllStateStates.setEnd0round(matrix);
                slide3table1.getModel().setValueAt(-1,-1,-1);
                slide3textField.setText("");
                slide3Step = 5;
                slide3labelDone.setVisible(true);
                slide3label1.setVisible(false);
                slide3table2.setRowSelectionAllowed(false);
                slide3table2.setColumnSelectionAllowed(false);
                tabs.requestFocus();
            }
        });
        slide3Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(3);
                slide3Step = 0;
                tabs.requestFocus();
            }
        });
        tabs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                switch (tabs.getSelectedIndex()) {
                    case 0: {
                        slide1label1.setVisible(false);
                        slide1label2.setVisible(false);
                        break;
                    }
                    case 1: {
                        slide2table2.setVisible(false);
                        slide2table4.setVisible(false);
                        slide2table5.setVisible(false);
                        slide2tableResult.setVisible(false);
                        slide2newStateLabel.setVisible(false);
                        slide2Arrow1.setVisible(false);
                        slide2Arrow2.setVisible(false);
                        slide2Plus.setVisible(false);
                        slide2Equals.setVisible(false);
                        slide2Button.setVisible(false);
                        leftOnlyOneColumn(tcmSlide2table2, 0);
                        leftOnlyOneColumn(tcmSlide2table4, 0);
                        leftOnlyOneColumn(tcmSlide2table5, 0);
                        slide2Step = 0;
                        break;
                    }
                    case 2: {
                        short[][] matrix = new short[4][4];
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                matrix[i][j] = AllStateCopy.getEnd0round()[i][j];
                            }
                        }
                        AllStateStates.setEnd0round(matrix);
                        slide3label1.setVisible(false);
                        slide3textField.setText("");
                        slide3ByteRow = 0;
                        slide3ByteColumn = 0;
                        slide3Step = 0;
                        slide3table2.setRowSelectionAllowed(false);
                        slide3table2.setColumnSelectionAllowed(false);
                        slide3labelDone.setVisible(false);
                        break;
                    }
                    case 3: {
                        slide4label1.setText("");
                        slide4label2.setText("");
                        slide4label2.setIcon(new ImageIcon());
                        slide4label3.setText("");
                        slide4label3.setIcon(new ImageIcon());
                        slide4label4.setText("");
                        slide4label4.setIcon(new ImageIcon());
                        slide4LabelResult.setText("");
                        slide4Step = 0;
                        BaseCellRenderer baseCellRenderer = new BaseCellRenderer();
                        baseCellRenderer.setHorizontalAlignment( JLabel.CENTER );
                        for (int i = 0; i < 4; i++) {
                            slide4table.getColumnModel().getColumn(i).setCellRenderer(baseCellRenderer);
                        }
                        short[][] matrix = new short[4][4];
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                matrix[i][j] = AllStateCopy.getEnd1SubBytes()[i][j];
                            }
                        }
                        AllStateStates.setEnd1SubBytes(matrix);
                        break;
                    }
                }
            }
        });
        tabs.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                switch (tabs.getSelectedIndex()) {
                    case 0: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            if (!slide1label1.isVisible()) {
                                slide1label1.setVisible(true);
                            } else if (!slide1label2.isVisible()) {
                                slide1label2.setVisible(true);
                            } else {
                                tabs.setSelectedIndex(1);
                            }
                        }
                        break;
                    }
                    case 1: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            if (!slide2Arrow1.isVisible()) {

                                slide2Arrow1.setVisible(true);
                                leftOnlyOneColumn(tcmSlide2table2, 0);
                                slide2table2.setVisible(true);

                                slide2Arrow2.setVisible(true);
                                leftOnlyOneColumn(tcmSlide2table4, 0);
                                slide2table4.setVisible(true);

                            } else if (!slide2Plus.isVisible()) {
                                slide2Plus.setVisible(true);
                                slide2Equals.setVisible(true);

                                leftOnlyOneColumn(tcmSlide2table5, 0);
                                slide2table5.setVisible(true);

                            } else if (!slide2tableResult.isVisible()) {
                                slide2newStateLabel.setVisible(true);
                                leftOnlyOneColumn(tcmSlide2tableResult, 0);
                                slide2tableResult.getColumnModel().getColumn(0).setPreferredWidth(40);
                                slide2tableResult.getColumnModel().getColumn(0).setMinWidth(40);
                                slide2tableResult.getColumnModel().getColumn(0).setMaxWidth(40);
                                slide2tableResult.setVisible(true);
                            } else {
                                slide2Step++;
                            }
                            switch(slide2Step) {
                                case 1: {
                                    tcmSlide2table2.showColumn(1);
                                    tcmSlide2table2.hideColumn(0);

                                    tcmSlide2table4.showColumn(1);
                                    tcmSlide2table4.hideColumn(0);

                                    tcmSlide2table5.showColumn(1);
                                    tcmSlide2table5.hideColumn(0);
                                    break;
                                }
                                case 2: {
                                    tcmSlide2tableResult.showColumn(1);
                                    slide2tableResult.getColumnModel().getColumn(1).setPreferredWidth(40);
                                    slide2tableResult.getColumnModel().getColumn(1).setMinWidth(40);
                                    slide2tableResult.getColumnModel().getColumn(1).setMaxWidth(40);
                                    break;
                                }
                                case 3: {
                                    tcmSlide2table2.showColumn(2);
                                    tcmSlide2table2.hideColumn(1);

                                    tcmSlide2table4.showColumn(2);
                                    tcmSlide2table4.hideColumn(1);

                                    tcmSlide2table5.showColumn(2);
                                    tcmSlide2table5.hideColumn(1);
                                    break;
                                }
                                case 4: {
                                    tcmSlide2tableResult.showColumn(2);
                                    slide2tableResult.getColumnModel().getColumn(2).setPreferredWidth(40);
                                    slide2tableResult.getColumnModel().getColumn(2).setMinWidth(40);
                                    slide2tableResult.getColumnModel().getColumn(2).setMaxWidth(40);
                                    break;
                                }
                                case 5: {
                                    tcmSlide2table2.showColumn(3);
                                    tcmSlide2table2.hideColumn(2);

                                    tcmSlide2table4.showColumn(3);
                                    tcmSlide2table4.hideColumn(2);

                                    tcmSlide2table5.showColumn(3);
                                    tcmSlide2table5.hideColumn(2);
                                    break;
                                }
                                case 6: {
                                    tcmSlide2tableResult.showColumn(3);
                                    slide2tableResult.getColumnModel().getColumn(3).setPreferredWidth(40);
                                    slide2tableResult.getColumnModel().getColumn(3).setMinWidth(40);
                                    slide2tableResult.getColumnModel().getColumn(3).setMaxWidth(40);
                                    break;
                                }
                                case 7: {
                                    tabs.setSelectedIndex(2);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 2: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            String num = "";
                            char row ='0';
                            char column = '0';
                            if (slide3Step < 5) {
                                num = Integer.toHexString(AllStateStates.getEnd0round()[slide3ByteRow][slide3ByteColumn]);
                                if (num.length() == 2) {
                                    row = num.charAt(0);
                                    column = num.charAt(1);
                                } else {
                                    row = '0';
                                    column = num.charAt(0);
                                }
                            }
                            switch (slide3Step) {
                                case 0: {
                                    slide3textField.setText(num);
                                    slide3label1.setVisible(true);
                                    slide3Step++;
                                    break;
                                }
                                case 1: {
                                    try {
                                        int rowInt = Character.getNumericValue(row);
                                        slide3table2.setRowSelectionInterval(rowInt,rowInt);
                                        slide3table2.setRowSelectionAllowed(true);
                                    } catch (Exception ex) {
                                        selectRowInTableOnSlide3(row);
                                    }
                                    slide3Step++;
                                    break;
                                }
                                case 2: {
                                    try {
                                        int columnInt = Character.getNumericValue(column);
                                        slide3table2.setRowSelectionAllowed(false);
                                        slide3table2.setColumnSelectionAllowed(true);
                                        slide3table2.setColumnSelectionInterval(columnInt,columnInt);
                                    } catch (Exception ex) {
                                        selectColumnInTableOnSlide3(column);
                                    }
                                    slide3Step++;
                                    break;
                                }
                                case 3: {
                                    slide3table2.setRowSelectionAllowed(true);
                                    slide3Step++;
                                    break;
                                }
                                case 4: {
                                    slide3table1.getModel().setValueAt(AllStateStates.getEnd1SubBytes()[slide3ByteRow][slide3ByteColumn], slide3ByteRow, slide3ByteColumn);
                                    slide3table2.setRowSelectionAllowed(false);
                                    slide3table2.setColumnSelectionAllowed(false);
                                    if (slide3ByteColumn == 3) {
                                        slide3ByteRow++;
                                        slide3ByteColumn = 0;
                                    } else {
                                        slide3ByteColumn++;
                                    }
                                    slide3Step = 0;
                                    if (slide3ByteRow == 4) {
                                        slide3label1.setVisible(false);
                                        slide3labelDone.setVisible(true);
                                        slide3Step = 5;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    case 3: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            switch (slide4Step) {
                                case 0: {
                                    slide4label1.setText("Не сдвигается");
                                    slide4Step++;
                                    break;
                                }
                                case 1: {
                                    slide4label1.setText("");
                                    slide4label2.setIcon(new ImageIcon("src/resources/arrowLeft.png"));
                                    slide4label2.setText("Сдвиг на 1 байт");
                                    slide4Step++;
                                    break;
                                }
                                case 2: {
                                    Step1CellRenderer step1CellRenderer = new Step1CellRenderer();
                                    step1CellRenderer.setHorizontalAlignment( JLabel.CENTER );
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step1CellRenderer);
                                    }
                                    for (int i = 0; i < 4;i++) {
                                        slide4table.getModel().setValueAt(AllStateStates.getEnd1ShiftRows()[1][i], 1, i);

                                    }
                                    slide4Step++;
                                    break;
                                }
                                case 3: {
                                    slide4label2.setText("");
                                    slide4label2.setIcon(new ImageIcon());
                                    slide4label3.setIcon(new ImageIcon("src/resources/arrowLeft.png"));
                                    slide4label3.setText("Сдвиг на 2 байта");
                                    slide4Step++;
                                    break;
                                }
                                case 4: {
                                    Step2CellRenderer step2CellRenderer = new Step2CellRenderer();
                                    step2CellRenderer.setHorizontalAlignment( JLabel.CENTER );
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step2CellRenderer);
                                    }
                                    for (int i = 0; i < 4;i++) {
                                        slide4table.getModel().setValueAt(AllStateStates.getEnd1ShiftRows()[2][i], 2, i);
                                    }
                                    slide4Step++;
                                    break;
                                }
                                case 5: {
                                    slide4label3.setText("");
                                    slide4label3.setIcon(new ImageIcon());
                                    slide4label4.setIcon(new ImageIcon("src/resources/arrowLeft.png"));
                                    slide4label4.setText("Сдвиг на 3 байта");
                                    slide4Step++;
                                    break;
                                }
                                case 6: {
                                    Step3CellRenderer step3CellRenderer = new Step3CellRenderer();
                                    step3CellRenderer.setHorizontalAlignment( JLabel.CENTER );
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step3CellRenderer);
                                    }
                                    for (int i = 0; i < 4;i++) {
                                        slide4table.getModel().setValueAt(AllStateStates.getEnd1ShiftRows()[3][i], 3, i);
                                    }
                                    slide4Step++;
                                    break;
                                }
                                case 7: {
                                    slide4label4.setText("");
                                    slide4label4.setIcon(new ImageIcon());
                                    slide4LabelResult.setText("Готово!");
                                    slide4Step++;
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        });
    }

    public void selectRowInTableOnSlide3(char row) {
        switch (row) {
            case 'a': {
                slide3table2.setRowSelectionInterval(10,10);
                break;
            }
            case 'b': {
                slide3table2.setRowSelectionInterval(11,11);
                break;
            }
            case 'c': {
                slide3table2.setRowSelectionInterval(12,12);
                break;
            }
            case 'd': {
                slide3table2.setRowSelectionInterval(13,13);
                break;
            }
            case 'e': {
                slide3table2.setRowSelectionInterval(14,14);
                break;
            }
            case 'f': {
                slide3table2.setRowSelectionInterval(15,15);
                break;
            }
        }
    }

    public void selectColumnInTableOnSlide3(char column) {
        switch (column) {
            case 'a': {
                slide3table2.setColumnSelectionInterval(10,10);
                break;
            }
            case 'b': {
                slide3table2.setColumnSelectionInterval(11,11);
                break;
            }
            case 'c': {
                slide3table2.setColumnSelectionInterval(12,12);
                break;
            }
            case 'd': {
                slide3table2.setColumnSelectionInterval(13,13);
                break;
            }
            case 'e': {
                slide3table2.setColumnSelectionInterval(14,14);
                break;
            }
            case 'f': {
                slide3table2.setColumnSelectionInterval(15,15);
                break;
            }
        }
    }

    public AESVisualisation(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(createSubBytesMenu());
        menuBar.add(createShiftRowsMenu());
        menuBar.add(createMixColumnsMenu());
        menuBar.add(createAddRoundKeyMenu());
        createAllListeners();
    }

    private JMenu createSubBytesMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Sub Bytes");
        // Изображение 1 (Sub Bytes)
        JMenuItem subBytes = new JMenuItem(new ImageIcon("src/resources/SubBytes.png"));
        subBytes.setFocusable(false);
        // Добавим в меню пункт Sub Bytes
        file.add(subBytes);
        return file;
    }

    private JMenu createShiftRowsMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Shift Rows");
        // Изображение 2 (Shift Rows)
        JMenuItem shiftRows = new JMenuItem(new ImageIcon("src/resources/ShiftRows.png"));
        // Добавим в меню пункт Shift Rows
        file.add(shiftRows);
        return file;
    }

    private JMenu createMixColumnsMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Mix Columns");
        // Изображение 2 (Mix Columns)
        JMenuItem mixColumns = new JMenuItem(new ImageIcon("src/resources/MixColumns.png"));
        // Добавим в меню пункт Mix Columns
        file.add(mixColumns);
        return file;
    }

    private JMenu createAddRoundKeyMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Add Round Key");
        // Изображение 2 (Add Round Key)
        JMenuItem addRoundKey = new JMenuItem(new ImageIcon("src/resources/AddRoundKey.png"));
        // Добавим в меню пункт Add Round Key
        file.add(addRoundKey);
        return file;
    }


    private static void inputData() {
        JPanel panel = new JPanel(new GridLayout(2,2));
        JLabel lmessage = new JLabel("Сообщение");
        JTextField message = new JTextField(15);
        JLabel lkey = new JLabel("Ключ");
        JTextField key = new JTextField(15);
        panel.add(lmessage);
        panel.add(message);
        panel.add(lkey);
        panel.add(key);
        JOptionPane.showMessageDialog(null, panel, "Введите данные", JOptionPane.PLAIN_MESSAGE);
        data[0] = message.getText();
        data[1] = key.getText();
    }

    public static void main(String[] args) {
        JFrame frame = new AESVisualisation("AES Visualisation");
//        inputData();
        AESEncrypter.main(data);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        //slide1
        slide1SVG = new SVGImage();
        slide1SVG.setSvgImage("resources/capture.svg", 300, 500);
        slide1table1 = new JTable(new InitialStateTM());
        slide1table2 = new JTable(new InitialKeyTM());
        inputData();
        slide1TextField1 = new JTextField(data[0]);
        slide1TextField2 = new JTextField((data[1]));

        //slide2
        slide2table1 = new JTable(new InitialStateTM());
        slide2table2 = new JTable(new InitialStateTM());
        slide2table3 = new JTable(new InitialKeyTM());
        slide2table4 = new JTable(new InitialKeyTM());
        slide2table5 = new JTable(new EndRound0StateTM());
        slide2tableResult = new JTable(new EndRound0StateTM());

        //slide3
        slide3table2 = new JTable(new SboxTM());
        slide3table2.setFocusable(false);
        slide3table2.getTableHeader().setReorderingAllowed(false);
        slide3ScrollPane = new JScrollPane(slide3table2);

        JTable lineTable = new TableWithRowHeader(slide3table2);
        slide3ScrollPane.setRowHeaderView(lineTable);

        slide3table1 = new JTable(new EndRound0StateTM());

        //slide4
        slide4table = new JTable(new EndRound1SubBytesTM());
        BaseCellRenderer baseCellRenderer = new BaseCellRenderer();
        baseCellRenderer.setHorizontalAlignment( JLabel.CENTER );
        for (int i = 0; i < 4; i++) {
            slide4table.getColumnModel().getColumn(i).setCellRenderer(baseCellRenderer);
        }

        //slide5
        slide5table1 = new JTable(new EndRound1ShiftRowsTM());

        // center the values in all tables
        for (int i = 0; i < 4; i++) {
            slide1table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide1table2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide2table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide2table2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide2table3.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide2table4.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide2table5.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide3table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            slide5table1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }
}