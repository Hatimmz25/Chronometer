package com.mycompany.chronometre;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ChronometreApp {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Chronometre");

        ChronometreFrame chronoPanel = new ChronometreFrame();
        frame.setContentPane(chronoPanel);
        frame.pack();              
        frame.setVisible(true);
        
    }
}
