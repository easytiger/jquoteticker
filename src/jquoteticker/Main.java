/*
 * Main.java
 *
 * Created on 30 November 2007, 13:04
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
package jquoteticker;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author gerry
 */
public class Main {

    /** Creates a new instance of Main */
    public Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        
//        try {            
//            UIManager.setLookAndFeel(
//                "com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (IllegalAccessException ex) {
//            ex.printStackTrace();
//        } catch (InstantiationException ex) {
//            ex.printStackTrace();
//        } catch (UnsupportedLookAndFeelException ex) {
//            ex.printStackTrace();
//        }

//       QuoteTickerFrame qtf = new QuoteTickerFrame();
//        qtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        qtf.setVisible(true);

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QuoteTickerFrame().setVisible(true);
            }
        });

    }// ends main
}
