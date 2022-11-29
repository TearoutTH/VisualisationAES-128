package project;

import lombok.Data;
import lombok.EqualsAndHashCode;
import project.TMs.MixMatrixTM.MixMatrixTM;
import project.TMs.SBoxTM.SboxTM;
import project.TMs.statesTMs.*;
import project.cellRenderersForSlide4.BaseCellRenderer;
import project.cellRenderersForSlide4.Step1CellRenderer;
import project.cellRenderersForSlide4.Step2CellRenderer;
import project.cellRenderersForSlide4.Step3CellRenderer;
import project.helpfulStaff.SVGImage;
import project.helpfulStaff.TableColumnManager;
import project.helpfulStaff.TableWithRowHeader;
import project.TMs.keysTMs.InitialKeyTM;
import project.setOriginalStatesForSlides.SetOriginalState;
import project.states.AllStateStates;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
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
    private JPanel slide2panelWithPlus;
    private JPanel slide2center;
    private JPanel slide2panelWithEqual;
    private JPanel slide2resultTable;
    private JButton slide2Button;
    private JTable slide2table5;
    private JLabel slide2Plus;
    private JLabel slide2Equal;
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
    private JTable slide5table2;
    private JTable slide5table3;
    private JTable slide5table4;
    private JTextField slide5num1;
    private JTextField slide5num2;
    private JTextField slide5num3;
    private JTextField slide5num4;
    private JTextField slide5num5;
    private JTextField slide5num6;
    private JTextField slide5num7;
    private JTextField slide5num8;
    private JTextField slide5num9;
    private JLabel slide5label1;
    private JLabel slide5label2;
    private JLabel slide5label3;
    private JLabel slide5label4;
    private JLabel slide5label5;
    private JLabel slide5label6;
    private JLabel slide5label7;
    private JLabel slide5label8;
    private JLabel slide5label9;
    private JLabel slide5label10;
    private JLabel slide5labelMatrix;
    private JLabel slide5LabelDone;
    private JPanel main06;
    private JTable slide6table1;
    private JTable slide6table3;
    private JTable slide6tableResult;
    private JTable slide6table2;
    private JTable slide6table4;
    private JTable slide6table5;
    private JLabel slide6Arrow1;
    private JLabel slide6Arrow2;
    private JLabel slide6Plus;
    private JLabel slide6Equal;
    private JLabel slide6newStateLabel;
    private JLabel slide1Numbers1;

    private int slide2Step = 0;

    private int slide3Step = 0;
    private int slide3ByteRow = 0;
    private int slide3ByteColumn = 0;

    private int slide4Step = 0;

    private List<JTextField> slide5NumsFromTable1 = new ArrayList<>();
    private List<JTextField> slide5NumsFromTable2 = new ArrayList<>();
    private int slide5ByteRow = 0;
    private int slide5ByteColumn = 0;
    private int slide5Step = 0;

    private static AESVisualisation frame;
    private static SetOriginalState setOriginalState;

    //slide6
    private int slide6Step = 0;

    //all table column managers
    private TableColumnManager tcmSlide2table2;
    private TableColumnManager tcmSlide2table4;
    private TableColumnManager tcmSlide2table5;
    private TableColumnManager tcmSlide2tableResult;

    private TableColumnManager tcmSlide5table3;
    private boolean slide5changeColumnFlag = false;

    public void leftOnlyOneColumn(TableColumnManager tcm, int columnNum) {
        if (tcm.getTcm().getColumnCount() == 1 && tcm.getTcm().getColumns().nextElement().getModelIndex() != columnNum) {
            tcm.showColumn(columnNum);
        }
        for (int i = 0; i < 4; i++) {
            if (columnNum != i) {
                tcm.hideColumn(i);
            }
        }
    }

    //formatting ang group text fields on 05 for next usage
    private void formattingAndGroupTextFieldsForSlide5() {
        slide5NumsFromTable1 = Arrays.asList(slide5num1, slide5num3, slide5num5, slide5num7);
        slide5NumsFromTable2 = Arrays.asList(slide5num2, slide5num4, slide5num6, slide5num8);
        slide5num9.setHorizontalAlignment(JTextField.CENTER);
        for (JTextField el : slide5NumsFromTable1) {
            el.setHorizontalAlignment(JTextField.CENTER);
            el.setBorder(new LineBorder(Color.BLACK));
        }
        for (JTextField el : slide5NumsFromTable2) {
            el.setHorizontalAlignment(JTextField.CENTER);
            el.setBorder(new LineBorder(Color.BLACK));
        }
    }

    //create listeners for slide 01
    private void createListenersForSlide1() {
        //reinput data by pressing button on a slide 01
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
    }

    private void createListenersForSlide3() {
        // button "To result" on a slide 03
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

        // button "Next step" on a slide 03
        slide3Button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabs.setSelectedIndex(3);
                slide3Step = 0;
                tabs.requestFocus();
            }
        });
    }

    //creating all listeners
    private void createAllListeners() {
        setOriginalState = new SetOriginalState();

        // create all tcm's (to hide columns when it's needed)
        tcmSlide2table2 = new TableColumnManager(slide2table2);
        tcmSlide2table4 = new TableColumnManager(slide2table4);
        tcmSlide2table5 = new TableColumnManager(slide2table5);
        tcmSlide2tableResult = new TableColumnManager(slide2tableResult);

        tcmSlide5table3 = new TableColumnManager(slide5table3);

        // listener, which brings the slide to its original state when switching to it through the tab
        tabs.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                switch (tabs.getSelectedIndex()) {
                    // slide 01
                    case 0: {
                        setOriginalState.forSlide1(frame);
                        break;
                    }

                    //slide 02
                    case 1: {
                        setOriginalState.forSlide2(frame);
                        break;
                    }

                    //slide 03
                    case 2: {
                        setOriginalState.forSlide3(frame);
                        break;
                    }

                    //slide 04
                    case 3: {
                        setOriginalState.forSlide4(frame);
                        break;
                    }

                    //slide 05
                    case 4: {
                        setOriginalState.forSlide5(frame);
                        break;
                    }
                    case 5: {
                        setOriginalState.ForSlide6(frame);
                        break;
                    }
                }
            }
        });
        // listener, which performing actions on each slide when pressing Enter button
        tabs.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                switch (tabs.getSelectedIndex()) {

                    //slide 01
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

                    //slide 02
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
                                slide2Equal.setVisible(true);

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
                            switch (slide2Step) {
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

                    //slide 03
                    case 2: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            String num = "";
                            char row = '0';
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
                                        slide3table2.setRowSelectionInterval(rowInt, rowInt);
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
                                        slide3table2.setColumnSelectionInterval(columnInt, columnInt);
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
                        break;
                    }

                    //slide 04
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
                                    step1CellRenderer.setHorizontalAlignment(JLabel.CENTER);
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step1CellRenderer);
                                    }
                                    for (int i = 0; i < 4; i++) {
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
                                    step2CellRenderer.setHorizontalAlignment(JLabel.CENTER);
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step2CellRenderer);
                                    }
                                    for (int i = 0; i < 4; i++) {
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
                                    step3CellRenderer.setHorizontalAlignment(JLabel.CENTER);
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step3CellRenderer);
                                    }
                                    for (int i = 0; i < 4; i++) {
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
                                case 8: {
                                    tabs.setSelectedIndex(4);
                                    slide4Step++;
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    case 4: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            switch (slide5Step) {
                                case 0: {
                                    leftOnlyOneColumn(tcmSlide5table3, slide5ByteRow);
                                    slide5table2.setVisible(true);
                                    slide5table3.setVisible(true);
                                    slide5label9.setVisible(true);
                                    slide5labelMatrix.setVisible(true);

                                    slide5table2.setRowSelectionAllowed(true);
                                    slide5table4.setCellSelectionEnabled(true);
                                    slide5table4.setRowSelectionAllowed(true);
                                    slide5table4.setColumnSelectionAllowed(true);

                                    leftOnlyOneColumn(tcmSlide5table3, slide3ByteColumn);
                                    slide5Step++;
                                    break;
                                }
                                case 1: {
                                    slide5table2.setRowSelectionInterval(slide5ByteRow, slide5ByteRow);

                                    slide5table4.setVisible(true);

                                    slide5label10.setVisible(true);
                                    formattingAndGroupTextFieldsForSlide5();
                                    if (slide5changeColumnFlag) {
                                        if (slide5ByteColumn != 0) {
                                            tcmSlide5table3.showColumn(slide5ByteColumn);
                                            tcmSlide5table3.hideColumn(slide5ByteColumn - 1);
                                        }
                                    }
                                    int i = 0;
                                    for (JTextField num : slide5NumsFromTable1) {
                                        num.setText(String.valueOf(slide5table2.getModel().getValueAt(slide5ByteRow, i)));
                                        i++;
                                    }
                                    i = 0;
                                    for (JTextField num : slide5NumsFromTable2) {
                                        num.setText(String.valueOf(slide5table3.getModel().getValueAt(i, slide5ByteColumn)));
                                        i++;
                                    }
                                    i = 0;
                                    slide5num9.setText(Integer.toHexString(AllStateStates.getEnd1MixColumns()[slide5ByteRow][slide5ByteColumn]));
                                    slide5table4.getModel().setValueAt(Integer.toHexString(AllStateStates.getEnd1MixColumns()[slide5ByteRow][slide5ByteColumn]), slide5ByteRow, slide5ByteColumn);
                                    slide5table4.setRowSelectionInterval(slide5ByteRow, slide5ByteRow);
                                    slide5table4.setColumnSelectionInterval(slide5ByteColumn, slide5ByteColumn);
                                    bot05.setVisible(true);

                                    if (slide5ByteRow == 3) {
                                        slide5ByteColumn++;
                                        slide5changeColumnFlag = true;
                                        slide5ByteRow = 0;
                                    } else {
                                        slide5ByteRow++;
                                        slide5changeColumnFlag = false;
                                    }
                                    if (slide5ByteColumn == 4) {
                                        slide5Step = 2;
                                    }
                                    break;
                                }
                                case 2: {
                                    slide5table2.setRowSelectionAllowed(false);
                                    slide5table4.setCellSelectionEnabled(false);
                                    slide5table4.setRowSelectionAllowed(false);
                                    slide5table4.setColumnSelectionAllowed(false);
                                    slide5LabelDone.setVisible(true);
                                    bot05.setVisible(false);
                                    slide5Step++;
                                    break;
                                }
                                case 3: {
                                    tabs.setSelectedIndex(5);
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
        createListenersForSlide1();
        createListenersForSlide3();
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

    //method for data input
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
        frame = new AESVisualisation("AES Visualisation");
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
        slide5table2 = new JTable(new MixMatrixTM());
        slide5table3 = new JTable(new EndRound1ShiftRowsTM());
        slide5table4 = new JTable(new EmptyTableTM());

        //slide6
        slide6table1 = new JTable(new EmptyTableTM());
        slide6table3 = new JTable(new EmptyTableTM());
        slide6tableResult = new JTable(new EmptyTableTM());
        slide6table2 = new JTable(new EmptyTableTM());
        slide6table4 = new JTable(new EmptyTableTM());
        slide6table5 = new JTable(new EmptyTableTM());

        List<JTable> tables =  Arrays.asList(slide1table1, slide1table2,
                                             slide2table1, slide2table2, slide2table3, slide2table4, slide2tableResult, slide2table5,
                                             slide3table1, slide3table2,
                                             slide4table,
                                             slide5table1, slide5table2, slide5table3, slide5table4);

        // center the values in all tables
        for (JTable table: tables) {
            for (int i = 0; i < 4; i++) {
                table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        }
    }
}