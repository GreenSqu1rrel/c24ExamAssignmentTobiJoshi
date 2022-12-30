import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class CustomerInfo extends javax.swing.JFrame {


    public CustomerInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        lHeader = new javax.swing.JLabel();
        lLastName = new javax.swing.JLabel();
        lFirstName = new javax.swing.JLabel();
        lID = new javax.swing.JLabel();
        lIBAN = new javax.swing.JLabel();
        lDateOfBirth = new javax.swing.JLabel();
        lResident = new javax.swing.JLabel();
        lNationality = new javax.swing.JLabel();
        lEMail = new javax.swing.JLabel();
        tfLastName = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfEMail = new javax.swing.JTextField();
        tfIBAN = new javax.swing.JTextField();
        tfAccType = new javax.swing.JTextField();
        tfBalance = new javax.swing.JTextField();
        tfNumOfTransact = new javax.swing.JTextField();
        lTel = new javax.swing.JLabel();
        tfTel = new javax.swing.JTextField();
        lAccType = new javax.swing.JLabel();
        tfDateOfBirth = new javax.swing.JTextField();
        lBalance = new javax.swing.JLabel();
        tfResident = new javax.swing.JTextField();
        lNumOfTransact = new javax.swing.JLabel();
        tfNationality = new javax.swing.JTextField();
        lTitleCInfo = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        btClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lHeader.setFont(new java.awt.Font("Serif", 0, 60)); // NOI18N
        ImageIcon c24Logo = new ImageIcon("src/images/logo.png");
        //TODO Image Scale
        Image c24LogoNScaled = c24Logo.getImage();
        Image c24LogoScaled = c24LogoNScaled.getScaledInstance(103,71, Image.SCALE_SMOOTH);
        c24Logo = new ImageIcon(c24LogoScaled);
        lHeader.setIcon(c24Logo);
        lHeader.setText("Banking Dashboard");

        lLastName.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lLastName.setText("Last Name:");

        lFirstName.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lFirstName.setText("First Name:");

        lID.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lID.setText("ID: ");

        lIBAN.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lIBAN.setText("IBAN:");

        lDateOfBirth.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lDateOfBirth.setText("Date of Birth:");

        lResident.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lResident.setText("Resident:");

        lNationality.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lNationality.setText("Nationality:");

        lEMail.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lEMail.setText("E-Mail:");

        tfLastName.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        tfFirstName.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        tfEMail.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        tfIBAN.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        tfAccType.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        tfBalance.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        tfNumOfTransact.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        lTel.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lTel.setText("Telefon:");

        tfTel.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        lAccType.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lAccType.setText("Account Type:");

        tfDateOfBirth.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        lBalance.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lBalance.setText("Balance:");

        tfResident.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        lNumOfTransact.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        lNumOfTransact.setText("Number of Transactions:");

        tfNationality.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N

        lTitleCInfo.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lTitleCInfo.setText("Customer Info");

        btClose.setText("Close");
        btClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeCInfo(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lTitleCInfo)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addComponent(lTel)
                                                                                                .addGap(26, 26, 26))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(lLastName)
                                                                                                        .addComponent(lEMail)
                                                                                                        .addComponent(lFirstName))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(tfFirstName)
                                                                                                .addComponent(tfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(tfTel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lBalance)
                                                                                        .addComponent(lAccType)
                                                                                        .addComponent(lIBAN)
                                                                                        .addComponent(lID))
                                                                                .addGap(51, 51, 51))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addComponent(lNumOfTransact)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(tfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfNumOfTransact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(btClose)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(tfIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(lResident)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(tfResident, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(lDateOfBirth)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(tfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(tfAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(lNationality)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(tfNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                                .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lTitleCInfo)
                                        .addComponent(btClose))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lLastName)
                                        .addComponent(lID)
                                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lDateOfBirth)
                                        .addComponent(tfDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lFirstName)
                                        .addComponent(lIBAN)
                                        .addComponent(tfIBAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lResident)
                                        .addComponent(tfResident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lEMail)
                                        .addComponent(lAccType)
                                        .addComponent(tfAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lNationality)
                                        .addComponent(tfNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lTel)
                                        .addComponent(lBalance)
                                        .addComponent(tfBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lNumOfTransact)
                                        .addComponent(tfNumOfTransact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(0, Short.MAX_VALUE))
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
                new CustomerInfo().setVisible(true);
            }
        });
    }

    private void closeCInfo(MouseEvent evt){

    }

    // Variables declaration - do not modify
    private javax.swing.JButton btClose;
    private javax.swing.JLabel lLastName;
    private javax.swing.JLabel lTitleCInfo;
    private javax.swing.JLabel lDateOfBirth;
    private javax.swing.JLabel lResident;
    private javax.swing.JLabel lNationality;
    private javax.swing.JLabel lEMail;
    private javax.swing.JLabel lHeader;
    private javax.swing.JLabel lTel;
    private javax.swing.JLabel lFirstName;
    private javax.swing.JLabel lAccType;
    private javax.swing.JLabel lID;
    private javax.swing.JLabel lBalance;
    private javax.swing.JLabel lIBAN;
    private javax.swing.JLabel lNumOfTransact;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JTextField tfDateOfBirth;
    private javax.swing.JTextField tfResident;
    private javax.swing.JTextField tfNationality;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfEMail;
    private javax.swing.JTextField tfIBAN;
    private javax.swing.JTextField tfAccType;
    private javax.swing.JTextField tfBalance;
    private javax.swing.JTextField tfNumOfTransact;
    private javax.swing.JTextField tfTel;
    // End of variables declaration
}
