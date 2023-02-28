
import java.sql.*;
/*
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
*/
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_entry_mahasiswa extends javax.swing.JDialog {

    public form_entry_mahasiswa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_tb_mahasiswa();
    }

    form_entry_mahasiswa(form_entry_peminjaman aThis, boolean rootPaneCheckingEnabled) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_mahasiswa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tempat_lahir = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_no_bp = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        txt_jurusan = new javax.swing.JTextField();
        bnt_update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        t_tgl_lahir = new javax.swing.JTextField();
        t_tgl_masuk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM ENTRY MAHASISWA");

        tb_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_mahasiswa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jLabel2.setText("No Bp");

        jLabel3.setText("Nama");

        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        jLabel4.setText("Tempat Lahir");

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel5.setText("Tanggal Lahir");

        jLabel6.setText("Jurusan");

        jLabel7.setText("Tanggal Masuk");

        bnt_update.setText("Update");
        bnt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_updateActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        t_tgl_lahir.setToolTipText("");

        t_tgl_masuk.setToolTipText("YYYY-MM-DD");

        jLabel8.setText("YYYY-MM-DD");

        jLabel9.setText("YYYY-MM-DD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_no_bp)
                    .addComponent(txt_nama)
                    .addComponent(txt_tempat_lahir)
                    .addComponent(txt_jurusan)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(simpan, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(bnt_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(t_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(t_tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addGap(60, 60, 60)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_no_bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_tempat_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(t_tgl_masuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(simpan)
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnt_update)
                    .addComponent(delete))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 908, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        String no_bp="", nama="", tempat_lahir="", jurusan="", tanggal_lahir, tanggal_masuk;
        //java.util.Date tanggal_lahir;
        //java.util.Date tanggal_masuk;
        
        no_bp = txt_no_bp.getText();
        nama = txt_nama.getText();
        tempat_lahir = txt_tempat_lahir.getText();
        jurusan = txt_jurusan.getText();
        //tanggal_masuk = (java.util.Date) this.txt_tanggal_masuk.getDate();
        //tanggal_lahir = (java.util.Date) this.txt_tanggal_lahir.getDate();
        tanggal_masuk = t_tgl_masuk.getText();
        tanggal_lahir = t_tgl_lahir.getText();
        
        try {
            Connection con = new koneksi_2().getConnection();
            String sql = "insert into tb_mahasiswa values (?,?,?,?,?,?)";
            PreparedStatement stat = (PreparedStatement) con.prepareStatement(sql);
            stat.setString(1, no_bp);
            stat.setString(2, nama);
            stat.setString(3, tempat_lahir);
            //stat.setDate(4, new java.sql.Date(tanggal_lahir.getTime()));
            stat.setString(4, tanggal_lahir);
            stat.setString(5, jurusan);
            //stat.setDate(6, new java.sql.Date(tanggal_masuk.getTime()));
            stat.setString(4, tanggal_masuk);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL","Informasi", JOptionPane.INFORMATION_MESSAGE);
            reset();
            tampil_tb_mahasiswa();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void tb_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_mahasiswaMouseClicked
        // TODO add your handling code here:
        kliktable();
    }//GEN-LAST:event_tb_mahasiswaMouseClicked

    //reset 
    public void reset(){
        txt_jurusan.setText("");
        txt_nama.setText("");
        txt_no_bp.setText("");
        //txt_tanggal_lahir.setDate(null);
        //txt_tanggal_masuk.setDate(null);
        t_tgl_lahir.setText(null);
        t_tgl_masuk.setText(null);
        txt_tempat_lahir.setText("");
    }
    
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void bnt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_updateActionPerformed
        Connection con = new koneksi_2().getConnection();
        String no_bp="", nama="", tempat_lahir="", jurusan="", tanggal_lahir, tanggal_masuk;
        //java.util.Date tanggal_lahir=null;
        //java.util.Date tanggal_masuk=null;
        no_bp = txt_no_bp.getText();
        nama = txt_nama.getText();
        tempat_lahir = txt_tempat_lahir.getText();
        jurusan = txt_jurusan.getText();
        //tanggal_masuk = (java.util.Date) this.txt_tanggal_masuk.getDate();
        //tanggal_lahir = (java.util.Date) this.txt_tanggal_lahir.getDate();
        tanggal_masuk = t_tgl_masuk.getText();
        tanggal_lahir = t_tgl_lahir.getText();
        if (tanggal_lahir==null){
            JOptionPane.showMessageDialog(null, "Silahkan isi TANGGAL LAHIR","Informasi", JOptionPane.INFORMATION_MESSAGE);
            //txt_tanggal_lahir.requestFocus();
        }
        else if (tanggal_masuk==null){
            JOptionPane.showMessageDialog(null, "Silahkan isi TANGGAL MASUK","Informasi", JOptionPane.INFORMATION_MESSAGE);
            //txt_tanggal_masuk.requestFocus();
        }
        else {
            String sql="update tb_mahasiswa set nama=?, tempat_lahir=?, tanggal_lahir=?, jurusan=?, tanggal_masuk=? where no_bp='"+no_bp+"'";
            java.sql.PreparedStatement stat = null;
            try {
                stat = con.prepareStatement(sql);
                stat.setString(1, nama);
                stat.setString(2, tempat_lahir);
                //stat.setDate(3, new java.sql.Date(tanggal_lahir.getTime()));
                stat.setString(3, tanggal_lahir);
                stat.setString(4, jurusan);
                //stat.setDate(5, new java.sql.Date(tanggal_masuk.getTime()));
                stat.setString(5, tanggal_masuk);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,"Data BERHASIL di Ubah");
                tampil_tb_mahasiswa();
                reset();
            }catch(SQLException se){
                JOptionPane.showMessageDialog(null,"Data GAGAL di Ubah");
            }
        }
    }//GEN-LAST:event_bnt_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int baris = tb_mahasiswa.getSelectedRow();
        String no_bp = tabmode.getValueAt(baris, 0).toString();        
        int ok=JOptionPane.showConfirmDialog(null,"Apakah Anda yakin ingin menghapus data Mahasiswa BP : "+no_bp+"?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(ok==0){
            try{
                //panggil method koneksi
                Connection con = new koneksi_2().getConnection();
                String sql="delete from tb_mahasiswa where no_bp='"+no_bp+"'";
                Statement st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Data Berhasil di hapus");
                tampil_tb_mahasiswa();
                reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Data Gagal di hapus");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void kliktable(){
        int baris = tb_mahasiswa.getSelectedRow();
        txt_no_bp.setText((String)tb_mahasiswa.getValueAt(baris, 0));
        txt_nama.setText((String)tb_mahasiswa.getValueAt(baris, 1));
        txt_tempat_lahir.setText((String)tb_mahasiswa.getValueAt(baris, 2));
        //txt_tanggal_lahir.setDate((Date)tb_mahasiswa.getValueAt(baris, 3));
        t_tgl_lahir.setText((String)tb_mahasiswa.getValueAt(baris, 3));
        txt_jurusan.setText((String)tb_mahasiswa.getValueAt(baris, 4));
        //txt_tanggal_masuk.setDate((Date)tb_mahasiswa.getValueAt(baris, 5));
        t_tgl_masuk.setText((String)tb_mahasiswa.getValueAt(baris, 5));
    }
    
    private DefaultTableModel tabmode;
    
    //menampilkan data dari datatabe ke tabel
    public void tampil_tb_mahasiswa(){
        Object []baris = {"No Bp","Nama","Tempat Lahir","Tanggal Lhair","Jurusan","Tanggal Masuk"};
        tabmode = new DefaultTableModel(null, baris);
        tb_mahasiswa.setModel(tabmode);
        Connection con = new koneksi_2().getConnection();
        try {
            String sql = "select * from tb_mahasiswa order by no_bp asc";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String no_bp = hasil.getString("no_bp");
                String nama = hasil.getString("nama");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String tanggal_lahir = hasil.getString("tanggal_lahir");
                String jurusan = hasil.getString("jurusan"); 
                String tanggal_masuk = hasil.getString("tanggal_masuk");
                String[] data = {no_bp, nama, tempat_lahir, tanggal_lahir, jurusan, tanggal_masuk};
                tabmode.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL","Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_entry_mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form_entry_mahasiswa dialog = new form_entry_mahasiswa(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnt_update;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField t_tgl_lahir;
    private javax.swing.JTextField t_tgl_masuk;
    private javax.swing.JTable tb_mahasiswa;
    private javax.swing.JTextField txt_jurusan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_no_bp;
    private javax.swing.JTextField txt_tempat_lahir;
    // End of variables declaration//GEN-END:variables
}
