//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package com.tactis.knowledgebase.gui;

import com.gg.slider.SideBar;
import com.gg.slider.SideBar.SideBarMode;
import com.gg.slider.SidebarSection;
import com.tactis.knowledgebase.Main;
import static com.tactis.knowledgebase.Main.KBVERSION;
import io.sentry.Sentry;
import org.icepdf.core.pobjects.Document;
import org.icepdf.ri.common.SwingController;
import org.icepdf.ri.common.SwingViewBuilder;
import org.icepdf.ri.util.PropertiesManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.text.MessageFormat;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.icepdf.core.exceptions.PDFException;
import org.icepdf.core.exceptions.PDFSecurityException;
import org.icepdf.core.io.SizeInputStream;
import org.icepdf.ri.common.views.DocumentViewController;
import org.icepdf.ri.common.views.DocumentViewControllerImpl;
import org.icepdf.ri.common.views.DocumentViewModelImpl;

public class Panels extends SwingController {

    // public static ClassLoader cl = Panels.class.getClassLoader();
    public static final Logger logger = Logger.getLogger(Panels.class.getName());
    public static JPanel accordionPanel;// = new JPanel(new BorderLayout());
    public static JPanel showPdfPanel;// = new JPanel(new BorderLayout());
    public static JPanel listPanel;// = new JPanel(new BorderLayout());
    public static JTabbedPane tabbedPane;// = new JTabbedPane();
    public static SwingController controller;// = new SwingController();
    public static int iterate;// = 0;
    public static JFrame finalFrame;// = new JFrame();
    public static JPanel dummyPanel;// = new JPanel((LayoutManager)null);
    public static JPanel searchPdfPanel;// = new JPanel(new BorderLayout());
    public static JTextField searchPdfField;// = new JTextField();
    public static JButton searchPdfButton;// = new JButton();
    public static JPanel internalSearchPanel;// = new JPanel(new BorderLayout());
    public static JTextField internalSearchField;// = new JTextField();
    public static JButton internalSearchButton;// = new JButton();
    public static JList<String> funcList1;// = new JList();
    public static JList<String> funcList2;// = new JList();
    public static JList<String> tecnList1;// = new JList();
    public static JList<String> tecnList2;// = new JList();
    public static JList<String> tecnList3;// = new JList();
    public static JList<String> tecnList4;// = new JList();
    public static JList<String> tecnList5;// = new JList();
    public static JList<String> tecnList6;// = new JList();
    public static JList<String> tecnList7;// = new JList();
    public static JList<String> tecnList8;// = new JList();
    public static JList<String> mailList;
    public static DefaultListModel<String> funcModel1;// = new DefaultListModel();
    public static DefaultListModel<String> funcModel2;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel1;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel2;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel3;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel4;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel5;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel6;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel7;// = new DefaultListModel();
    public static DefaultListModel<String> tecnModel8;// = new DefaultListModel();
    public static DefaultListModel<String> mailModel;
    public static DefaultListModel modelOfTecn = new DefaultListModel();
    public static DefaultListModel modelOfFunc = new DefaultListModel();
    public static DefaultListModel modelOfMail = new DefaultListModel();
    public static SideBar sideBar;
    public static SideBar innerFuncBar;
    public static SideBar innerTecnBar;
    public static SideBar innerMailBar;
    public static SidebarSection confNgSection;
    public static SidebarSection radiNgSection;
    public static SidebarSection noviQuestSection;
    public static SidebarSection noviDashSection;
    public static SidebarSection noviGestSection;
    public static SidebarSection noviPemSection;
    public static SidebarSection postgreSQLSection;
    public static SidebarSection internalSection;
    public static SidebarSection dashBoardSection;
    public static SidebarSection vpnSection;

    public static SidebarSection func;
    public static SidebarSection tecn;
    public static SidebarSection mail;
    public static JList<JComponent> sidebarList = new JList<JComponent>();
    public static DefaultListModel<JComponent> sidebarModel;
    public static PropertiesManager propertiesManager;
    public static SwingViewBuilder factory;
    public static JPanel viewerComponentPanel;
    public static Image iconNg;
    public static Image magIcon;
    public static Image docIcon;
    public static Image funcIcon;
    public static Image tecIcon;
    public static Document docKeeper = null;
    public static String pdfName = "null xD";
    public static String keeperValue = "KOTL";
    String finalString = "notset";

    static {

        /*     System.out.println("talvez aqui 1");
          sideBar = new SideBar(SideBarMode.TOP_LEVEL, true, 350, true);
          System.out.println("talvez aqui 2");
        innerFuncBar = new SideBar(SideBarMode.INNER_LEVEL, true, 350, true);
        System.out.println("talvez aqui 3");
        innerTecnBar = new SideBar(SideBarMode.INNER_LEVEL, true, 350, true);
        System.out.println("talvez aqui 4");
      //  propertiesManager = new PropertiesManager(System.getProperties(), new Properties(), controller.getMessageBundle());
        System.out.println("talvez aqui 5");
        System.out.println(controller);
        System.out.println(proper);
        factory = new SwingViewBuilder(controller, propertiesManager);
        System.out.println("talvez aqui 6");
        viewerComponentPanel = factory.buildViewerPanel(); */
    }

    String gestUrl;
    String docUrl/*= this.getClass().getResource("/img/doc.png").toString()*/;
    String funcUrl/*= this.getClass().getResource("/img/paper.png").toString()*/;
    String tecUrl/*= this.getClass().getResource("/img/cog.png").toString()*/;
    String magUrl = "/img/lupa16.png";/* = this.getClass().getResource("/img/lupa16.png").toString()*/
    ;
    String mailUrl;
    String functionUrl;
    String tecnUrl;
    String ngUrl;
    String xrayUrl;
    String nqUrl;
    String ndUrl;
    String npUrl;
    String psqlUrl;
    String intUrl;
    String dashUrl;
    String vpnUrl;

    public Panels() {
        //  System.out.println("wubbbbb");
    }

    @Override
    public void openDocument(final URL location) {
        if (location != null) {
            // dispose a currently open document, if one.
            if (document != null) {
                closeDocument();
            }

            setDisplayTool(DocumentViewModelImpl.DISPLAY_TOOL_WAIT);

            // load the document
            document = new Document();
            try {

                // make a connection
                final URLConnection urlConnection = location.openConnection();
                final int size = urlConnection.getContentLength();
                org.icepdf.ri.common.SwingWorker worker = new org.icepdf.ri.common.SwingWorker() {
                    public Object construct() {
                        InputStream in = null;
                        try {
                            // Create ProgressMonitorInputStream
                            Object[] messageArguments = {location.toString()};
                            MessageFormat formatter = new MessageFormat(
                                    messageBundle.getString("viewer.dialog.openURL.downloading.msg"));
                            ProgressMonitorInputStream progressMonitorInputStream
                                    = new ProgressMonitorInputStream(
                                            viewerComponentPanel,
                                            formatter.format(messageArguments),
                                            new SizeInputStream(urlConnection.getInputStream(), size));
                            // Create a stream on the URL connection
                            in = new BufferedInputStream(progressMonitorInputStream);
                            String pathOrURL = location.toString();
                            document.setInputStream(in, pathOrURL);
                            // create default security callback is user has not created one
                            setupSecurityHandler(document, documentViewController.getSecurityCallback());
                            commonNewDocumentHandling(location.getPath());
                            setDisplayTool(DocumentViewModelImpl.DISPLAY_TOOL_PAN);
                        } catch (IOException ex) {
                            if (in != null) {
                                try {
                                    in.close();
                                } catch (IOException e) {
                                    System.out.println("Error opening document " + (document == null ? document : document.getInfo().getTitle()));

                                }
                            }
                            closeDocument();
                            document = null;
                        } catch (PDFException e) {
                            //   System.out.println("BRUHVSKI");
//                            org.icepdf.ri.util.Resources.showMessageDialog(
//                                    viewerComponentPanel,
//                                    JOptionPane.INFORMATION_MESSAGE,
//                                    messageBundle,
//                                    "viewer.dialog.openDocument.pdfException.title",
//                                    "viewer.dialog.openDocument.pdfException.msg",
//                                    location);
                            System.out.println("Error opening document " + (document == null ? document : document.getInfo().getTitle()));
                            document = null;
                        } catch (PDFSecurityException e) {
                            //  System.out.println("BRUHVSKI 2");
//                            org.icepdf.ri.util.Resources.showMessageDialog(
//                                    viewerComponentPanel,
//                                    JOptionPane.INFORMATION_MESSAGE,
//                                    messageBundle,
//                                    "viewer.dialog.openDocument.pdfSecurityException.title",
//                                    "viewer.dialog.openDocument.pdfSecurityException.msg",
//                                    location);
                            System.out.println("Error opening document " + (document == null ? document : document.getInfo().getTitle()));
                            document = null;

                        } catch (Exception e) {
                            //     System.out.println("BRUHVSKI 3");
//                            org.icepdf.ri.util.Resources.showMessageDialog(
//                                    viewerComponentPanel,
//                                    JOptionPane.INFORMATION_MESSAGE,
//                                    messageBundle,
//                                    "viewer.dialog.openDocument.exception.title",
//                                    "viewer.dialog.openDocument.exception.msg",
//                                    location);
                            System.out.println("Error opening document " + (document == null ? document : document.getInfo().getTitle()));
                            document = null;
                        }
                        return null;
                    }
                };
                worker.start();

            } catch (Exception e) {
                System.out.println("Error opening document " + (document == null ? document : document.getInfo().getTitle()));
//                org.icepdf.ri.util.Resources.showMessageDialog(
//                        viewerComponentPanel,
//                        JOptionPane.INFORMATION_MESSAGE,
//                        messageBundle,
//                        "viewer.dialog.openDocument.exception.title",
//                        "viewer.dialog.openDocument.exception.msg",
//                        location);
                document = null;

            }
        }
    }

    public static void newOpenPdf(String selectedResult, String filePath) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        URL chosenPdfUrl = Main.class.getResource(filePath);
        // SwingController x = new SwingController();
        if (controller.getDocument() == null) {

            showPdfPanel.add(viewerComponentPanel, "Center");
            dummyPanel.add(showPdfPanel);
            controller.getWindowManagementCallback();
            try {

                controller.openDocument(chosenPdfUrl);
            } catch (Exception pde) {
                pde.printStackTrace();
            }

            // LoadingScreen.waitFor(pdfThread);
            //    Thread.sleep(100);
            //logger.info("SAVING THIS DOC IN DOC KEEPER");
            //logger.info(keeperValue);
            //logger.info("setting dockeeper");
            //docKeeper = controller.getDocument();
            // logger.info("setting keepervalue");
            // logger.info("get controller doc");
            // logger.info(controller.getDocument().getDocumentLocation());
            // docKeeper = controller.getDocument();
            // logger.info("get dockeeper doc");
            // logger.info(docKeeper.getDocumentLocation());
            // keeperValue = docKeeper.getDocumentLocation();
            //  logger.info("set keeper value ");
            //  logger.info(keeperValue);
            //JOptionPane.showMessageDialog(finalFrame,"Stop spamming!","Erro",JOptionPane.ERROR_MESSAGE);
        } else {
            //  Thread.sleep(50);

            // controller.getDocument().dispose();
            controller.openDocument(chosenPdfUrl);

            // logger.info("keeper");
            //  logger.info(keeperValue);
            // logger.info("getdoc");
            // logger.info(controller.getDocument().getDocumentLocation());
            // if (!keeperValue.equals(controller.getDocument().getDocumentLocation())) {
            //   Thread.sleep(100);
            //  logger.info("SAVING THIS DOC IN DOC KEEPER");
            //  docKeeper = controller.getDocument();
            // }   else {
            //    logger.info(docKeeper.toString());
            //   logger.info(controller.getDocument().toString());
            //   logger.info("DOCUMENT IS THE SAME, DOING NOTHING");
            //  }
        }

//        logger.info("DOC IS NOT NULL..."/* + " @ " + new Object() {
//        }.getClass().getEnclosingMethod().getName()*/);
//        try {
//            ++iterate;
//          //  URL chosenPdfUrl = Main.class.getResource(chosenPdf);
//            Runnable pdfThread = new Runnable() {
//                @Override
//                public void run() {
//                    int count = 0;
//                    while (controller.getDocument() == null) {
//                        try {
//                            // if ()
//                            //    if (controller.getDocument() == null) {
//                            //for (int i = 0; i < 60; i++) {
//                            Thread.sleep(1000);
//                        } catch (InterruptedException ex) {
//                            Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex);
//                        }
//                        count++;
//                        logger.info("DOC IS NULL!!! RETRYING!!!" + " @ " + new Object() {
//                        }.getClass().getEnclosingMethod().getName());
//                        //Runnable openPdf = new Runnable() {
//                        //    @Override
//                        //    public void run() {
//                        controller.openDocument(chosenPdfUrl);
////  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//                        //    }
//                        // };
//                        // LoadingScreen.waitFor(openPdf);
//
//                        //}
//                        if (count > 2) {
//                            JOptionPane.showMessageDialog(null, "Erro ao abrir PDF '" + chosenPdfUrl + "'!", "Erro", 0);
//                            break;
//                        }
//                    }
//                }
//            };
//            finalFrame.repaint();
//
//            // if (docKeeper != null) {
//            //     logger.info(docKeeper.getDocumentLocation());
//            // }
//            if (actualChoice == -777) {
//                pdfName = selectedResult;
//            }
//            if (selectedResult.equals("donotuse")) {
//                pdfName = getDocumentName(actualChoice);
//            }
//            if (controller.getDocument() == null) {
//                logger.info("NO DOCUMENT, CREATING FIRST ONE" + " @ " + new Object() {
//                }.getClass().getEnclosingMethod().getName());
//                showPdfPanel.add(viewerComponentPanel, "Center");
//                dummyPanel.add(showPdfPanel);
//                controller.getWindowManagementCallback();
//                logger.info("FIRST SELECTION, ONLY OPENING " + pdfName.toUpperCase()/* + chosenPdf*/ + " @ " + new Object() {
//                        }.getClass().getEnclosingMethod().getName());
//                //controller.openDocument(chosenPdfUrl);
//                LoadingScreen.waitFor(pdfThread);
//                //    Thread.sleep(100);
//                //logger.info("SAVING THIS DOC IN DOC KEEPER");
//                //logger.info(keeperValue);
//                //logger.info("setting dockeeper");
//                //docKeeper = controller.getDocument();
//                // logger.info("setting keepervalue");
//                // logger.info("get controller doc");
//                // logger.info(controller.getDocument().getDocumentLocation());
//                // docKeeper = controller.getDocument();
//                // logger.info("get dockeeper doc");
//                // logger.info(docKeeper.getDocumentLocation());
//                // keeperValue = docKeeper.getDocumentLocation();
//                //  logger.info("set keeper value ");
//                //  logger.info(keeperValue);
//                //JOptionPane.showMessageDialog(finalFrame,"Stop spamming!","Erro",JOptionPane.ERROR_MESSAGE);
//            } else {
//                //  Thread.sleep(50);
//                logger.info("FOUND A LIVE DOCUMENT, KILLING IT" + " @ " + new Object() {
//                }.getClass().getEnclosingMethod().getName());
//                controller.getDocument().dispose();
//                logger.info("SELECTION " + iterate + ", OPENING " + pdfName.toUpperCase()/* + chosenPdf*/ + " @ " + new Object() {
//                        }.getClass().getEnclosingMethod().getName());
//                controller.openDocument(chosenPdfUrl);
//
//                // logger.info("keeper");
//                //  logger.info(keeperValue);
//                // logger.info("getdoc");
//                // logger.info(controller.getDocument().getDocumentLocation());
//                // if (!keeperValue.equals(controller.getDocument().getDocumentLocation())) {
//                //   Thread.sleep(100);
//                //  logger.info("SAVING THIS DOC IN DOC KEEPER");
//                //  docKeeper = controller.getDocument();
//                // }   else {
//                //    logger.info(docKeeper.toString());
//                //   logger.info(controller.getDocument().toString());
//                //   logger.info("DOCUMENT IS THE SAME, DOING NOTHING");
//                //  }
//            }
//
//            logger.info("DOC IS NOT NULL..." + " @ " + new Object() {
//            }.getClass().getEnclosingMethod().getName());
//            // if (iterate == 1) {
//            //
//            // }
//
////THIS IS A TEST, DO NOT DESTROY CODE BELOW!!!
//            /*showPdfPanel.remove(viewerComponentPanel);
//        showPdfPanel.add(viewerComponentPanel, "Center");
//        dummyPanel.add(showPdfPanel);
//        controller.getWindowManagementCallback();
//        controller.openDocument(chosenPdf);
//        docKeeper = controller.getDocument();*/
//// TEST OVER
//        } catch (Exception xD) {
//// todas as ex. caem aqui
//            xD.printStackTrace();
//        }
    }

    public static void openPdf(String chosenPdf, int actualChoice, String selectedResult) throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        try {
            ++iterate;
            URL chosenPdfUrl = Main.class.getResource(chosenPdf);
            Runnable pdfThread = new Runnable() {
                @Override
                public void run() {
                    int count = 0;
                    while (controller.getDocument() == null) {
                        try {
                            // if ()
                            //    if (controller.getDocument() == null) {
                            //for (int i = 0; i < 60; i++) {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            // Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        count++;

                        //Runnable openPdf = new Runnable() {
                        //    @Override
                        //    public void run() {
                        controller.openDocument(chosenPdfUrl);
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        //    }
                        // };
                        // LoadingScreen.waitFor(openPdf);

                        //}
                        if (count > 2) {
                            JOptionPane.showMessageDialog(null, "Erro ao abrir PDF '" + chosenPdfUrl + "'!", "Erro", 0);
                            break;
                        }
                    }
                }
            };
            finalFrame.repaint();

            // if (docKeeper != null) {
            //     logger.info(docKeeper.getDocumentLocation());
            // }
            if (actualChoice == -777) {
                pdfName = selectedResult;
            }
            if (selectedResult.equals("donotuse")) {
                pdfName = getDocumentName(actualChoice);
            }
            if (controller.getDocument() == null) {

                showPdfPanel.add(viewerComponentPanel, "Center");
                dummyPanel.add(showPdfPanel);
                controller.getWindowManagementCallback();

                //controller.openDocument(chosenPdfUrl);
                LoadingScreen.waitFor(pdfThread);
                //    Thread.sleep(100);
                //logger.info("SAVING THIS DOC IN DOC KEEPER");
                //logger.info(keeperValue);
                //logger.info("setting dockeeper");
                //docKeeper = controller.getDocument();
                // logger.info("setting keepervalue");
                // logger.info("get controller doc");
                // logger.info(controller.getDocument().getDocumentLocation());
                // docKeeper = controller.getDocument();
                // logger.info("get dockeeper doc");
                // logger.info(docKeeper.getDocumentLocation());
                // keeperValue = docKeeper.getDocumentLocation();
                //  logger.info("set keeper value ");
                //  logger.info(keeperValue);
                //JOptionPane.showMessageDialog(finalFrame,"Stop spamming!","Erro",JOptionPane.ERROR_MESSAGE);
            } else {
                //  Thread.sleep(50);

                controller.getDocument().dispose();

                controller.openDocument(chosenPdfUrl);

                // logger.info("keeper");
                //  logger.info(keeperValue);
                // logger.info("getdoc");
                // logger.info(controller.getDocument().getDocumentLocation());
                // if (!keeperValue.equals(controller.getDocument().getDocumentLocation())) {
                //   Thread.sleep(100);
                //  logger.info("SAVING THIS DOC IN DOC KEEPER");
                //  docKeeper = controller.getDocument();
                // }   else {
                //    logger.info(docKeeper.toString());
                //   logger.info(controller.getDocument().toString());
                //   logger.info("DOCUMENT IS THE SAME, DOING NOTHING");
                //  }
            }

            // if (iterate == 1) {
            //
            // }
//THIS IS A TEST, DO NOT DESTROY CODE BELOW!!!
            /*showPdfPanel.remove(viewerComponentPanel);
        showPdfPanel.add(viewerComponentPanel, "Center");
        dummyPanel.add(showPdfPanel);
        controller.getWindowManagementCallback();
        controller.openDocument(chosenPdf);
        docKeeper = controller.getDocument();*/
// TEST OVER
        } catch (Exception xD) {
// todas as ex. caem aqui
            xD.printStackTrace();
        }

    }

    public static void closeDoc() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        if (controller.getDocument() != null) {

            controller.closeDocument();
            //  controller.dispose();

        } else {

        }

    }

    public static String returnThis(String string) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        return string;
    }

    public static String getDocumentName(int choice) {
        System.out.println("AM I EVEN HERE????????????????????????????????????????????????????????????????");
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        String x = "ERRO";
        switch (choice) {
            case 67:
                x = "WillMaster";
                break;

            case 66:
                x = "DIS Mac";
                break;

            case 64:
                x = "OpenVPN";
                break;

            case 16:
                x = "Newtom";

                break;
            case 25:
                x = "Triana";

                break;
            case 45:
                x = "DashBoard Reports";

                break;
            case 46:
                x = "NO RESULTS";

                break;
            case 27:
                x = "VixWin";

                break;
            case 20:
                x = "RayMage";

                break;
            case 5:
                x = "Gestão de Stocks - Geral";

                break;
            case 40:
                x = "Atualizações Automáticas";

                break;
            case 36:
                x = "Server NoviPem";

                break;
            case 19:
                x = "Quickvision";

                break;
            case 21:
                x = "RioView";

                break;
            case 15:
                x = "NemoStudio";

                break;
            case 38:
                x = "Montar Interface Clientes";

                break;
            case 11:
                x = "EzDent_I";

                break;
            case 24:
                x = "Sopro Imaging";

                break;
            case 17:
                x = "Romexis";

                break;
            case 42:
                x = "Instaladores Windows";

                break;
            case 0:
                x = "Formação Inicial";

                break;
            case 32:
                x = "Posto NoviGest";

                break;
            case 31:
                x = "Cartao Cidadao";

                break;
            case 18:
                x = "ProImage";

                break;
            case 7:
                x = "CS Imaging";

                break;
            case 3:
                x = "Requisições de Exames";

                break;
            case 43:
                x = "Instaladores Macintosh";

                break;
            case 22:
                x = "Sidexis";

                break;
            case 2:
                x = "Orçamentos com Tópicos";

                break;
            case 37:
                x = "Replicação PostgreSQL";

                break;
            case 44:
                x = "Certificados ZeroSSL";

                break;
            case 13:
                x = "MediaDent";

                break;
            case 26:
                x = "VistaSoft";

                break;
            case 41:
                x = "Upgrades NoviGest";

                break;
            case 8:
                x = "CliniView";

                break;
            case 33:
                x = "Server NoviGest Mac OS";

                break;
            case 23:
                x = "Softysdental";

                break;
            case 30:
                x = "Atalho como administrador";

                break;
            case 6:
                x = "AIS SETELEC";

                break;
            case 9:
                x = "DeepView";

                break;
            case 4:
                x = "Gestão Stocks Folha Produtos";

                break;
            case 14:
                x = "MyRayIrys";

                break;
            case 12:
                x = "HandyDentist";

                break;
            case 28:
                x = "Configuração NoviQuest";

                break;
            case 1:
                x = "Configurar Atalhos";

                break;
            case 39:
                x = "Especificações PC";

                break;
            case 34:
                x = "Server NoviGest Windows";

                break;
            case 29:
                x = "Server NoviDash";

                break;
            case 35:
                x = "Troubleshooting";

                break;
            case 10:
                x = "Digora";

                break;
        }

        return returnThis(x);

    }

    public void setSections() throws Exception {

        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        sideBar = new SideBar(SideBarMode.TOP_LEVEL, true, 350, true);
        innerFuncBar = new SideBar(SideBarMode.INNER_LEVEL, true, 350, true);
        innerTecnBar = new SideBar(SideBarMode.INNER_LEVEL, true, 350, true);
        innerMailBar = new SideBar(SideBarMode.INNER_LEVEL, true, 350, true);
        //WindowManager winMag = new com.tactis.knowledgebase.gui.WindowManager();
        //   winMag.commonWindowCreation();
        controller = /*new SwingController()*/ new Panels();
        int viewType = DocumentViewControllerImpl.ONE_COLUMN_VIEW;
        int pageFit = DocumentViewController.PAGE_FIT_ACTUAL_SIZE;
        propertiesManager = new PropertiesManager(System.getProperties(), new Properties(), controller.getMessageBundle());
        factory = new SwingViewBuilder(controller, propertiesManager, null, false, 0, null, viewType, pageFit);
        viewerComponentPanel = factory.buildViewerPanel();

        accordionPanel = new JPanel(new BorderLayout());
        showPdfPanel = new JPanel(new BorderLayout());
        listPanel = new JPanel(new BorderLayout());
        tabbedPane = new JTabbedPane();

        iterate = 0;
        URL iconUrl = getClass().getResource("/img/baseIcon.png");
        ImageIcon icon = new ImageIcon(iconUrl);
        finalFrame = new JFrame(/*"/img/baseIcon.png"*/);
        finalFrame.setIconImage(icon.getImage());
        dummyPanel = new JPanel(null);
        searchPdfPanel = new JPanel(new BorderLayout());
        searchPdfField = new JTextField();
        searchPdfButton = new JButton(new ImageIcon(Panels.class.getResource(magUrl)));
        internalSearchPanel = new JPanel(new BorderLayout());
        internalSearchField = new JTextField();
        internalSearchButton = new JButton();

        funcList1 = new JList<>();
        funcList2 = new JList<>();
        tecnList1 = new JList<>();
        tecnList2 = new JList<>();
        tecnList3 = new JList<>();
        tecnList4 = new JList<>();
        tecnList5 = new JList<>();
        tecnList6 = new JList<>();
        tecnList7 = new JList<>();
        tecnList8 = new JList<>();
        mailList = new JList<>();
        funcModel1 = new DefaultListModel<>();
        funcModel2 = new DefaultListModel<>();
        tecnModel1 = new DefaultListModel<>();
        tecnModel2 = new DefaultListModel<>();
        tecnModel3 = new DefaultListModel<>();
        tecnModel4 = new DefaultListModel<>();
        tecnModel5 = new DefaultListModel<>();
        tecnModel6 = new DefaultListModel<>();
        tecnModel7 = new DefaultListModel<>();
        tecnModel8 = new DefaultListModel<>();
        mailModel = new DefaultListModel<>();
        sidebarModel = new DefaultListModel<JComponent>();

        docUrl = "/img/docIcon.png";
        funcUrl = "/img/functionIcon.png";
        tecUrl = "/img/tecIcon.png";
        mailUrl = "/img/mail-icon.png";

        //  magUrl = "/img/nd.png";
        //  gestUrl = "/img/baseIcon.png";
        //functionUrl;
        //tecnUrl = ;
        //String ngUrl;
        xrayUrl = "/img/xrayIcon.png";
        ngUrl = "/img/ng.png";
        nqUrl = "/img/nq.png";
        ndUrl = "/img/nd.png";
        npUrl = "/img/np.png";
        psqlUrl = "/img/psql.png";
        intUrl = "/img/intIcon.png";
        dashUrl = "/img/dashIcon.png";
        vpnUrl = "/img/vpnIcon.png";

        iconNg = new ImageIcon(gestUrl).getImage();/*ImageIO.read(this.ngUrl);*/
        docIcon = new ImageIcon(docUrl).getImage();
        funcIcon = new ImageIcon(funcUrl).getImage();
        //functionIcon = new ImageIcon(functionUrl).getImage();
        tecIcon = new ImageIcon(tecUrl).getImage();
        magIcon = new ImageIcon(magUrl).getImage();
        confNgSection = new SidebarSection(innerFuncBar, "Configuração NoviGest", this.getFunc2(), new ImageIcon(Main.class.getResource(ngUrl)));
        radiNgSection = new SidebarSection(innerFuncBar, "Radiologia", this.getFunc3_1(), new ImageIcon(Main.class.getResource(xrayUrl)));
        noviQuestSection = new SidebarSection(innerTecnBar, "NoviQuest", this.getTec1(), new ImageIcon(Main.class.getResource(nqUrl)));
        noviDashSection = new SidebarSection(innerTecnBar, "NoviDash", this.getTec2(), new ImageIcon(Main.class.getResource(ndUrl)));
        noviGestSection = new SidebarSection(innerTecnBar, "NoviGest", this.getTec3(), new ImageIcon(Main.class.getResource(ngUrl)));
        noviPemSection = new SidebarSection(innerTecnBar, "NoviPem", this.getTec4(), new ImageIcon(Main.class.getResource(npUrl)));
        postgreSQLSection = new SidebarSection(innerTecnBar, "PostgreSQL", this.getTec5(), new ImageIcon(Main.class.getResource(psqlUrl)));
        internalSection = new SidebarSection(innerTecnBar, "Processos Internos", this.getTec6(), new ImageIcon(Main.class.getResource(intUrl)));
        dashBoardSection = new SidebarSection(innerTecnBar, "DashBoard", this.getTec7(), new ImageIcon(Main.class.getResource(dashUrl)));
        vpnSection = new SidebarSection(innerTecnBar, "VPN", this.getTec8(), new ImageIcon(Main.class.getResource(vpnUrl)));

        getPanel();
        searchPanel();

        mail = new SidebarSection(sideBar, "Modelos E-mail", this.getMailList(), new ImageIcon(Main.class.getResource(mailUrl)));
        func = new SidebarSection(sideBar, "Funcionalidade", Panels.innerFuncBar, new ImageIcon(Main.class.getResource(funcUrl)));
        tecn = new SidebarSection(sideBar, "Tecnica", Panels.innerTecnBar, new ImageIcon(Main.class.getResource(tecUrl)));

        getPanel2();

    }

//    public void doSelectionMethod(FocusEvent evt) throws InterruptedException {
//        JList list = (JList) evt.getSource();
//        String selectedResult = list.getSelectedValue().toString();
//        logger.info(selectedResult + " @ " + new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        String filePath = "/pdf/" + selectedResult + ".pdf";
//        // logger.info(filePath+ " @ " + new Object(){}.getClass().getEnclosingMethod().getName());
//        // logger.info("FS: " + finalString);
//        // logger.info("SR: " + selectedResult);
//        // logger.info("FP: " + filePath);
//        if (!finalString.equals(filePath)) {
//            openPdf(filePath, -777, selectedResult);
//            Interface.resizeAll();
//        }
//
//        finalString = filePath;
//    }
    public void doSelectionMethod(ListSelectionEvent e) throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();

        if (e != null) {
            JList list = (JList) e.getSource();
            int indexOfSelection = list.getSelectedIndex();
            String valueOfSelection = list.getSelectedValue().toString();

//            System.out.println("INDEX 1.5 " + indexOfSelection);
//            System.out.println("VALUE 1.5 " + valueOfSelection);
            // clearAndSelect(list, valueOfSelection, indexOfSelection);
//            System.out.println("INDEX 2 " + indexOfSelection);
//            System.out.println("VALUE 2 " + valueOfSelection);
            Object savedSelection = list.getSelectedValue();
            String selectedResult = "null";
            /* if (list.getSelectedValue() != null) {*/
            selectedResult = savedSelection.toString();

            String filePath = "/pdf/" + selectedResult + ".pdf";

//            final ListSelectionEvent FINAL_evt = evt;
            // logger.info(filePath+ " @ " + new Object(){}.getClass().getEnclosingMethod().getName());
//            logger.info("FS: " + finalString);
//            logger.info("SR: " + selectedResult);
//            logger.info("FP: " + filePath);
            if (!finalString.equals(filePath)) {
                //clearAndSelect(list, savedSelection);
//                try {
//                    LoadingScreen.waitFor(new Runnable() {
//                        @Override
////                        public void run() {
//                System.out.println("CA ESTOU EU:");
//                System.out.println(finalString);
//                System.out.println(filePath);
                newOpenPdf(selectedResult, filePath);
                /* }*/
//                    });
//                  
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }

                //openPdf(filePath, -777, selectedResult);
            }

            // Logger x = new Logger();
//            System.err.println("UISTO VAI SAIR NO ERR");
//            logger.info("ISTO VAI SAIR NO OUT");
            //  LOG.fine("XPTO");
            finalString = filePath;
            /*   }*/
        }

    }

    public void clearAndSelect(JList list, String value, int index) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        if (!list.isSelectionEmpty()) {
            //  list.removeAll();

        }

        list.setSelectedIndex(index);

    }

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
       // System.out.println(methodName);
        return (i >= minValueInclusive && i <= maxValueInclusive);
    }

    public static void deSelectLists() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
    }

    public void doSelectionMethod(String userInput) throws InterruptedException {

        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
       // System.out.println(methodName);

        int q = funcModel1.getSize();
        int w = funcModel2.getSize();
        int e = tecnModel1.getSize();
        int r = tecnModel2.getSize();
        int t = tecnModel3.getSize();
        int y = tecnModel4.getSize();
        int u = tecnModel5.getSize();
        int i = tecnModel6.getSize();
        int o = tecnModel7.getSize();
        int p = tecnModel8.getSize();
        int a = mailModel.getSize();
        int ONE = (q-1);
        int TWO = (q+w-1);
        int THREE = (q+w+e-1);
        int FOUR = (q+w+e+r-1);
        int FIVE = (q+w+e+r+t-1);
        int SIX = (q+w+e+r+t+y-1);
        int SEVEN = (q+w+e+r+t+y+u-1);
        int EIGHT = (q+w+e+r+t+y+u+i-1);
        int NINE = (q+w+e+r+t+y+u+i+o-1);
        int TEN = (q+w+e+r+t+y+u+i+o+p-1);
        int ELEVEN = (q+w+e+r+t+y+u+i+o+p+a-1);

        String finalString = null;
        int changedInt = 0;
        System.out.println("OMEGASIZE: "+Main.listOfLists.size());
        System.out.println(q-1);
        System.out.println(q+w-1);
        System.out.println(q+w+e-1);
        System.out.println(q+w+e+r-1);
        System.out.println(q+w+e+r+t-1);
        System.out.println(q+w+e+r+t+y-1);
        System.out.println(q+w+e+r+t+y+u-1);
        System.out.println(q+w+e+r+t+y+u+i-1);
        System.out.println(q+w+e+r+t+y+u+i+o-1);
        System.out.println(q+w+e+r+t+y+u+i+o+p-1);
        System.out.println(q+w+e+r+t+y+u+i+o+p+a-1);
        for (String s : Main.listOfLists) {
            
            if (s.equals(userInput)) {
                Integer index = Main.listOfLists.indexOf(s);
                System.out.println("INDEX IS: "+ index);
                System.out.println("TITLE IS: "+ s);
                
              //  System.out.println("THE CHANGEDINT IS "+ changedInt);
                if (between(index, 0, ONE)) {//funcModel1 funcList1
                   
                    changedInt = index - 0;
                    System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(funcModel1.getElementAt(changedInt))) {
                        funcList1.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(confNgSection);
                    }
                }
                if (between(index, ONE+1, TWO )) {
                
                    changedInt = index - (ONE+1);
//                    System.out.println("#"+(index));
//                    System.out.println("#"+(ONE));
//                    System.out.println("#"+(1));
//                    System.out.println("#"+(index-ONE));
//                    
//                    System.out.println("#"+(index-ONE+1));
                 System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(funcModel2.getElementAt(changedInt))) {
                        funcList2.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(radiNgSection);
                    }
                }
                if (between(index, TWO+1, THREE)) {
                
                    changedInt = index - (TWO+1);
                  System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel1.getElementAt(changedInt))) {
                        tecnList1.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(noviQuestSection);
                    }
                }
                if (between(index, THREE+1, FOUR)) {
                
                    changedInt = index - (THREE+1);
                System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel2.getElementAt(changedInt))) {
                        tecnList2.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(noviDashSection);
                    }
                }
                if (between(index, FOUR+1, FIVE)) {
                
                    changedInt = index - (FOUR+1);
                  System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel3.getElementAt(changedInt))) {
                        tecnList3.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(noviGestSection);
                    }
                }
                if (between(index, FIVE+1, SIX)) {
                 
                    changedInt = index - (FIVE+1);
                System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel4.getElementAt(changedInt))) {
                        tecnList4.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(noviPemSection);
                    }
                }
                if (between(index, SIX+1, SEVEN)) {
               
                    changedInt = index - (SIX+1);
              System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel5.getElementAt(changedInt))) {
                        tecnList5.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(postgreSQLSection);
                    }
                }
                if (between(index, SEVEN+1, EIGHT)) {
              
                    changedInt = index - (SEVEN+1);
                 System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel6.getElementAt(changedInt))) {
                        tecnList6.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(internalSection);
                    }
                }
                if (between(index, EIGHT+1, NINE)) {
               
                    changedInt = index - (EIGHT+1);
               System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel7.getElementAt(changedInt))) {
                        tecnList7.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(dashBoardSection);
                    }
                }
                if (between(index, NINE+1, TEN)) {
                
                    changedInt = index - (NINE+1);
                System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(tecnModel8.getElementAt(changedInt))) {
                        tecnList8.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(vpnSection);
                    }
                }
                if (between(index, TEN+1, ELEVEN)) {
               
                    changedInt = index - (TEN+1);
                  System.out.println("CHANG IS: "+changedInt);
                    if (userInput.equals(mailModel.getElementAt(changedInt))) {
                        mailList.setSelectedIndex(changedInt);
                        Interface.collapseAllButTheOneSelected(mail);
                    }
                }
                if (between(index, -100, -1) || between(index, ELEVEN+1, 100)) {
                   System.out.println("CHANG IS: "+changedInt);
                    logger.log(Level.INFO, "TAS ME A DIZER QUE O INDEX = {0} ???", index);
                }
            }
        }

        // JList list = (JList) evt.getSource();
        //  String selectedResult = "null";
        /* if (list.getSelectedValue() != null) {*/
        //selectedResult = list.getSelectedValue().toString();
//            logger.info(selectedResult + " @ " + new Object() {
//            }.getClass().getEnclosingMethod().getName());
//            String filePath = "/pdf/" + selectedResult + ".pdf";
//            // logger.info(filePath+ " @ " + new Object(){}.getClass().getEnclosingMethod().getName());
////            logger.info("FS: " + finalString);
////            logger.info("SR: " + selectedResult);
////            logger.info("FP: " + filePath);
//            if (!finalString.equals(filePath)) {
//                newOpenPdf(selectedResult, filePath);
//                //  openPdf(filePath, -777, selectedResult);
//                Interface.resizeAll();
//            }
//            // Logger x = new Logger();
////            System.err.println("UISTO VAI SAIR NO ERR");
////            logger.info("ISTO VAI SAIR NO OUT");
//            //  LOG.fine("XPTO");
//
//            finalString = filePath;
        /*   }*/
    }

    public void showFinalFrame() throws IOException {
        // Interface.setProperties();
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        //   finalFrame.setIconImage((new ImageIcon(gestUrl)).getImage());
        finalFrame.setResizable(true);
        finalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        finalFrame.setSize(1440, 900);
        finalFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        finalFrame.setLocationRelativeTo(null);

        // this.pdfSearchPanel();
        finalFrame.setTitle("Tactis Knowledge Base");
        finalFrame.setVisible(true);
        Interface.resizeAll();
    }

    public void searchPanel() throws IOException {
        // Interface.resizeAll();
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
//        Image img = ImageIO.read(Main.class.getResource(magUrl));
//        Icon icon = new ImageIcon(Panels.class.getResource(magUrl));
//        searchPdfButton.setIcon(icon);
        searchPdfPanel.add(searchPdfField, "Center");
        searchPdfPanel.add(searchPdfButton, "East");
        dummyPanel.add(searchPdfPanel);
    }

    public void pdfSearchPanel() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
    }

    public void getPanel() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Interface.resizeAll();
        // sidebarModel.add(0, sideBar);

        innerFuncBar.addSection(confNgSection);
        innerFuncBar.addSection(radiNgSection);
        for (Component c : innerFuncBar.getComponents()) {

        }
        innerTecnBar.addSection(noviQuestSection);
        innerTecnBar.addSection(noviDashSection);
        innerTecnBar.addSection(noviGestSection);
        innerTecnBar.addSection(noviPemSection);
        innerTecnBar.addSection(postgreSQLSection);
        innerTecnBar.addSection(internalSection);
        innerTecnBar.addSection(dashBoardSection);
        innerTecnBar.addSection(vpnSection);

    }

    public void getPanel2() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        sideBar.addSection(func);
        sideBar.addSection(tecn);
        sideBar.addSection(mail);
        listPanel.add(sideBar, "West");
        tabbedPane.add("Search", listPanel);
        tabbedPane.add("Tópicos", listPanel);
        tabbedPane.add("Versão", null);
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                if (tabbedPane.getSelectedIndex() != 0) {
                    try {
                        URL iconUrl = getClass().getResource("/img/baseIcon.png");
                        ImageIcon icon = new ImageIcon(iconUrl);

                        JLabel label = new JLabel("Versão Tactis KB é " + System.getProperty("KBVERSION", KBVERSION));

                        JOptionPane optionPane = new JOptionPane(label, JLabel.CENTER);
                        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

                        JDialog dialog = optionPane.createDialog("");
                        dialog.setModal(true);
                        dialog.setTitle("Versão");
                        dialog.pack();
                        dialog.setLocationRelativeTo(finalFrame);
                        dialog.setIconImage(icon.getImage());
                        dialog.setVisible(true);

                        //  JOptionPane.showMessageDialog(finalFrame, "Versão Tactis KB é " + System.getProperty("KBVERSION", KBVERSION), "Informação", 1);
                        tabbedPane.setSelectedIndex(0);
                    } catch (Exception ex) {
                        com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                    }

                }

            }
        });
        accordionPanel.add(tabbedPane);
        dummyPanel.add(accordionPanel);
        finalFrame.add(dummyPanel);

        sidebarModel.add(0, func);
        sidebarModel.add(1, tecn);
        sidebarModel.add(2, mail);
        sidebarModel.add(3, confNgSection);
        sidebarModel.add(4, radiNgSection);
        sidebarModel.add(5, noviQuestSection);
        sidebarModel.add(6, noviDashSection);
        sidebarModel.add(7, noviGestSection);
        sidebarModel.add(8, noviPemSection);
        sidebarModel.add(9, postgreSQLSection);
        sidebarModel.add(10, internalSection);
        sidebarModel.add(11, dashBoardSection);
        sidebarModel.add(12, vpnSection);

        modelOfFunc.add(0, confNgSection);
        modelOfFunc.add(1, radiNgSection);

        modelOfTecn.add(0, noviQuestSection);
        modelOfTecn.add(1, noviDashSection);
        modelOfTecn.add(2, noviGestSection);
        modelOfTecn.add(3, noviPemSection);
        modelOfTecn.add(4, postgreSQLSection);
        modelOfTecn.add(5, internalSection);
        modelOfTecn.add(6, dashBoardSection);
        modelOfTecn.add(7, vpnSection);

        modelOfMail.add(0, mail);
    }

    private JComponent getMailList() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.mailStrings) {
            System.out.println("ADDING "+s +" AT "+mailModel.getSize());
            mailModel.add(mailModel.getSize(), s);
        }
//        mailModel.add(0, "Pack SMS Comunicações");
//        mailModel.add(1, "NoviPem Prescrição Electrónica");
//        mailModel.add(2, "Introdução de Tabelas");
//        mailModel.add(3, "Consentimentos RGPD");
//        mailModel.add(4, "Características PCs Recomendadas");
//        mailModel.add(5, "Formulário Potencial Cliente");
        mailList.setModel(mailModel);
        mailList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        return mailList;
    }

    private JComponent getFunc2() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.confStrings) {
            funcModel1.add(funcModel1.getSize(), s);
        }
//        funcModel1.add(0, "Formação Inicial");
//        funcModel1.add(1, "Configurar Atalhos");
//        funcModel1.add(2, "Orçamentos com Tópicos");
//        funcModel1.add(3, "Requisições de Exames");
//        funcModel1.add(4, "Gestão de Stocks - Folha de Produtos");
//        funcModel1.add(5, "Gestão de Stocks - Geral");
//        funcModel1.add(6, "Gestão de Próteses");
        funcList1.setModel(funcModel1);
        // funcList1.addMouseListener(new MouseAdapter() {
        //   public void mouseClicked(MouseEvent evt) {
        //        try {
        //            Panels.this.doSelectionMethod(evt);
        //      } catch (InterruptedException e) {
        //         e.printStackTrace();
        //    }
        //  }
        //  });
        funcList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                //  JList list = (JList) e.getSource();
//                for (int x : list.getSelectedIndices()) {
//                    if (x == -1) {
//                        System.out.println("TAS TODO MALUCO XD");
//                        skip = true;
//                    }
//                }
                try {

                    /* DefaultListModel model = (DefaultListModel) list.getModel();
                            for (int i = 0; i < model.size(); i++) {
                                System.out.println("LMFOF: " + model.getElementAt(i));
                            }*/
                    doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }

            }
        });
//        funcList1.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        return funcList1;
    }

    public static String getPdfName(MouseEvent event, int listIndex) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        JList sourceList = (JList) event.getSource();
        int index = sourceList.getSelectedIndex();
        int incomingList = listIndex;
        String listString = Main.listMap.get(incomingList);
        String actualPdf = null;

        return null;

    }

    private JComponent getFunc3_1() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.radStrings) {
            funcModel2.add(funcModel2.getSize(), s);
        }
//        funcModel2.add(0, "AIS SETELEC");
//        funcModel2.add(1, "CS Imaging");
//        funcModel2.add(2, "CliniView");
//        funcModel2.add(3, "DeepView");
//        funcModel2.add(4, "Digora");
//        funcModel2.add(5, "EzDent_i");
//        funcModel2.add(6, "HandyDentist");
//        funcModel2.add(7, "MediaDent");
//        funcModel2.add(8, "MyRayIrys");
//        funcModel2.add(9, "NemoStudio");
//        funcModel2.add(10, "Newtom");
//        funcModel2.add(11, "Romexis");
//        funcModel2.add(12, "Proimage");
//        funcModel2.add(13, "Quickvision");
//        funcModel2.add(14, "RayMage");
//        funcModel2.add(15, "RioView");
//        funcModel2.add(16, "Sidexis");
//        funcModel2.add(17, "Softysdental");
//        funcModel2.add(18, "Sopro Imaging");
//        funcModel2.add(19, "Triana");
//        funcModel2.add(20, "VistaSoft");
//        funcModel2.add(21, "VixWin");
//        funcModel2.add(22, "DIS Mac");
//        funcModel2.add(23, "WillMaster");
//        funcModel2.add(24, "DBSWIN");
        funcList2.setModel(funcModel2);
//        funcList2.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        funcList2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        return funcList2;
    }

    private JComponent getTec1() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        for (String s : Main.nqStrings) {
            tecnModel1.add(tecnModel1.getSize(), s);
        }
//        tecnModel1.add(0, "Configuração NoviQuest");
        tecnList1.setModel(tecnModel1);
//        tecnList1.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        tecnList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        return tecnList1;
    }

    private JComponent getTec2() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.ndStrings) {
            tecnModel2.add(tecnModel2.getSize(), s);
        }
//        tecnModel2.add(0, "Server NoviDash");
        tecnList2.setModel(tecnModel2);
//        tecnList2.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        tecnList2.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        return tecnList2;
    }

    private JComponent getTec3() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.ngStrings) {
            tecnModel3.add(tecnModel3.getSize(), s);
        }
//        tecnModel3.add(0, "Atalho como Administrador");
//        tecnModel3.add(1, "Cartao Cidadao");
//        tecnModel3.add(2, "Posto NoviGest");
//        tecnModel3.add(3, "Server NoviGest Mac OS");
//        tecnModel3.add(4, "Server NoviGest Windows");
//        tecnModel3.add(5, "Troubleshooting");
        tecnList3.setModel(tecnModel3);
//        tecnList3.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        tecnList3.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        return tecnList3;
    }

    private JComponent getTec4() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.npStrings) {
            tecnModel4.add(tecnModel4.getSize(), s);
        }
//        tecnModel4.add(0, "Server NoviPem");
        tecnList4.setModel(tecnModel4);
//        tecnList4.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        tecnList4.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        return tecnList4;
    }

    private JComponent getTec5() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        for (String s : Main.psqlStrings) {
            tecnModel5.add(tecnModel5.getSize(), s);
        }
//        tecnModel5.add(0, "Replicação PostgreSQL");
        tecnList5.setModel(tecnModel5);
        tecnList5.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        return tecnList5;

    }

    private JComponent getTec6() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        for (String s : Main.intStrings) {
            tecnModel6.add(tecnModel6.getSize(), s);
        }
//        tecnModel6.add(0, "Montar interface clientes");
//        tecnModel6.add(1, "Especificações PCs");
//        tecnModel6.add(2, "Atualizações Automáticas");
//        tecnModel6.add(3, "Upgrades NoviGest");
//        tecnModel6.add(4, "Instaladores Windows");
//        tecnModel6.add(5, "Instaladores Macintosh");
//        tecnModel6.add(6, "Certificados ZeroSSL");
        tecnList6.setModel(tecnModel6);
//        tecnList6.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
        tecnList6.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }
        );
        return tecnList6;
    }

    private JComponent getTec7() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.dashStrings) {
            tecnModel7.add(tecnModel7.getSize(), s);
        }
//        tecnModel7.add(0, "DashBoard Reports");
        tecnList7.setModel(tecnModel7);
//        tecnList7.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            /*  @Override
//            public void focusLost(FocusEvent evt) {
//                try {
//                    Thread.sleep(100);
//                    closeDoc();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//             */
//        });
        tecnList7.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }
        );
        return tecnList7;
    }

    private JComponent getTec8() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (String s : Main.vpnStrings) {
            tecnModel8.add(tecnModel8.getSize(), s);
        }
//        tecnModel8.add(0, "OpenVPN");
//        tecnModel8.add(1, "SoftEtherVPN");
        tecnList8.setModel(tecnModel8);
//        tecnList8.addFocusListener(new FocusAdapter() {
//            @Override
//            public void focusGained(FocusEvent evt) {
//                try {
//                    Panels.this.doSelectionMethod(evt);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            /*  @Override
//            public void focusLost(FocusEvent evt) {
//                try {
//                    Thread.sleep(100);
//                    closeDoc();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//            }
//            
//             */
//        });
        tecnList8.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                try {
                    logger.info("VALUE CHANGED");
                    Panels.this.doSelectionMethod(e);
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Panels.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }
        );
        return tecnList8;

    }
}
