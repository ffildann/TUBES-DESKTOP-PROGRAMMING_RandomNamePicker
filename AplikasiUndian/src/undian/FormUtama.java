package undian;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FAIZ FILDAN NUGROHO
 */
public class FormUtama extends javax.swing.JFrame {
    /**
     * Creates new form FormUtama
     */
    
    DefaultTableModel model;
    public FormUtama() {
        initComponents();
        
        String [] judul={"NIM","Nama"};
        model= new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tbl_undi = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tbl_tambah = new javax.swing.JButton();
        tbl_hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        tbl_edit = new javax.swing.JButton();
        tbl_reset = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        jButton4.setText("jButton4");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Undian");

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Selamat Datang di Aplikasi Undian");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MAHASISWA");
        jPanel1.add(jLabel6, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        tbl_undi.setBackground(new java.awt.Color(255, 255, 255));
        tbl_undi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_undi.setText("Mulai Undian");
        tbl_undi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_undiActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 13, 0, 0);
        jPanel2.add(tbl_undi, gridBagConstraints);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_tambah.setBackground(new java.awt.Color(51, 255, 0));
        tbl_tambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_tambah.setText("Tambah");
        tbl_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_tambahActionPerformed(evt);
            }
        });
        jPanel3.add(tbl_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 30));

        tbl_hapus.setBackground(new java.awt.Color(204, 0, 0));
        tbl_hapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_hapus.setText("Hapus");
        tbl_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_hapusActionPerformed(evt);
            }
        });
        jPanel3.add(tbl_hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 30));

        tabel.setBackground(new java.awt.Color(102, 255, 255));
        tabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 2, true));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NIM", "Nama"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 390, 120));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nama");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 20));

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        jPanel3.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 260, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NIM");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 20));
        jPanel3.add(txt_nim, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 260, -1));

        tbl_edit.setBackground(new java.awt.Color(255, 255, 0));
        tbl_edit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_edit.setText("Edit");
        tbl_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_editActionPerformed(evt);
            }
        });
        jPanel3.add(tbl_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 80, 30));

        tbl_reset.setBackground(new java.awt.Color(255, 255, 255));
        tbl_reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_reset.setText("Reset");
        tbl_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbl_resetActionPerformed(evt);
            }
        });
        jPanel3.add(tbl_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 70, 60));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 13, 25, 14);
        jPanel2.add(jPanel3, gridBagConstraints);

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Nama Tidak Bisa Diulang?");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 13, 0, 0);
        jPanel2.add(jCheckBox1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_undiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_undiActionPerformed
        // TODO add your handling code here:
        
    TableModel dtm = tabel.getModel();
    int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
    String[]tabeldata = new String[nRow];
    for (int i = 1 ; i < nRow ; i++)
    tabeldata[i] = (String)dtm.getValueAt(i,1);
       
       Random rnd = new Random(); 
       int idx = rnd.nextInt(tabeldata.length);
       
       JOptionPane.showMessageDialog(this,"SELAMAT KEPADA : \n" + 
               tabeldata[idx]);
    }//GEN-LAST:event_tbl_undiActionPerformed

    private void tbl_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_tambahActionPerformed
 try {                                           
     // TODO add your handling code here:
     Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_undian", "root", "");
     cn.createStatement().executeUpdate("Insert into dataundi values "+" ('"+txt_nim.getText()+"','"+txt_nama.getText()+"')");
     tampilkan();
     reset();
 } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"ADA DATA YANG BELUM DIISI !!");
        }
    }//GEN-LAST:event_tbl_tambahActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int i = tabel.getSelectedRow();
        
        if(i>-1){
            txt_nim.setText(model.getValueAt(i,0).toString());
            txt_nama.setText(model.getValueAt(i,1).toString());
        }
    }//GEN-LAST:event_tabelMouseClicked

    private void tbl_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_hapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_undian", "root", "");
            cn.createStatement().executeUpdate("Delete  from dataundi where NIM ='"+txt_nim.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_hapusActionPerformed

    private void tbl_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_editActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_undian", "root", "");
            cn.createStatement().executeUpdate("Update dataundi set NIM ='"+txt_nim.getText()+"', Nama ='"+txt_nama.getText()+"' where NIM ='"+txt_nim.getText()+"'");
            tampilkan();
            reset();
        } catch (SQLException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbl_editActionPerformed

    private void tbl_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbl_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_tbl_resetActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void reset(){
        txt_nim.setText("");
        txt_nama.setText("");
    }
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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JButton tbl_edit;
    private javax.swing.JButton tbl_hapus;
    private javax.swing.JButton tbl_reset;
    private javax.swing.JButton tbl_tambah;
    private javax.swing.JButton tbl_undi;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        int row = tabel.getRowCount();
        for (int a=0; a<row; a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db_undian", "root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM dataundi");
            while(rs.next()){
                String data []={rs.getString(1), rs.getString(2)};
                model.addRow(data);
                        }
        } catch (SQLException ex) {
            Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
}

