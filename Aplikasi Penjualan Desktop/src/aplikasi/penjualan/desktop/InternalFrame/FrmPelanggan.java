/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.penjualan.desktop.InternalFrame;

import aplikasi.penjualan.desktop.util.NavigatorForm;
import com.sunday.june.aplikasi.penjualan.controller.PelangganController;
import com.sunday.june.aplikasi.penjualan.orm.Pelanggan;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Null Pointer
 */
public class FrmPelanggan extends javax.swing.JInternalFrame implements NavigatorForm {

    /**
     * Creates new form FrmPelanggan
     */
    public FrmPelanggan() {
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

        jKodePelanggan = new javax.swing.JLabel();
        jNamaPelanggan = new javax.swing.JLabel();
        jAlamatPelanggan = new javax.swing.JLabel();
        jtxtKodePelanggan = new javax.swing.JTextField();
        jtxtNamaPelanggan = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAlamatPelanggan = new javax.swing.JTextArea();

        setClosable(true);
        setTitle("Form Pelanggan");

        jKodePelanggan.setText("Kode Pelanggan");

        jNamaPelanggan.setText("Nama Pelanggan");

        jAlamatPelanggan.setText("Alamat Pelanggan");

        jtxtKodePelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtKodePelangganKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtKodePelangganKeyTyped(evt);
            }
        });

        jtxtNamaPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNamaPelangganKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNamaPelangganKeyTyped(evt);
            }
        });

        jtxtAlamatPelanggan.setColumns(20);
        jtxtAlamatPelanggan.setRows(5);
        jtxtAlamatPelanggan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAlamatPelangganKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jtxtAlamatPelanggan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jAlamatPelanggan)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jKodePelanggan)
                            .addComponent(jNamaPelanggan))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtKodePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jKodePelanggan)
                    .addComponent(jtxtKodePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNamaPelanggan)
                    .addComponent(jtxtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jAlamatPelanggan)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtKodePelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtKodePelangganKeyPressed

        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            cariData();          
            if(pelanggan!=null){
                showData();
            }else{
                jtxtNamaPelanggan.requestFocus();
            }
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_jtxtKodePelangganKeyPressed

    private void jtxtKodePelangganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtKodePelangganKeyTyped
        // TODO add your handling code here:
        if(jtxtKodePelanggan.getText().length()==5){
            evt.consume();
        }
        cariData();
        if(pelanggan!=null){
            showData();
        }
    }//GEN-LAST:event_jtxtKodePelangganKeyTyped

    private void jtxtNamaPelangganKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNamaPelangganKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            jtxtAlamatPelanggan.requestFocus();
        }
    }//GEN-LAST:event_jtxtNamaPelangganKeyPressed

    private void jtxtNamaPelangganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNamaPelangganKeyTyped
        // TODO add your handling code here:
        if(jtxtNamaPelanggan.getText().trim().length()==20){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_jtxtNamaPelangganKeyTyped

    private void jtxtAlamatPelangganKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtAlamatPelangganKeyTyped
        // TODO add your handling code here:
        
        if(jtxtAlamatPelanggan.getText().trim().length()==100){
            evt.consume();
        }
        
    }//GEN-LAST:event_jtxtAlamatPelangganKeyTyped
Pelanggan pelanggan;
    PelangganController plgCtrl = new PelangganController(aplikasi.penjualan.desktop.AplikasiPenjualanDesktop.emf);
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAlamatPelanggan;
    private javax.swing.JLabel jKodePelanggan;
    private javax.swing.JLabel jNamaPelanggan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtxtAlamatPelanggan;
    private javax.swing.JTextField jtxtKodePelanggan;
    private javax.swing.JTextField jtxtNamaPelanggan;
    // End of variables declaration//GEN-END:variables

    @Override
    public void clearData() {
        jtxtAlamatPelanggan.setText("");
        jtxtKodePelanggan.setText("");
        jtxtNamaPelanggan.setText("");
    }

    @Override
    public void newData() {
        clearData();
        jtxtKodePelanggan.requestFocus();
    }

    @Override
    public void saveData() {
        if(jtxtKodePelanggan.getText().trim().length()>0|| !jtxtKodePelanggan.getText().equals("")){
            try {
                pelanggan = plgCtrl.cari(jtxtKodePelanggan.getText().toUpperCase());
            } catch (Exception e) {
            }
            if(pelanggan == null){
                pelanggan = new Pelanggan();
                try {
                    if(jtxtNamaPelanggan.getText().trim().length()>0 || !jtxtNamaPelanggan.getText().equals("")){
                        pelanggan.setKodepelanggan(jtxtKodePelanggan.getText().toUpperCase());
                    pelanggan.setNamapelanggan(jtxtNamaPelanggan.getText().toUpperCase());
                  if(jtxtAlamatPelanggan.getText().trim().length() > 0 || !jtxtAlamatPelanggan.getText().equals("")){
                      pelanggan.setAlamat(jtxtAlamatPelanggan.getText());
                  }else{
                      JOptionPane.showMessageDialog(null,"Alamat Pelanggan Masih Kosong ");
                      jtxtAlamatPelanggan.requestFocus();
                  }
                }else{
                        JOptionPane.showMessageDialog(null, "Nama Pelanggan Masih Kosong");
                        jtxtNamaPelanggan.requestFocus();
                        
                    }

                plgCtrl.simpan(pelanggan);
                JOptionPane.showMessageDialog(null, "Pelanggan Berhasil Disimpan");
                clearData();
                jtxtKodePelanggan.requestFocus();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "GAGAL");
                    e.printStackTrace();
                    clearData();
                    jtxtKodePelanggan.requestFocus();
                }
            }else{
                int jawaban = JOptionPane.showConfirmDialog(null, "Kode Pelanggan Sudah tersedia!"+"/n Teruskan untuk edit","Peringatan",JOptionPane.OK_CANCEL_OPTION);
                if(jawaban == JOptionPane.OK_OPTION){
                try {
                                        if(jtxtNamaPelanggan.getText().trim().length()>0|| !jtxtNamaPelanggan.getText().equals("")){
                       pelanggan.setKodepelanggan(jtxtKodePelanggan.getText().toUpperCase());
                    pelanggan.setNamapelanggan(jtxtNamaPelanggan.getText().toUpperCase());
                  if(jtxtAlamatPelanggan.getText().trim().length() > 0 || !jtxtAlamatPelanggan.getText().equals("")){
                      pelanggan.setAlamat(jtxtAlamatPelanggan.getText());
                  }else{
                      JOptionPane.showMessageDialog(null,"Alamat Pelanggan Masih Kosong ");
                      jtxtAlamatPelanggan.requestFocus();
                  }
                }else{
                        JOptionPane.showMessageDialog(null, "Nama Pelanggan Masih Kosong");
                        jtxtNamaPelanggan.requestFocus();
                        
                    }
                                        
                                        plgCtrl.edit(pelanggan);
                                        JOptionPane.showMessageDialog(null, "Pelanggan Berhasil di edit");
                                        clearData();
                                        jtxtKodePelanggan.requestFocus();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal Menyimpan");
                    clearData();
                    jtxtKodePelanggan.setText("");
                }
            }else{
                    jtxtKodePelanggan.requestFocus();
                    jtxtKodePelanggan.selectAll();
                }
            }
        }
    }

    @Override
    public void setData() {
    }

    @Override
    public void deleteData() {
        try {
            if(jtxtKodePelanggan.getText().trim().length()>0|| !jtxtKodePelanggan.getText().equals("")){
                plgCtrl.hapus(jtxtKodePelanggan.getText());
            }
            clearData();
            jtxtKodePelanggan.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus");
            clearData();
            jtxtKodePelanggan.requestFocus();
        }
        
    }

    @Override
    public void cariData() {
        try {
            pelanggan = plgCtrl.cari(jtxtKodePelanggan.getText().toUpperCase());

        } catch (Exception e) {
        }
    }
    @Override
    public void showData() {
    jtxtKodePelanggan.setText(pelanggan.getKodepelanggan());
    jtxtNamaPelanggan.setText(pelanggan.getNamapelanggan());
    jtxtAlamatPelanggan.setText(pelanggan.getAlamat());
    
    
    }

    @Override
    public void printData() {
        EntityManager em = null;
        try {
            em = aplikasi.penjualan.desktop.AplikasiPenjualanDesktop.emf.createEntityManager();
            em.getTransaction().begin();
            Connection con = em.unwrap(Connection.class);
            
            File file = new File("");
            String sourceFile = file.getAbsolutePath()+"\\report\\Pelanggan.Jasper";
            JasperPrint jPrint = JasperFillManager.fillReport(sourceFile, new HashMap(), con);
            JasperViewer jView = new JasperViewer(jPrint);
            jView.setFitPageZoomRatio();
            jView.setVisible(true);
            em.getTransaction().commit();
            con.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak Bisa Print "+e.getMessage());
        }finally{
            if(em != null){
                em.close();
            }
        }
    }
}
