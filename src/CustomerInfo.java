import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class CustomerInfo extends javax.swing.JFrame {


    public CustomerInfo(String[] dataOfCustomer) {
        initComponents(dataOfCustomer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(String[] dataOfCustomer) {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfIBAN = new javax.swing.JTextField();
        tfAccType = new javax.swing.JTextField();
        tfBalance = new javax.swing.JTextField();
        tfNumofTransact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTelNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfDateOfBirth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfResident = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfNationality = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 60)); // NOI18N
        ImageIcon c24Logo = new ImageIcon("src/images/logo.png");
        Image c24LogoNScaled = c24Logo.getImage();
        Image c24LogoScaled = c24LogoNScaled.getScaledInstance(103,71, Image.SCALE_SMOOTH);
        c24Logo = new ImageIcon(c24LogoScaled);
        jLabel2.setIcon(c24Logo);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel1.setText("Last Name:");

        jLabel4.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel6.setText("ID: ");

        jLabel8.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel8.setText("IBAN:");

        jLabel12.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel12.setText("Date of Birth:");

        jLabel13.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel13.setText("Resident:");

        jLabel14.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel14.setText("Nationality:");

        jLabel15.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel15.setText("E-Mail:");

        tfLastName.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfLastName.setEditable(false);
        tfLastName.setText(dataOfCustomer[0]);

        tfFirstName.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfFirstName.setEditable(false);

        tfEmail.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfEmail.setEditable(false);

        tfIBAN.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfIBAN.setEditable(false);

        tfAccType.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfAccType.setEditable(false);

        tfBalance.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfBalance.setEditable(false);

        tfNumofTransact.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfNumofTransact.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel3.setText("Telefon:");

        tfTelNumber.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfTelNumber.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel5.setText("Account Type:");

        tfDateOfBirth.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfDateOfBirth.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel7.setText("Balance:");

        tfResident.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        tfResident.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        jLabel9.setText("Number of Trasactions:");

        tfNationality.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        jButton1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jButton1.setText("Close");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                closeCInfo(e);
            }
        });

        jLabel10.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel10.setText("Customer Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(jLabel3)
                                                                                .addGap(26, 26, 26))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel1)
                                                                                        .addComponent(jLabel15)
                                                                                        .addComponent(jLabel4))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(tfFirstName)
                                                                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(tfTelNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel6))
                                                                .addGap(51, 51, 51))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(tfNumofTransact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(tfIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel13)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(tfResident, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel12)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(tfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(tfAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jLabel14)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(tfNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 1, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)
                                                .addGap(127, 127, 127)
                                                .addComponent(jButton1)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jButton1)
                                                .addComponent(jLabel10)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6)
                                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12)
                                        .addComponent(tfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel8)
                                        .addComponent(tfIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13)
                                        .addComponent(tfResident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel5)
                                        .addComponent(tfAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14)
                                        .addComponent(tfNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfTelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addComponent(tfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(tfNumofTransact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String[] data = new String[12];
                new CustomerInfo(data).setVisible(true);
            }
        });
    }

    private void closeCInfo(MouseEvent evt){
        System.out.println(tfLastName.getText());
        System.out.println(tfFirstName.getText());
        System.out.println(tfEmail.getText());
        System.out.println(tfIBAN.getText());
        System.out.println(tfAccType.getText());
        System.out.println(tfBalance.getText());
        System.out.println(tfNumofTransact.getText());
        System.out.println(tfTelNumber.getText());
        System.out.println(tfDateOfBirth.getText());
        System.out.println(tfResident.getText());
        System.out.println(tfNationality.getText());
        System.out.println(tfID.getText());
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfDateOfBirth;
    private javax.swing.JTextField tfResident;
    private javax.swing.JTextField tfNationality;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIBAN;
    private javax.swing.JTextField tfAccType;
    private javax.swing.JTextField tfBalance;
    private javax.swing.JTextField tfNumofTransact;
    private javax.swing.JTextField tfTelNumber;
    // End of variables declaration
}

