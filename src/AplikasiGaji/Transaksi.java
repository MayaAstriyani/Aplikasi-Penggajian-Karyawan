package AplikasiGaji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Transaksi extends javax.swing.JFrame {

    DefaultTableModel model;
    
    public String kode_karyawan, nama, jabatan, gaji_pokok, uang_makan, tunjangan, total_gaji;
   
    public String getnama(){
        return nama; 
    }
    public String getkodeJabatan(){
        return kode_karyawan; 
    }
    public String getJabatan(){
        return jabatan; 
    }
    public String getGajiPokok(){
        return gaji_pokok; 
    }
    public String getUangMakan(){
        return uang_makan;
    }
    public String getTunjagan(){
        return tunjangan; 
    }
    public String TotalGaji(){
        return total_gaji; 
    }
    
    //method untuk mengambil data dari TampilKaryawan
    public void ambildata(){
        TampilKaryawan fdb = new TampilKaryawan();
        fdb.feb = this;
        txtNamakaryawan.setText(nama);
        txtKodekaryawan.setText(kode_karyawan);
        txtJabatan.setText(jabatan);
        txtGajipokok.setText(gaji_pokok);
        txtUangmakan.setText(uang_makan);
        txtBpjs.setText(tunjangan);
        txtTotalgaji.setText(total_gaji);
    }
    
    public void reset(){
        txtKodetransaksi.setText("");
        txtKodekaryawan.setText("");
        txtNamakaryawan.setText("");
        txtJabatan.setText("");
        txtGajipokok.setText("");
        txtUangmakan.setText("");
        txtBpjs.setText("");
        txtTotalgaji.setText("");
        txtTanggal.setDateFormatString(null);
    }
    
    public Transaksi() {
        initComponents();
        setLocationRelativeTo(null);
      
        //kodingan untuk menampilkan data
        String [] judul ={"Kode Transaksi","Kode Karyawan", "Nama Karyawan", "Jabatan", "Tanggal", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", 
        "Total Gaji"};
        model=new DefaultTableModel(judul,0);
        tblTransaksi.setModel(model);
        
        showtable();
    }
    
    public void showtable(){
        //method untuk menapilkan data ke tabel
        int row = tblTransaksi.getRowCount();
        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }
    
        try {
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM transaksi";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
            String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
                 , rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
            model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtKodetransaksi = new javax.swing.JTextField();
        txtKodekaryawan = new javax.swing.JTextField();
        txtNamakaryawan = new javax.swing.JTextField();
        txtJabatan = new javax.swing.JTextField();
        txtGajipokok = new javax.swing.JTextField();
        txtUangmakan = new javax.swing.JTextField();
        txtBpjs = new javax.swing.JTextField();
        txtTotalgaji = new javax.swing.JTextField();
        btnTampilKaryawan = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCarinama = new javax.swing.JTextField();
        btnCariTransaksi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();
        txtTanggal = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Transaksi");
        setPreferredSize(new java.awt.Dimension(1022, 528));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(982, 528));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Kode Transaksi");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Tanggal");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Kode Karyawan");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("Jabatan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Nama Karyawan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Gaji Pokok");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Uang Makan");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("BPJS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Total Gaji");

        txtKodetransaksi.setBackground(new java.awt.Color(240, 240, 240));
        txtKodetransaksi.setMinimumSize(null);

        txtKodekaryawan.setBackground(new java.awt.Color(240, 240, 240));
        txtKodekaryawan.setEnabled(false);
        txtKodekaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodekaryawanActionPerformed(evt);
            }
        });

        txtNamakaryawan.setBackground(new java.awt.Color(240, 240, 240));
        txtNamakaryawan.setEnabled(false);
        txtNamakaryawan.setMinimumSize(null);

        txtJabatan.setBackground(new java.awt.Color(240, 240, 240));
        txtJabatan.setEnabled(false);
        txtJabatan.setMinimumSize(null);

        txtGajipokok.setBackground(new java.awt.Color(240, 240, 240));
        txtGajipokok.setEnabled(false);

        txtUangmakan.setBackground(new java.awt.Color(240, 240, 240));
        txtUangmakan.setEnabled(false);

        txtBpjs.setBackground(new java.awt.Color(240, 240, 240));
        txtBpjs.setEnabled(false);
        txtBpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBpjsActionPerformed(evt);
            }
        });

        txtTotalgaji.setBackground(new java.awt.Color(240, 240, 240));
        txtTotalgaji.setEnabled(false);

        btnTampilKaryawan.setBackground(new java.awt.Color(30, 129, 176));
        btnTampilKaryawan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnTampilKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampilKaryawan.setText("...");
        btnTampilKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilKaryawanActionPerformed(evt);
            }
        });

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

        btnRefresh.setBackground(new java.awt.Color(53, 142, 184));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Nama Karyawan");

        txtCarinama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnCariTransaksi.setBackground(new java.awt.Color(53, 142, 184));
        btnCariTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCariTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        btnCariTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cari.png"))); // NOI18N
        btnCariTransaksi.setText("Cari");
        btnCariTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariTransaksiActionPerformed(evt);
            }
        });

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Transaksi", "Kode Karyawan", "Nama Karyawan", "Jabatan", "Tanggal", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", "Total Gaji"
            }
        ));
        tblTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTransaksi);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNamakaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtKodetransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtKodekaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTampilKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBpjs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUangmakan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCariTransaksi))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKodetransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKodekaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTampilKaryawan)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNamakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(40, 40, 40)
                                .addComponent(btnRefresh))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtUangmakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBpjs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtGajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCariTransaksi)
                            .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(7, 7, 7)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //kodingan untuk tombol edit
         if (txtKodetransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtKodetransaksi.requestFocus();
        }
        else if (txtKodekaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtKodekaryawan.requestFocus();
        }
        else if (txtNamakaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtNamakaryawan.requestFocus();
        }
        else if (txtJabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtJabatan.requestFocus();
        }
        else if (txtTanggal.getDateFormatString().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtGajipokok.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtUangmakan.requestFocus();
        }

        else if (txtBpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtBpjs.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtTotalgaji.requestFocus();
        } else {
        //kodingan untuk tombol edit
            try {
                //format jcalender
                String tampilan ="yyyy-MM-dd" ; 
                SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
                String Tanggal = String.valueOf(fm.format(txtTanggal.getDate()));
                String sql="UPDATE transaksi SET nama_karyawan='"+txtNamakaryawan.getText()+"',jabatan='"+txtJabatan.getText()+"',tanggal='"+Tanggal+"',gaji_pokok='"+txtGajipokok.getText()+"',uang_makan='"+txtUangmakan.getText()+"',tunjangan_bpjs='"+txtBpjs.getText()
                +"',total_gaji='"+txtTotalgaji.getText()+"'WHERE kode_transaksi='"+txtKodetransaksi.getText()+"'";
                Connection conn=(Connection)ConnectionDB.connectDatabase();
                PreparedStatement pst= (PreparedStatement)conn.prepareStatement(sql);
                pst.execute();
                showtable();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
         reset();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        //kodingan untuk tombol hapus
        if (txtKodetransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtKodetransaksi.requestFocus();
        }
        else if (txtKodekaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtKodekaryawan.requestFocus();
        }
        else if (txtNamakaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtNamakaryawan.requestFocus();
        }
        else if (txtJabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtJabatan.requestFocus();
        }
        else if (txtTanggal.getDateFormatString().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtGajipokok.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtUangmakan.requestFocus();
        }

        else if (txtBpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtBpjs.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu");
            txtTotalgaji.requestFocus();
        } else {
        try {
            String sql="DELETE FROM transaksi WHERE kode_transaksi='"+txtKodetransaksi.getText()+"'";
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

    private void btnCariTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariTransaksiActionPerformed
        //kodingan untuk tombol cari berdasarkan nama karyawan
        int row = tblTransaksi.getRowCount();
        
        for(int a = 0; a < row; a++){
            model.removeRow(0);
        }
        
        try {
            Statement stat = (Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM transaksi WHERE nama_karyawan LIKE '%"+txtCarinama.getText()+"%'";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
                    , rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)};
                model.addRow(data);
            }
        }catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCariTransaksiActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
      reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void tblTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTransaksiMouseClicked
        //kodingan untuk memilih data yang di edit menggunakan mouse
        int i = tblTransaksi.getSelectedRow();
        if(i>-1){
            txtKodetransaksi.setText(model.getValueAt(i, 0).toString());
            txtKodekaryawan.setText(model.getValueAt(i, 1).toString());
            txtNamakaryawan.setText(model.getValueAt(i, 2).toString());
            txtJabatan.setText(model.getValueAt(i, 3).toString());
            txtTanggal.setDateFormatString(model.getValueAt(i, 4).toString());
            txtGajipokok.setText(model.getValueAt(i, 5).toString());
            txtUangmakan.setText(model.getValueAt(i, 6).toString());
            txtBpjs.setText(model.getValueAt(i, 7).toString());
            txtTotalgaji.setText(model.getValueAt(i, 8).toString());
        }
    }//GEN-LAST:event_tblTransaksiMouseClicked

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        

        // kodingan untuk tombol tambah
        if (txtKodetransaksi.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Transaksi Harus Diisi");
            txtKodetransaksi.requestFocus();
        }
        else if (txtKodekaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Karyawan Harus Diisi");
            txtKodekaryawan.requestFocus();
        }
        else if (txtNamakaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Karyawan  Harus Diisi");
            txtNamakaryawan.requestFocus();
        }
        else if (txtJabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jabatan Harus Diisi");
            txtJabatan.requestFocus();
        }
        else if (txtTanggal.getDateFormatString().equals("")){
            JOptionPane.showMessageDialog(null, "Tanggal Harus Diisi");
            txtGajipokok.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Gaji Pokok Harus Diisi");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uang Makan Harus Diisi");
            txtUangmakan.requestFocus();
        }

        else if (txtBpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tunjangan BPJS Harus Diisi");
            txtBpjs.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Total Gaji Harus Diisi");
            txtTotalgaji.requestFocus();
        } else {
            try {
                //format jcalender
                 String tampilan ="yyyy-MM-dd" ; 
                 SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
                 String Tanggal = String.valueOf(fm.format(txtTanggal.getDate()));
                String sql="INSERT INTO transaksi (kode_transaksi, kode_karyawan, nama_karyawan, jabatan, tanggal, gaji_pokok,"
                + "uang_makan, tunjangan_bpjs, total_gaji) VALUES ('"
                +txtKodetransaksi.getText() + "','"
                +txtKodekaryawan.getText() + "','"
                +txtNamakaryawan.getText() + "','"
                +txtJabatan.getText() + "','"
                +Tanggal+ "','"
                +txtGajipokok.getText() + "','"
                +txtUangmakan.getText() + "','"
                +txtBpjs.getText() + "','"
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

    private void txtKodekaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodekaryawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodekaryawanActionPerformed

    private void btnTampilKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilKaryawanActionPerformed
        // TODO add your handling code here:
        TampilKaryawan fdb = new TampilKaryawan();
        fdb.feb = this;
        fdb.setVisible(true);
    }//GEN-LAST:event_btnTampilKaryawanActionPerformed

    private void txtBpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBpjsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCariTransaksi;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampilKaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransaksi;
    public javax.swing.JTextField txtBpjs;
    private javax.swing.JTextField txtCarinama;
    public javax.swing.JTextField txtGajipokok;
    public javax.swing.JTextField txtJabatan;
    public javax.swing.JTextField txtKodekaryawan;
    private javax.swing.JTextField txtKodetransaksi;
    public javax.swing.JTextField txtNamakaryawan;
    private com.toedter.calendar.JDateChooser txtTanggal;
    public javax.swing.JTextField txtTotalgaji;
    public javax.swing.JTextField txtUangmakan;
    // End of variables declaration//GEN-END:variables
}
