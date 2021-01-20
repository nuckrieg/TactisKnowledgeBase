//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package pt.tactis.knowledgebase;

//import com.gtranslate.Translator;
import pt.tactis.knowledgebase.etc.Scheduler;
import pt.tactis.knowledgebase.gui.LoadingScreen;
import pt.tactis.knowledgebase.gui.Panels;
import pt.tactis.knowledgebase.gui.Interface;
import static pt.tactis.knowledgebase.gui.LoadingScreen.barra;
import static pt.tactis.knowledgebase.gui.LoadingScreen.label;
import java.awt.Image;
import org.icepdf.core.exceptions.PDFException;
import org.icepdf.core.exceptions.PDFSecurityException;
import org.icepdf.core.pobjects.Document;
import org.icepdf.core.search.SearchTerm;
import org.icepdf.ri.common.ComponentKeyBinding;
import org.icepdf.ri.common.MyAnnotationCallback;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.List;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.util.Timer;
import java.util.*;
import org.apache.commons.io.IOUtils;
import io.sentry.Sentry;
import io.sentry.SentryEnvelopeHeaderAdapter;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static final Logger logger = Logger.getLogger(Main.class.getName());
    public static final String conf1 = "Formação Inicial";
    public static final String conf2 = "Configurar Atalhos";
    public static final String conf3 = "Orçamentos com Tópicos";
    public static final String conf4 = "Requisições de Exames";
    public static final String conf5 = "Gestão de Stocks - Folha de Produtos";
    public static final String conf6 = "Gestão de Stocks - Geral";
    public static final String conf7 = "Gestão de Próteses";

    public static final String rad1 = "AIS SETELEC";
    public static final String rad2 = "CS Imaging";
    public static final String rad3 = "CliniView";
    public static final String rad4 = "DeepView";
    public static final String rad5 = "Digora";
    public static final String rad6 = "EzDent_i";
    public static final String rad7 = "HandyDentist";
    public static final String rad8 = "MediaDent";
    public static final String rad9 = "MyRayIrys";
    public static final String rad10 = "NemoStudio";
    public static final String rad11 = "Newtom";
    public static final String rad12 = "Romexis";
    public static final String rad13 = "Proimage";
    public static final String rad14 = "Quickvision";
    public static final String rad15 = "RayMage";
    public static final String rad16 = "RioView";
    public static final String rad17 = "Sidexis";
    public static final String rad18 = "Softysdental";
    public static final String rad19 = "Sopro Imaging";
    public static final String rad20 = "Triana";
    public static final String rad21 = "VistaSoft";
    public static final String rad22 = "VixWin";
    public static final String rad23 = "DIS Mac";
    public static final String rad24 = "WillMaster";
    public static final String rad25 = "DBSWIN";
    public static final String nq1 = "Configuração NoviQuest";
    public static final String nd1 = "Server NoviDash";
    public static final String ng1 = "Atalho como Administrador";
    public static final String ng2 = "Cartao Cidadao";
    public static final String ng3 = "Posto NoviGest";
    public static final String ng4 = "Server NoviGest Mac OS";
    public static final String ng5 = "Server NoviGest Windows";
    public static final String ng6 = "Troubleshooting";
    public static final String ng7 = "Posto Trabalho Linux";
    public static final String np1 = "Server NoviPem";
    public static final String psql1 = "Replicação PostgreSQL";
    public static final String int1 = "Montar interface clientes";
    public static final String int2 = "Especificações PCs";
    public static final String int3 = "Atualizações Automáticas";
    public static final String int4 = "Upgrades NoviGest";
    public static final String int5 = "Instaladores Windows";
    public static final String int6 = "Instaladores Macintosh";
    public static final String int7 = "Certificados ZeroSSL";
    public static final String dash1 = "DashBoard Reports";
    public static final String dash2 = "Geração Relatórios Manuais";
    public static final String vpn1 = "OpenVPN";
    public static final String vpn2 = "SoftEtherVPN";
    public static final String mail1 = "Pack SMS Comunicações";
    public static final String mail2 = "NoviPem Prescrição Electrónica";
    public static final String mail3 = "Introdução de Tabelas";
    public static final String mail4 = "Consentimentos RGPD";
    public static final String mail5 = "Características PCs Recomendadas";
    public static final String mail6 = "Formulário Potencial Cliente";
    public static final String[] confStrings = {conf1, conf2, conf3, conf4, conf5, conf6, conf7};
    public static final String[] radStrings = {rad1, rad2, rad3, rad4, rad5, rad6, rad7, rad8, rad9, rad10, rad11, rad12, rad13, rad14, rad15, rad16, rad17, rad18, rad19, rad20, rad21, rad22, rad23, rad24, rad25};
    public static final String[] nqStrings = {nq1};
    public static final String[] ndStrings = {nd1};
    public static final String[] ngStrings = {ng1, ng2, ng3, ng4, ng5, ng6, ng7};
    public static final String[] npStrings = {np1};
    public static final String[] psqlStrings = {psql1};
    public static final String[] intStrings = {int1, int2, int3, int4, int5, int6, int7};
    public static final String[] dashStrings = {dash1, dash2};
    public static final String[] vpnStrings = {vpn1, vpn2};
    public static final String[] mailStrings = {mail1, mail2, mail3, mail4, mail5, mail6};
    public static final JDialog dialog = new JDialog();
    public static SearchTerm searchTerm = null;
    public static Iterator iterator = null;
    //   public static final Image iconNg;
    public static int foundX;
    public static boolean iFoundIt;
    public static String result;
    public static ArrayList<String> arrayResults;
    public static String whatWasDone;
    public static ArrayList<String> finalList;
    public static int iterateMePlease;
    public static int countFound;
    public static Timer timer;
    public static LinkedList<String> listOfLists;
    public static ArrayList<String> finalListOfLists;
    public static int foundCount;
    public static int ocNumber;
    public static Map<Integer, Integer> map;
    public static Map<Integer, String> confMap = new HashMap<>();
    public static Map<Integer, String> radMap = new HashMap<>();
    public static Map<Integer, String> nqMap = new HashMap<>();
    public static Map<Integer, String> ndMap = new HashMap<>();
    public static Map<Integer, String> ngMap = new HashMap<>();
    public static Map<Integer, String> npMap = new HashMap<>();
    public static Map<Integer, String> psqlMap = new HashMap<>();
    public static Map<Integer, String> intMap = new HashMap<>();
    public static Map<Integer, String> dashMap = new HashMap<>();
    public static Map<Integer, String> listMap = new HashMap<>();
    public static Map<Integer, String> vpnMap = new HashMap<>();
    public static Map<Integer, String> mailMap = new HashMap<>();
    public static String KBVERSION = "2.1";

    public static int value = 0;
    public static boolean finalize = false;
    public static boolean windows = false;
    static ArrayList<String> resultsString = new ArrayList();

    static {

//        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
//        System.out.println(methodName);
        //  iconNg = Panels.iconNg;
       // System.getProperty("KBVERSION",KBVERSION);
        initSentry();
        foundX = 0;
        iFoundIt = false;
        result = null;
        arrayResults = new ArrayList();
        whatWasDone = null;
        finalList = new ArrayList();
        iterateMePlease = 0;
        countFound = 0;
        timer = new Timer();
        listOfLists = new LinkedList();
        finalListOfLists = new ArrayList();
        foundCount = 0;
        ocNumber = -1;
        map = new HashMap();

    }

    public Main() {
//        String methodName = new Object() {}.getClass().getEnclosingMethod().getName();
//        System.out.println(methodName);

    }

    public static void setDebug() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        logger.setLevel(Level.parse(System.getProperty("DEBUGLEVEL", "WARNING")));
    }

    public static void initSentry() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
       
        
        Sentry.init(options -> {
            options.setDsn("https://b79953d25db544218efa2f83c14e1e1d@o474143.ingest.sentry.io/5509986");
        });

        try {
            //  logger.info("SENTRY INITIATED!");
        } catch (Exception ex) {
            try {
                if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                    ex.printStackTrace();
                } else {
                    pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                }
            } catch (UnknownHostException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        Sentry.configureScope(scope -> {
            try {
                scope.setTag("SO", "Sistema OPERA");
                scope.setContexts("Sistema Operativo", System.getProperty("os.name") + ", " + System.getProperty("os.arch"));
                // scope.setContexts("Arquitetura", System.getProperty("os.arch"));
                scope.setContexts("Software", "Java: " + System.getProperty("java.version") + "\n"
                        + "TactisKB: " + KBVERSION);
                //   scope.setContexts("Versão KB", KBVERSION);
                scope.setContexts("Detalhes", "User: " + System.getProperty("user.name") + "\n"
                        + "Hostname: " + InetAddress.getLocalHost().getHostName() + "\n"
                        + "IP: " + InetAddress.getLocalHost().getHostAddress());
                //   scope.setContexts("User",  System.getProperty("user.name"));
            } catch (UnknownHostException ex) {
                try {
                    if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                        ex.printStackTrace();
                    } else {
                        pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                    }
                } catch (UnknownHostException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }
        });
    }

    public static void fillMaps() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        for (int i = 0; i < confStrings.length; i++) {
            confMap.put(i, confStrings[i]);

        }
        for (int i = 0; i < radStrings.length; i++) {
            radMap.put(i + 1, radStrings[i]);
        }
        for (int i = 0; i < nqStrings.length; i++) {
            nqMap.put(i, nqStrings[i]);
        }
        for (int i = 0; i < ndStrings.length; i++) {
            ndMap.put(i, ndStrings[i]);
        }
        for (int i = 0; i < ngStrings.length; i++) {
            ngMap.put(i, ngStrings[i]);
        }
        for (int i = 0; i < npStrings.length; i++) {
            npMap.put(i, npStrings[i]);
        }
        for (int i = 0; i < psqlStrings.length; i++) {
            psqlMap.put(i, psqlStrings[i]);
        }
        for (int i = 0; i < intStrings.length; i++) {
            intMap.put(i, intStrings[i]);
        }
        for (int i = 0; i < dashStrings.length; i++) {
            dashMap.put(i, dashStrings[i]);
        }
        for (int i = 0; i < vpnStrings.length; i++) {
            vpnMap.put(i, vpnStrings[i]);
        }
        for (int i = 0; i < mailStrings.length; i++) {
            mailMap.put(i, mailStrings[i]);
        }
        listMap.put(0, "CONF");
        listMap.put(1, "RAD");
        listMap.put(2, "NQ");
        listMap.put(3, "ND");
        listMap.put(4, "NG");
        listMap.put(5, "NP");
        listMap.put(6, "PSQL");
        listMap.put(7, "INT");
        listMap.put(8, "DASH");
        listMap.put(9, "VPN");
        listMap.put(10, "MAIL");

        //logger.info(dashMap.get(0));
    }

    public void fillDoc(Document document) throws IOException, PDFException, PDFSecurityException, InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        /*   document.setUrl(this.getClass().getResource("/kb/files/pdf/Troubleshooting.pdf"));
        logger.info(document.getNumberOfPages());
        PageText text = document.getPageText(1);
        String finalText = text.toString();

        logger.info(document.getPageText(1));

        String translated = translator.translate(finalText, Language.PORTUGUESE, Language.ENGLISH);
        PDDocument newPdf = new PDDocument();
        PDPage newPage = new PDPage();
        PDPageContentStream contentStream = new PDPageContentStream(newPdf, newPage);
        contentStream.beginText();
        contentStream.showText(translated);
        contentStream.endText();
        contentStream.close();
        newPdf.save("C:/actis/xpto.pdf"); */
//        document.setUrl(this.getClass().getResource("/kb/files/pdf/Troubleshooting.pdf"));
//        logger.info(document.getNumberOfPages() + " @ " + new Object() {
//        }.getClass().getEnclosingMethod().getName() + " @ " + new Object() {
//        }.getClass().getName());
//        PageText text = document.getPageText(1);
//        String finalText = text.toString();
//        String translatedText = Translator.translate("pt","en",finalText);
        //      logger.info(translatedText+ " @ " + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    public static void main(String[] args) throws IOException, InterruptedException, PDFException, PDFSecurityException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        // Document newDoc = new Document();
        //   new Main().fillDoc(newDoc);
        //new Translate().pdf();
        //System.setOut(new Output(System.out));
        fillMaps();
        try {
            new Main().setDialogIcon();
        } catch (Exception ex) {
            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                ex.printStackTrace();
            } else {
                if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                    ex.printStackTrace();
                } else {
                    pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                }
            }

        }

        //System.getProperty("os.name")
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            windows = true;
        }

        LoadingScreen.waitFor(new Runnable() {
            @Override
            public void run() {
                try {

                    startupProcedure();
                } catch (Exception ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });

    }

    public void setDialogIcon()/* throws IOException, Exception*/ {
        //LoadingScreen.dialog.setIconImage(new ImageIcon(ImageIO.read(Runtime.getRuntime().getClass().getResource("/src/main/java/com/tactis/knowledgebase/resources/images/baseIcon.png"))).getImage());
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        //LoadingScreen.dialog.setIconImage(new ImageIcon("/com/tactis/knowledgebase/resources/images/baseIcon.png").getImage());
        String iconString = "/img/baseIcon.png";
        URL iconUrl = Main.class.getResource(iconString);
        Image iconImage = new ImageIcon(iconUrl).getImage();

        // URL url = getResource(iconName);
        // LoadingScreen.dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource(iconName)));
        LoadingScreen.dialog.setIconImage(iconImage);
        //   ImageIcon imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource(proteseIcon)));
        //  byte[] buffer = new byte[is.available()];
        // is.read(buffer);
        //File fileBaseIcon = new File(System.getProperty("user.home") + "\\AppData\\Local\\Temp\\TKB-baseIcon.png");
        //   LoadingScreen.dialog.setIconImage(new ImageIcon(fileBaseIcon.getPath()).getImage());
    }

    public URL getResource(String file) throws Exception {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        ClassLoader classLoader = getClass().getClassLoader();
        URL url = classLoader.getResource(file);
        if (url != null) {
            return url;
        } else {
            // logger.info("Ficheiro não encontrado: " + file);
            return null;
        }

    }

    public static void checkProperties() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        String baseFileDir = "C:\\TactisKnowledgeBase\\files\\";

        String propDir = "\\.icesoft\\icepdf-viewer\\";

        String wantedFile = "pdfviewerri.properties";

        String homeDir = System.getProperty("user.home");

        String dirPath = homeDir + propDir;

        String filePath = homeDir + propDir + wantedFile;

        String copyCmd = "copy " + baseFileDir + wantedFile + " \"" + filePath + "\"";

        String delOld = "del \"" + filePath + "\"";

        File file = new File(filePath);

        File path = new File(dirPath);

        ProcessBuilder doCopy;

        String makeDir = "mkdir \"" + dirPath + "\"";
        ProcessBuilder doDir;

        List command;
        doDir = new ProcessBuilder("cmd", "/c", makeDir);
        try {

            doDir.start().waitFor();

        } catch (Exception ex) {
            try {
                if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                    ex.printStackTrace();
                } else {
                    pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                }
            } catch (UnknownHostException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        if (path.exists() && path.isDirectory()) {

            if (file.exists() && file.isFile()) {

                doCopy = new ProcessBuilder("cmd", "/c", delOld);
                try {
                    doCopy.start().waitFor();
                } catch (InterruptedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                } catch (IOException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        }

    }

    public static void startupProcedure() throws Exception {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        barra.setString(label.getText());
        //barra.setValue(50);
        LoadingScreen.panel.add(barra, "South");
        barra.setVisible(true);
        barra.setMinimum(1);
        barra.setMaximum(1000);
//        barra.setValue(1);
//        barra.setValue(barValues(barra));

        // new LoadingScreen();
//        barra.setValue(barValues(barra));
        Main setProperties = new Main();
//        barra.setValue(barValues(barra));
        setProperties.newProperties();
//        barra.setValue(barValues(barra));

        //barra.setValue(value += 2);
    }

    public static int barValues(JProgressBar bar) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        int VALUE1 = (int) (barra.getMaximum() * 0.1);
        int VALUE2 = (int) (barra.getValue() * 0.9);
        int VALUE3 = (int) (VALUE1 + VALUE2);
        return VALUE3;

    }

    public static void fillNewList() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        int i;
        /* System.out.println("COMEÇA AQUI OS SIZES!!");
        System.out.println(Panels.funcModel1.getSize());
        System.out.println(Panels.funcModel2.getSize());
        System.out.println(Panels.tecnModel1.getSize());
        System.out.println(Panels.tecnModel2.getSize());
        System.out.println(Panels.tecnModel3.getSize());
        System.out.println(Panels.tecnModel4.getSize());
        System.out.println(Panels.tecnModel5.getSize());
        System.out.println(Panels.tecnModel6.getSize());
        System.out.println(Panels.tecnModel7.getSize());
        System.out.println(Panels.tecnModel8.getSize());
        System.out.println(Panels.mailModel.getSize());
        System.out.println("ACABA AQUI OS SIZES!!");*/
        for (i = 0; i < Panels.funcModel1.getSize(); ++i) {
            
            listOfLists.add(Panels.funcModel1.get(i));
            map.put(0, i);
        }

        for (i = 0; i < Panels.funcModel2.getSize(); ++i) {
            listOfLists.add(Panels.funcModel2.get(i));
            map.put(1, i);
        }

        for (i = 0; i < Panels.tecnModel1.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel1.get(i));
            map.put(2, i);
        }

        for (i = 0; i < Panels.tecnModel2.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel2.get(i));
            map.put(3, i);
        }

        for (i = 0; i < Panels.tecnModel3.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel3.get(i));
            map.put(4, i);
        }

        for (i = 0; i < Panels.tecnModel4.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel4.get(i));
            map.put(5, i);
        }

        for (i = 0; i < Panels.tecnModel5.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel5.get(i));
            map.put(6, i);
        }

        for (i = 0; i < Panels.tecnModel6.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel6.get(i));
            map.put(7, i);
        }

        for (i = 0; i < Panels.tecnModel7.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel7.get(i));
            map.put(8, i);
        }

        for (i = 0; i < Panels.tecnModel8.getSize(); ++i) {
            listOfLists.add(Panels.tecnModel8.get(i));
            map.put(9, i);
        }

        for (i = 0; i < Panels.mailModel.getSize(); ++i) {
            listOfLists.add(Panels.mailModel.get(i));
            map.put(10, i);
        }

    }

    private static String convertInputStreamToString(InputStream inputStream) throws IOException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];

        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        return result.toString(StandardCharsets.UTF_8.name());
    }

    public void mainRunner(Panels panel) throws Exception {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        //barra.setValue(value += 2);
        Interface.setProperties();
        // barra.setValue(value += 2);
        fillNewList();
        ComponentKeyBinding.install(Panels.controller, Panels.viewerComponentPanel);
        Panels.controller.getDocumentViewController().setAnnotationCallback(new MyAnnotationCallback(Panels.controller.getDocumentViewController()));

        Panels.accordionPanel.setName("Lista Accordion");
        //barra.setValue(value += 2);
        Panels.showPdfPanel.setName("Visualizador PDF");
        Panels.listPanel.setName("Painel Lista");
        Panels.viewerComponentPanel.setName("Viewer Component");
        Panels.tabbedPane.setName("Title Pane");
        //barra.setValue(value += 2);
        Panels.finalFrame.setName("Frame Principal");
        Panels.dummyPanel.setName("Painel Segurador");
        Panels.searchPdfPanel.setName("Painel de Pesquisa");
        Panels.searchPdfField.setName("Field de Pesquisa");
        Panels.searchPdfButton.setName("Botao de Pesquisa");
        //barra.setValue(value += 2);
        Panels.funcList1.setName("Lista Funcionalidade 1");
        Panels.funcList2.setName("Lista Funcionalidade 2");
        Panels.tecnList1.setName("Lista Tecnica 1");
        Panels.tecnList2.setName("Lista Tecnica 2");
        Panels.tecnList3.setName("Lista Tecnica 3");
        Panels.tecnList4.setName("Lista Tecnica 4");
        //barra.setValue(value += 2);
        Panels.tecnList5.setName("Lista Tecnica 5");
        Panels.tecnList6.setName("Lista Tecnica 6");
        Panels.tecnList7.setName("Lista Tecnica 7");
        Panels.sideBar.setName("Sidebar Principal");
        Panels.innerFuncBar.setName("Inner Funcionalidade");
        Panels.innerTecnBar.setName("Inner Tecnica");
        Panels.confNgSection.setName("Seccao Conf Ng");
        // barra.setValue(value += 2);
        Panels.radiNgSection.setName("Seccao Radiologia");
        Panels.noviQuestSection.setName("Seccao NoviQuest");
        Panels.noviDashSection.setName("Seccao NoviDash");
        Panels.noviGestSection.setName("Seccao NoviGest");
        Panels.noviPemSection.setName("Seccao NoviPem");
        Panels.postgreSQLSection.setName("Seccao PostgreSQL");
        // barra.setValue(value += 2);
        Panels.internalSection.setName("Seccao Processos Internos");
        Panels.dashBoardSection.setName("Seccao DashBoard");
        Panels.func.setName("Main Funcionalidade");
        // barra.setValue(value += 2);
        Panels.tecn.setName("Main Tecnica");
        Panels.mail.setName("Main Mail");

        Timer timer = new Timer();
        Scheduler memInfo = new Scheduler();
        timer.scheduleAtFixedRate(memInfo, 60000L, 60000L);
        // barra.setValue(value += 2);

        try {
            // barra.setValue(value += 2);

            panel.showFinalFrame();

            // barra.setValue(value += 2);
        } catch (IOException ex) {
            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                ex.printStackTrace();
            } else {
                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
            }
        }
        // barra.setValue(value += 2);
        Panels.controller.getViewerFrame();
        // barra.setValue(value += 2);
        Panels.finalFrame.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent arg0) {
                Interface.resizeAll();
                // Interface.changePdfZoom();
            }
        });
        // barra.setValue(value += 2);
//        Panels.finalFrame.addKeyListener(new KeyListener() {
//            public void keyTyped(KeyEvent e) {
//            }
//
//            public void keyPressed(KeyEvent e) {
//            }
//
//            public void keyReleased(KeyEvent e) {
//            }
//        });
//        Panels.finalFrame.addWindowFocusListener(new WindowFocusListener() {
//            public void windowGainedFocus(WindowEvent e) {
//                //  logger.info("FOCUSED ON WINDOW");
//
//            }
//
//            public void windowLostFocus(WindowEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//                //  logger.info("LOST WINDOW FOCUS");
//
//            }
//        });
//        Panels.finalFrame.addWindowListener(new WindowListener() {
//            public void windowOpened(WindowEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//                //  logger.info("WINDOW OPENED");
//
//            }
//
//            public void windowClosing(WindowEvent e) {
//                // logger.info("WINDOW IS CLOSING");
//            }
//
//            public void windowClosed(WindowEvent e) {
//                //  logger.info("WINDOW CLOSED");
//            }
//
//            public void windowIconified(WindowEvent e) {
//            }
//
//            public void windowDeiconified(WindowEvent e) {
//            }
//
//            public void windowActivated(WindowEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//                // logger.info("WINDOW ACTIVE");
//
//            }
//
//            public void windowDeactivated(WindowEvent e) {
//                // logger.info("WINDOW NOT ACTIVE");
//            }
//        });
//        Panels.finalFrame.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//
//            }
//
//            public void mousePressed(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseExited(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//        });
//        Panels.dummyPanel.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mousePressed(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseExited(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//        });
//        Panels.showPdfPanel.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mousePressed(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseExited(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//        });
//        Panels.accordionPanel.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mousePressed(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//
//            public void mouseExited(MouseEvent e) {
//                Interface.resizeAll();
//                Interface.changePdfZoom();
//            }
//        });
        Panels.finalFrame.addWindowStateListener((e) -> {
            Interface.resizeAll();
            // Interface.changePdfZoom();
        });
//        Panels.searchPdfField.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//            }
//
//            public void mousePressed(MouseEvent e) {
//            }
//
//            public void mouseReleased(MouseEvent e) {
//            }
//
//            public void mouseEntered(MouseEvent e) {
//            }
//
//            public void mouseExited(MouseEvent e) {
//            }
//        });
//        Panels.internalSearchButton.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    
//                    Interface.callDisplayResult();
//                } catch (Exception ex) {
//                    if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
//                ex.printStackTrace();
//            } else {
//                com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);}
//                }
//
//            }
//        });
//        Panels.internalSearchField.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                try {
//                    Interface.callDisplayResult();
//                } catch (Exception ex) {
//                    if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
//                ex.printStackTrace();
//            } else {
//                com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);}
//                }
//            }
//        });
//        Panels.dummyPanel.addKeyListener(new KeyAdapter() {
//            public void keyPressed(KeyEvent e) {
//                if (e.isControlDown()) {
//                    try {
//                        Interface.callDisplayResult();
//                    } catch (Exception ex) {
//                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
//                ex.printStackTrace();
//            } else {
//                com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);}
//                    }
//                }
//
//            }
//        });
        Panels.searchPdfField.addActionListener((e) -> {
            try {
                Interface.callDisplayResult(Panels.searchPdfField.getText());
            } catch (Exception ex) {
                try {
                    if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                        ex.printStackTrace();
                    } else {
                        pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                    }
                } catch (UnknownHostException ex1) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                }
                ;
            }

        });
        Panels.searchPdfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Interface.callDisplayResult(Panels.searchPdfField.getText());
                } catch (Exception ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                        }
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        });
        Panels.searchPdfField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Main.ocNumber = -1;
                Main.finalListOfLists.clear();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Main.ocNumber = -1;
                Main.finalListOfLists.clear();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Main.ocNumber = -1;
                Main.finalListOfLists.clear();
            }
        });
        return;
    }

    public void newProperties() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        if (!windows) {

            try {
                barra.setValue(barValues(barra));
                Panels panel = new Panels();
                panel.setSections();
                // panel.showFinalFrame();
                barra.setValue(barValues(barra));
                mainRunner(panel);
            } catch (Exception x) {

            }

        } else {
            try {
                barra.setValue(barValues(barra));

                String newFilePath = "/etc/pdfviewerri.properties";
//                String test = "/img/book.png";
                // File newFileFile = new File(test)
                // File x = new File(newFilePath);
                //   File xpto = new File(x.getPath());
                Charset encoding = StandardCharsets.ISO_8859_1;
                InputStream contentIs = Main.class.getResourceAsStream(newFilePath);
                String actualContent = IOUtils.toString(contentIs, encoding);
                // byte[] content = FileUtils.readFileToByteArray(new File(Main.class.getResource(newFilePath).getFile()));
                // String fileContent = new String(content, encoding);
                // logger.info(actualContent + " @ " + new Object() {
                //}.getClass().getEnclosingMethod().getName() + " @ " + new Object() {
                //}.getClass().getName());
                //System.exit(0);
                //Resource rsrc = new ClassPathResource(newFilePath);
                //URL rsrcUrl = this.getClass().getResource(test);
                //File rsrc = new File(rsrcUrl.toURI());
                // logger.info(newFilePath);
                // String properties = ResourceManager.extract(newFilePath);
                // File properties = new File(Runtime.getRuntime().getClass().getResource(newFilePath).toURI());
                //logger.info(properties);
                //InputStream origFileStream = new FileInputStream(rsrc)/*this.getClass().getResourceAsStream(newFilePath)*/;

                //BufferedReader reader = new BufferedReader(new InputStreamReader(origFileStream));
                //File xxx = new File(Main.class.getResource(newFilePath));
                File homeDirX = new File((System.getProperty("user.home") + "\\file.temp"));
                //logger.info((System.getProperty("user.home")+"\\file.temp"));
                FileWriter fileWriter = new FileWriter(homeDirX);
                BufferedWriter writer = new BufferedWriter(fileWriter);
                writer.write(actualContent);
                //while ((reader.readLine()) != null) {

                //}
                //reader.close();
                writer.close();

                String propDir = "\\.icesoft\\icepdf-viewer\\";

                String wantedFile = "pdfviewerri.properties";

                String homeDir = System.getProperty("user.home");

                String dirPath = homeDir + propDir;

                String filePath = homeDir + propDir + wantedFile;
                String makeDir = "mkdir \"" + dirPath + "\"";
                String copyCmd = "move \"" + homeDirX + "\" \"" + filePath + "\"";
                String delTmp = "del \"" + newFilePath + "\"";
                //    logger.info("MAKING DIR IS:");
                //  logger.info(makeDir);
                //  logger.info("COPYING FILE IS: ");
                //  logger.info(copyCmd);

                String delOld = "del \"" + filePath + "\"";

                File file = new File(filePath);

                File path = new File(dirPath);

                ProcessBuilder doDir;
                // logger.info(copyCmd);

//                List command;
//                ProcessBuilder delTemporaryFile = new ProcessBuilder("cmd", "/c", delTmp);
                doDir = new ProcessBuilder("cmd", "/c", makeDir);
                try {

                    doDir.start().waitFor();

                } catch (Exception ex) {
                    if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                        ex.printStackTrace();
                    } else {
                        pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                    }
                }

                ProcessBuilder doCopy;

                if (path.exists() && path.isDirectory()) {

                    if (file.exists() && file.isFile()) {

                        doCopy = new ProcessBuilder("cmd", "/c", delOld);
                        try {
                            // logger.info("vou copy");
                            doCopy.start().waitFor();
                        } catch (Exception ex) {
                            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                                ex.printStackTrace();
                            } else {
                                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                            }
                        }
                    }
                }

                while (true) {
                   
                    // barra.setValue(value += 2);
                    Process p = null;
                    //  Process pd = null;
                    //  barra.setValue(value += 2);
                    InputStream errorStream;
                    //  barra.setValue(value += 2);
                    InputStream outputStream;
                    //  barra.setValue(value += 2);
                    String error = null;
                    //  barra.setValue(value += 2);
                    String output = null;
                    //  barra.setValue(value += 2);
                    //  String errorPd = null;
                    //  String outputPd = null;
                    while (!path.exists() || !path.isDirectory()) {
                      
                        // barra.setValue(48);

                        doCopy = new ProcessBuilder("cmd", "/c", "mkdir \"" + homeDir + propDir + "\"");
                        try {
                            p = doCopy.start();
                        } catch (IOException ex) {
                            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                                ex.printStackTrace();
                            } else {
                                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                            }
                        }
                        try {
                            p.waitFor();
                        } catch (InterruptedException ex) {
                            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                                ex.printStackTrace();
                            } else {
                                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                            }
                        }
                        errorStream = p.getErrorStream();
                        outputStream = p.getInputStream();
                        try {
                          
                            error = convertInputStreamToString(errorStream);
                      
                        } catch (IOException ex) {
                            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                                ex.printStackTrace();
                            } else {
                                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                            }
                        }
                        try {
                          
                            output = convertInputStreamToString(outputStream);
                         
                        } catch (IOException ex) {
                            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                                ex.printStackTrace();
                            } else {
                                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                            }
                        }
                        if (!error.trim().equals("")) {

                            JOptionPane.showMessageDialog(null, "Diretório '" + dirPath + "' não tem permissões de escrita!", "Erro", 0);
                            System.exit(1);
                        } else {
                            logger.info(output.trim()/* + " @ " + new Object() {
                            }.getClass().getEnclosingMethod().getName() + " @ " + new Object() {
                            }.getClass().getName()*/);
                        }
                    }
                  
                    // barra.setValue(value += 2);

//                    System.out.println("123");

                    /*  logger.info(file.getAbsolutePath()/* + " @ " + new Object() {
                    }.getClass().getEnclosingMethod().getName() + " @ " + new Object() {
                    }.getClass().getName());
                   /* logger.info(file.exists() + " @ " + new Object() {
                    }.getClass().getEnclosingMethod().getName() + " @ " + new Object() {
                    }.getClass().getName());*/
 /*  logger.info(file.isFile() + " @ " + new Object() {
                    }.getClass().getEnclosingMethod().getName() + " @ " + new Object() {
                    }.getClass().getName());*/
                    //  barra.setValue(value += 2);
                    if (file.exists() && file.isFile()) {
                      
//                        System.out.println("1231");
                        finalize = true;
//                        System.out.println("entalei onde 1");

                        Panels panel = new Panels();
//                        System.out.println("entalei onde 2");

                        panel.setSections();
//                        System.out.println("entalei onde 3");

                        mainRunner(panel);
             
                        break;
                    }

                    if (!finalize) {

                        doCopy = new ProcessBuilder("cmd", "/c", copyCmd);

                        if (!path.canWrite()) {

                            throw new AccessDeniedException(dirPath);
                        }

                        try {

                            //FileUtils.copyFile(new File(properties), new File(filePath));
                            p = doCopy.start();
                            p.waitFor();
                            // pd = delTemporaryFile.start();
                            // pd.waitFor();
                            // delTemporaryFile.start().waitFor();
                        } catch (Exception ex) {
                            if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                                ex.printStackTrace();
                            } else {
                                pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
                            }
                        }
                   //     System.out.println("error 1");
                        error = convertInputStreamToString(p.getErrorStream());
                     //   System.out.println("error done");
                        output = convertInputStreamToString(p.getInputStream());
                      //  System.out.println("output done");
                        //errorPd = convertInputStreamToString(pd.getErrorStream());
                        //outputPd = convertInputStreamToString(pd.getInputStream());

                        if (!error.trim().equals("")) {

                            JOptionPane.showMessageDialog(null, "Diretório '" + dirPath + "' não tem permissões de escrita!", "Erro", 0);
                            System.exit(1);
                        } else {
                            finalize = true;
                        //    System.out.println("???");

                        }
                        // barra.getValue();
                        // logger.info(barra.getValue());
                        barra.setValue(100);
                    }
                  //  System.out.println("novo?");

                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
