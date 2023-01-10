package AplikasiGaji;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TampilKaryawan extends javax.swing.JFrame {

    DefaultTableModel model;
    public Transaksi feb= null;
    
    //method untuk menampilkan data ke tabel
    public void showtable(){
        int row = tblTampilkaryawan.getRowCount();
      
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
    
    public TampilKaryawan() {
        initComponents();
        setLocationRelativeTo(null);
        //kodingan untuk menampilkan data pada tabel
        
        String [] judul ={"Kode Karyawan", "Nama Karyawan", "Alamat", "No Telpon", "Jabatan", "Gaji Pokok", "Uang Makan", "Tunjangan BPJS", 
        "Total Gaji"};
        model=new DefaultTableModel(judul,0);
        tblTampilkaryawan.setModel(model);
        
        showtable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTampilkaryawan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblTampilkaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        tblTampilkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTampilkaryawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTampilkaryawan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblTampilkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTampilkaryawanMouseClicked
        // TODO add your handling code here:
        Transaksi baru = new Transaksi();
        TableModel tk = tblTampilkaryawan.getModel();
        int i = tblTampilkaryawan.getSelectedRow();
        
        feb.kode_karyawan = tk.getValueAt(i, 0).toString();
        feb.nama = tk.getValueAt(i, 1).toString();
        feb.jabatan=tk.getValueAt(i, 4).toString();
        feb.gaji_pokok = tk.getValueAt(i, 5).toString();
        feb.uang_makan = tk.getValueAt(i, 6).toString();
        feb.tunjangan = tk.getValueAt(i, 7).toString();
        feb.total_gaji = tk.getValueAt(i, 8).toString();
        feb.ambildata();
        
        this.dispose();
    }//GEN-LAST:event_tblTampilkaryawanMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblTampilkaryawan;
    // End of variables declaration//GEN-END:variables

}
