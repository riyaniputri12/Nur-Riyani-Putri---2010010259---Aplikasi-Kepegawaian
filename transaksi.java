/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewapc;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class transaksi extends javax.swing.JFrame {
    int nilai1,kali;
    private String[] JudulKolom={"ID Transaksi","Tanggal","Nama Penyewa","Nama Komputer","Mulai","Selesai","Durasi","Bayar"};
    private int[]LebarKolom ={100,100,100,100,100,100,100,100};
    private String SQL="SELECT * FROM transaksi";
    String dateChooser;
    public void tampilPilihan() {
        java.sql.Statement st;
        java.sql.Connection con;
        java.sql.ResultSet rs;
        try {
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sewa_pc", "root", "");
            st = con.createStatement();
            String s = "select * from penyewa";
            rs = st.executeQuery(s);
            while (rs.next()) {
                nama.addItem(rs.getString(2));
            }
            String a = "select * from komputer";
            rs = st.executeQuery(a);
            while (rs.next()) {
                komp.addItem(rs.getString(1));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
                }
    }
    public void tanggal(){
        Date ys=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy H:mm");
        tgl.setText(s.format(ys));
    }

    public transaksi() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        new configdb().setJudulTabel(tabel_transaksi, JudulKolom);
        new configdb().tampilTabel(tabel_transaksi, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_transaksi, LebarKolom);
        tampilPilihan();
        tanggal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        notransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tgl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        durasi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bayar = new javax.swing.JTextField();
        nama = new javax.swing.JComboBox<>();
        komp = new javax.swing.JComboBox<>();
        mulai = new javax.swing.JFormattedTextField();
        selesai = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_transaksi = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        cari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        bsave = new javax.swing.JButton();
        bubah = new javax.swing.JButton();
        bbatal = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bcetakkomp = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PENYEWAAN PC");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("No Transaksi");

        jLabel3.setText("Nama Komputer");

        jLabel5.setText("Tanggal");

        jLabel6.setText("Nama Penyewa");

        jLabel7.setText("Mulai");

        jLabel8.setText("Selesai");

        jLabel9.setText("Durasi");

        jLabel10.setText("Bayar");

        bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bayarActionPerformed(evt);
            }
        });

        nama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        komp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        mulai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm"))));

        selesai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("h:mm"))));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addContainerGap(151, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selesai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mulai, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(komp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(notransaksi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bayar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(durasi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(komp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(durasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABEL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tabel_transaksi.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_transaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_transaksi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PENCARIAN DATA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        jLabel1.setText("Masukan Kata Kunci");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cari)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TOMBOL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        bsave.setBackground(new java.awt.Color(255, 51, 51));
        bsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bubah.setBackground(new java.awt.Color(255, 51, 51));
        bubah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bbatal.setBackground(new java.awt.Color(255, 51, 51));
        bbatal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bhapus.setBackground(new java.awt.Color(255, 51, 51));
        bhapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bcetakkomp.setBackground(new java.awt.Color(255, 51, 51));
        bcetakkomp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bcetakkomp.setForeground(new java.awt.Color(255, 255, 255));
        bcetakkomp.setText("Cetak Data");
        bcetakkomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakkompActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(255, 51, 51));
        keluar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        keluar.setForeground(new java.awt.Color(255, 255, 255));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bcetakkomp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bcetakkomp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
        String a,b;
        a = (String)nama.getSelectedItem();
        b = (String)komp.getSelectedItem();
        String[] Fieldnya ={"no_transaksi","nama_penyewa","nama_komputer","mulai","selesai","durasi","bayar"};
        String[] Valuenya = {notransaksi.getText(),a,b,mulai.getText(),selesai.getText(),durasi.getText(),bayar.getText()};
        new configdb().Ubah("transaksi","no_transaksi",notransaksi.getText(), Fieldnya, Valuenya);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        new configdb().setJudulTabel(tabel_transaksi, JudulKolom);
        new configdb().tampilTabel(tabel_transaksi, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_transaksi, LebarKolom);
                                        
                
    }//GEN-LAST:event_bubahActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String a,b;
        a = (String)nama.getSelectedItem();
        b = (String)komp.getSelectedItem();
        String[] Fieldnya ={"no_transaksi","tgl_transaksi","nama_penyewa","nama_komputer","mulai","selesai","durasi","bayar"};
        String[] Valuenya = {notransaksi.getText(),tgl.getText(),a,b,mulai.getText(),selesai.getText(),durasi.getText(),bayar.getText()};
        if ( new configdb().DuplikasiPrimeryKey("transaksi","no_transaksi",notransaksi.getText()))
            {
              JOptionPane.showMessageDialog(null,"ID Penyewa Sudah Ada");
        }else{
                 new configdb().Simpan("transaksi",Fieldnya, Valuenya);
                 JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan");
                 new configdb().setJudulTabel(tabel_transaksi, JudulKolom);
                 new configdb().tampilTabel(tabel_transaksi, JudulKolom, SQL);
                 new configdb().setLebarKolomTabel(tabel_transaksi, LebarKolom);
                }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
        String a,b;
        a = (String)nama.getSelectedItem();
        b = (String)komp.getSelectedItem();
        String[] Fieldnya ={"no_transaksi","tgl_transaksi","nama_penyewa","nama_komputer","mulai","selesai","durasi","bayar"};
        String[] Valuenya = {notransaksi.getText(),tgl.getText(),a,b,mulai.getText(),selesai.getText(),durasi.getText(),bayar.getText()};
        new configdb().Hapus("transaksi","no_transaksi",notransaksi.getText());
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        new configdb().setJudulTabel(tabel_transaksi, JudulKolom);
        new configdb().tampilTabel(tabel_transaksi, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_transaksi, LebarKolom);
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        notransaksi.setText("");
        mulai.setText("");
        selesai.setText("");
        durasi.setText("");
        bayar.setText("");
        nama.setSelectedIndex(0);
        komp.setSelectedIndex(0);
    }//GEN-LAST:event_bbatalActionPerformed

    private void tabel_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_transaksiMouseClicked
        // TODO add your handling code here:
        int row = tabel_transaksi.getSelectedRow(); 
        notransaksi.setText(tabel_transaksi.getModel().getValueAt(row,0).toString());
        nama.setSelectedItem(tabel_transaksi.getModel().getValueAt(row,2).toString());
        komp.setSelectedItem(tabel_transaksi.getModel().getValueAt(row,3).toString());
        mulai.setText(tabel_transaksi.getModel().getValueAt(row,4).toString());
        selesai.setText(tabel_transaksi.getModel().getValueAt(row,5).toString());
        durasi.setText(tabel_transaksi.getModel().getValueAt(row,6).toString());
        bayar.setText(tabel_transaksi.getModel().getValueAt(row,7).toString());
        
    }//GEN-LAST:event_tabel_transaksiMouseClicked

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
       String SQLCari ="SELECT*FROM transaksi WHERE no_transaksi LIKE'%"+cari.getText()+"%' OR nama_penyewa LIKE '%"+cari.getText()+"%'";
       new configdb().setJudulTabel(tabel_transaksi, JudulKolom);
       new configdb().tampilTabel(tabel_transaksi, JudulKolom, SQLCari);
       new configdb().setLebarKolomTabel(tabel_transaksi, LebarKolom);
    }//GEN-LAST:event_cariKeyReleased

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void bcetakkompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakkompActionPerformed
        // TODO add your handling code here:
        new configdb().tampilLaporan("src/laporan/transaksi.jrxml","SELECT * FROM transaksi");
    }//GEN-LAST:event_bcetakkompActionPerformed

    private void bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bayarActionPerformed
        // TODO add your handling code here:
        nilai1=Integer.parseInt(durasi.getText());
        kali=nilai1*6000;
        bayar.setText(String.valueOf(kali));
    }//GEN-LAST:event_bayarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayar;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcetakkomp;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField durasi;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JComboBox<String> komp;
    private javax.swing.JFormattedTextField mulai;
    private javax.swing.JComboBox<String> nama;
    private javax.swing.JTextField notransaksi;
    private javax.swing.JFormattedTextField selesai;
    private javax.swing.JTable tabel_transaksi;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}
