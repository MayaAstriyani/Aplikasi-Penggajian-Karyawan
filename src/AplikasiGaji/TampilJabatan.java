package AplikasiGaji;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TampilJabatan extends javax.swing.JFrame {

    DefaultTableModel model;  
    
    public Karyawan fab = null;
  
    //method untuk menampilkan data pada tabel  
    public void showtabel(){
        int row = tblTampiljabatan.getRowCount();
        
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
    
    public TampilJabatan() {
        initComponents();
        setLocationRelativeTo(null);
        
        //menampilkan data ke tabel
        String [] judul ={"Kode Jabatan", "Nama Jabatan", "Gaji Pokok", "Uang Makan","Tunjangan BPJS", "Total Gaji"};
        model = new DefaultTableModel(judul,0);
        tblTampiljabatan.setModel(model);
        
        showtabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTampiljabatan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 400));
        setSize(new java.awt.Dimension(700, 400));

        tblTampiljabatan.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblTampiljabatan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTampiljabatan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTampiljabatanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTampiljabatan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tblTampiljabatanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTampiljabatanMouseClicked
        Karyawan baru = new Karyawan();
        TableModel ap = tblTampiljabatan.getModel();
        int i= tblTampiljabatan.getSelectedRow();
        fab.jabatan = ap.getValueAt(i, 1).toString();
        fab.gaji_pokok = ap.getValueAt(i, 2).toString();
        fab.uang_makan = ap.getValueAt(i, 3).toString();
        fab.tunjangan = ap.getValueAt(i, 4).toString();
        fab.total_gaji = ap.getValueAt(i, 5).toString();
        fab.ambildata();
        this.dispose();
    }//GEN-LAST:event_tblTampiljabatanMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblTampiljabatan;
    // End of variables declaration//GEN-END:variables
}
