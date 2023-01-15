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

public class karyawan extends javax.swing.JFrame {
    private String[] JudulKolom={"NIK","Nama","Tanggal mulai","Gaji Pokok (Rp)","Status","Bagian"};
    private int[]LebarKolom ={100,100,100,100,100,100};
    private String SQL="SELECT * FROM karyawan";
    public void tampilPilihan() {
        java.sql.Statement st;
        java.sql.Connection con;
        java.sql.ResultSet rs;
        try {
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/2010010259_kepegawaian", "root", "");
            st = con.createStatement();
            String s = "select * from bagian";
            rs = st.executeQuery(s);
            while (rs.next()) {
                bagian.addItem(rs.getString(2));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
                }
    }

    public karyawan() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        new configdb().setJudulTabel(tabel_karyawan, JudulKolom);
        new configdb().tampilTabel(tabel_karyawan, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_karyawan, LebarKolom);
        tampilPilihan();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bagian = new javax.swing.JComboBox<>();
        gaji_pokok = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        tgl = new javax.swing.JFormattedTextField();
        nama = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_karyawan = new javax.swing.JTable();
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

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("APLIKASI KEPEGAWAIAN");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INPUT", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jLabel2.setText("NIK");

        jLabel3.setText("Gaji Pokok");

        jLabel5.setText("Nama");

        jLabel6.setText("Tanggal Mulai");

        jLabel7.setText("Status Karyawan");

        jLabel8.setText("Bagian");

        bagian.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        gaji_pokok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaji_pokokActionPerformed(evt);
            }
        });

        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        tgl.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(status, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tgl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gaji_pokok, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bagian, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nik, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(0, 112, Short.MAX_VALUE)))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gaji_pokok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bagian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TABEL", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        tabel_karyawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabel_karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_karyawanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_karyawan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PENCARIAN DATA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
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

        bsave.setBackground(new java.awt.Color(0, 0, 0));
        bsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bsave.setForeground(new java.awt.Color(255, 255, 255));
        bsave.setText("Save");
        bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsaveActionPerformed(evt);
            }
        });

        bubah.setBackground(new java.awt.Color(0, 0, 0));
        bubah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bubah.setForeground(new java.awt.Color(255, 255, 255));
        bubah.setText("Ubah");
        bubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bubahActionPerformed(evt);
            }
        });

        bbatal.setBackground(new java.awt.Color(0, 0, 0));
        bbatal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bbatal.setForeground(new java.awt.Color(255, 255, 255));
        bbatal.setText("Batal");
        bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbatalActionPerformed(evt);
            }
        });

        bhapus.setBackground(new java.awt.Color(0, 0, 0));
        bhapus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bhapus.setForeground(new java.awt.Color(255, 255, 255));
        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bcetakkomp.setBackground(new java.awt.Color(0, 0, 0));
        bcetakkomp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bcetakkomp.setForeground(new java.awt.Color(255, 255, 255));
        bcetakkomp.setText("Cetak Data");
        bcetakkomp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcetakkompActionPerformed(evt);
            }
        });

        keluar.setBackground(new java.awt.Color(0, 0, 0));
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
                .addGap(18, 18, 18)
                .addComponent(bubah, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(bsave)
                    .addComponent(bcetakkomp)
                    .addComponent(keluar)
                    .addComponent(bhapus)
                    .addComponent(bbatal)
                    .addComponent(bubah))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bubahActionPerformed
        // TODO add your handling code here:
        String a;
        a = (String)bagian.getSelectedItem();
        String[] Fieldnya ={"nik","nama","tanggal_mulai","gaji_pokok","status_karyawan","bagian_id"};
        String[] Valuenya = {nik.getText(),nama.getText(),tgl.getText(),gaji_pokok.getText(),status.getText(),a};
        new configdb().Ubah("karyawan","nik",nik.getText(), Fieldnya, Valuenya);
        JOptionPane.showMessageDialog(null,"Data Berhasil diubah");
        new configdb().setJudulTabel(tabel_karyawan, JudulKolom);
        new configdb().tampilTabel(tabel_karyawan, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_karyawan, LebarKolom);
                                        
                
    }//GEN-LAST:event_bubahActionPerformed

    private void bsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsaveActionPerformed
        // TODO add your handling code here:
        String a;
        a = (String)bagian.getSelectedItem();
        String[] Fieldnya ={"nik","nama","tanggal_mulai","gaji_pokok","status_karyawan","bagian_id"};
        String[] Valuenya = {nik.getText(),nama.getText(),tgl.getText(),gaji_pokok.getText(),status.getText(),a};
        if ( new configdb().DuplikasiPrimeryKey("karyawan","nik",nik.getText()))
            {
              JOptionPane.showMessageDialog(null,"NIK Sudah Ada");
        }else{
                 new configdb().Simpan("karyawan",Fieldnya, Valuenya);
                 JOptionPane.showMessageDialog(null,"Data Berhasil di Simpan");
                 new configdb().setJudulTabel(tabel_karyawan, JudulKolom);
                 new configdb().tampilTabel(tabel_karyawan, JudulKolom, SQL);
                 new configdb().setLebarKolomTabel(tabel_karyawan, LebarKolom);
                }
    }//GEN-LAST:event_bsaveActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        // TODO add your handling code here:
       String a;
        a = (String)bagian.getSelectedItem();
        String[] Fieldnya ={"nik","nama","tanggal_mulai","gaji_pokok","status_karyawan","bagian_id"};
        String[] Valuenya = {nik.getText(),nama.getText(),tgl.getText(),gaji_pokok.getText(),status.getText(),a};
        new configdb().Hapus("karyawan","nik",nik.getText());
        JOptionPane.showMessageDialog(null,"Data Berhasil dihapus");
        new configdb().setJudulTabel(tabel_karyawan, JudulKolom);
        new configdb().tampilTabel(tabel_karyawan, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tabel_karyawan, LebarKolom);
    }//GEN-LAST:event_bhapusActionPerformed

    private void bbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbatalActionPerformed
        // TODO add your handling code here:
        nik.setText("");
        nama.setText("");
        gaji_pokok.setText("");
        status.setText("");
        tgl.setText("");
        bagian.setSelectedIndex(0);
    }//GEN-LAST:event_bbatalActionPerformed

    private void tabel_karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_karyawanMouseClicked
        // TODO add your handling code here:
        int row = tabel_karyawan.getSelectedRow(); 
        nik.setText(tabel_karyawan.getModel().getValueAt(row,0).toString());
        nama.setText(tabel_karyawan.getModel().getValueAt(row,1).toString());
        tgl.setText(tabel_karyawan.getModel().getValueAt(row,2).toString());
        gaji_pokok.setText(tabel_karyawan.getModel().getValueAt(row,3).toString());
        status.setText(tabel_karyawan.getModel().getValueAt(row,4).toString());;         
        bagian.setSelectedItem(tabel_karyawan.getModel().getValueAt(row,5).toString());
    }//GEN-LAST:event_tabel_karyawanMouseClicked

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        // TODO add your handling code here:
       String SQLCari ="SELECT*FROM karyawan WHERE nik LIKE'%"+cari.getText()+"%' OR nama LIKE '%"+cari.getText()+"%'";
       new configdb().setJudulTabel(tabel_karyawan, JudulKolom);
       new configdb().tampilTabel(tabel_karyawan, JudulKolom, SQLCari);
       new configdb().setLebarKolomTabel(tabel_karyawan, LebarKolom);
    }//GEN-LAST:event_cariKeyReleased

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_keluarActionPerformed

    private void bcetakkompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcetakkompActionPerformed
        // TODO add your handling code here:
        new configdb().tampilLaporan("src/laporan/karyawan.jrxml","SELECT * FROM karyawan");
    }//GEN-LAST:event_bcetakkompActionPerformed

    private void gaji_pokokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaji_pokokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gaji_pokokActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main (String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bagian;
    private javax.swing.JButton bbatal;
    private javax.swing.JButton bcetakkomp;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bsave;
    private javax.swing.JButton bubah;
    private javax.swing.JTextField cari;
    private javax.swing.JTextField gaji_pokok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nik;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabel_karyawan;
    private javax.swing.JFormattedTextField tgl;
    // End of variables declaration//GEN-END:variables
}
