package AplikasiGaji;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Laporan extends javax.swing.JFrame {

    public String pilihan;
    DefaultTableModel model;
    
     public Laporan() {
        initComponents();
        setLocationRelativeTo(null);
    }
         
    //method tampil data tabel karyawan
    public void showtablekaryawan(){
        String [] judul_karyawan ={"Kode Karyawan", "Nama Karyawan", "Alamat", "No Telpon", "Jabatan", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", 
        "Total Gaji"};
        model=new DefaultTableModel(judul_karyawan,0);
        tblLaporan.setModel(model);
        
        int row = tblLaporan.getRowCount();
      
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
    
    //method tampil data tabel transaksi
      public void showtabletraksasi(){
       String [] judul_transaksi ={"Kode Transaksi", "Kode Karyawan", "Nama Karyawan", "Jabatan", "Tanggal", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", 
        "Total Gaji"};
        model=new DefaultTableModel(judul_transaksi,0);
        tblLaporan.setModel(model);
       int row=tblLaporan.getRowCount();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaporan = new javax.swing.JTable();
        btncetak_transaksi = new javax.swing.JButton();
        btncetak_karyawan = new javax.swing.JButton();
        btnLaporan = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Laporan");
        setResizable(false);
        setSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 500));

        tblLaporan.setBackground(new java.awt.Color(240, 240, 240));
        tblLaporan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblLaporan.setForeground(new java.awt.Color(51, 51, 51));
        tblLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tblLaporan);

        btncetak_transaksi.setBackground(new java.awt.Color(30, 129, 176));
        btncetak_transaksi.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btncetak_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btncetak_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cetak.png"))); // NOI18N
        btncetak_transaksi.setText("Cetak Data Transaksi");
        btncetak_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetak_transaksiActionPerformed(evt);
            }
        });

        btncetak_karyawan.setBackground(new java.awt.Color(30, 129, 176));
        btncetak_karyawan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btncetak_karyawan.setForeground(new java.awt.Color(255, 255, 255));
        btncetak_karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cetak.png"))); // NOI18N
        btncetak_karyawan.setText("Cetak Data Karyawan");
        btncetak_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncetak_karyawanActionPerformed(evt);
            }
        });

        btnLaporan.setBackground(new java.awt.Color(30, 129, 176));
        btnLaporan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnLaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAPORAN DATA KARYAWAN", "LAPORAN DATA TRANSAKSI", " " }));
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(btncetak_karyawan)
                        .addGap(33, 33, 33)
                        .addComponent(btncetak_transaksi)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncetak_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncetak_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        pilihan= (String) btnLaporan.getSelectedItem();
        if("LAPORAN DATA KARYAWAN".equals(pilihan)){
            showtablekaryawan();
        }
        else if("LAPORAN DATA TRANSAKSI".equals(pilihan)){
            showtabletraksasi();

        }
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void btncetak_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetak_karyawanActionPerformed
        try {
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("cetak_karyawan.jasper"), null, ConnectionDB.connectDatabase());
            JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btncetak_karyawanActionPerformed

    private void btncetak_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncetak_transaksiActionPerformed
        try {
            JasperPrint jp = JasperFillManager.fillReport(getClass().getResourceAsStream("cetak_transaksi.jasper"), null, ConnectionDB.connectDatabase());
            JasperViewer.viewReport(jp, false);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btncetak_transaksiActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btnLaporan;
    private javax.swing.JButton btncetak_karyawan;
    private javax.swing.JButton btncetak_transaksi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLaporan;
    // End of variables declaration//GEN-END:variables
}
