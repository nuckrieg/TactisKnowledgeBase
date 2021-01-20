package com.gg;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import com.gg.calculation.CalculationTester;
import com.gg.expander.ExpanderTester;
import com.gg.filter.FilterComponentTester;
import com.gg.layout.LayoutTester;
import com.gg.slider.SliderTester;
import com.gg.tabledialog.DialogTableTester;
import com.gg.tablerownumbers.TableRowNumberTester;
import io.sentry.Sentry;
import java.net.InetAddress;

/**
 *
 * The frame contains all components visible in application such as search panel
 * and the table.
 */
public class Showcase extends JFrame {

    private static final long serialVersionUID = -7860751063126147788L;

    public Showcase() throws Exception {

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                e.printStackTrace();
            } else {
                com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(e);
            }
            // If Nimbus is not available, fall back to cross-platform
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception ex) {
                if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                    ex.printStackTrace();
                } else {
                    com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                }
                // not worth my time
            }
        }

        //
        // try {
        //
        //// UIManager.setLookAndFeel(
        //// UIManager.getSystemLookAndFeelClassName());
        // // Set cross-platform Java L&F (also called "Metal")
        // UIManager.setLookAndFeel(UIManager
        // .getCrossPlatformLookAndFeelClassName());
        // } catch (Exception e) {
        // throw e;
        // // handle exception
        // }
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

        setTitle("Showcase");

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.add("Expander", ExpanderTester.getPanel());

        tabbedPane.add("Filter Tree/List", FilterComponentTester.getPanel());

        tabbedPane.add("Slider", SliderTester.getPanel());

        tabbedPane.add("Calculation", CalculationTester.getPanel());

        tabbedPane.add("Table Dialog", DialogTableTester.getPanel());

        tabbedPane.add("Table Row Numbers", TableRowNumberTester.getPanel());

        tabbedPane.add("Layout manager", LayoutTester.getPanel());

        this.add(tabbedPane);

    }

    /**
     * Set up of the main frame.
     *
     * @param mode networked or non networked
     * @throws Exception
     */
    public static void main(String[] s2) throws Exception {

        Showcase s = new Showcase();
        s.setSize(600, 600);

        s.setVisible(true);

        // MainFrame frame = new MainFrame();
        //
        // //initialise UIDelgate
        // UIDelegate.getInstance().initialise(frame, mode);
        //
        // //call a search all (ie get all bookings) when starting up.
        // ArrayList<Booking> list = UIDelegate.getInstance().getAllBookings();
        // frame.getModel().setBookings(list);
        //
        // frame.pack();
        // frame.setVisible(true);
    }
}
