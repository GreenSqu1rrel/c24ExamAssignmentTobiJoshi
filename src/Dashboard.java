import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {

        initComponents();
        readUsers();
        getPercent();
    }


    /*

     */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        jLabel3 = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel4 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jTextField1 = new JTextField();
        jButton1 = new JButton();
        jComboBox3 = new JComboBox<>();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jLabel5 = new JLabel();
        jScrollPane2 = new JScrollPane();
        jTextArea1 = new JTextArea();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1920, 1080));

        jLabel1.setFont(new Font("Serif", 0, 24));
        ImageIcon c24Logo = new ImageIcon("src/images/logo.png");
        Image c24LogoNScaled = c24Logo.getImage();
        Image c24LogoScaled = c24LogoNScaled.getScaledInstance(103,71, Image.SCALE_SMOOTH);
        c24Logo = new ImageIcon(c24LogoScaled);
        jLabel1.setIcon(c24Logo);

        jLabel2.setFont(new Font("Serif", 0, 24)); // NOI18N
        jLabel2.setText("Hello, admin.");

        jTable1.setModel(new DefaultTableModel(
                new Object [][]{},
                new String [] {
                        "ID", "IBAN", "First Name", "Last Name", "Date of Birth", "Residence", "Nationality", "E-Mail", "Telephone Number", "Account Type", "Balance", "Transactions"
                }

        ){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        });

        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new Font("Serif", 0, 24)); // NOI18N
        jLabel3.setText("Sort by");

        jComboBox1.setFont(new Font("Serif", 0, 12)); // NOI18N
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Last Name", "Account Type", "Balance", "Age", "Specific Account Type" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionEvent(evt);
            }
        });

        jLabel4.setFont(new Font("Serif", 0, 24)); // NOI18N
        jLabel4.setText("Search");

        jComboBox2.setFont(new Font("Serif", 0, 12)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "IBAN", "Last Name" }));


        jTextField1.setFont(new Font("Serif", 0, 12)); // NOI18N

        jButton1.setFont(new Font("Serif", 0, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                searchButtonEVT(evt);
            }
        });

        jComboBox3.setFont(new Font("Serif", 0, 12));
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "Smart", "Plus", "Max" }));
        jComboBox3.setEnabled(false);


        jButton2.setFont(new Font("Serif", 0, 12)); // NOI18N
        jButton2.setText("Sort");
        jButton2.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evt){
                sortButtonEVT(evt);
            }
        }); 

        jButton3.setFont(new Font("Serif", 0, 24)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                logout(evt);
            }
        });

        jLabel5.setFont(new Font("Serif", 0, 36)); // NOI18N
        jLabel5.setText("Banking Dashboard");

        jTextArea1.setColumns(15);
        jTextArea1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(6);
        jTextArea1.setEditable(false);
        jScrollPane2.setViewportView(jTextArea1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 667, Short.MAX_VALUE)
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
                                                .addGap(516, 516, 516)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jComboBox1, GroupLayout.Alignment.TRAILING, 0, 153, Short.MAX_VALUE)
                                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox2, GroupLayout.Alignment.TRAILING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextField1, GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane2, GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jButton2))
                                                        .addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton3)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jButton2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(jButton1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 976, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                System.out.println();
                new Dashboard().setVisible(true);
                System.out.println();
            }
        });
    }

    private void readUsers() {


        String line = "";


        try {
            BufferedReader br = new BufferedReader(new FileReader("src/C24_customers.csv"));

            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                String id = values[0];
                String iBAN = values[1];
                String firstName = values[2];
                String lastName = values[3];
                String dateOfBirth = values[4];
                String residence = values[5];
                String nationality = values[6];
                String eMail = values[7];
                String telNumber = values[8];
                String accountType = values[9];
                String balance = values[10];
                String transactions = values[11];
                customers.add(new Customer(id, iBAN, firstName, lastName, dateOfBirth, residence, nationality, eMail, telNumber, accountType, balance, transactions));


            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] row;
            for(int i = 0; i < customers.size(); i++){
                row = new Object[12];
                row[0] = customers.get(i).id;
                row[1] = customers.get(i).iBAN;
                row[2] = customers.get(i).firstName;
                row[3] = customers.get(i).lastName;
                row[4] = customers.get(i).dateOfBirth;
                row[5] = customers.get(i).residence;
                row[6] = customers.get(i).nationality;
                row[7] = customers.get(i).eMail;
                row[8] = customers.get(i).telNumber;
                row[9] = customers.get(i).accountType;
                row[10] = customers.get(i).balance;
                row[11] = customers.get(i).transactions;
                model.addRow(row);

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void getPercent(){
        double allUsers = 0;
        double smartUsers = 0;
        double plusUsers = 0;
        double maxUsers = 0;
        for(int i = 0; i < customers.size(); i++){
            allUsers += 1;
            if(customers.get(i).accountType.equals("SMART")){
                smartUsers += 1;
            }else if(customers.get(i).accountType.equals("PLUS")){
                plusUsers += 1;
            }else if(customers.get(i).accountType.equals("MAX")){
                maxUsers += 1;
            }
        }
        double perSmart = smartUsers / allUsers;
        double perPlus = plusUsers / allUsers;
        double perMax = maxUsers / allUsers;
        perPlus = Math.round(perPlus * 100);
        perMax = Math.round(perMax * 100);
        jTextArea1.append("Statistics: \n");
        jTextArea1.append("Plus: " + perPlus + "%\n");
        jTextArea1.append("Max: " + perMax + "%\n");
    }

    private void searchButtonEVT(MouseEvent evt){

        int f = jComboBox2.getSelectedIndex();
        String content = jTextField1.getText();
        switch (f){
            case 0: searchIBAN(content); break;
            case 1: searchLastName(content); break;
            default: Component frame = null;
                    JOptionPane.showMessageDialog(frame,
                    "If this Error persists please restart the Programm.",
                    "An Error Occured",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void searchLastName(String sLastName){

        for(int i = 0; i < customers.size(); i++){
            if(sLastName.equals(customers.get(i).lastName)){
                new CustomerInfo(getDataOfCustomer(i)).setVisible(true);
                break;
            }
            else{
                System.out.println("Not success " + sLastName + " not equal to " + customers.get(i).lastName);
            }
        }
    }
    private void searchIBAN(String sIBAN){
        for(int i = 0; i < customers.size() - 1; i++){
            if(sIBAN.equals(customers.get(i).iBAN)){
                new CustomerInfo(getDataOfCustomer(i)).setVisible(true);
                break;
            }
            else{
                System.out.println("Not success " + sIBAN + " not equal to " + customers.get(i).iBAN);
            }
        }
    }

    private String[] getDataOfCustomer(int customer){
        String[] arrayCustomer = new String[12];
        arrayCustomer[0] = customers.get(customer).lastName;
        arrayCustomer[1] = customers.get(customer).firstName;
        arrayCustomer[2] = customers.get(customer).eMail;
        arrayCustomer[3] = customers.get(customer).iBAN;
        arrayCustomer[4] = customers.get(customer).accountType;
        arrayCustomer[5] = customers.get(customer).balance;
        arrayCustomer[6] = customers.get(customer).transactions;
        arrayCustomer[7] = customers.get(customer).telNumber;
        arrayCustomer[8] = customers.get(customer).dateOfBirth;
        arrayCustomer[9] = customers.get(customer).residence;
        arrayCustomer[10] = customers.get(customer).nationality;
        arrayCustomer[11] = customers.get(customer).id;
        return arrayCustomer;
    }
    
    private void sortButtonEVT(MouseEvent evt){
        int i = jCombobox1.getSelectedIndex();
        switch (i){
            case 0:
            case 1:
            case 2:
            case 3:
            default: Component frame = null;
                    JOptionPane.showMessageDialog(frame,
                    "If this Error persists please restart the Programm.",
                    "An Error Occured",
                    JOptionPane.ERROR_MESSAGE);
            }
    }




    private void sortByLastName(){
        LinkedList<Customer> copy = (LinkedList) customers.clone;
        copy.sort(Comparator.comparing(Customer::lastName);
        // Delete Table Rows 
        // Add copy sorted
        
    }
    
    private void sortByAccountType(){
        LinkedList<Customer> copy = new LinkedList<Customer>;
        for(int i = 0; i < customers.size; i++){
            if(customers.get(i).accountType.equals("SMART"){
                copy.add(new Customer(customers.get(i).id, customers.get(i).iBAN, customers.get(i).firstName, customers.get(i).lastName, customers.get(i).dateOfBirth, customers.get(i).residence, customers.get(i).nationality, customers.get(i).eMail, customers.get(i).telNumber, customers.get(i).accountType, customers.get(i).balance, customers.get(i).transactions));
            }
        }
        for(int i = 0; i < customers.size; i++){
            if(customers.get(i).accountType.equals("PLUS"){
                copy.add(new Customer(customers.get(i).id, customers.get(i).iBAN, customers.get(i).firstName, customers.get(i).lastName, customers.get(i).dateOfBirth, customers.get(i).residence, customers.get(i).nationality, customers.get(i).eMail, customers.get(i).telNumber, customers.get(i).accountType, customers.get(i).balance, customers.get(i).transactions));
            }
        }
        for(int i = 0; i < customers.size; i++){
            if(customers.get(i).accountType.equals("MAX"){
                copy.add(new Customer(customers.get(i).id, customers.get(i).iBAN, customers.get(i).firstName, customers.get(i).lastName, customers.get(i).dateOfBirth, customers.get(i).residence, customers.get(i).nationality, customers.get(i).eMail, customers.get(i).telNumber, customers.get(i).accountType, customers.get(i).balance, customers.get(i).transactions));
            }
        }
    }
    
    private void sortByBalance(){
    
    }
    
    private void sortByAge(){
    
    } 
    
    private void sortBySpecificAccountType(){
    
    }
    
     
    private void sortActionEvent(ActionEvent evt){
        int i = jComboBox1.getSelectedIndex();
        switch (i){
            case 4: jComboBox3.setEnabled(true); break;
            default: jComboBox3.setEnabled(false); break;
        }
    }

    private void logout (MouseEvent evt){
        JComponent comp = (JComponent) evt.getSource();
        Window win = SwingUtilities.getWindowAncestor(comp);
        win.dispose();
        Login.main(null);
    }


    // Variables declaration - do not modify
    LinkedList<Customer> customers = new LinkedList<>();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}