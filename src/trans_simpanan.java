
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows XP
 */
public class trans_simpanan extends javax.swing.JFrame {

    /**
     * Creates new form trans_simpanan
     */
    public trans_simpanan() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tket = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tnoang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tnama = new javax.swing.JTextField();
        talamat = new javax.swing.JTextField();
        tpekerjaan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tdebet = new javax.swing.JTextField();
        tkredit = new javax.swing.JTextField();
        tsaldo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tlama = new javax.swing.JTextField();
        bedit = new javax.swing.JButton();
        bhapus = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();
        tnosim = new javax.swing.JTextField();
        bsimpan = new javax.swing.JButton();
        bcari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        Tanggal = new com.toedter.calendar.JDateChooser();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Transaksi Simpanan Koperasi");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("No Trans :");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Jenis Simpanan :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tgl.Trans :");

        tket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tketActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Anggota"));

        jLabel4.setText("No Anggota :");

        jLabel5.setText("Nama :");

        jLabel6.setText("Alamat :");

        tnoang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tnoangKeyPressed(evt);
            }
        });

        jLabel7.setText("Pekerjaan :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(talamat, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(tpekerjaan, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(tnama, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(tnoang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnoang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(talamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Simpan :");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Penarikan :");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Saldo :");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Saldo Lama :");

        tdebet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdebetActionPerformed(evt);
            }
        });
        tdebet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tdebetKeyPressed(evt);
            }
        });

        tsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsaldoActionPerformed(evt);
            }
        });

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tlama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tsaldo)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tdebet)
                            .addComponent(tkredit)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tlama)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tdebet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tkredit)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tlama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tsaldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        bedit.setText("Edit");
        bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditActionPerformed(evt);
            }
        });

        bhapus.setText("Hapus");
        bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhapusActionPerformed(evt);
            }
        });

        bkeluar.setText("Kembali");
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        bsimpan.setText("Simpan");
        bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsimpanActionPerformed(evt);
            }
        });

        bcari.setText("Cari");
        bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcariActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
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
        Table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table1);

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tnosim)
                            .addComponent(Tanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tket, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(reset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tnosim))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bkeluar)
                                        .addComponent(bhapus)
                                        .addComponent(bedit)
                                        .addComponent(bcari)
                                        .addComponent(reset))
                                    .addComponent(bsimpan)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tketActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tketActionPerformed

    private void tnoangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tnoangKeyPressed
        String kolom[] = {"No.Anggota","Nama","Alamat","Kota","No.Telepon","Pekerjaan"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM anggota WHERE no_ang ='"+tnoang.getText()+"'";
        ResultSet rs = koneksi.executeQuery(SQL);
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            
            try
            {                
                if(rs.next())
                {
                    String no_ang = rs.getString(1);
                String nama_ang = rs.getString(2);
                String alamat = rs.getString(3);
                String kota = rs.getString(4);
                String no_telp = rs.getString(5);
                String pekerjaan = rs.getString(6);
                String data[] = {no_ang,nama_ang,alamat,kota,no_telp,pekerjaan};
                dtm.addRow(data);
                Table1.setModel(dtm);
                    
                    bhapus.setEnabled(true);
                    bsimpan.setVisible(true);
                    bsimpan.setEnabled(false);                    
                    bedit.setEnabled(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Kode Tidak Tersedia");
                    tnoang.setText("");                    
                    
                    bhapus.setEnabled(true);
                    bsimpan.setEnabled(true);
                    bedit.setEnabled(true);
                    bersih();
                    selectData();
                }                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"<Error> Koneksikan Xampp Terlebih Dahulu : "+e,"Koneksi Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_tnoangKeyPressed

    private void tdebetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdebetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdebetActionPerformed

    private void tdebetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tdebetKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        }
    }//GEN-LAST:event_tdebetKeyPressed

    private void tsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsaldoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double saldo = Double.parseDouble(tlama.getText())+Double.parseDouble(tdebet.getText())-Double.parseDouble(tkredit.getText());
        tsaldo.setText(Double.toString(saldo));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tlamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlamaActionPerformed

    private void beditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beditActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());                    
        String SQL="update trans_simpanan set jenis='"+tket.getText()+"',saldo='"+tsaldo.getText()+"' where nosimpan='"+tnosim.getText()+"'";
                int status = koneksi.execute(SQL);
                String SQL1="update detail_simpanan set no_ang='"+tnoang.getText()+"',debet='"+tdebet.getText()+"',kredit='"+tkredit.getText()+
                        "',saldo='"+tsaldo.getText()+"' where nosimpan='"+tnosim.getText()+"'";
                int status1 = koneksi.execute(SQL1);
                JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            bersih();    
            selectData();
    }//GEN-LAST:event_beditActionPerformed

    private void bhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhapusActionPerformed
        int baris = Table1.getSelectedRow();
        if (baris != -1) {
            String no = Table1.getValueAt(baris, 3).toString();
            String SQL = "DELETE FROM trans_simpanan WHERE nosimpan='"+no+"'";
            int status = koneksi.execute(SQL);
            String SQL1 = "DELETE FROM detail_simpanan WHERE nosimpan='"+no+"'";
            int status1 = koneksi.execute(SQL1);
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
        selectData();
        bersih();
    }//GEN-LAST:event_bhapusActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        new utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_bkeluarActionPerformed

    private void bsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsimpanActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(Tanggal.getDate());                    
        String SQL = "INSERT INTO trans_simpanan (nosimpan,tglsimpan,jenis,saldo) "
            + "VALUES('"+tnosim.getText()+"','"+tanggal+"','"+tket.getText()+"','"+tsaldo.getText()+"')";                                                    
            int status = koneksi.execute(SQL);            
        String SQL1 = "INSERT INTO detail_simpanan (nosimpan,no_ang,debet,kredit,saldo) "
                + "VALUES('"+tnosim.getText()+"','"+tnoang.getText()+"','"+tdebet.getText()+"','"+tkredit.getText()+"','"+tsaldo.getText()+"')";
            int status1 = koneksi.execute(SQL1);
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            bersih();    
            selectData();
    }//GEN-LAST:event_bsimpanActionPerformed

    private void bcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcariActionPerformed
        try
    {        
        String kolom[] = {"Nama Anggota","Alamat","Pekerjaan","No.Simpan","Tanggal Simpan","Jenis","Saldo","No.Anggota","Debet","Kredit"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "select tglsimpan,jenis from trans_simpanan where nosimpan='"+tnosim.getText()+"'";
        ResultSet rs = koneksi.executeQuery(SQL);        
       while (rs.next())
        {                                            
                String tglsimpan = rs.getString(1);
                String jenis = rs.getString(2);              
                String SQL1 = "select no_ang,nama_ang,alamat,pekerjaan from anggota where no_ang='"+tnoang.getText()+"'";
        ResultSet rs1 = koneksi.executeQuery(SQL1); 
        if(rs1.next()){
            
            String no_ang = rs1.getString(1);
                String nama_ang = rs1.getString(2);
                String alamat = rs1.getString(3);
                String pekerjaan = rs1.getString(4);
                String SQL2 = "select nosimpan,saldo,debet,kredit from detail_simpanan where nosimpan='"+tnosim.getText()+"'";
        ResultSet rs2 = koneksi.executeQuery(SQL2); 
        if(rs2.next()){
            
            String nosimpan = rs2.getString(1);
                String debet = rs2.getString(2);
                String kredit = rs2.getString(3);                                
                String saldo = rs2.getString(4);            
            String data[] = {nama_ang,alamat,pekerjaan,nosimpan,tglsimpan,jenis,saldo,no_ang,debet,kredit};
                dtm.addRow(data);                                                                                                    
                   Table1.setModel(dtm);     
        }                
        }
        }
    }
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(trans_simpanan.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }//GEN-LAST:event_bcariActionPerformed

    private void Table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table1MouseClicked
        // TODO add your handling code here:
int baris = Table1.getSelectedRow();
        if (baris !=1) {
            
            tnama.setText(Table1.getValueAt(baris, 0).toString());
            talamat.setText(Table1.getValueAt(baris, 1).toString());
            tpekerjaan.setText(Table1.getValueAt(baris, 2).toString());
            tnosim.setText(Table1.getValueAt(baris, 3).toString());
            tnosim.setEnabled(false);
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try {
                dateFormat = date.parse(Table1.getValueAt(baris, 4).toString());
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(trans_pinjaman.class.getName()).log(Level.SEVERE, null, ex);
            }
            Tanggal.setDate(dateFormat);
            Tanggal.setEnabled(false);
            tket.setText(Table1.getValueAt(baris, 5).toString());            
            tsaldo.setText(Table1.getValueAt(baris, 6).toString());
            tnoang.setText(Table1.getValueAt(baris, 7).toString());
            tnoang.setEnabled(false);
            tdebet.setText(Table1.getValueAt(baris, 8).toString());
            tkredit.setText(Table1.getValueAt(baris, 9).toString());            
        }
        
    }//GEN-LAST:event_Table1MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_formWindowOpened

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        bersih();        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(trans_simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trans_simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trans_simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trans_simpanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new trans_simpanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table1;
    private com.toedter.calendar.JDateChooser Tanggal;
    private javax.swing.JButton bcari;
    private javax.swing.JButton bedit;
    private javax.swing.JButton bhapus;
    private javax.swing.JButton bkeluar;
    private javax.swing.JButton bsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField talamat;
    private javax.swing.JTextField tdebet;
    private javax.swing.JTextField tket;
    private javax.swing.JTextField tkredit;
    private javax.swing.JTextField tlama;
    private javax.swing.JTextField tnama;
    private javax.swing.JTextField tnoang;
    private javax.swing.JTextField tnosim;
    private javax.swing.JTextField tpekerjaan;
    private javax.swing.JTextField tsaldo;
    // End of variables declaration//GEN-END:variables

    private void selectData() {                        
        try
    {        
        String kolom[] = {"Nama Anggota","Alamat","Pekerjaan","No.Simpan","Tanggal Simpan","Jenis","Saldo","No.Anggota","Debet","Kredit"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "select anggota.no_ang,anggota.nama_ang,anggota.alamat,anggota.pekerjaan,detail_simpanan.nosimpan,detail_simpanan.debet,"
                + "detail_simpanan.kredit,detail_simpanan.saldo,trans_simpanan.tglsimpan,trans_simpanan.jenis from anggota INNER JOIN detail_simpanan "
                + "ON detail_simpanan.no_ang=anggota.no_ang INNER JOIN trans_simpanan ON trans_simpanan.nosimpan=detail_simpanan.nosimpan";
        ResultSet rs = koneksi.executeQuery(SQL);        
       while (rs.next())
        {                            
                String no_ang = rs.getString(1);
                String nama_ang = rs.getString(2);
                String alamat = rs.getString(3);
                String pekerjaan = rs.getString(4);
                String nosimpan = rs.getString(5);
                String debet = rs.getString(6);
                String kredit = rs.getString(7);                                
                String saldo = rs.getString(8);            
                String tglsimpan = rs.getString(9);
                String jenis = rs.getString(10);                
            String data[] = {nama_ang,alamat,pekerjaan,nosimpan,tglsimpan,jenis,saldo,no_ang,debet,kredit};
                dtm.addRow(data);                                                                                                    
                   Table1.setModel(dtm);     
        }                
    }
        catch (SQLException ex) {
            java.util.logging.Logger.getLogger(trans_simpanan.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    private void bersih() {
        tnosim.setText("");
tket.setText("");
tsaldo.setText("");
tnoang.setText("");
tdebet.setText("");
tkredit.setText("");
tnama.setText("");
talamat.setText("");
tpekerjaan.setText("");
tlama.setText("");
Tanggal.setDate(null);
tnosim.setEnabled(true);
Tanggal.setEnabled(true);
tnoang.setEnabled(true);
selectData();
    }
}
