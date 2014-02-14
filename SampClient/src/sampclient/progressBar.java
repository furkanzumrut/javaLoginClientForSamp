/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sampclient;

/**
 *
 * @author furkanzumrut
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

public class progressBar {
  static class BarThread extends Thread {
    private static int DELAY = 30;

    JProgressBar progressBar;
    JLabel label;
    JButton button;

    public BarThread(JProgressBar bar, JLabel lab,JButton but) {
      progressBar = bar;
      label = lab;
      button = but;
    }

    public void run() {
      int minimum = progressBar.getMinimum();
      int maximum = progressBar.getMaximum();
      Runnable runner = new Runnable() {
        public void run() {
          int value = progressBar.getValue();
          progressBar.setValue(value + 1);
          if(progressBar.getValue() >= 20 && progressBar.getValue() <= 50){
          label.setText("Bileşenler Yükleniyor..."+"%"+String.valueOf(value+1));    
          }else if(progressBar.getValue() >= 85 && progressBar.getValue() <= 99){
          label.setText("Tamamlanıyor..."+"%"+String.valueOf(value+1));        
          }else if(progressBar.getValue() == 100)
          {
          label.setText("%100");    
          button.setVisible(true);   
          }else{
          label.setText("%"+String.valueOf(value+1));
          }
          
        }
      };
      for (int i = minimum; i < maximum; i++) {
        try {
          SwingUtilities.invokeAndWait(runner);
          // our job for each step is to just sleep
          Thread.sleep(DELAY);
        } catch (InterruptedException ignoredException) {
        } catch (InvocationTargetException ignoredException) {
        }
      }
    }
  }

 
}


