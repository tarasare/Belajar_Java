/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.penjualan.desktop;

import aplikasi.penjualan.desktop.frame.FrmMain;
import com.sunday.june.aplikasi.penjualan.AplikasiPenjualan;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.UIManager;

/**
 *
 * @author Null Pointer
 */
public class AplikasiPenjualanDesktop {

    /**
     * @param args the command line arguments
     */
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aplikasi_PenjualanPU");
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            FrmMain frmMain = new FrmMain();
            frmMain.setVisible(true);
           
        } catch (Exception e) {
        }
        
    }
    
}
