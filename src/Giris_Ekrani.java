
 import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sefa Mert
 */
public class Giris_Ekrani extends javax.swing.JFrame {
    
    Baglanti_kurma baglanti = new Baglanti_kurma();

    /**
     * Creates new form Giris_Ekrani
     */
    public Giris_Ekrani() {
        initComponents();
        //Jframe boyut degistirmek istersek burasi!!!
        setSize(750, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mesajkutusu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        parola = new javax.swing.JPasswordField();
        yeniMail = new javax.swing.JTextField();
        Giris_Butonu = new javax.swing.JButton();
        kayıtButonu = new javax.swing.JButton();
        alt = new javax.swing.JButton();
        Cikis_butonu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        mesajkutusu.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jPanel1.add(mesajkutusu);
        mesajkutusu.setBounds(300, 170, 259, 49);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAROLA :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 300, 117, 43);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-MAIL :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 230, 140, 43);

        parola.setBackground(new java.awt.Color(204, 204, 204));
        parola.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(parola);
        parola.setBounds(320, 300, 230, 43);

        yeniMail.setBackground(new java.awt.Color(204, 204, 204));
        yeniMail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yeniMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniMailActionPerformed(evt);
            }
        });
        jPanel1.add(yeniMail);
        yeniMail.setBounds(320, 230, 230, 43);

        Giris_Butonu.setBackground(new java.awt.Color(0, 0, 0));
        Giris_Butonu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Giris_Butonu.setForeground(new java.awt.Color(255, 255, 255));
        Giris_Butonu.setText("GIRIS YAP");
        Giris_Butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Giris_ButonuActionPerformed(evt);
            }
        });
        jPanel1.add(Giris_Butonu);
        Giris_Butonu.setBounds(330, 380, 200, 64);

        kayıtButonu.setBackground(new java.awt.Color(0, 0, 0));
        kayıtButonu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        kayıtButonu.setForeground(new java.awt.Color(255, 255, 255));
        kayıtButonu.setText("KAYIT Ol");
        kayıtButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayıtButonuActionPerformed(evt);
            }
        });
        jPanel1.add(kayıtButonu);
        kayıtButonu.setBounds(330, 460, 200, 64);

        alt.setBackground(new java.awt.Color(204, 204, 0));
        alt.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        alt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-minimize-window-48.png"))); // NOI18N
        alt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altMouseClicked(evt);
            }
        });
        alt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altActionPerformed(evt);
            }
        });
        jPanel1.add(alt);
        alt.setBounds(640, 10, 34, 34);

        Cikis_butonu.setBackground(new java.awt.Color(255, 255, 0));
        Cikis_butonu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Cikis_butonu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-window-48.png"))); // NOI18N
        Cikis_butonu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cikis_butonuMouseClicked(evt);
            }
        });
        Cikis_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cikis_butonuActionPerformed(evt);
            }
        });
        jPanel1.add(Cikis_butonu);
        Cikis_butonu.setBounds(680, 10, 34, 34);

        jPanel3.setBackground(new java.awt.Color(229, 9, 20));
        jPanel3.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 70, 600);

        jPanel2.setBackground(new java.awt.Color(229, 9, 20));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("LOGIN");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(160, 20, 170, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(90, 10, 64, 64);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 70, 790, 90);

        jLabel3.setFont(new java.awt.Font("Sitka Display", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(229, 9, 20));
        jLabel3.setText("NETFLIX");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 20, 210, 50);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(229, 9, 20));
        jLabel4.setText("N");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(670, 500, 60, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/enter.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(240, 380, 64, 64);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(240, 460, 64, 64);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 750, 600);

        setSize(new java.awt.Dimension(854, 610));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Giris_ButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Giris_ButonuActionPerformed
        mesajkutusu.setText("");
        String message;
        String yeniMail = this.yeniMail.getText();
        String parola = new String(this.parola.getPassword());
        
        if(yeniMail.equalsIgnoreCase("") && parola.equalsIgnoreCase("")){
            message = "Kullanici adi ve sifre bos birakilamaz!!!";
            JOptionPane.showMessageDialog(this, message);
        } 
        else{
            boolean giris = baglanti.kontrol(yeniMail, parola);
            if(giris){
               setVisible(false);
               new Ana_Ekran(yeniMail).setVisible(true);
            }
            else{
               JOptionPane.showMessageDialog(this, "Kullanici adi veya sifre yanlis lutfen tekrar deneyiniz!!!");
            }
        }
        
        
        
        
    }//GEN-LAST:event_Giris_ButonuActionPerformed

    private void kayıtButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayıtButonuActionPerformed
        
        
        Kayit_Ekrani kekran = new Kayit_Ekrani();
        setVisible(false);
        kekran.setVisible(true);
        
    }//GEN-LAST:event_kayıtButonuActionPerformed

    private void Cikis_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cikis_butonuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_Cikis_butonuActionPerformed

    private void altMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_altMouseClicked

    private void altActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_altActionPerformed

    private void yeniMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yeniMailActionPerformed

    private void Cikis_butonuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cikis_butonuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Cikis_butonuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris_Ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cikis_butonu;
    private javax.swing.JButton Giris_Butonu;
    private javax.swing.JButton alt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kayıtButonu;
    private javax.swing.JLabel mesajkutusu;
    private javax.swing.JPasswordField parola;
    private javax.swing.JTextField yeniMail;
    // End of variables declaration//GEN-END:variables
}
