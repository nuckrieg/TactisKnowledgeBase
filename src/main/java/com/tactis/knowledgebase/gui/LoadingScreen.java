//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.tactis.knowledgebase.gui;

import com.tactis.knowledgebase.Main;
import static com.tactis.knowledgebase.Main.logger;
import io.sentry.Sentry;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoadingScreen {
    public static final JDialog dialog = new JDialog();
    public static String message = "A obter dados, por favor aguarde...";
    public static String title = "Aviso";
    public static JPanel panel = new JPanel(new BorderLayout());
    public static JLabel label = new JLabel();
    public static JProgressBar barra = new JProgressBar();
    public LoadingScreen() {

    }

    public static void waitFor(Runnable command) throws IOException {
        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
       
      /*  try {
            new Main().setDialogIcon();
        } catch (Exception ex) {
           if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                ex.printStackTrace();
            } else {
                com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
        }*/

        label.setText(message);
        Font f = label.getFont();
        label.setFont(f.deriveFont(f.getStyle() | 2));
        Font f2 = label.getFont();
        label.setFont(f2.deriveFont(f2.getStyle() | 1));
        label.setVerticalAlignment(0);
        label.setVerticalTextPosition(0);
        label.setHorizontalAlignment(0);
        label.setHorizontalTextPosition(0);
        panel.setAlignmentY(0.5F);
        panel.setAlignmentX(0.5F);
        panel.add(label, "Center");
       // dialog.setIconImage(new ImageIcon("C:\\tactis\\KB\\baseIcon.png").getImage());
        dialog.setTitle(title);
        dialog.add(panel, "Center");
        dialog.setSize(250, 100);
        dialog.setDefaultCloseOperation(0);
        dialog.setLocationRelativeTo(null);
        (new Thread(new Runnable() {
            public void run() {

                command.run();

                //DO INSERT TO-RUN CODE HERE
                dialog.dispose();
             
            }
        })).start();
        dialog.setVisible(true);
    }
}
