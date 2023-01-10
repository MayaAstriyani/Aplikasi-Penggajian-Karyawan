package AplikasiGaji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {
   
    DefaultTableModel model;
    
    public Admin(){
        initComponents();
        setLocationRelativeTo(null);
      
        //untuk menampilkan data pada tabel
        String [] judul ={"Kode Admin", "Nama", "Username", "Password"};
        model=new DefaultTableModel(judul,0);
        tblAdmin.setModel(model);
        
        showtable();
    }
    
    //method untuk menampilkan data ke tabel
    public void showtable(){
        int row = tblAdmin.getRowCount();
        
        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }
      
        try{
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM admin";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
             Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void reset(){
        txtNama.setText("");
        txtPassword.setText("");
        txtKodeadmin.setText("");
        txtUsername.setText("");
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKodeadmin = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCariadmin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtCarinama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Admin");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Kode Admin");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Password");

        txtKodeadmin.setBackground(new java.awt.Color(240, 240, 240));
        txtKodeadmin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtKodeadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeadminActionPerformed(evt);
            }
        });

        txtNama.setBackground(new java.awt.Color(240, 240, 240));
        txtNama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        txtUsername.setBackground(new java.awt.Color(240, 240, 240));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtPassword.setBackground(new java.awt.Color(240, 240, 240));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnSimpan.setBackground(new java.awt.Color(30, 129, 176));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/simpan.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setName("btnSimpan"); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(30, 129, 176));
        btnHapus.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hapus.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setName("btnHapus"); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(30, 129, 176));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setName("btnEdit"); // NOI18N
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(30, 129, 176));
        btnReset.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setName("btnHapus"); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnCariadmin.setBackground(new java.awt.Color(53, 142, 184));
        btnCariadmin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCariadmin.setForeground(new java.awt.Color(255, 255, 255));
        btnCariadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cari.png"))); // NOI18N
        btnCariadmin.setText("Cari");
        btnCariadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariadminActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Nama");

        txtCarinama.setBackground(new java.awt.Color(240, 240, 240));
        txtCarinama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCarinama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarinamaActionPerformed(evt);
            }
        });

        tblAdmin.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Amin", "Nama", "Username", "Password"
            }
        ));
        tblAdmin.setName(""); // NOI18N
        tblAdmin.setRequestFocusEnabled(false);
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAdmin);

        btnRefresh.setBackground(new java.awt.Color(53, 142, 184));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnCariadmin)
                .addGap(13, 13, 13))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(13, 13, 13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtKodeadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus))
                .addContainerGap(91, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKodeadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnCariadmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        showtable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        int i= tblAdmin.getSelectedRow();
        if(i>-1){
            txtKodeadmin.setText(model.getValueAt(i, 0).toString());
            txtNama.setText(model.getValueAt(i, 1).toString());
            txtUsername.setText(model.getValueAt(i, 2).toString());
            txtPassword.setText(model.getValueAt(i, 3).toString());
        }
    }//GEN-LAST:event_tblAdminMouseClicked

    private void txtCarinamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarinamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarinamaActionPerformed

    private void btnCariadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariadminActionPerformed
        int row = tblAdmin.getRowCount();

        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }

        try {
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM admin WHERE nama LIKE '%"+txtCarinama.getText()+"%'";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)};
                model.addRow(data);
            }
        } catch (SQLException ex){
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCariadminActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (txtKodeadmin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtKodeadmin.requestFocus();
        }
        else if (txtNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNama.requestFocus();
        }
        else if (txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtPassword.requestFocus();
        }
        else if (txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtPassword.requestFocus();}
        else{
        try{
            String sql="UPDATE admin SET nama='"+txtNama.getText()+"',username='"+txtUsername.getText()+"',password='"+txtPassword.getText()
            +"'WHERE kode_admin='"+txtKodeadmin.getText()+"'";
            Connection conn=(Connection)ConnectionDB.connectDatabase();
            PreparedStatement pst= (PreparedStatement)conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil diedit!");
            showtable();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}
        reset();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (txtKodeadmin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtKodeadmin.requestFocus();
        }
        else if (txtNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNama.requestFocus();
        }
        else if (txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtPassword.requestFocus();
        }
        else if (txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtPassword.requestFocus();}
        else{
        try {
            String sql="DELETE FROM admin WHERE kode_admin='"+txtKodeadmin.getText()+"'";
            Connection conn=(Connection)ConnectionDB.connectDatabase();
            PreparedStatement pst= (PreparedStatement)conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            showtable();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}
        reset();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

        if (txtKodeadmin.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Admin Harus Diisi");
            txtKodeadmin.requestFocus();
        }
        else if (txtNama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Harus Diisi");
            txtNama.requestFocus();
        }
        else if (txtUsername.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username Harus Diisi");
            txtPassword.requestFocus();
        }
        else if (txtPassword.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Password Harus Diisi");
            txtPassword.requestFocus();
        }
        else {
            try {
                String sql="INSERT INTO admin (kode_admin, nama, username, password) VALUES ('"
                +txtKodeadmin.getText() + "','"
                +txtNama.getText() + "','"
                +txtUsername.getText() + "','"
                +txtPassword.getText() +"')";
                Connection conn =(Connection)ConnectionDB.connectDatabase();
                PreparedStatement pst = (PreparedStatement)conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                showtable();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        reset();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtKodeadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeadminActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariadmin;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTextField txtCarinama;
    private javax.swing.JTextField txtKodeadmin;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
