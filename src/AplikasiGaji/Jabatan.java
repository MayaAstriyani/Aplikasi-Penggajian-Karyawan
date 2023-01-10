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
public class Jabatan extends javax.swing.JFrame {
    
    DefaultTableModel model;
    
    public Jabatan() {
        initComponents();
        setLocationRelativeTo(null);
        
        //menampilkan data ke tabel
        String [] judul ={"Kode Jabatan", "Nama Jabatan", "Gaji Pokok", "Uang Makan","Tunjangan BPJS", "Total Gaji"};
        model = new DefaultTableModel(judul,0);
        tblJabatan.setModel(model);
        
        showtable();
    }
    
    //method untuk menampilkan data pada tabel    
    public void showtable(){
        int row = tblJabatan.getRowCount();
        
        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }
        
        try {
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM jabatan";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void reset(){
        txtGajipokok.setText("");
        txtKodejabatan.setText("");
        txtNamajabatan.setText("");
        txtTotalgaji.setText("");
        txtTunjanganbpjs.setText("");
        txtUangmakan.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotalgaji = new javax.swing.JTextField();
        txtUangmakan = new javax.swing.JTextField();
        txtKodejabatan = new javax.swing.JTextField();
        txtTunjanganbpjs = new javax.swing.JTextField();
        txtNamajabatan = new javax.swing.JTextField();
        txtGajipokok = new javax.swing.JTextField();
        txtCarinama = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnCarijabatan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblJabatan = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Jabatan");
        setResizable(false);
        setSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Kode Jabatan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nama Jabatan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Gaji Pokok");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Uang Makan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Tunjangan BPJS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Total Gaji");

        txtTotalgaji.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtTotalgaji.setEnabled(false);
        txtTotalgaji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalgajiActionPerformed(evt);
            }
        });

        txtUangmakan.setBackground(new java.awt.Color(240, 240, 240));

        txtKodejabatan.setBackground(new java.awt.Color(240, 240, 240));
        txtKodejabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtTunjanganbpjs.setBackground(new java.awt.Color(240, 240, 240));
        txtTunjanganbpjs.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtNamajabatan.setBackground(new java.awt.Color(240, 240, 240));
        txtNamajabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtGajipokok.setBackground(new java.awt.Color(240, 240, 240));
        txtGajipokok.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCarinama.setBackground(new java.awt.Color(240, 240, 240));
        txtCarinama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

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

        btnSimpan.setBackground(new java.awt.Color(30, 129, 176));
        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/simpan.png"))); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setToolTipText("");
        btnSimpan.setName("btnSimpan"); // NOI18N
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnCarijabatan.setBackground(new java.awt.Color(53, 142, 184));
        btnCarijabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCarijabatan.setForeground(new java.awt.Color(255, 255, 255));
        btnCarijabatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cari.png"))); // NOI18N
        btnCarijabatan.setText("Cari");
        btnCarijabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarijabatanActionPerformed(evt);
            }
        });

        tblJabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblJabatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Jabatan", "Nama Jabatan", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", "Total Gaji"
            }
        ));
        tblJabatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJabatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblJabatan);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Nama Jabatan");

        btnRefresh.setBackground(new java.awt.Color(53, 142, 184));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNamajabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtKodejabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUangmakan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTunjanganbpjs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRefresh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCarijabatan))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHapus))
                                .addGap(68, 68, 68)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtKodejabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtNamajabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtGajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtUangmakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtTunjanganbpjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtTotalgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(jLabel7)
                    .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCarijabatan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void tblJabatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJabatanMouseClicked
        //kodingan untuk memilih data yang di edit menggunakan mouse
        int i= tblJabatan.getSelectedRow();
        if(i>-1){
            txtKodejabatan.setText(model.getValueAt(i, 0).toString());
            txtNamajabatan.setText(model.getValueAt(i, 1).toString());
            txtGajipokok.setText(model.getValueAt(i, 2).toString());
            txtUangmakan.setText(model.getValueAt(i, 3).toString());
            txtTunjanganbpjs.setText(model.getValueAt(i, 4).toString());
            txtTotalgaji.setText(model.getValueAt(i, 5).toString());
        }
    }//GEN-LAST:event_tblJabatanMouseClicked

    private void btnCarijabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarijabatanActionPerformed
        //kodingan untuk mencari data berdasarkan nama karyawan
        int row = tblJabatan.getRowCount();
        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }
        try {
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM jabatan WHERE nama_jabatan LIKE '%"+txtCarinama.getText()+"%'";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCarijabatanActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        //kodingan untuk tombol simpan
        

        if (txtKodejabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Jabatan Harus Diisi");
            txtKodejabatan.requestFocus();
        }
        else if (txtNamajabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Jabatan Harus Diisi");
            txtNamajabatan.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Gaji Pokok  Harus Diisi");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uang Makan Harus Diisi");
            txtUangmakan.requestFocus();
        }
        else if (txtTunjanganbpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tunjangan BPJS Harus Diisi");
            txtTunjanganbpjs.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Total Gaji Harus Diisi");
            txtTotalgaji.requestFocus();
        } else {
            try {
                 int x, y, z, total;
                 x = Integer.parseInt(txtGajipokok.getText());
                 y = Integer.parseInt(txtUangmakan.getText());
                 z = Integer.parseInt(txtTunjanganbpjs.getText());
                 total = x + y + z;
                 txtTotalgaji.setText(String.valueOf(total));
                String sql="INSERT INTO jabatan (kode_jabatan, nama_jabatan, gaji_pokok, uang_makan, tunjangan_bpjs, total_gaji) VALUES ('"
                +txtKodejabatan.getText() + "','"
                +txtNamajabatan.getText() + "','"
                +txtGajipokok.getText() + "','"
                +txtUangmakan.getText() + "','"
                +txtTunjanganbpjs.getText() + "','"
                +txtTotalgaji.getText() +"')";
                Connection conn=(Connection)ConnectionDB.connectDatabase();
                PreparedStatement pst= (PreparedStatement)conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
                showtable();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        reset();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //kodingan untuk tombol edit
        int x, y, z, total;
       
         if (txtKodejabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtKodejabatan.requestFocus();
        }
        else if (txtNamajabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNamajabatan.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtUangmakan.requestFocus();
        }
        else if (txtTunjanganbpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTunjanganbpjs.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTotalgaji.requestFocus();
        } else {
        try {
        x = Integer.parseInt(txtGajipokok.getText());
        y = Integer.parseInt(txtUangmakan.getText());
        z = Integer.parseInt(txtTunjanganbpjs.getText());
        total = x + y + z;
        txtTotalgaji.setText(String.valueOf(total));
            String sql="UPDATE jabatan SET nama_jabatan='"+txtNamajabatan.getText()+"',gaji_pokok='"+txtGajipokok.getText()+"',uang_makan='"+txtUangmakan.getText()
            +"',tunjangan_bpjs='"+txtTunjanganbpjs.getText()+"',total_gaji='"+txtTotalgaji.getText()+"'WHERE kode_jabatan='"+txtKodejabatan.getText()+"'";
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

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //kodingan tombol reset
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        //kodingan untuk tombol hapus
        if (txtKodejabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtKodejabatan.requestFocus();
        }
        else if (txtNamajabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNamajabatan.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtUangmakan.requestFocus();
        }
        else if (txtTunjanganbpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTunjanganbpjs.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTotalgaji.requestFocus();
        } else {
        try {
            String sql="DELETE FROM jabatan WHERE kode_jabatan='"+txtKodejabatan.getText()+"'";
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

    private void txtTotalgajiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalgajiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalgajiActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarijabatan;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblJabatan;
    private javax.swing.JTextField txtCarinama;
    public javax.swing.JTextField txtGajipokok;
    public javax.swing.JTextField txtKodejabatan;
    public javax.swing.JTextField txtNamajabatan;
    public javax.swing.JTextField txtTotalgaji;
    public javax.swing.JTextField txtTunjanganbpjs;
    public javax.swing.JTextField txtUangmakan;
    // End of variables declaration//GEN-END:variables
}
