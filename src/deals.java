import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class deals {
    private JPanel main;
    private JTabbedPane tabbedPane1;
    private JButton ADDDEALSButton;
    private JButton VIEWDEALSButton;
    private JButton UPDATEDEALSButton;
    private JTable table1;
    private JButton NAMEButton;
    private JButton LOCKEDAMTButton1;
    private JButton RECIEVEDAMTButton1;
    private JButton EXPECTEDDELIVERYButton1;
    private JButton STATUSButton1;
    private JButton DEALCREATIONButton1;
    private JTextField textStatus;
    private JTextField textName;
    private JTextField textDelivery;
    private JTextField textLockedAmt;
    private JTextField textRecievedAmt;
    private JTextField textDeal;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("deals");
        frame.setContentPane(new deals().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public deals() {
        Connect();
    ADDDEALSButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            addDealsData();

        }
    });
        VIEWDEALSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                createTable();
                viewDealsData();
            }
        });
    }

  private void createTable(){
        tableModel = new DefaultTableModel(new String[]{"S No.","Name","Locked amt","Recieved amt","Status","Expected Delivery","Deal Creation"},1 );
        table1.setModel(tableModel);
  }

  private void viewDealsData() {
        try {
            String query = "SELECT deals.id , name , locked_amt , received_amt, status , expected_delivery , deal_creation from deals INNER JOIN dealer ON deals.dealerid = dealer.id ";
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
        }
        catch (SQLException e){
            e.printStackTrace();
      }


  }

  public void addDealsData(){
        String name , locked_amt , received_amt , status , expected_delivery , deal_creation;
        name = textName.getText();
        locked_amt = textLockedAmt.getText();
        received_amt = textRecievedAmt.getText();
        status = textStatus.getText();
        expected_delivery = textDelivery.getText();
        deal_creation = textDeal.getText();

        try {
            String query = "INSERT into deals(name , locked_amt , received_amt , status, expected_delivery , deal_creation)VALUES(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,name);
            pst.setString(2,locked_amt);
            pst.setString(3,received_amt);
            pst.setString(4,status);
            pst.setString(5,expected_delivery);
            pst.setString(6,deal_creation);
            pst.executeUpdate();

            textName.setText("");
            textLockedAmt.setText("");
            textRecievedAmt.setText("");
            textStatus.setText("");
            textDelivery.setText("");
            textDeal.setText("");
            JOptionPane.showMessageDialog(null,"Record Added!");


        }
        catch (SQLException e){
            e.printStackTrace();
        }
  }


//  -----------------------------Establish Connection---------------------
    Connection con;
    PreparedStatement pst;

    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/factory","root","");
            System.out.println("Success");

        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    public static String titleCaseFunction(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
        return Character.toTitleCase(input.charAt(0))+ input.substring(1).toLowerCase();
    }
}
