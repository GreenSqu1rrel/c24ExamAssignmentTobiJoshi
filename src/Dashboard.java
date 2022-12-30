import javax.swing.*;
import java.awt.*;

public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
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
        lSortBy = new JLabel();
        jComboBox1 = new JComboBox<>();
        jLabel4 = new JLabel();
        jComboBox2 = new JComboBox<>();
        jTextField1 = new JTextField();
        btGO = new JButton();
        jComboBox3 = new JComboBox<>();
        btGO = new JButton();
        btSort = new JButton();
        btLogout = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1920, 1080));

        jLabel1.setFont(new Font("Serif", 0, 60)); // NOI18N
        ImageIcon c24Logo = new ImageIcon("src/images/logo.png");
        Image c24LogoNScaled = c24Logo.getImage();
        Image c24LogoScaled = c24LogoNScaled.getScaledInstance(103,71, Image.SCALE_SMOOTH);
        c24Logo = new ImageIcon(c24LogoScaled);
        jLabel1.setIcon(c24Logo);
        jLabel1.setText("Banking Dashboard");

        jLabel2.setFont(new Font("Serif", 0, 24)); // NOI18N
        jLabel2.setText("Hello, admin.");

        jTable1.setModel(new DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        lSortBy.setFont(new Font("Serif", 0, 24)); // NOI18N
        lSortBy.setText("Sort by");

        jComboBox1.setFont(new Font("Serif", 0, 12)); // NOI18N
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Last Name", "Account Type", "Balance", "Age", "Specific Account Type" }));
        jComboBox1.setSelectedIndex(4);

        jLabel4.setFont(new Font("Serif", 0, 24)); // NOI18N
        jLabel4.setText("Search");

        jComboBox2.setFont(new Font("Serif", 0, 12)); // NOI18N
        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "IBAN", "Last Name" }));

        jTextField1.setFont(new Font("Serif", 0, 12)); // NOI18N

        btGO.setFont(new Font("Serif", 0, 12)); // NOI18N
        btGO.setText("Go");

        jComboBox3.setFont(new Font("Serif", 0, 12)); // NOI18N
        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "Smart", "Plus", "Max" }));

        btSort.setFont(new Font("Serif", 0, 12)); // NOI18N
        btSort.setText("Sort");

        btLogout.setFont(new Font("Serif", 0, 24)); // NOI18N
        btLogout.setText("Logout");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 611, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btLogout, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(lSortBy, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btGO)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField1, GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                                                .addComponent(btGO, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btLogout))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lSortBy)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(btGO)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addGap(8, 8, 8)
                                                .addComponent(btGO))
                                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 976, GroupLayout.PREFERRED_SIZE))
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
                new Dashboard().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}