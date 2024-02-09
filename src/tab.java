import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import org.jdatepicker.JDatePicker;
import org.jdatepicker.UtilCalendarModel;


//import org.apache.commons.lang3.text.WordUtils;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalTime;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class tab {
    private JPanel main;
    private JTabbedPane tabbedPane1;
    private JButton DEALERButton;
    private JButton VIEWDATAButton;
    private JButton PRODUCTButton;
    private JButton ADDDATAButton;
    private JTable table1;
    private JButton DELETEDATAButton;
    private JTable table2;
    private JButton VIEWDATAButton1;
    private JButton ADDDATAButton1;
    private JButton DELETEDATAButton1;
    private JTextField txtName;
    private JTextField txtAddress;
    private JTextField txtContact;
    private JButton SUBMITButton;
    private JTabbedPane tabbedPane2;
    private JButton ADDDEALSButton;
    private JButton VIEWDEALSButton;
    private JTable table3;
    private JButton NAMEButton;
    private JButton LOCKEDAMTButton;
    private JButton RECEIVEDAMTButton;
    private JButton EXPECTEDDELIVERYButton;
    private JButton DEALCREATIONButton;
    //    private JTextField textName;
    private JTextField textLockedAmt;
    private JTextField textRecievedAmt;


    private JButton DEALSButton;

    private JComboBox textName;
    private JPanel panel1;
    private JButton SUBMITButton1;
    private JTable table4;
    private JButton EMPLOYEEButton;
    private JTabbedPane tabbedPane3;
    private JButton ADDEMPLOYEEButton;
    private JButton REMOVEEMPLOYEEButton;
    private JButton VIEWEMPLOYEEButton;
    private JTextField Employeeid;
    private JTextField Ename;
    private JTextField Edesignation;
    private JTextField Econtact;
    private JTextField Ewages;
    private JTextField Joining;
    private JTextField Leaving;
    private JButton SUBMITButton2;
    private JTabbedPane tabbedPane4;
    private JButton ADDSALARYButton;
    private JButton VIEWSALARYButton;
    private JButton DELETESALARYButton;
    private JTable table5;
    private JButton SUBMITButton3;
    private JTextField textWorkhours;
    private JTextField textWages;
    private JTextField textPaydate;
    private JButton SALARYButton;
    private JComboBox EmpName;
    private JTabbedPane tabbedPane5;
    private JTable table6;
    private JTextField stockIncQty;
    private JTextField StockIncCost;
    private JTextField stockIncDate;
    private JButton VIEWEMPLOYEEButton1;
    private JComboBox stockDealer;
    //    private JComboBox stockIncId;
    private JComboBox stockIncDesc;
    private JButton SUBMITButton4;
    private JButton STOCKINCOMINGButton;
    private JComboBox stockIncSize;
    private JButton ADDSTOCKButton;
    private JButton VIEWSTOCKButton;
    private JButton DELETESTOCKButton;
    private JTabbedPane tabbedPane6;
    private JPanel panel2;
    private JButton VIEWOUTGOINGSTOCKButton;
    private JButton DELETEOUTGOINGSTOCKButton;
    private JButton ADDSTOCKOUTGOINGButton;
    private JTable table7;
    private JButton stockOutgoingButton;
    private JComboBox StockOutdealer;
    private JComboBox StockOutproduct;
    private JTextField StockOutqty;
    private JComboBox StockOutsize;
    private JTextField StockOutcost;
    private JTextField StockOutdate;
    private JButton SUBMITButton6;
    private JTabbedPane tabbedPane7;
    private JButton ADDEXPENSESButton;
    private JButton VIEWEXPENSESButton;
    private JButton DELETEEXPENSESButton;
    private JTable table8;
    private JTextField repairField;
    private JTextField packingField;
    private JTextField machineField;
    private JTextField lightField;
    private JTextField conveyanceField;
    private JTextField officeField;
    private JTextField promotionField;
    private JTextField taxesField;
    private JButton SUBMITButton5;
    private JTextField commissionField;
    private JButton OTHEREXPENSESButton;
    private JTextArea WELCOMETOEXPENSIFYTextArea;
    private JTextArea FACTORYMANAGEMENTAPPLICATIONTextArea;
    private JTextArea textArea1;
    private JTextArea textArea2;
    private JTextField Searchid;
    private JButton UPDATEEMPLOYEEButton;
    private JDatePicker joiningdate;
    private JDatePicker leavingdate;
    private JButton DELETEDEALSButton;
    private JComboBox textStatus;
    private JDatePicker textDeal;
    private JDatePicker deliverText;
    private JTextField productfield;
    private JDatePicker stockIncomingdate;
    private JDatePicker stockoutgoingdate;
    private JDatePicker salaryDate;
    private JTextArea PROFITANDLOSSTextArea;
    private JTable table9;
    private JButton PROFITLOSSButton;
    private DefaultTableModel tableModelPL;
    private DefaultTableModel tableModel;
    private DefaultTableModel tableModel1;
    private DefaultTableModel tableModelEmployee;
    private DefaultTableModel tableModelSalary;
    private DefaultTableModel tableStockInc;
    private DefaultTableModel tableModelStockOut;
    private DefaultTableModel expenseTable;

    public tab() {
        Connect();
        tabbedPane1.setSelectedIndex(1);
        PRODUCTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                createTable();
                tabbedPane1.setSelectedIndex(0);
                viewDataInserted();
//                tabbedPane1.setEnabledAt(1, false);
//                tabbedPane1.setEnabledAt(2, false);
//                tabbedPane1.setEnabledAt(3, false);
//                tabbedPane1.setEnabledAt(4, false);
//                tabbedPane1.setEnabledAt(5, false);
//                tabbedPane1.setEnabledAt(6, false);
//                tabbedPane1.setEnabledAt(7, false);
//                tabbedPane1.setEnabledAt(8, false);
//                tabbedPane1.setEnabledAt(9, false);
//                tabbedPane1.setEnabledAt(10, false);


            }
        });

//        --------------------functionofaddingdata---------------------------
        ADDDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDataToTable();

            }
        });
// ---------------------------------viewdatabutton-----------------------
        VIEWDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewDataInserted();
            }
        });

//        ----------------------------deletedatabutton----------------------
        DELETEDATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedData();
            }
        });
        DEALERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createDealerTable();
                tabbedPane1.setSelectedIndex(4);
            }
        });
        VIEWDATAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewDealersData();
            }
        });
        ADDDATAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(8);

            }
        });
        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String validatedContact = validationFunction(txtContact.getText());

                if (!validatedContact.isEmpty()) {
                    addDealerData();
                }

            }
        });
        DELETEDATAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteDealerData();
            }
        });
        DEALSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                tabbedPane1.setSelectedIndex(9);
                tabbedPane2.setSelectedIndex(0);
                createDealTable();
                viewDealsData();
            }
        });
        textName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                comboBox.showPopup();
                fetchNameDealer(comboBox);

            }
        });
        ADDDEALSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane2.setSelectedIndex(1);

            }
        });

        VIEWDEALSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane2.setSelectedIndex(0);
                viewDealsData();

            }
        });
        SUBMITButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDealsData();
            }
        });
//
        EMPLOYEEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(5);
                createEmployeeTable();
                viewEmployeeData();
            }
        });
        ADDEMPLOYEEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane3.setSelectedIndex(1);
            }
        });

        ADDEMPLOYEEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane3.setSelectedIndex(1);
            }
        });
        REMOVEEMPLOYEEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteEmployeeData();
            }
        });
        SUBMITButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addEmployeeData();
            }
        });
        SALARYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(6);
                tabbedPane4.setSelectedIndex(0);
                createSalaryTable();
                tabbedPane4.setSelectedIndex(0);
                viewSalaryData();
            }
        });

        ADDSALARYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane4.setSelectedIndex(1);

            }
        });
        EmpName.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox comboBox1 = (JComboBox) e.getSource();
                comboBox1.showPopup();
                fetchNameEmployee(comboBox1);


            }
        });
        VIEWSALARYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewSalaryData();
            }
        });
        DELETESALARYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSalaryData();
            }
        });
        STOCKINCOMINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(7);
                createStockIncTable();
                viewStockIncData();
            }
        });


        stockIncSize.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox comboBox5 = (JComboBox) e.getSource();
                comboBox5.showPopup();
                setComboBoxValues(comboBox5, SizeOptions.values());
            }
        });
        SUBMITButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStockInc();
            }
        });
        VIEWSTOCKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane5.setSelectedIndex(0);
                viewStockIncData();
            }
        });
        DELETESTOCKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStockIncData();
            }
        });
        VIEWSALARYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane4.setSelectedIndex(0);
                viewSalaryData();

            }
        });
        SUBMITButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addSalaryData();
            }
        });
        stockOutgoingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(10);
                createStockOutTable();
                viewStockOutData();
            }
        });
        ADDSTOCKOUTGOINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane6.setSelectedIndex(1);
            }
        });
        SUBMITButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStockOut();
            }
        });
        StockOutdealer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox StockOutdealer = (JComboBox) e.getSource();
                StockOutdealer.showPopup();
                fetchDealsId(StockOutdealer);
            }
        });
        StockOutproduct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox StockOutproduct = (JComboBox) e.getSource();
                StockOutproduct.showPopup();
                fetchProductId(StockOutproduct);
            }
        });

        StockOutsize.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox Stockoutsize = (JComboBox) e.getSource();
                Stockoutsize.showPopup();
                setComboBoxValues(Stockoutsize, SizeOptions.values());
            }
        });
        StockOutproduct.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedProduct = (String) e.getItem();
                    System.out.println("Selected Product: " + selectedProduct);
                }
            }
        });
        StockOutdealer.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedDealer = (String) e.getItem();
                    System.out.println("Selected Id" + selectedDealer);
                }
            }
        });
        VIEWOUTGOINGSTOCKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane6.setSelectedIndex(0);
                viewStockOutData();
            }
        });
        StockOutsize.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedSize = (String) e.getItem();
                    System.out.println("Selected Product" + selectedSize);
                }
            }
        });
        DELETEOUTGOINGSTOCKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStockOutData();
            }
        });
        OTHEREXPENSESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(2);
                createExpenseTable();
                viewExpenseData();
            }
        });
        ADDEXPENSESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane7.setSelectedIndex(1);

            }
        });
        SUBMITButton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addOtherExpenses();
            }
        });
        VIEWEXPENSESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane7.setSelectedIndex(0);
                viewExpenseData();
            }
        });
        DELETEEXPENSESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteExpense();
            }
        });
        ADDSTOCKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane5.setSelectedIndex(1);
            }
        });
        VIEWEMPLOYEEButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane3.setSelectedIndex(0);
                createEmployeeTable();
                viewEmployeeData();
            }
        });
        VIEWEMPLOYEEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane3.setSelectedIndex(1);
                try {
                    String eid = Searchid.getText();

                    pst = con.prepareStatement("SELECT employee_id, name, designation, contact_no, wage, joining_date, leaving_date FROM employeedetails WHERE employee_id = ?");
                    pst.setString(1, eid);
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        String employee_id = rs.getString(1);
                        String name = rs.getString(2);
                        String designation = rs.getString(3);
                        String contact_no = rs.getString(4);
                        String wage = rs.getString(5);
                        java.sql.Date joining_date = rs.getDate(6);
                        java.sql.Date leaving_date = rs.getDate(7);

                        Employeeid.setText(employee_id);
                        Ename.setText(name);
                        Edesignation.setText(designation);
                        Econtact.setText(contact_no);
                        Ewages.setText(wage);

                        // Set joining date in date picker
                        if (joining_date != null) {
                            UtilCalendarModel joiningDateModel = new UtilCalendarModel();
                            joiningDateModel.setDate(joining_date.toLocalDate().getYear(), joining_date.toLocalDate().getMonthValue() - 1, joining_date.toLocalDate().getDayOfMonth());
                            joiningdate.getModel().setDate(joiningDateModel.getYear(), joiningDateModel.getMonth() + 1, joiningDateModel.getDay());
                            joiningdate.getModel().setSelected(true);
                        } else {
                            joiningdate.getModel().setSelected(false);
                        }

                        // Set leaving date in date picker
                        if (leaving_date != null) {
                            UtilCalendarModel leavingDateModel = new UtilCalendarModel();
                            leavingDateModel.setDate(leaving_date.toLocalDate().getYear(), leaving_date.toLocalDate().getMonthValue() - 1, leaving_date.toLocalDate().getDayOfMonth());
                            leavingdate.getModel().setDate(leavingDateModel.getYear(), leavingDateModel.getMonth() + 1, leavingDateModel.getDay());
                            leavingdate.getModel().setSelected(true);
                        } else {
                            leavingdate.getModel().setSelected(false);
                        }

                    } else {
                        Employeeid.setText("");
                        Ename.setText("");
                        Edesignation.setText("");
                        Econtact.setText("");
                        Ewages.setText("");
                        joiningdate.getModel().setSelected(false);
                        leavingdate.getModel().setSelected(false);
                        JOptionPane.showMessageDialog(null, "Invalid Employee ID");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


        UPDATEEMPLOYEEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String eid;
                String employee_id, name, designation, contact_no, joining_date, leaving_date;
                int wage;

                employee_id = Employeeid.getText();
                name = titleCaseFunction(Ename.getText());
                designation = Edesignation.getText();
                contact_no = Econtact.getText();
                wage = Integer.parseInt(Ewages.getText());
                joining_date = Joining.getText();
                leaving_date = Leaving.getText();
                eid = Searchid.getText();


                try {
                    pst = con.prepareStatement("UPDATE employeedetails set employee_id=? , name=? , designation=? , contact_no=? , wage=? , joining_date=? , leaving_date=? where employee_id=? ");
                    pst.setString(1, employee_id);
                    pst.setString(2, name);
                    pst.setString(3, designation);
                    pst.setString(4, contact_no);
                    pst.setInt(5, wage);
                    pst.setString(6, joining_date);
                    pst.setString(7, leaving_date);
                    pst.setString(8, eid);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated !!");

                    Employeeid.setText("");
                    Ename.setText("");
                    Edesignation.setText("");
                    Econtact.setText("");
                    Ewages.setText("");
                    Joining.setText("");
                    Leaving.setText("");
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


        Searchid.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                Searchid.setText("");
            }
        });
        textStatus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JComboBox textStatus = (JComboBox) e.getSource();
                textStatus.showPopup();
                setComboBoxValues(textStatus, SizeOption.values());
            }
        });
        DELETEDEALSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table3.getSelectedRow();
                if (selectedRow != -1) {
                    String idToDelete = (String) tableModel.getValueAt(selectedRow, tableModel.findColumn("S No."));
                    try {
                        pst = con.prepareStatement("DELETE FROM deals where id = ?");
                        pst.setString(1, idToDelete);
                        int rowsAffected = pst.executeUpdate();

                        if (rowsAffected > 0) {
                            System.out.println(rowsAffected + "Data removed Successfully");
                            tableModel.removeRow(selectedRow);
                        } else {
                            System.out.println("Select a row");
                        }

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Select a row to delete");
                }
            }
        });
        PROFITLOSSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tabbedPane1.setSelectedIndex(3);
             createProfitLossTable();
             viewProfitLoss();
            }
        });
    }


    //--------------------------mainmethodSetup-----------------------------
    public static void main(String[] args) {

        JFrame frame = new JFrame("tab");
        frame.setContentPane(new tab().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    //---------------------------createtablefunction------------------------
    private void createTable() {
        tableModel = new DefaultTableModel(new String[]{"S No.", "name", "mfgcost", "time"}, 1);
        table1.setModel(tableModel);
    }

    private void createDealerTable() {
        tabbedPane1.setSelectedIndex(2);
        tableModel1 = new DefaultTableModel(new String[]{"dealerid", "name", "dealeraddress", "contact"}, 0);
        table2.setModel(tableModel1);
        ViewDealersData();
    }

    //  --------------------------addingdatatotable--------------------------------
//    ------------------------------------PRODUCTTABLE-----------------------------
    private void addDataToTable() {
        String name, mfgcost;

        do {
            name = JOptionPane.showInputDialog("Enter name");
            mfgcost = JOptionPane.showInputDialog("Enter mfgcost");

            if (name == null || name.isEmpty() || mfgcost == null || mfgcost.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields");
                break;
            } else {
                try {
                    int mfgcostValue = Integer.parseInt(mfgcost);

                    if (!isValidPositiveInteger(mfgcostValue)) {
                        JOptionPane.showMessageDialog(null, "Please enter a valid positive integer for mfgcost");
                        continue;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid integer for mfgcost");
                    continue;
                }
            }
            insertDataIntoDatabase(name, mfgcost, LocalTime.now());
            break;

        } while (true);

//        LocalTime time = LocalTime.now();
//        Object[] rowData = {name, mfgcost, time};
//        tableModel.addRow(rowData);
//        insertDataIntoDatabase(name, mfgcost, time);
    }

    private boolean isValidPositiveInteger(int value) {
        return value > 0;
    }


    //------------------------------insertdataintosql------------------------------
    private void insertDataIntoDatabase(String name, String mfgcost, LocalTime time) {
        try {
            String query = "INSERT INTO product ( name, mfgcost, time) VALUES ( ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, name);
            pst.setString(2, mfgcost);
            pst.setObject(3, time);

            pst.executeUpdate();
            System.out.println("Data inserted into MySQL database.");

            SwingUtilities.invokeLater(() -> {

                int option = JOptionPane.showConfirmDialog(null, "Would you like to view inserted data?", "Confirmation",
                        JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    viewDataInserted();
                }
                if (option == JOptionPane.NO_OPTION) {
                    tabbedPane1.setSelectedIndex(1);
                }
            });

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //-------------------------------Deleteddata----------------------
    private void deleteSelectedData() {
        int selectedRow = table1.getSelectedRow();

        if (selectedRow != -1) {
            try {
                // Assuming "name" is in the second column (index 1) of your table model
                String nameToDelete = (String) tableModel.getValueAt(selectedRow, 1);

                String deleteQuery = "DELETE FROM product WHERE name = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                    preparedStatement.setString(1, nameToDelete);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " row(s) deleted successfully.");
                        tableModel.removeRow(selectedRow);
                        viewDataInserted();
                    } else {
                        System.out.println("No rows deleted. Name not found.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(main, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }


//    ------------------------------ViewDataInserted--------------------------

    public void viewDataInserted() {
        try {
            String query = "SELECT  name , mfgcost , time FROM product";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableModel.setRowCount(0);
            int numbers = 1;
            while (rs.next()) {
                Object[] rowData = {
                        numbers++,
                        rs.getString("name"),
                        rs.getString("mfgcost"),
                        rs.getObject("time")
                };
                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void addDealerData() {
        String name, dealeraddress, contact;

        name = titleCaseFunction(txtName.getText());
        dealeraddress = txtAddress.getText();
        contact = validationFunction(txtContact.getText());


        try {
            String query = "INSERT into dealer(name,dealeraddress,contact) VALUES(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, name);
            pst.setString(2, dealeraddress);
            pst.setString(3, contact);
            pst.executeUpdate();

            txtName.setText("");
            txtAddress.setText("");
            txtContact.setText("");
            txtContact.requestFocus();
            JOptionPane.showMessageDialog(null, "Record added");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void ViewDealersData() {
        try {
            String query = "Select dealerid ,name , dealeraddress , contact from dealer";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rst = pst.executeQuery();

            tableModel1.setRowCount(0);
            while (rst.next()) {
                Object[] rowData = {
                        rst.getString("dealerid"),
                        titleCaseFunction(rst.getString("name")),
                        rst.getString("dealeraddress"),
                        validationFunction(rst.getString("contact"))

                };
                tableModel1.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private void deleteDealerData() {
        int selectedRow = table2.getSelectedRow();

        if (selectedRow != -1) {
            String idToDelete = (String) tableModel1.getValueAt(selectedRow, tableModel1.findColumn("dealerid"));

            try {
                String deleteQuery = "DELETE FROM dealer WHERE dealerid = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                    preparedStatement.setString(1, idToDelete);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " row(s) deleted successfully.");
                        tableModel1.removeRow(selectedRow);
                    } else {
                        System.out.println("No rows deleted. ID not found.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(main, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }


    }


    //  --------------------Variabledeclaration-------------------------
    Connection con;
    PreparedStatement pst;

    // -------------------------Connectionwithdatabase--------------------
    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/factory", "root", "");
            System.out.println("Success");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //     -------------------convertStringtoTitlecase--------------------------
    public static String titleCaseFunction(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return Character.toTitleCase(input.charAt(0)) + input.substring(1).toLowerCase();
    }

    public static String validationFunction(String input) {
        if (input.length() <= 0) {
            showError("Write valid Input");


        }

        return input;
    }


    public static void showError(String message) {
        JOptionPane.showMessageDialog(null, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    //  -----------------------------------deals--------------------------
    private void createDealTable() {
        tableModel = new DefaultTableModel(new String[]{"S No.", "Name", "Locked amt", "Recieved amt", "Status", "Expected Delivery", "Deal Creation"}, 1);
        table3.setModel(tableModel);
    }

    private void viewDealsData() {
        try {
            String query = "SELECT deals.id , name , locked_amt , received_amt, status , expected_delivery , deal_creation from deals INNER JOIN dealer ON deals.dealerid = dealer.dealerid";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableModel.setRowCount(0);
            while (rs.next()) {
                Object[] rowData = {
                        rs.getString("id"),
                        titleCaseFunction(rs.getString("name")),
                        rs.getString("locked_amt"),
                        rs.getString("received_amt"),
                        rs.getString("status"),
                        rs.getString("expected_delivery"),
                        rs.getString("deal_creation")
                };

                tableModel.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addDealsData() {
        String dealerid, status;
        int locked_amt, received_amt;


        setComboBoxValue(textStatus, SizeOption.values());
        dealerid = textName.getSelectedItem().toString();

        status = getStringValue(textStatus);

        try {
            locked_amt = validateAndParsePositiveInteger(textLockedAmt.getText());


            received_amt = validateAndParsePositiveInteger(textRecievedAmt.getText());

            UtilCalendarModel expectedDelivery = (UtilCalendarModel) deliverText.getModel();
            UtilCalendarModel dealCreation = (UtilCalendarModel) textDeal.getModel();

            java.util.Calendar expectedCalendar = expectedDelivery.getValue();
            java.util.Calendar dealCalendar = dealCreation.getValue();

            java.util.Date deliverText = expectedCalendar.getTime();
            java.util.Date textDeal = dealCalendar.getTime();

            java.sql.Date sqlDelivery = new java.sql.Date(deliverText.getTime());
            java.sql.Date sqlDeal = new java.sql.Date(textDeal.getTime());

            int myid = fetchDealerId(dealerid);

            String query = "INSERT into deals(dealerid , locked_amt , received_amt , status, expected_delivery , deal_creation)VALUES(?,?,?,?,?,?)";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setInt(1, myid);
                pst.setInt(2, locked_amt);
                pst.setInt(3, received_amt);
                pst.setString(4, status);
                pst.setDate(5, sqlDelivery);
                pst.setDate(6, sqlDeal);
                pst.executeUpdate();

                fetchNameDealer(new JComboBox<>());

                textName.setSelectedIndex(-1);
                textLockedAmt.setText("");
                textRecievedAmt.setText("");
                textStatus.removeAllItems();
                expectedDelivery.setValue(null);
                dealCreation.setValue(null);
                JOptionPane.showMessageDialog(null, "Record Added!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter valid positive integer values for locked_amt and received_amt");
        }
    }

    private int validateAndParsePositiveInteger(String value) throws NumberFormatException {
        int intValue = Integer.parseInt(value);
        if (isValidPositiveInteger(intValue)) {
            return intValue;
        } else {
            throw new NumberFormatException("Not a positive integer");
        }
    }


    enum SizeOption {
        Pending, Shipped, Delivered, Completed;
    }

    private void setComboBoxValue(JComboBox<String> textStatus, Enum<?>[] values) {
//        comboBox5.removeAllItems();
        for (Enum<?> value : values) {
            textStatus.addItem(value.toString());
        }
    }

    private void fetchNameDealer(JComboBox<String> comboBox) {
        try {

            String query = "SELECT name from dealer";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            Vector<String> names = new Vector<>();
            while (rs.next()) {
                names.add(rs.getString("name"));

            }
            comboBox.setModel(new DefaultComboBoxModel<>(names));
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private int fetchDealerId(String name) {

        String query = "SELECT dealerid from dealer where name =?";
        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt("dealerid");
            }
            return -1;


        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }


//    private String fetchDealerName(int dealerid) {
//        String query = "SELECT name FROM dealer WHERE dealerid = ?";
//        try {
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setInt(1, dealerid);
//            ResultSet rs = pst.executeQuery();
//
//            if (rs.next()) {
//                return rs.getString("name");
//            }
//
//            // Return an indication that no dealer name was found
//            return null;
//        } catch (SQLException e) {
//            e.printStackTrace();
//            // Handle the exception appropriately, for example, logging or rethrowing
//        }
//
//        // If an exception occurs, return an indication (null or an empty string) as appropriate
//        return null;
//    }

    //    ------------------------EMPLOYEEDATA-----------------------------
    private void createEmployeeTable() {
        tableModelEmployee = new DefaultTableModel(new String[]{"No.", "Name", "Designation", "Contact No.", "Wage", "Joining Date", "Leaving Date"}, 0);
        table4.setModel(tableModelEmployee);
    }


    private void addEmployeeData() {
        String employee_id, name, designation, contact_no, joining_date, leaving_date;
        int wage;

        employee_id = Employeeid.getText();
        name = titleCaseFunction(Ename.getText());
        designation = Edesignation.getText();
        contact_no = Econtact.getText();

        try {
            // Validate wage as a positive integer
            wage = Integer.parseInt(Ewages.getText());

            if (isValidPositiveInteger(wage)) {
                // Assuming joiningdate and leavingdate are JDatePicker instances
                UtilCalendarModel joiningDateModel = (UtilCalendarModel) joiningdate.getModel();
                UtilCalendarModel leavingDateModel = (UtilCalendarModel) leavingdate.getModel();

                // Get the selected dates
                java.util.Calendar joiningCalendar = joiningDateModel.getValue();
                java.util.Calendar leavingCalendar = leavingDateModel.getValue();

                // Convert java.util.Calendar to java.util.Date if needed
                java.util.Date joiningDate = joiningCalendar.getTime();
                java.util.Date leavingDate = leavingCalendar.getTime();

                // Convert java.util.Date to java.sql.Date if needed
                java.sql.Date sqlJoiningDate = new java.sql.Date(joiningDate.getTime());
                java.sql.Date sqlLeavingDate = new java.sql.Date(leavingDate.getTime());

                // Insert data only if the wage is a valid positive integer
                String query = "INSERT into employeedetails(employee_id, name, designation, contact_no, wage, joining_date, leaving_date) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pst = con.prepareStatement(query)) {
                    pst.setString(1, employee_id);
                    pst.setString(2, name);
                    pst.setString(3, designation);
                    pst.setString(4, contact_no);
                    pst.setInt(5, wage);
                    pst.setDate(6, sqlJoiningDate); // Use setDate for SQL DATE type
                    pst.setDate(7, sqlLeavingDate); // Use setDate for SQL DATE type
                    pst.executeUpdate();

                    Employeeid.setText("");
                    Ename.setText("");
                    Edesignation.setText("");
                    Econtact.setText("");
                    Ewages.setText("");
                    joiningDateModel.setValue(null); // Clear the date picker
                    leavingDateModel.setValue(null); // Clear the date picker

                    JOptionPane.showMessageDialog(null, "Record added");
                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Id is taken");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Enter a valid positive integer value for wage");
            }
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException (if wage is not a valid integer)
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Enter a valid integer value for wage");
        }
    }


    public void viewEmployeeData() {
        try {
            String query = "SELECT   name , designation , contact_no, wage , joining_date , leaving_date FROM employeedetails";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableModelEmployee.setRowCount(0);
            int number = 1;
            while (rs.next()) {
                Object[] rowData = {

                        number++,
                        rs.getString("name"),
                        rs.getString("designation"),
                        rs.getInt("contact_no"),
                        rs.getInt("wage"),
                        rs.getString("joining_date"),
                        rs.getString("leaving_date")

                };
                tableModelEmployee.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void deleteEmployeeData() {
        int selectedRow = table4.getSelectedRow();

        if (selectedRow != -1) {
            String idToDelete = (String) tableModelEmployee.getValueAt(selectedRow, tableModelEmployee.findColumn("Name"));

            try {
                String deleteQuery = "DELETE FROM employeedetails WHERE name = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                    preparedStatement.setString(1, idToDelete);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " row(s) deleted successfully.");
                        tableModelEmployee.removeRow(selectedRow);
                    } else {
                        System.out.println("No rows deleted. ID not found.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(main, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }


    }

    //    --------------------------------SalaryDetails---------------------------------
    private void createSalaryTable() {
        tableModelSalary = new DefaultTableModel(new String[]{"No.", "Name", "Work Hrs", "Extra Hrs", "Wages PH.", "Total Wages", "Pay Date"}, 0);
        table5.setModel(tableModelSalary);
    }


    public void addSalaryData() {
        String employee_id;
        int workhours, wagesperhr;
        employee_id = EmpName.getSelectedItem().toString();
        workhours = Integer.parseInt(textWorkhours.getText());
        wagesperhr = Integer.parseInt(textWages.getText());


        try {
            if (isValidPositiveInteger(workhours) && isValidPositiveInteger(wagesperhr)) {

                UtilCalendarModel payModel = (UtilCalendarModel) salaryDate.getModel();
                java.util.Calendar payCalender = payModel.getValue();
                java.util.Date payDate = payCalender.getTime();
                java.sql.Date newDate = new java.sql.Date(payDate.getTime());

                int myid = fetchEmployeeId(employee_id);

                int workHours;
                int maxRegularHours = 8;
                int regularHours = Math.min(workhours, maxRegularHours);
                int extraHours = Math.max(workhours - maxRegularHours, 0);

                String query = "INSERT into employee(employee_id , work_hours , extra_hrs , wage_per_hour, total_wage , Pay_date)VALUES(?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, myid);
                pst.setInt(2, regularHours);
                pst.setInt(3, extraHours);
                pst.setInt(4, wagesperhr);
                int totalWage = (regularHours + extraHours) * wagesperhr;
                pst.setInt(5, totalWage);
                pst.setDate(6, newDate);
                pst.executeUpdate();

                fetchNameEmployee(new JComboBox<>());

                EmpName.setSelectedIndex(-1);
                textWorkhours.setText("");
                textWages.setText("");
                payModel.setValue(null);

                JOptionPane.showMessageDialog(null, "Record Added!");

            } else {
                JOptionPane.showMessageDialog(null, "Enter valid integer value in Wages & Workhours");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void fetchNameEmployee(JComboBox<String> comboBox1) {
        try {

            String query = "SELECT name from employeedetails";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            Vector<String> employees = new Vector<>();
            while (rs.next()) {
                employees.add(rs.getString("name"));

            }
            comboBox1.setModel(new DefaultComboBoxModel<>(employees));
            rs.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private int fetchEmployeeId(String name) {

        String query = "SELECT employee_id from employeedetails where name =?";
        try {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return rs.getInt("employee_id");
            }
            return -1;


        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    private void viewSalaryData() {
        try {
            String query = "SELECT employee.id ,name , work_hours , extra_hrs , wage_per_hour,total_wage , Pay_date from employee INNER JOIN employeedetails ON employee.employee_id = employeedetails.employee_id ";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableModelSalary.setRowCount(0);
            int number = 1;
            while (rs.next()) {
                Object[] rowData = {
                        number++,
//                        rs.getString("id"),
                        titleCaseFunction(rs.getString("name")),
                        rs.getString("work_hours"),
                        rs.getString("extra_hrs"),
                        rs.getString("wage_per_hour"),
                        rs.getString("total_wage"),
                        rs.getString("Pay_date")
                };

                tableModelSalary.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void deleteSalaryData() {
        int selectedRow = table5.getSelectedRow();

        if (selectedRow != -1) {
            int idToDelete = (int) tableModelSalary.getValueAt(selectedRow, tableModelSalary.findColumn("No."));

            try {
                String deleteQuery = "DELETE FROM employee WHERE id = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                    preparedStatement.setInt(1, idToDelete);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " row(s) deleted successfully.");
                        tableModelSalary.removeRow(selectedRow);
                    } else {
                        System.out.println("No rows deleted. ID not found.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(main, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }


    }

    //    -------------------------------STOCK INCOMING----------------------
    public void createStockIncTable() {
        tableStockInc = new DefaultTableModel(new String[]{"S No.", "Name", "Qty", "Size", "Cost(INR)", "Incoming Date"}, 0);
        table6.setModel(tableStockInc);

    }

    private void addStockInc() {
        setComboBoxValues(stockIncSize, SizeOptions.values());
        String stockInc_desc, stockInc_size;
        int stockInc_qty, stockInc_cost;
        stockInc_desc = productfield.getText();
        stockInc_qty = Integer.parseInt(stockIncQty.getText());
        stockInc_size = getStringValue(stockIncSize);
        stockInc_cost = Integer.parseInt(StockIncCost.getText());
//    stockInc_date = stockIncomingdate.getDateFormat();

        try {
            if (isValidPositiveInteger(stockInc_qty) && isValidPositiveInteger(stockInc_cost)) {


                UtilCalendarModel calendarModel = (UtilCalendarModel) stockIncomingdate.getModel();
                java.util.Calendar calendarDate = calendarModel.getValue();
                java.util.Date dateCalender = calendarDate.getTime();
                java.sql.Date newDate = new java.sql.Date(dateCalender.getTime());


                String query = "INSERT INTO stockincoming ( product_desc ,qty ,  size ,product_cost ,incoming_date )VALUES(?,?,?,?,?) ";
                PreparedStatement pst = con.prepareStatement(query);


                pst.setString(1, stockInc_desc);
                pst.setInt(2, stockInc_qty);
                pst.setString(3, stockInc_size);
                pst.setInt(4, stockInc_cost);
                pst.setDate(5, newDate);

                pst.executeUpdate();
                pst.close();
                JOptionPane.showMessageDialog(null, "Data inserted");

                productfield.setText("");
                stockIncQty.setText("");
                stockIncSize.removeAllItems();
                StockIncCost.setText("");
                calendarModel.setValue(null);
            } else {
                JOptionPane.showMessageDialog(null, "Write positive integer value for Qty & Cost");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Write correct integer value for Qty & Cost");
            ex.printStackTrace();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Write correct integer value for Qty & Cost");
            e.printStackTrace();
        }


    }

    private void fetchProductId(JComboBox<String> comboBox2) {
        try {
            String query = "SELECT id FROM product";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();


            while (rs.next()) {
                comboBox2.addItem(rs.getString("id"));
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchProductName(JComboBox<String> comboBox3) {
        try {
            String query = "SELECT name FROM product";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

//            comboBox3.removeAllItems();

            while (rs.next()) {
                comboBox3.addItem(rs.getString("name"));
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchDealsId(JComboBox<String> stockOutdealer) {
        try {
            String query = "Select id from deals";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                stockOutdealer.addItem(String.valueOf(rs.getInt("id")));
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void fetchDealerName(JComboBox<String> comboBox4) {
        try {
            String query = "SELECT name FROM dealer";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

//            comboBox4.removeAllItems();

            while (rs.next()) {
                comboBox4.addItem(rs.getString("name"));
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    enum SizeOptions {
        SMALL, MEDIUM, LARGE;
    }

    private void setComboBoxValues(JComboBox<String> comboBox5, Enum<?>[] values) {

        for (Enum<?> value : values) {
            comboBox5.addItem(value.toString());
        }
    }

    private String getStringValue(JComboBox<?> comboBox) {
        Object selectedItem = comboBox.getSelectedItem();
        return (selectedItem != null) ? selectedItem.toString() : "";
    }

    private void viewStockIncData() {


        try {
            String query = "SELECT id, product_desc, qty ,size,product_cost ,incoming_date FROM stockincoming";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableStockInc.setRowCount(0);
            int number = 1;
            while (rs.next()) {
                Object[] rowData = {
                        number++,
                        titleCaseFunction(rs.getString("product_desc")),
                        rs.getString("qty"),
                        rs.getString("size"),
                        rs.getString("product_cost"),

                        rs.getString("incoming_date")
                };

                tableStockInc.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void deleteStockIncData() {
        int selectedRow = table6.getSelectedRow();

        try {
            String query = "SELECT id FROM stockincoming";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            List<String[]> dataList = new ArrayList<>();
            while (rs.next()) {
                String[] rowData = {
                        rs.getString("id")
                };
                dataList.add(rowData);
            }

            // Print the data in the array
            int i = 1;
            for (String[] row : dataList) {
                if (i == selectedRow + 1) {
                    for (String value : row) {
                        String idToDelete = value;
                        try {
                            String deleteQuery = "DELETE FROM stockincoming WHERE id = ?";
                            try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                                preparedStatement.setString(1, idToDelete);
                                int rowsAffected = preparedStatement.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println(rowsAffected + " row(s) deleted successfully.");
                                    tableStockInc.removeRow(selectedRow);
                                } else {
                                    System.out.println("No rows deleted. ID not found.");
                                }
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                }
                i = i + 1;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    //    ----------------------------stockoutgoing--------------------------------
    private void createStockOutTable() {
        tableModelStockOut = new DefaultTableModel(new String[]{"No.", "Deal id","Dealer name", "Product id", "Qty", "Size", "Mfg Cost", "Outgoing Date"}, 0);
        table7.setModel(tableModelStockOut);
    }

    private void addStockOut() {
        fetchDealsId(StockOutdealer);
        fetchProductId(StockOutproduct);
        setComboBoxValues(StockOutsize, SizeOptions.values());

        String stockOut_qty, stockOut_size, stockOut_cost, stockOut_deal;
        int stockOut_product;
        stockOut_qty = StockOutqty.getText();
        stockOut_size = getStringValue(StockOutsize);
        stockOut_cost = StockOutcost.getText();
        stockOut_product = Integer.parseInt(getStringValue(StockOutproduct));
        stockOut_deal = getStringValue(StockOutdealer);

        try {
            UtilCalendarModel stockoutModel = (UtilCalendarModel) stockoutgoingdate.getModel();
            java.util.Calendar modelDate = stockoutModel.getValue();
            java.util.Date modelCalender = modelDate.getTime();
            java.sql.Date goingDate = new java.sql.Date(modelCalender.getTime());

            String query = "INSERT INTO stockoutward (dealsid, productid, qty, size, mfgcost, outgoingdate) VALUES(?,?,?,?,?,?)";


            PreparedStatement pst = con.prepareStatement(query);


            pst.setString(1, stockOut_deal);
//            pst.setString(2, dealer_name);
            pst.setString(2, String.valueOf(stockOut_product));
            pst.setString(3, stockOut_qty);
            pst.setString(4, stockOut_size);
            pst.setString(5, stockOut_cost);
            pst.setDate(6, goingDate);

            pst.executeUpdate();
            pst.close();


            // Clear UI components after successful insertion
            StockOutdealer.removeAllItems();
            StockOutproduct.removeAllItems();
            StockOutqty.setText("");
            StockOutsize.removeAllItems();
            StockOutcost.setText("");
            stockoutModel.setValue(null);

            JOptionPane.showMessageDialog(null, "Product added");

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    private void viewStockOutData() {
        try {
            String query = "SELECT dealsid,d1.name, productid, qty, size, so.mfgcost, outgoingdate " +
                    "FROM stockoutward so " +
                    "JOIN product p ON so.productid = p.id " +
                    "JOIN deals d ON so.dealsid = d.id " +
                    "JOIN dealer d1 on d.dealerid = d1.dealerid ";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableModelStockOut.setRowCount(0);
            int number = 1;
            while (rs.next()) {
                Object[] rowData = {
                        number++,
                        rs.getString("dealsid"),
                        rs.getString("name"),
                        rs.getString("productid"),
                        rs.getString("qty"),
                        rs.getString("size"),
                        rs.getString("mfgcost"),
                        rs.getString("outgoingdate")
                };
                tableModelStockOut.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    private void deleteStockOutData() {
        int selectedRow = table7.getSelectedRow();

        if (selectedRow != -1) {
            int idToDelete = (int) tableModelStockOut.getValueAt(selectedRow, 0);

            try {
                String deleteQuery = "DELETE FROM stockoutward WHERE id = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                    preparedStatement.setInt(1, idToDelete);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " row(s) deleted successfully.");
                        tableModelStockOut.removeRow(selectedRow);
                    } else {
                        System.out.println("No rows deleted. ID not found.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(main, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }
    }


    //    ---------------------------Other-Expenses------------------------------
    private void createExpenseTable() {
        expenseTable = new DefaultTableModel(new String[]{"S No.", "R&M", "Packing", "Machinery", "Lights", "Conveyance", "Office Expense", "Promotion", "Taxes", "Commissions", "Total"}, 0);
        table8.setModel(expenseTable);
    }

    private void addOtherExpenses() {
        int repairs, packing, machinery, lighting, conveyance, officeexpense, promotion, taxes, commission;

        // Assuming that the getText() method returns a string representation of integer values
        repairs = Integer.parseInt(repairField.getText());
        packing = Integer.parseInt(packingField.getText());
        machinery = Integer.parseInt(machineField.getText());
        lighting = Integer.parseInt(lightField.getText());
        conveyance = Integer.parseInt(conveyanceField.getText());
        officeexpense = Integer.parseInt(officeField.getText());
        promotion = Integer.parseInt(promotionField.getText());
        taxes = Integer.parseInt(taxesField.getText());
        commission = Integer.parseInt(commissionField.getText());

        try {
            String query = "INSERT into otherexpense(`repair&maintenance`, `packing`, `machinery`, `lights`, `conveyance`, `office_expense`, `promotion`, `taxes`, `other_commissions`, `total`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, repairs);
            pst.setInt(2, packing);
            pst.setInt(3, machinery);
            pst.setInt(4, lighting);
            pst.setInt(5, conveyance);
            pst.setInt(6, officeexpense);
            pst.setInt(7, promotion);
            pst.setInt(8, taxes);
            pst.setInt(9, commission);

            int totalAdd = repairs + packing + machinery + lighting + conveyance + officeexpense + promotion + taxes + commission;
            pst.setInt(10, totalAdd);

            pst.executeUpdate();

            repairField.setText("");
            packingField.setText("");
            machineField.setText("");
            lightField.setText("");
            conveyanceField.setText("");
            officeField.setText("");
            promotionField.setText("");
            taxesField.setText("");
            commissionField.setText("");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void viewExpenseData() {

        try {
            String query = "SELECT `id`,`repair&maintenance`, `packing`, `machinery`, `lights`, `conveyance`, `office_expense`, `promotion`, `taxes`, `other_commissions`, `total`from otherexpense";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            expenseTable.setRowCount(0);
            while (rs.next()) {
                Object rowData[] = {
                        rs.getInt("id"),
                        rs.getInt("repair&maintenance"),
                        rs.getInt("packing"),
                        rs.getInt("machinery"),
                        rs.getInt("lights"),
                        rs.getInt("conveyance"),
                        rs.getInt("office_expense"),
                        rs.getInt("promotion"),
                        rs.getInt("taxes"),
                        rs.getInt("other_commissions"),
                        rs.getInt("total")

                };
                expenseTable.addRow(rowData);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void deleteExpense() {
        int selectedRow = table8.getSelectedRow();

        if (selectedRow != -1) {
            int idToDelete = (int) expenseTable.getValueAt(selectedRow, expenseTable.findColumn("S No."));

            try {
                String deleteQuery = "DELETE FROM otherexpense WHERE id = ?";
                try (PreparedStatement preparedStatement = con.prepareStatement(deleteQuery)) {
                    preparedStatement.setInt(1, idToDelete);
                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println(rowsAffected + " row(s) deleted successfully.");
                        expenseTable.removeRow(selectedRow);
                    } else {
                        System.out.println("No rows deleted. ID not found.");
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(main, "Please select a row to delete.", "No Row Selected", JOptionPane.WARNING_MESSAGE);
        }

    }
//    --------------------------creationofp&ltable----------------------
    private void createProfitLossTable(){
        tableModelPL = new DefaultTableModel(new String[]{"Sales","Product Exp","Labour","Machinery&Overheads","Raw Material","Total Expense","Profit&Loss"},10);
        table9.setModel(tableModelPL);

    }

    private void viewProfitLoss(){

        try {
            String query = "SELECT pl.id, so.mfgcost AS so_mfgcost, p.mfgcost AS p_mfgcost, e.total_wage, oe.total, si.product_cost, pl.total_expense, pl.profit_loss " +
                    "FROM profitloss pl " +
                    "JOIN stockoutward so ON pl.sid = so.id " +
                    "JOIN product p ON pl.pid = p.id " +
                    "JOIN employee e ON pl.eid = e.id " +
                    "JOIN otherexpense oe ON pl.oeid = oe.id " +
                    "JOIN stockincoming si ON pl.siid = si.id ";


            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            tableModelPL.setRowCount(0);
            int number = 1;

            while (rs.next()) {
                int totalExpense = rs.getInt("p_mfgcost") + rs.getInt("total_wage") + rs.getInt("total") + rs.getInt("product_cost");
                int calculate = rs.getInt("so_mfgcost") + totalExpense;

                Object[] rowData = {
                        number++,
                        rs.getInt("id"),
                        rs.getInt("so_mfgcost"),
                        rs.getInt("p_mfgcost"),
                        rs.getInt("total_wage"),
                        rs.getInt("total"),
                        rs.getInt("product_cost"),
                        totalExpense,
                        calculate  // assuming 'calculate' is the correct value for the profit_loss column
                };
                tableModelPL.addRow(rowData);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }




}
