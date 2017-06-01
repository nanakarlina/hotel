
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iitutsa
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public frmMain() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtNO = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdstan = new javax.swing.JRadioButton();
        rddel = new javax.swing.JRadioButton();
        rdsui = new javax.swing.JRadioButton();
        rdprm = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDatein = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jDateout = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1Data = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtStatus = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NO. kamar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 210, 101, 20);

        txtNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOActionPerformed(evt);
            }
        });
        getContentPane().add(txtNO);
        txtNO.setBounds(40, 230, 90, 30);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(140, 230, 260, 30);

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAMA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 210, 60, 20);

        jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("tipe kamar ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 260, 100, 20);

        buttonGroup1.add(rdstan);
        rdstan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdstan.setForeground(new java.awt.Color(255, 255, 255));
        rdstan.setText("STANDART");
        rdstan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdstanActionPerformed(evt);
            }
        });
        getContentPane().add(rdstan);
        rdstan.setBounds(40, 280, 110, 23);

        buttonGroup1.add(rddel);
        rddel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rddel.setForeground(new java.awt.Color(255, 255, 255));
        rddel.setText("DELUXE");
        getContentPane().add(rddel);
        rddel.setBounds(40, 320, 110, 23);

        buttonGroup1.add(rdsui);
        rdsui.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdsui.setForeground(new java.awt.Color(255, 255, 255));
        rdsui.setText("SUITE");
        getContentPane().add(rdsui);
        rdsui.setBounds(160, 320, 110, 23);

        buttonGroup1.add(rdprm);
        rdprm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdprm.setForeground(new java.awt.Color(255, 255, 255));
        rdprm.setText("PREMIUM");
        getContentPane().add(rdprm);
        rdprm.setBounds(160, 280, 110, 23);

        jLabel13.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("harga ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 350, 41, 19);
        getContentPane().add(txtHarga);
        txtHarga.setBounds(40, 370, 230, 30);

        jLabel14.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TGL check in ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(40, 420, 90, 19);
        getContentPane().add(jDatein);
        jDatein.setBounds(40, 450, 170, 30);

        jLabel15.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TGL check out ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(40, 500, 100, 19);
        getContentPane().add(jDateout);
        jDateout.setBounds(40, 530, 166, 30);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tb1Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO KAMAR", "NAMA PEMESAN", "JENIS KAMAR", "TGLPINJAM", "TGLKEMBALI", "HARGA", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1Data.setToolTipText("");
        tb1Data.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tb1Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1Data);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(500, 70, 830, 420);

        btnSave.setText("CHECK IN");
        btnSave.setActionCommand("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(50, 590, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(180, 590, 90, 30);

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(310, 590, 80, 30);

        jButton1.setText("CHECK OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 660, 110, 30);

        txtStatus.setText("cari status ");
        getContentPane().add(txtStatus);
        txtStatus.setBounds(530, 580, 260, 30);

        btncari.setText("cari");
        btncari.setToolTipText("");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari);
        btncari.setBounds(810, 580, 80, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/HOTEL.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 1360, 810);

        setBounds(0, 0, 1377, 808);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed

    }//GEN-LAST:event_txtNamaActionPerformed

    private void rdstanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdstanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdstanActionPerformed

    private void tb1DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1DataMouseClicked
        // TODO add your handling code here:
        int baris = tb1Data.getSelectedRow();
        if (baris !=-1) {
            txtNO.setText(tb1Data.getValueAt(baris, 0).toString());
            txtNama.setText(tb1Data.getValueAt(baris, 1).toString());
            if ("standard".equals(tb1Data.getValueAt(baris, 2).toString())){
                rdstan.setSelected(true);
            }else if ("deluxe".equals(tb1Data.getValueAt(baris, 2).toString())){
                rddel.setSelected(true);
            }else if ("premium".equals(tb1Data.getValueAt(baris, 2).toString())){
                rdprm.setSelected(true);
            } else {
                rdsui.setSelected(true);
            }
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date tglin = null;
            try{
                tglin = date.parse(tb1Data.getValueAt(baris, 3).toString());
            } catch (ParseException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
            }
            jDatein.setDate(tglin);

            Date tglout = null;
            try{
                tglout = date.parse(tb1Data.getValueAt(baris, 4).toString());
            } catch (ParseException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
            }
            jDateout.setDate(tglout);
            txtHarga.setText(tb1Data.getValueAt(baris, 5).toString());

        }
    }//GEN-LAST:event_tb1DataMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglpinjam = dateFormat.format(jDatein.getDate());
        String tglkembali = dateFormat.format(jDateout.getDate());
        String stat ="check in" ;
        String jenis ="";
        if(rdstan.isSelected()){
            jenis ="standard";
        } else if(rdsui.isSelected()) {
            jenis ="suite";
        } else if (rddel.isSelected()){
            jenis="deluxe";
        }else {
            jenis = "premium";
        }
        if (txtNO.getText().equals("")||txtNama.getText().equals("")||jenis.equals("")||tglpinjam.equals("")||tglkembali.equals("")||txtHarga.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Harap lengkapi data","error",JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL = "INSERT INTO tb_pesan VALUES ('"+txtNO.getText()+"', '"+txtNama.getText()+"', '"+jenis+"', '"+tglpinjam+"', '"+tglkembali+"', '"+txtHarga.getText()+"', '"+stat+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this,"check in berhasil ","sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this,"check in gagal ","error",JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int baris = tb1Data.getSelectedRow();
        if (baris != -1) {
            String no = tb1Data.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_pesan WHERE no_kamar ='"+no+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        buttonGroup1.clearSelection();

        txtNama.setText("");
        txtNO.setText("");
        txtHarga.setText("");
      
        jDatein.setDate(null);
        jDateout.setDate(null);

    }//GEN-LAST:event_btnClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglin = dateFormat.format(jDatein.getDate());
        String tglout = dateFormat.format(jDateout.getDate());
        String stat = "check out";
        String jenis ="";
        if(rdstan.isSelected()){
            jenis ="standard";
        } else if(rddel.isSelected()) {
            jenis ="deluxe";
        } else if (rdprm.isSelected()){
            jenis="premium";
        }else {
            jenis = "suite";
        }
        String SQL = "UPDATE tb_pesan SET "
        +"nama='"+txtNama.getText()+"',"
        +"tipe='"+jenis+"',"
        +"checkin='"+tglin+"',"
        +"checkout='"+tglout+"',"
        +"harga='"+txtHarga.getText()+"',"
        +"status='"+stat+"' "
        + "WHERE no_kamar='"+txtNO.getText()+"'";
        int update = KoneksiDB.execute(SQL);
        if (update == 1){
            JOptionPane.showMessageDialog(this," berhasil check out ","sukses",JOptionPane.INFORMATION_MESSAGE);
            selectData();
        } else {
            JOptionPane.showMessageDialog(this," gagal check out","error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        selectstatus();

    }//GEN-LAST:event_btncariActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btncari;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDatein;
    private com.toedter.calendar.JDateChooser jDateout;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rddel;
    private javax.swing.JRadioButton rdprm;
    private javax.swing.JRadioButton rdstan;
    private javax.swing.JRadioButton rdsui;
    private javax.swing.JTable tb1Data;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNO;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables
 private void selectData() {
         String kolom[] = {"no_kamar","nama","tipe","checkin","checkout","harga","status"};
       DefaultTableModel dtm = new DefaultTableModel(null,kolom);
       String SQL = "SELECT * FROM tb_pesan";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nama= rs.getString(2);
               String jenis = " ";
               if("standard".equals(rs.getString(3))){
                   jenis = "standard";
               }else if ("deluxe".equals(rs.getString(3))){
                   jenis = "deluxe";
               }else if ("suite".equals(rs.getString(3))){
                   jenis = "suite";
               } else{
                   jenis = "premium";
               }
             
               String harga = rs.getString(6);
               String tglin = rs.getString(4);
               String tglout = rs.getString(5);
               String status = rs.getString(7);
              
               String data[] = {no,nama,jenis,tglin,tglout,harga,status};
               dtm.addRow(data);
           }
           
       }catch (SQLException ex){
                   Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null, ex);
                   }
       tb1Data.setModel(dtm);
    }

    private void selectstatus() {
           String kolom[] = {"no","nama","jenis","tglin","tglout","harga","status"};
       DefaultTableModel dtm = new DefaultTableModel(null,kolom);
       String SQL = "SELECT * FROM tb_pesan WHERE status='"+txtStatus.getText()+"'";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nama= rs.getString(2);
               String jenis = " ";
               if("standard".equals(rs.getString(3))){
                   jenis = "standard";
               }else if ("deluxe".equals(rs.getString(3))){
                   jenis = "deluxe";
               }else if ("suite".equals(rs.getString(3))){
                   jenis = "suite";
               } else{
                   jenis = "premium";
               }
               
               String tglin = rs.getString(6);
               String tglout = rs.getString(7);
               String harga = rs.getString(8);
               String status = rs.getString(8);
              
               String data[] = {no,nama,jenis,tglin,tglout,harga,status};
               dtm.addRow(data);
           }
           
       }catch (SQLException ex){
                   Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null, ex);
                   }
       tb1Data.setModel(dtm);
    }
}

