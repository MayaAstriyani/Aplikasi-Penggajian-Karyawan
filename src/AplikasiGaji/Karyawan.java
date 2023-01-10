package AplikasiGaji;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jdk.internal.dynalink.DefaultBootstrapper;

public class Karyawan extends javax.swing.JFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKaryawan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtKodekaryawan = new javax.swing.JTextField();
        txtNamakaryawan = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        txtNotelp = new javax.swing.JTextField();
        txtJabatan = new javax.swing.JTextField();
        txtGajipokok = new javax.swing.JTextField();
        txtUangmakan = new javax.swing.JTextField();
        txtTunjangan = new javax.swing.JTextField();
        txtTotalgaji = new javax.swing.JTextField();
        btnTampiljabatan = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnCarikaryawan = new javax.swing.JButton();
        txtCarinama = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form Karyawan");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tblKaryawan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Karyawan", "Nama Karyawan", "Alamat", "No. Telp", "Jabatan", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", "Total Gaji"
            }
        ));
        tblKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKaryawan);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setText("Kode Karyawan");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel2.setText("Nama Karyawan");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setText("Alamat");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setText("No. Telp");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setText("Jabatan");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setText("Gaji Pokok");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setText("Uang Makan");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setText("Tunjangan BPJS");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setText("Total Gaji");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setText("Nama karyawan");

        txtKodekaryawan.setBackground(new java.awt.Color(240, 240, 240));
        txtKodekaryawan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtNamakaryawan.setBackground(new java.awt.Color(240, 240, 240));
        txtNamakaryawan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtAlamat.setBackground(new java.awt.Color(240, 240, 240));
        txtAlamat.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtNotelp.setBackground(new java.awt.Color(240, 240, 240));
        txtNotelp.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtJabatan.setBackground(new java.awt.Color(240, 240, 240));
        txtJabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtJabatan.setEnabled(false);
        txtJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJabatanActionPerformed(evt);
            }
        });

        txtGajipokok.setBackground(new java.awt.Color(240, 240, 240));
        txtGajipokok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtGajipokok.setEnabled(false);

        txtUangmakan.setBackground(new java.awt.Color(240, 240, 240));
        txtUangmakan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUangmakan.setEnabled(false);

        txtTunjangan.setBackground(new java.awt.Color(240, 240, 240));
        txtTunjangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTunjangan.setEnabled(false);

        txtTotalgaji.setBackground(new java.awt.Color(240, 240, 240));
        txtTotalgaji.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTotalgaji.setEnabled(false);

        btnTampiljabatan.setBackground(new java.awt.Color(30, 129, 176));
        btnTampiljabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnTampiljabatan.setForeground(new java.awt.Color(255, 255, 255));
        btnTampiljabatan.setText("jButton1");
        btnTampiljabatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTampiljabatanMouseClicked(evt);
            }
        });
        btnTampiljabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampiljabatanActionPerformed(evt);
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

        btnCarikaryawan.setBackground(new java.awt.Color(53, 142, 184));
        btnCarikaryawan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnCarikaryawan.setForeground(new java.awt.Color(255, 255, 255));
        btnCarikaryawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cari.png"))); // NOI18N
        btnCarikaryawan.setText("Cari");
        btnCarikaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarikaryawanActionPerformed(evt);
            }
        });

        txtCarinama.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtCarinama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarinamaActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNamakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKodekaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtUangmakan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotalgaji, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTampiljabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(275, 275, 275))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRefresh)
                                .addGap(578, 578, 578)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCarikaryawan))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSimpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHapus, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtKodekaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTampiljabatan))
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtNamakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtGajipokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(48, 48, 48))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtUangmakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtTunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTotalgaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarinama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(btnCarikaryawan)
                    .addComponent(btnRefresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    DefaultTableModel model;
    
    public String jabatan, gaji_pokok, uang_makan, tunjangan, total_gaji;
   
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
        TampilJabatan fdb = new TampilJabatan();
        fdb.fab = this;
        txtJabatan.setText(jabatan);
        txtGajipokok.setText(gaji_pokok);
        txtUangmakan.setText(uang_makan);
        txtTunjangan.setText(tunjangan);
        txtTotalgaji.setText(total_gaji);
    }
    
       public void reset(){
        txtKodekaryawan.setText("");
        txtNamakaryawan.setText("");
        txtAlamat.setText("");
        txtNotelp.setText("");
        txtJabatan.setText("");
        txtGajipokok.setText("");
        txtUangmakan.setText("");
        txtTunjangan.setText("");
        txtTotalgaji.setText("");
    }
    
    
    //method untuk menampilkan data ke tabel
    private void showtable(){
        int row = tblKaryawan.getRowCount();
      
        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }
        
        try {
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM karyawan";
            ResultSet rs=stat.executeQuery(sql);
            
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
                     , rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Karyawan() {
        initComponents();
        setLocationRelativeTo(null);
        //kodingan untuk menampilkan data pada tabel
        
        String [] judul ={"Kode Karyawan", "Nama Karyawan", "Alamat", "No Telpon", "Jabatan", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", 
        "Total Gaji"};
        model=new DefaultTableModel(judul,0);
        tblKaryawan.setModel(model);
        
        showtable();
    }
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        //kodingan untuk tombol edit
         if (txtKodekaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtKodekaryawan.requestFocus();
        }
        else if (txtNamakaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNamakaryawan.requestFocus();
        }
        else if (txtAlamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtAlamat.requestFocus();
        }
        else if (txtNotelp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNotelp.requestFocus();
        }
        else if (txtJabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtJabatan.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtUangmakan.requestFocus();
        }
        else if (txtTunjangan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTunjangan.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTotalgaji.requestFocus();
        }
        else {
        try {
            String sql="UPDATE karyawan SET nama_karyawan='"+txtNamakaryawan.getText()+"',alamat='"+txtAlamat.getText()+"',no_telpon='"+txtNotelp.getText()
            +"',jabatan='"+txtJabatan.getText()+"',gaji_pokok='"+txtGajipokok.getText()+"',uang_makan='"+txtUangmakan.getText()+"',tunjangan_bpjs='"+txtTunjangan.getText()
            +"',total_gaji='"+txtTotalgaji.getText()+"'WHERE kode_karyawan='"+txtKodekaryawan.getText()+"'";
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

    private void btnCarikaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarikaryawanActionPerformed
        //kodingan untuk mencari data berdasarkan nama karyawan pada data transaksi
        int row = tblKaryawan.getRowCount();
        
        for (int a = 0; a < row; a++){
            model.removeRow(0);
        }
        
        try {
            Statement stat=(Statement)ConnectionDB.connectDatabase().createStatement();
            String sql="SELECT * FROM karyawan WHERE nama_karyawan LIKE '%"+txtCarinama.getText()+"%'";
            ResultSet rs=stat.executeQuery(sql);
            while(rs.next()){
                String data[]= {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)
                    , rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCarikaryawanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        //kodingan untuk tombol hapus
         if (txtKodekaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtKodekaryawan.requestFocus();
        }
        else if (txtNamakaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNamakaryawan.requestFocus();
        }
        else if (txtAlamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtAlamat.requestFocus();
        }
        else if (txtNotelp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtNotelp.requestFocus();
        }
        else if (txtJabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtJabatan.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtUangmakan.requestFocus();
        }
        else if (txtTunjangan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTunjangan.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih data terlebih dahulu!");
            txtTotalgaji.requestFocus();
        }
        else {
        try {
            String sql="DELETE FROM karyawan WHERE kode_karyawan='"+txtKodekaryawan.getText()+"'";
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

    private void tblKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKaryawanMouseClicked
        //kodingan untuk memilih data yang di edit menggunakan mouse
        int i = tblKaryawan.getSelectedRow();
        if(i>-1){
            txtKodekaryawan.setText(model.getValueAt(i, 0).toString());
            txtNamakaryawan.setText(model.getValueAt(i, 1).toString());
            txtAlamat.setText(model.getValueAt(i, 2).toString());
            txtNotelp.setText(model.getValueAt(i, 3).toString());
            txtJabatan.setText(model.getValueAt(i, 4).toString());
            txtGajipokok.setText(model.getValueAt(i, 5).toString());
            txtUangmakan.setText(model.getValueAt(i, 6).toString());
            txtTunjangan.setText(model.getValueAt(i, 7).toString());
            txtTotalgaji.setText(model.getValueAt(i, 8).toString());
        }
    }//GEN-LAST:event_tblKaryawanMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //kodingan untuk tombol reset
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        //kodingan tombol tambah
        if (txtKodekaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Karyawan Harus Diisi");
            txtKodekaryawan.requestFocus();
        }
        else if (txtNamakaryawan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Nama Karyawan Harus Diisi");
            txtNamakaryawan.requestFocus();
        }
        else if (txtAlamat.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Alamat  Harus Diisi");
            txtAlamat.requestFocus();
        }
        else if (txtNotelp.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No Telpon Harus Diisi");
            txtNotelp.requestFocus();
        }
        else if (txtJabatan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Jabatan Harus Diisi");
            txtJabatan.requestFocus();
        }
        else if (txtGajipokok.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Gaji Pokok Harus Diisi");
            txtGajipokok.requestFocus();
        }
        else if (txtUangmakan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Uang Makan Harus Diisi");
            txtUangmakan.requestFocus();
        }
        else if (txtTunjangan.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Tunjangan BPJS Pokok Harus Diisi");
            txtTunjangan.requestFocus();
        }
        else if (txtTotalgaji.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Total Gaji Harus Diisi");
            txtTotalgaji.requestFocus();
        }
        else {
            try {
                String sql = "INSERT INTO karyawan(kode_karyawan, nama_karyawan, alamat, no_telpon, jabatan, gaji_pokok, uang_makan, tunjangan_bpjs, total_gaji)"
                + " VALUES ('"
                +txtKodekaryawan.getText() + "','"
                +txtNamakaryawan.getText() + "','"
                +txtAlamat.getText() + "','"
                +txtNotelp.getText() + "','"
                +txtJabatan.getText() + "','"
                +txtGajipokok.getText() + "','"
                +txtUangmakan.getText() + "','"
                +txtTunjangan.getText() + "','"
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

    private void btnTampiljabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampiljabatanActionPerformed
        TampilJabatan fdb = new TampilJabatan();
        fdb.fab = this;
        fdb.setVisible(true);
    }//GEN-LAST:event_btnTampiljabatanActionPerformed

    private void btnTampiljabatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTampiljabatanMouseClicked

    }//GEN-LAST:event_btnTampiljabatanMouseClicked

    private void txtJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJabatanActionPerformed

    private void txtCarinamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarinamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarinamaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        showtable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarikaryawan;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnRefresh;
    public javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTampiljabatan;
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
    public javax.swing.JTable tblKaryawan;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtCarinama;
    public javax.swing.JTextField txtGajipokok;
    public javax.swing.JTextField txtJabatan;
    private javax.swing.JTextField txtKodekaryawan;
    private javax.swing.JTextField txtNamakaryawan;
    private javax.swing.JTextField txtNotelp;
    public javax.swing.JTextField txtTotalgaji;
    public javax.swing.JTextField txtTunjangan;
    public javax.swing.JTextField txtUangmakan;
    // End of variables declaration//GEN-END:variables
}
