package project;

import lombok.Data;
import lombok.EqualsAndHashCode;
import project.TMs.EmptyTableTM;
import project.TMs.MixMatrixTM;
import project.TMs.RconTM;
import project.TMs.SboxTM;
import project.TMs.columnsForSlide7.*;
import project.TMs.keysTMs.*;
import project.TMs.statesTMs.*;
import project.TMs.statesTMs.endRound1.*;
import project.TMs.statesTMs.endRound10.*;
import project.TMs.statesTMs.endRound2.*;
import project.TMs.statesTMs.endRound3.*;
import project.TMs.statesTMs.endRound4.*;
import project.TMs.statesTMs.endRound5.*;
import project.TMs.statesTMs.endRound6.*;
import project.TMs.statesTMs.endRound7.*;
import project.TMs.statesTMs.endRound8.*;
import project.TMs.statesTMs.endRound9.*;
import project.allCellRenderers.CellRendererForSlide7;
import project.allCellRenderers.cellRenderersForSlide4.*;
import project.calculations.AESEncrypter;
import project.calculations.KeyExpander;
import project.helpfulStaff.*;
import project.setOriginalStatesForSlides.SetOriginalState;
import project.states.AllStates;
import project.states.ColumnsForSlide7;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@EqualsAndHashCode(callSuper = true)
@Data
public class AESVisualization extends JFrame {

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
    private JPanel slide7main;
    private JPanel slide7top;
    private JTable slide7table1;
    private JTable slide7table2;
    private JPanel slide7botLeft;
    private JPanel slide7botRight;
    private JTable slide7Column1;
    private JButton slide7Button1;
    private JTextField slide7TextField1;
    private JTextField slide7TextField2;
    private JTable slide7SBox;
    private JTable slide7Rcon;
    private JTable slide7Column2;
    private JTable slide7Column3;
    private JLabel slide7LabelRound1;
    private JLabel slide7LabelRound2;
    private JLabel slide7LabelRound10;
    private JScrollPane slide7ScrollPane;
    private JLabel slide7LabelCalculate;
    private JLabel slide7LabelResult;
    private JLabel slide7LabelPlus2;
    private JLabel slide7LabelRcon;
    private JLabel slide7LabelPlus1;
    private JLabel slide7Labeli1;
    private JLabel slide7Labeli2;
    private JPanel slide7AllColumns;
    private JPanel slide8Panel1;
    private JPanel slide8Panel2;
    private JPanel slide8Panel3;
    private JPanel slide8Panel4;
    private JPanel slide8Panel5;
    private JPanel slide8Panel6;
    private JTable slide8table01;
    private JTable slide8table02;
    private JTable slide8table03;
    private JTable slide8table04;
    private JTable slide8table05;
    private JTable slide8table11;
    private JTable slide8table12;
    private JTable slide8table13;
    private JTable slide8table14;
    private JTable slide8table15;
    private JTable slide8table21;
    private JTable slide8table22;
    private JTable slide8table23;
    private JTable slide8table24;
    private JTable slide8table25;
    private JTable slide8table31;
    private JTable slide8table32;
    private JTable slide8table33;
    private JTable slide8table34;
    private JTable slide8table35;
    private JTable slide8table41;
    private JTable slide8table42;
    private JTable slide8table43;
    private JTable slide8table44;
    private JTable slide8table45;
    private JTable slide8table51;
    private JTable slide8table52;
    private JTable slide8table53;
    private JTable slide8table54;
    private JTable slide8table55;
    private JTable slide9table61;
    private JTable slide9table62;
    private JTable slide9table63;
    private JTable slide9table64;
    private JTable slide9table65;
    private JTable slide9table71;
    private JTable slide9table72;
    private JTable slide9table73;
    private JTable slide9table74;
    private JTable slide9table75;
    private JTable slide9table81;
    private JTable slide9table82;
    private JTable slide9table83;
    private JTable slide9table84;
    private JTable slide9table85;
    private JTable slide9table91;
    private JTable slide9table92;
    private JTable slide9table93;
    private JTable slide9table94;
    private JTable slide9table95;
    private JTable slide9table101;
    private JTable slide9table102;
    private JTable slide9table103;
    private JTable slide9table104;
    private JTable slide9table105;
    private JTable slide9tableResult;
    private JPanel slide9Panel1;
    private JPanel slide9Panel2;
    private JPanel slide9Panel3;
    private JPanel slide9Panel4;
    private JPanel slide9Panel5;
    private JPanel slide9Panel6;
    private JLabel slide1Numbers1;

    private static AESVisualization frame;
    private static SetOriginalState setOriginalState;

    //slide 02
    private int slide2Step = 0;

    //slide 03
    private int slide3Step = 0;
    private int slide3ByteRow = 0;
    private int slide3ByteColumn = 0;

    //slide 04
    private int slide4Step = 0;

    //slide 05
    private List<JTextField> slide5NumsFromTable1 = new ArrayList<>();
    private List<JTextField> slide5NumsFromTable2 = new ArrayList<>();
    private int slide5ByteRow = 0;
    private int slide5ByteColumn = 0;
    private int slide5Step = 0;

    //slide 06
    private int slide6Step = 0;

    //slide 07
    private int slide7Step = 0;
    private int slide7StepSbox = 0;
    private int slide7RoundNum = 0;
    private int slide7ColumnNum = 4;

    //slide 08
    private int slide8Step = 0;

    //slide 09
    private int slide9Step = 0;

    //all table column managers
    private TableColumnManager tcmSlide2table2;
    private TableColumnManager tcmSlide2table4;
    private TableColumnManager tcmSlide2table5;
    private TableColumnManager tcmSlide2tableResult;

    private TableColumnManager tcmSlide5table3;

    private TableColumnManager tcmSlide6table2;
    private TableColumnManager tcmSlide6table4;
    private TableColumnManager tcmSlide6table5;
    private TableColumnManager tcmSlide6tableResult;

    private TableColumnManager tcmSlide7table1;
    private TableColumnManager tcmSlide7table2;

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

    //formatting ang group text fields on 05
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

    //create listeners for slide 03
    private void createListenersForSlide3() {
        // button "To result" on a slide 03
        slide3Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                short[][] matrix = new short[4][4];
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        matrix[i][j] = AllStates.getEnd1SubBytes()[i][j];
                    }
                }
                AllStates.setEnd0round(matrix);
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

    private void createListenerForSlide7() {
        slide7Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 4; i < 12; i++) {
                    tcmSlide7table1.showColumn(i);
                }
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        slide7table2.setValueAt(Integer.toHexString(KeyExpander.getRoundKeys()[i][j+40]),i,j);
                    }
                }
                slide7AllColumns.setVisible(false);
                slide7LabelCalculate.setVisible(false);
                slide7LabelRound1.setText("Раунд 1");
                slide7LabelRound2.setText("Раунд 2");
                slide7LabelRound10.setVisible(true);

                slide7TextField1.setText("");
                slide7TextField2.setText("");
                slide7SBox.clearSelection();

                slide7Step = 0;
                slide7RoundNum = 3;
                tabs.requestFocus();
            }
        });
    }

    //creating listener for tabs
    private void createListenersForTabs() {
        setOriginalState = new SetOriginalState();

        // create all tcm's (to hide columns when it's needed)
        tcmSlide2table2 = new TableColumnManager(slide2table2);
        tcmSlide2table4 = new TableColumnManager(slide2table4);
        tcmSlide2table5 = new TableColumnManager(slide2table5);
        tcmSlide2tableResult = new TableColumnManager(slide2tableResult);

        tcmSlide5table3 = new TableColumnManager(slide5table3);

        tcmSlide6table2 = new TableColumnManager(slide6table2);
        tcmSlide6table4 = new TableColumnManager(slide6table4);
        tcmSlide6table5 = new TableColumnManager(slide6table5);
        tcmSlide6tableResult = new TableColumnManager(slide6tableResult);

        tcmSlide7table1 = new TableColumnManager(slide7table1);
        tcmSlide7table2 = new TableColumnManager(slide7table2);

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
                        setOriginalState.forSlide6(frame);
                        break;
                    }
                    case 6: {
                        setOriginalState.forSlide7(frame);
                        break;
                    }
                    case 7: {
                        setOriginalState.forSlide8(frame);
                        break;
                    }
                    case 8: {
                        setOriginalState.forSlide9(frame);
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
                                //read value and divide it to row and column
                                num = Integer.toHexString(AllStates.getEnd0round()[slide3ByteRow][slide3ByteColumn]);
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
                                    // using try, because row can be a letter
                                    try {
                                        int rowInt = Character.getNumericValue(row);
                                        slide3table2.setRowSelectionInterval(rowInt, rowInt);
                                        slide3table2.setRowSelectionAllowed(true);
                                    } catch (Exception ex) {
                                        //using special method if row is a letter
                                        selectRowInTableOnSlide3(row);
                                    }
                                    slide3Step++;
                                    break;
                                }
                                case 2: {
                                    // using try, because column can be a letter
                                    try {
                                        int columnInt = Character.getNumericValue(column);
                                        slide3table2.setRowSelectionAllowed(false);
                                        slide3table2.setColumnSelectionAllowed(true);
                                        slide3table2.setColumnSelectionInterval(columnInt, columnInt);
                                    } catch (Exception ex) {
                                        //using special method if column is a letter
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
                                    slide3table1.getModel().setValueAt(AllStates.getEnd1SubBytes()[slide3ByteRow][slide3ByteColumn], slide3ByteRow, slide3ByteColumn);
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
                                    //showing desired label
                                    slide4label1.setText("");
                                    slide4label2.setIcon(new ImageIcon("src/resources/captures/arrowLeft.png"));
                                    slide4label2.setText("Сдвиг на 1 байт");
                                    slide4Step++;
                                    break;
                                }
                                case 2: {
                                    //change cell renderer and values
                                    Step1CellRenderer step1CellRenderer = new Step1CellRenderer();
                                    step1CellRenderer.setHorizontalAlignment(JLabel.CENTER);
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step1CellRenderer);
                                    }
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getModel().setValueAt(AllStates.getEnd1ShiftRows()[1][i], 1, i);

                                    }
                                    slide4Step++;
                                    break;
                                }
                                case 3: {
                                    //showing desired label
                                    slide4label2.setText("");
                                    slide4label2.setIcon(new ImageIcon());
                                    slide4label3.setIcon(new ImageIcon("src/resources/captures/arrowLeft.png"));
                                    slide4label3.setText("Сдвиг на 2 байта");
                                    slide4Step++;
                                    break;
                                }
                                case 4: {
                                    //change cell renderer and values
                                    Step2CellRenderer step2CellRenderer = new Step2CellRenderer();
                                    step2CellRenderer.setHorizontalAlignment(JLabel.CENTER);
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step2CellRenderer);
                                    }
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getModel().setValueAt(AllStates.getEnd1ShiftRows()[2][i], 2, i);
                                    }
                                    slide4Step++;
                                    break;
                                }
                                case 5: {
                                    //showing desired label
                                    slide4label3.setText("");
                                    slide4label3.setIcon(new ImageIcon());
                                    slide4label4.setIcon(new ImageIcon("src/resources/captures/arrowLeft.png"));
                                    slide4label4.setText("Сдвиг на 3 байта");
                                    slide4Step++;
                                    break;
                                }
                                case 6: {
                                    //change cell renderer and values
                                    Step3CellRenderer step3CellRenderer = new Step3CellRenderer();
                                    step3CellRenderer.setHorizontalAlignment(JLabel.CENTER);
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getColumnModel().getColumn(i).setCellRenderer(step3CellRenderer);
                                    }
                                    for (int i = 0; i < 4; i++) {
                                        slide4table.getModel().setValueAt(AllStates.getEnd1ShiftRows()[3][i], 3, i);
                                    }
                                    slide4Step++;
                                    break;
                                }
                                case 7: {
                                    //showing label "Done"
                                    slide4label4.setText("");
                                    slide4label4.setIcon(new ImageIcon());
                                    slide4LabelResult.setText("Готово!");
                                    slide4Step++;
                                    break;
                                }
                                case 8: {
                                    //switch to next tab
                                    tabs.setSelectedIndex(4);
                                    slide4Step++;
                                    break;
                                }
                            }
                        }
                        break;
                    }

                    //slide 05
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

                                    leftOnlyOneColumn(tcmSlide5table3, slide5ByteColumn);
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
                                    slide5num9.setText(Integer.toHexString(AllStates.getEnd1MixColumns()[slide5ByteRow][slide5ByteColumn]));
                                    slide5table4.getModel().setValueAt(Integer.toHexString(AllStates.getEnd1MixColumns()[slide5ByteRow][slide5ByteColumn]), slide5ByteRow, slide5ByteColumn);
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

                    // slide 06 (same as 02)
                    case 5: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            if (!slide6Arrow1.isVisible()) {

                                slide6Arrow1.setVisible(true);
                                leftOnlyOneColumn(tcmSlide6table2, 0);
                                slide6table2.setVisible(true);

                                slide6Arrow2.setVisible(true);
                                leftOnlyOneColumn(tcmSlide6table4, 0);
                                slide6table4.setVisible(true);

                            } else if (!slide6Plus.isVisible()) {
                                slide6Plus.setVisible(true);
                                slide6Equal.setVisible(true);
                                leftOnlyOneColumn(tcmSlide6table5, 0);
                                slide6table5.setVisible(true);
                            } else if (!slide6tableResult.isVisible()) {
                                slide6newStateLabel.setVisible(true);
                                leftOnlyOneColumn(tcmSlide6tableResult, 0);
                                slide6tableResult.getColumnModel().getColumn(0).setPreferredWidth(40);
                                slide6tableResult.getColumnModel().getColumn(0).setMinWidth(40);
                                slide6tableResult.getColumnModel().getColumn(0).setMaxWidth(40);
                                slide6tableResult.setVisible(true);
                            } else {
                                slide6Step++;
                            }
                            switch (slide6Step) {
                                case 1: {
                                    tcmSlide6table2.showColumn(1);
                                    tcmSlide6table2.hideColumn(0);

                                    tcmSlide6table4.showColumn(1);
                                    tcmSlide6table4.hideColumn(0);

                                    tcmSlide6table5.showColumn(1);
                                    tcmSlide6table5.hideColumn(0);
                                    break;
                                }
                                case 2: {
                                    tcmSlide6tableResult.showColumn(1);
                                    slide6tableResult.getColumnModel().getColumn(1).setPreferredWidth(40);
                                    slide6tableResult.getColumnModel().getColumn(1).setMinWidth(40);
                                    slide6tableResult.getColumnModel().getColumn(1).setMaxWidth(40);
                                    break;
                                }
                                case 3: {
                                    tcmSlide6table2.showColumn(2);
                                    tcmSlide6table2.hideColumn(1);

                                    tcmSlide6table4.showColumn(2);
                                    tcmSlide6table4.hideColumn(1);

                                    tcmSlide6table5.showColumn(2);
                                    tcmSlide6table5.hideColumn(1);
                                    break;
                                }
                                case 4: {
                                    tcmSlide6tableResult.showColumn(2);
                                    slide6tableResult.getColumnModel().getColumn(2).setPreferredWidth(40);
                                    slide6tableResult.getColumnModel().getColumn(2).setMinWidth(40);
                                    slide6tableResult.getColumnModel().getColumn(2).setMaxWidth(40);
                                    break;
                                }
                                case 5: {
                                    tcmSlide6table2.showColumn(3);
                                    tcmSlide6table2.hideColumn(2);

                                    tcmSlide6table4.showColumn(3);
                                    tcmSlide6table4.hideColumn(2);

                                    tcmSlide6table5.showColumn(3);
                                    tcmSlide6table5.hideColumn(2);
                                    break;
                                }
                                case 6: {
                                    tcmSlide6tableResult.showColumn(3);
                                    slide6tableResult.getColumnModel().getColumn(3).setPreferredWidth(40);
                                    slide6tableResult.getColumnModel().getColumn(3).setMinWidth(40);
                                    slide6tableResult.getColumnModel().getColumn(3).setMaxWidth(40);
                                    break;
                                }
                                case 7: {
                                    tabs.setSelectedIndex(6);
                                    break;
                                }
                            }
                        }
                        break;
                    }

                    //slide 07
                    case 6: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                                switch (slide7Step) {
                                    case 0 : {
                                        if (slide7RoundNum == 3) {
                                            tabs.setSelectedIndex(7);
                                        }
                                        slide7LabelRcon.setVisible(false);
                                        slide7Column3.setVisible(false);
                                        slide7LabelPlus2.setVisible(false);

                                        slide7AllColumns.setVisible(true);

                                        slide7LabelCalculate.setVisible(true);
                                        slide7LabelResult.setVisible(false);
                                        slide7Column1.setVisible(true);
                                        slide7Labeli1.setVisible(true);
                                        slide7LabelPlus1.setVisible(true);
                                        slide7Column2.setVisible(true);
                                        slide7Labeli2.setVisible(true);

                                        setOriginalState.resetSlide7Columns();

                                        //just update values
                                        slide7Column1.setValueAt(-1,-1,-1);
                                        slide7Column2.setValueAt(-1,-1,-1);
                                        slide7Column3.setValueAt(-1,-1,-1);

                                        //check if columnNum is divisible by 4 (that mean we should change animation)
                                        //and add Rcon, interaction with SBox e.t.c
                                        if (slide7ColumnNum % 4 == 0) {
                                            if (slide7RoundNum == 2) {
                                                for (int i = 0; i < 4; i++) {
                                                    for (int j = 0; j < 4; j++) {
                                                        slide7table2.setValueAt(Integer.toHexString(KeyExpander.getRoundKeys()[i][j+40]),i,j);
                                                    }
                                                }
                                                slide7LabelCalculate.setVisible(false);
                                                slide7AllColumns.setVisible(false);
                                                slide7LabelRound10.setVisible(true);
                                                slide7RoundNum++;
                                                break;
                                            }
                                            slide7LabelRcon.setVisible(true);
                                            slide7Column3.setVisible(true);
                                            slide7LabelPlus2.setVisible(true);
                                        }
                                        slide7Step++;
                                        break;
                                    }
                                    case 1 : {
                                        slide7LabelCalculate.setVisible(true);
                                        for (int i = 0; i < 4; i++) {
                                            slide7Column2.setValueAt(Integer.toHexString(KeyExpander.getRoundKeys()[i][slide7ColumnNum - 1]), i, 0);
                                        }
                                        if (slide7ColumnNum % 4 != 0) {
                                            slide7Step = 5;
                                        } else {
                                            slide7Step++;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        slide7Column2.setRowSelectionInterval(0,0);
                                        slide7Column2.setColumnSelectionInterval(0,0);
                                        slide7Step++;
                                        break;
                                    }
                                    case 3: {
                                        for (int i = 0; i < 4; i++) {
                                            if (i == 3) {
                                                slide7Column2.setValueAt(Integer.toHexString(KeyExpander.getRoundKeys()[0][slide7ColumnNum - 1]), i, 0);
                                            } else {
                                                slide7Column2.setValueAt(Integer.toHexString(KeyExpander.getRoundKeys()[i + 1][slide7ColumnNum - 1]), i, 0);
                                            }
                                        }
                                        slide7Column2.setRowSelectionInterval(3,3);
                                        slide7Column2.setColumnSelectionInterval(0,0);
                                        slide7Step++;
                                        break;
                                    }
                                    case 4: {
                                        slide7TextField1.setText(ColumnsForSlide7.getColumn2()[slide7StepSbox]);
                                        String num = "";
                                        char row = '0';
                                        char column = '0';
                                        int rowInt = 0;
                                        int columnInt = 0;
                                        num = ColumnsForSlide7.getColumn2()[slide7StepSbox];
                                        if (num.length() == 2) {
                                            row = num.charAt(0);
                                            column = num.charAt(1);
                                        } else {
                                            row = '0';
                                            column = num.charAt(0);
                                        }

                                        try {
                                            rowInt = Character.getNumericValue(row);
                                            slide7SBox.setRowSelectionInterval(rowInt, rowInt);
                                        } catch (Exception ex) {
                                            switch (row) {
                                                case 'a': {
                                                    rowInt = 10;
                                                    slide7SBox.setRowSelectionInterval(10,10);
                                                    break;
                                                }
                                                case 'b': {
                                                    rowInt = 11;
                                                    slide7SBox.setRowSelectionInterval(11,11);
                                                    break;
                                                }
                                                case 'c': {
                                                    rowInt = 12;
                                                    slide7SBox.setRowSelectionInterval(12,12);
                                                    break;
                                                }
                                                case 'd': {
                                                    rowInt = 13;
                                                    slide7SBox.setRowSelectionInterval(13,13);
                                                    break;
                                                }
                                                case 'e': {
                                                    rowInt = 14;
                                                    slide7SBox.setRowSelectionInterval(14,14);
                                                    break;
                                                }
                                                case 'f': {
                                                    rowInt = 15;
                                                    slide7SBox.setRowSelectionInterval(15,15);
                                                    break;
                                                }
                                            }
                                        }

                                        try {
                                            columnInt = Character.getNumericValue(column);
                                            slide7SBox.setColumnSelectionInterval(columnInt, columnInt);
                                        } catch (Exception ex) {
                                            switch (column) {
                                                case 'a': {
                                                    columnInt = 10;
                                                    slide7SBox.setColumnSelectionInterval(10,10);
                                                    break;
                                                }
                                                case 'b': {
                                                    columnInt = 11;
                                                    slide7SBox.setColumnSelectionInterval(11,11);
                                                    break;
                                                }
                                                case 'c': {
                                                    columnInt = 12;
                                                    slide7SBox.setColumnSelectionInterval(12,12);
                                                    break;
                                                }
                                                case 'd': {
                                                    columnInt = 13;
                                                    slide7SBox.setColumnSelectionInterval(13,13);
                                                    break;
                                                }
                                                case 'e': {
                                                    columnInt = 14;
                                                    slide7SBox.setColumnSelectionInterval(14,14);
                                                    break;
                                                }
                                                case 'f': {
                                                    columnInt = 15;
                                                    slide7SBox.setColumnSelectionInterval(15,15);
                                                    break;
                                                }
                                            }
                                        }
                                        slide7TextField2.setText(Integer.toHexString(AESEncrypter.getsBox()[rowInt][columnInt]));
                                        slide7Column2.setValueAt(Integer.toHexString(AESEncrypter.getsBox()[rowInt][columnInt]), slide7StepSbox, 0);
                                        slide7Column2.setRowSelectionInterval(slide7StepSbox, slide7StepSbox);
                                        slide7Column2.setColumnSelectionInterval(0,0);
                                        if (slide7StepSbox != 3) {
                                            slide7StepSbox++;
                                        } else {
                                            slide7StepSbox = 0;
                                            slide7Step++;
                                        }
                                        break;
                                    }
                                    case 5: {
                                        slide7Column2.clearSelection();
                                        slide7SBox.clearSelection();
                                        slide7TextField1.setText("");
                                        slide7TextField2.setText("");
                                        for (int i = 0; i < 4; i++) {
                                            slide7Column1.setValueAt(Integer.toHexString(KeyExpander.getRoundKeys()[i][slide7ColumnNum - 4]), i, 0);
                                        }
                                        if (slide7ColumnNum % 4 != 0) {
                                            slide7Step = 7;
                                        } else {
                                            slide7Step++;
                                        }
                                        break;
                                    }
                                    case 6: {
                                        for (int i = 0; i < 4; i++) {
                                            slide7Column3.setValueAt(Integer.toHexString(KeyExpander.getRCon()[i][slide7RoundNum]), i, 0);
                                        }
                                        slide7Step++;
                                        break;
                                    }
                                    case 7: {
                                        slide7LabelResult.setVisible(true);
                                        tcmSlide7table1.showColumn(slide7ColumnNum);
                                        if (slide7ColumnNum % 4 == 3) {
                                            if (slide7RoundNum == 1) {
                                                slide7LabelRound1.setText("Раунд 1");
                                            } else {
                                                slide7LabelRound2.setText("Раунд 2");
                                            }

                                        }
                                        if (slide7ColumnNum % 4 == 0) {
                                            slide7RoundNum++;
                                        }
                                        slide7ColumnNum++;
                                        slide7Step = 0;
                                        break;
                                    }
                                }
                        }
                        break;
                    }

                    //slide 08 (just showing all panels one by one)
                    case 7: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            switch (slide8Step) {
                                case 0: {
                                    slide8Panel2.setVisible(true);
                                    slide8Step++;
                                    break;
                                }
                                case 1: {
                                    slide8Panel3.setVisible(true);
                                    slide8Step++;
                                    break;
                                }
                                case 2: {
                                    slide8Panel4.setVisible(true);
                                    slide8Step++;
                                    break;
                                }
                                case 3: {
                                    slide8Panel5.setVisible(true);
                                    slide8Step++;
                                    break;
                                }
                                case 4: {
                                    slide8Panel6.setVisible(true);
                                    slide8Step++;
                                    break;
                                }
                                case 5: {
                                    tabs.setSelectedIndex(8);
                                    break;
                                }
                            }
                        }
                        break;
                    }

                    // slide 09 (same as 08)
                    case 8: {
                        if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                            switch (slide9Step) {
                                case 0: {
                                    slide9Panel2.setVisible(true);
                                    slide9Step++;
                                    break;
                                }
                                case 1: {
                                    slide9Panel3.setVisible(true);
                                    slide9Step++;
                                    break;
                                }
                                case 2: {
                                    slide9Panel4.setVisible(true);
                                    slide9Step++;
                                    break;
                                }
                                case 3: {
                                    slide9Panel5.setVisible(true);
                                    slide9Step++;
                                    break;
                                }
                                case 4: {
                                    slide9Panel6.setVisible(true);
                                    slide9Step++;
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


    // method used when row is a letter
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

    // method used when column is a letter
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

    public AESVisualization(String title) throws HeadlessException {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        // making menu
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(createSubBytesMenu());
        menuBar.add(createShiftRowsMenu());
        menuBar.add(createMixColumnsMenu());
        menuBar.add(createAddRoundKeyMenu());
        createListenersForSlide1();
        createListenersForSlide3();
        createListenerForSlide7();
        createListenersForTabs();
    }

    // tab in menu
    private JMenu createSubBytesMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Sub Bytes");
        // Изображение 1 (Sub Bytes)
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resources/captures/SubBytes.png")));
            JMenuItem subBytes = new JMenuItem(new ImageIcon(image));
            subBytes.setFocusable(false);
            // Добавим в меню пункт Sub Bytes
            file.add(subBytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    // tab in menu
    private JMenu createShiftRowsMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Shift Rows");
        // Изображение 2 (Shift Rows)
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resources/captures/ShiftRows.png")));
            JMenuItem shiftRows = new JMenuItem(new ImageIcon(image));
            shiftRows.setFocusable(false);
            // Добавим в меню пункт Shift Rows
            file.add(shiftRows);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    // tab in menu
    private JMenu createMixColumnsMenu() {
        // Создание выпадающего меню
        JMenu file = new JMenu("Mix Columns");
        // Изображение 2 (Mix Columns)
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resources/captures/MixColumns.png")));
            JMenuItem mixColumns = new JMenuItem(new ImageIcon(image));
            mixColumns.setFocusable(false);
            // Добавим в меню пункт Mix Columns
            file.add(mixColumns);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    // tab in menu
    private JMenu createAddRoundKeyMenu() {
        // Создание выпадающего меню
        JMenu file = new JMenu("Add Round Key");
        // Изображение 2 (Add Round Key)
        try {
            BufferedImage image = ImageIO.read(Objects.requireNonNull(getClass().getResource("/resources/captures/AddRoundKey.png")));
            JMenuItem addRoundKey = new JMenuItem(new ImageIcon(image));
            addRoundKey.setFocusable(false);
            // Добавим в меню пункт Add Round Key
            file.add(addRoundKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    //method for data input
    private static void inputData() {
        JPanel panel = new JPanel(new GridLayout(2,2));
        JLabel lmessage = new JLabel("Сообщение");
        JTextField message = new JTextField(15);
        JLabel lkey = new JLabel("Ключ");
        JTextField key = new JTextField(15);

        JButton exit = new JButton();
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel.add(lmessage);
        panel.add(message);
        panel.add(lkey);
        panel.add(key);

        Object[] options = { "Ок", "Отмена" };
        int n = JOptionPane.showOptionDialog(null, panel, "Введите данные", JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE, null, options,options[0]);

        if (n == 1) {
            if (data[0] == null) {
                System.exit(0);
            } else {
                message.setText(data[0]);
                key.setText(data[1]);
            }
        }

        if (isDataCorrect(message.getText(), key.getText())) {
            data[0] = message.getText();
            data[1] = key.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Данные введены неправильно", "Error", JOptionPane.ERROR_MESSAGE);
            inputData();
        }
    }

    private static boolean isDataCorrect(String message, String key) {
        boolean flag = true;
        String[] numsInMessage = message.split("\\s*(\\s|,|!|\\.)\\s*");
        if (numsInMessage.length != 16) {
            flag = false;
        } else {
            for (String num : numsInMessage) {
                if (!num.matches("[0123456789abcdef]+")) {
                    flag = false;
                }
            }
        }
        String[] numsInKey = key.split("\\s*(\\s|,|!|\\.)\\s*");
        if (numsInKey.length != 16) {
            flag = false;
        } else {
            for (String num : numsInKey) {
                if (!num.matches("[0123456789abcdef]+")) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        inputData();
        frame = new AESVisualization("AES Visualization");
        // transfer data using parameter of main method
        AESEncrypter.main(data);
        frame.setVisible(true);
    }

    // default method. It's creating all components with "custom create" check mark.
    private void createUIComponents() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        //slide1
        slide1SVG = new SVGImage();
        slide1SVG.setSvgImage("resources/captures/capture.svg", 300, 500);
        slide1table1 = new JTable(new InitialStateTM());
        slide1table2 = new JTable(new InitialKeyTM());
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
        slide6table1 = new JTable(new EndRound1MixColumnsTM());
        slide6table3 = new JTable(new Round1KeyTM());
        slide6tableResult = new JTable(new EndRound1AddRoundKeyTM());
        slide6table2 = new JTable(new EndRound1MixColumnsTM());
        slide6table4 = new JTable(new Round1KeyTM());
        slide6table5 = new JTable(new EndRound1AddRoundKeyTM());

        //slide7
        slide7table1 = new JTable(new FirstThreeKeysTM());
        for (int i = 0; i < 12; i++) {
            slide7table1.getColumnModel().getColumn(i).setPreferredWidth(40);
            slide7table1.getColumnModel().getColumn(i).setMinWidth(40);
            slide7table1.getColumnModel().getColumn(i).setMaxWidth(40);
        }

        CellRendererForSlide7 cellRendererForSlide7 = new CellRendererForSlide7();
        cellRendererForSlide7.setHorizontalAlignment( JLabel.CENTER );
        for (int i = 0; i < 12; i++) {
            slide7table1.getColumnModel().getColumn(i).setCellRenderer(cellRendererForSlide7);
        }

        slide7table2 = new JTable(new EmptyTableTM());

        slide7Column1 = new JTable(new Slide7Column1TM());
        slide7Column2 = new JTable(new Slide7Column2TM());
        slide7Column3 = new JTable(new Slide7Column3TM());


        slide7Rcon = new JTable(new RconTM());
        slide7SBox = new JTable(new SboxTM());
        slide7SBox.setFocusable(false);
        slide7SBox.getTableHeader().setReorderingAllowed(false);
        slide7ScrollPane = new JScrollPane(slide7SBox);

        JTable lineTable2 = new TableWithRowHeader(slide7SBox);
        slide7ScrollPane.setRowHeaderView(lineTable2);

        //center values
        slide7Column1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        slide7Column2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        slide7Column3.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);

        //slide 08
        slide8table01 = new JTable(new InitialStateTM());
        slide8table02 = new JTable(new EmptyTableTM());
        slide8table03 = new JTable(new EmptyTableTM());
        slide8table04 = new JTable(new EmptyTableTM());
        slide8table05 = new JTable(new InitialKeyTM());

        slide8table11 = new JTable(new EndRound0StateTM());
        slide8table12 = new JTable(new EndRound1SubBytesTM());
        slide8table13 = new JTable(new EndRound1ShiftRowsTM());
        slide8table14 = new JTable(new EndRound1MixColumnsTM());
        slide8table15 = new JTable(new Round1KeyTM());

        slide8table21 = new JTable(new EndRound1AddRoundKeyTM());
        slide8table22 = new JTable(new EndRound2SubBytesTM());
        slide8table23 = new JTable(new EndRound2ShiftRowsTM());
        slide8table24 = new JTable(new EndRound2MixColumnsTM());
        slide8table25 = new JTable(new Round2KeyTM());

        slide8table31 = new JTable(new EndRound2AddRoundKeyTM());
        slide8table32 = new JTable(new EndRound3SubBytesTM());
        slide8table33 = new JTable(new EndRound3ShiftRowsTM());
        slide8table34 = new JTable(new EndRound3MixColumnsTM());
        slide8table35 = new JTable(new Round3KeyTM());

        slide8table41 = new JTable(new EndRound3AddRoundKeyTM());
        slide8table42 = new JTable(new EndRound4SubBytesTM());
        slide8table43 = new JTable(new EndRound4ShiftRowsTM());
        slide8table44 = new JTable(new EndRound4MixColumnsTM());
        slide8table45 = new JTable(new Round4KeyTM());

        slide8table51 = new JTable(new EndRound4AddRoundKeyTM());
        slide8table52 = new JTable(new EndRound5SubBytesTM());
        slide8table53 = new JTable(new EndRound5ShiftRowsTM());
        slide8table54 = new JTable(new EndRound5MixColumnsTM());
        slide8table55 = new JTable(new Round5KeyTM());

        //slide 09
        slide9table61 = new JTable(new EndRound5AddRoundKeyTM());
        slide9table62 = new JTable(new EndRound6SubBytesTM());
        slide9table63 = new JTable(new EndRound6ShiftRowsTM());
        slide9table64 = new JTable(new EndRound6MixColumnsTM());
        slide9table65 = new JTable(new Round6KeyTM());

        slide9table71 = new JTable(new EndRound6AddRoundKeyTM());
        slide9table72 = new JTable(new EndRound7SubBytesTM());
        slide9table73 = new JTable(new EndRound7ShiftRowsTM());
        slide9table74 = new JTable(new EndRound7MixColumnsTM());
        slide9table75 = new JTable(new Round7KeyTM());

        slide9table81 = new JTable(new EndRound7AddRoundKeyTM());
        slide9table82 = new JTable(new EndRound8SubBytesTM());
        slide9table83 = new JTable(new EndRound8ShiftRowsTM());
        slide9table84 = new JTable(new EndRound8MixColumnsTM());
        slide9table85 = new JTable(new Round8KeyTM());

        slide9table91 = new JTable(new EndRound8AddRoundKeyTM());
        slide9table92 = new JTable(new EndRound9SubBytesTM());
        slide9table93 = new JTable(new EndRound9ShiftRowsTM());
        slide9table94 = new JTable(new EndRound9MixColumnsTM());
        slide9table95 = new JTable(new Round9KeyTM());

        slide9table101 = new JTable(new EndRound9AddRoundKeyTM());
        slide9table102 = new JTable(new EndRound10SubBytesTM());
        slide9table103 = new JTable(new EndRound10ShiftRowsTM());
        slide9table104 = new JTable(new EmptyTableTM());
        slide9table105 = new JTable(new Round10KeyTM());

        slide9tableResult = new JTable(new EndRound10AddRoundKeyTM());

        List<JTable> tables =  Arrays.asList(slide1table1, slide1table2,
                                             slide2table1, slide2table2, slide2table3, slide2table4, slide2tableResult, slide2table5,
                                             slide3table1, slide3table2,
                                             slide4table,
                                             slide5table1, slide5table2, slide5table3, slide5table4,
                                             slide6table1, slide6table2, slide6table3, slide6table4, slide6tableResult, slide6table5,
                                             slide7table2);

        // center the values in all tables
        for (JTable table: tables) {
            for (int i = 0; i < 4; i++) {
                table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        }
    }
}