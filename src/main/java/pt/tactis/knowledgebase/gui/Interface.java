//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package pt.tactis.knowledgebase.gui;

import com.gg.slider.SideBar;
import com.gg.slider.SidebarSection;
import pt.tactis.knowledgebase.Main;
import static pt.tactis.knowledgebase.gui.Panels.sideBar;
import java.awt.Component;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.icepdf.ri.common.views.DocumentViewComponent;
import org.icepdf.ri.common.views.DocumentViewController;
import org.icepdf.ri.common.views.DocumentViewControllerImpl;

public class Interface {

    public static boolean isSpecificCollapsed = false;
    public static boolean isAllTecnCollapsed = false;
    public static boolean isAllFuncCollapsed = false;
    public static boolean isAllCollapsed = false;
    public static boolean isFuncCollapsed = false;
    public static boolean isTecnCollapsed = false;
    public static boolean isMailCollapsed = false;
    public static JComponent keepCurrentComponent = null;
    public static final Logger logger = Logger.getLogger(Interface.class.getName());
    int var99 = -7500;
    public static HashMap<SidebarSection, String> collapseMap = new HashMap();

    public Interface() {

    }

    public static void searchWithinPdf() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        if (Main.searchTerm != null) {
            Panels.controller.getDocumentSearchController().removeSearchTerm(Main.searchTerm);
            Panels.controller.getDocumentSearchController().clearAllSearchHighlight();
        }

        Main.searchTerm = Panels.controller.getDocumentSearchController().addSearchTerm(Panels.internalSearchField.getText(), false, false);

        for (int i = 1; i > 0; ++i) {

            Panels.controller.getDocumentSearchController().searchHighlightPage(i, Main.searchTerm.getTerm(), false, false);
            if (i == Panels.controller.getDocument().getNumberOfPages()) {
                break;
            }
        }

    }

    public static void resizeAll() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
//        resizePdf();
        //Panels.finalFrame.repaint();
        int width = Panels.finalFrame.getWidth();
        int height = Panels.finalFrame.getHeight();
        Panels.accordionPanel.setBounds(1, 1, 350, height - 72);
        Panels.showPdfPanel.setBounds(351, 1, width - 375, height - 40);
        Panels.searchPdfPanel.setBounds(1, height - 72, 350, 32);
        int pdfW = Panels.showPdfPanel.getWidth();
        Panels.internalSearchPanel.setBounds(pdfW / 2 - 175, height - 72, 350, 32);
        //Panels.finalFrame.repaint();
        //Panels.accordionPanel.repaint();
        //Panels.showPdfPanel.repaint();
        //Panels.searchPdfPanel.repaint();
//        resizePdf();
    }

    public static void resizeAccordion() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        resizePdf();
        Panels.finalFrame.repaint();
        Panels.accordionPanel.repaint();
        Panels.showPdfPanel.repaint();
        Panels.searchPdfPanel.repaint();
        int height = Panels.finalFrame.getHeight();
        Panels.accordionPanel.setBounds(1, 1, 350, height - 40);
    }

    public static void resizePdf() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        /*  System.out.println("##########################.resizing.######################");
        Panels.finalFrame.revalidate();
        Panels.finalFrame.repaint();
        Panels.accordionPanel.revalidate();
        Panels.accordionPanel.repaint();
        Panels.showPdfPanel.revalidate();
        Panels.showPdfPanel.repaint();
        Panels.searchPdfPanel.revalidate();
        Panels.searchPdfPanel.repaint();
        Panels.dummyPanel.revalidate();
        Panels.dummyPanel.repaint();*/

    }

    public static void setProperties() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

        Panels.propertiesManager.setBoolean("application.toolbar.show.utility.save", false);
        Panels.propertiesManager.setBoolean("application.toolbar.show.utility.open", false);
        Panels.propertiesManager.setBoolean("application.toolbar.show.utility.search", true);
        Panels.propertiesManager.setBoolean("application.toolbar.show.fit", true);
        Panels.propertiesManager.setBoolean("application.toolbar.show.rotate", false);
        Panels.propertiesManager.setBoolean("application.toolbar.show.zoom", true);
        Panels.propertiesManager.setBoolean("application.statusbar.show.viewmode", true);
        Panels.propertiesManager.setBoolean("application.utilitypane.show.search", true);
        Panels.propertiesManager.setBoolean("application.toolbar.show.tool", false);
        Panels.propertiesManager.setInt("document.pagefitMode", 3);
        //Panels.propertiesManager.setInt("document.viewtype", DocumentViewControllerImpl.USE_ATTACHMENTS_VIEW);
        System.getProperties().put("application.toolbar.show.utility.save", false);
        System.getProperties().put("application.viewerpreferences.fitwindow", true);
        System.getProperties().put("org.icepdf.core.imageReference", "blurred");
        System.getProperties().put("org.icepdf.core.imagecache.enabled", false);
        System.getProperties().put("org.icepdf.core.scaleImages", true);
        System.getProperties().put("org.icepdf.core.paint.disableAlpha", false);
        System.getProperties().put("org.icepdf.core.ccittfax.jai", true);
        System.getProperties().put("org.icepdf.core.imageProxy", true);
        System.getProperties().put("org.jpedal.jai", true);
        System.getProperties().put("org.icepdf.core.awtFontLoading", true);
        System.getProperties().put("org.icepdf.core.screen.render", "VALUE_RENDER_QUALITY");
        System.getProperties().put("org.icepdf.core.screen.stroke", "VALUE_STROKE_PURE");
        System.getProperties().put("org.icepdf.core.screen.alphaInterpolation", "VALUE_INTERPOLATION_QUALITY");
        System.getProperties().put("org.icepdf.core.screen.interpolation", "VALUE_INTERPOLATION_BILINEAR");
        System.getProperties().put("org.icepdf.core.print.interpolation", "VALUE_INTERPOLATION_BILINEAR");
        System.getProperties().put("org.icepdf.core.screen.antiAliasing", "VALUE_ANTIALIAS_ON");
        System.getProperties().put("org.icepdf.core.screen.colorRender", "VALUE_COLOR_RENDER_QUALITY");
        System.getProperties().put("org.icepdf.core.screen.dither", "VALUE_DITHER_ENABLE");
        System.getProperties().put("org.icepdf.core.screen.fractionalmetrics", "VALUE_FRACTIONALMETRICS_ON");
        System.getProperties().put("org.icepdf.core.screen.textAntiAliasing", "true");
        System.getProperties().put("org.icepdf.core.views.buffersize.vertical", "10.0");
        System.getProperties().put("org.icepdf.core.views.buffersize.horizontal", "10.0");
        System.getProperties().put("org.icepdf.core.views.refreshfrequency", 5);
        System.getProperties().put("org.icepdf.core.library.threadPoolSize", 64);
        // Panels.finalFrame.repaint();
        Panels.propertiesManager.saveProperties();

    }

    public static void changePdfZoom() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();
    }

    public static void collapseAll() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        //    Thread.sleep(1000);
        Panels.finalFrame.repaint();

        collapseAllTecn();
        collapseAllFunc();
        Panels.mail.collapse(true);
        isAllCollapsed = true;
    }

    public static void collapseAllButTheOneSelected(SidebarSection section) throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        boolean isExpand = false;
        if (section.getOwner().isCurrentExpandedSection(section)) {
            //   System.out.println("sou eu mesmo :)");
            isExpand = true;

        } else {
            //    System.out.println("é mentira");
            isExpand = false;
        }
        if (isExpand == false) {
            for (int i = 0; i < Panels.sidebarModel.size(); i++) {
                JComponent c = Panels.sidebarModel.elementAt(i);

                if (/*section != c*/false) {
                    ((SidebarSection) c).collapse(true);

//                try {
//                    for (Component comp : ((SidebarSection) c).getComponents()) {
//                        System.out.println("3 ##COMPONENTE É: " + comp.getName());
//                        System.out.println("3 #####SECTION É: " + section.getName());
//                        if (section == comp) {
//                            System.out.println("4 ##COMPONENTE É: " + comp.getName());
//                            System.out.println("4 #####SECTION É: " + section.getName());
//                            System.out.println("4 #####PARENT  É: " + ((SidebarSection) section.getParent()).getName());
//                            //((SidebarSection) c).expand();
//                            ((SidebarSection) section.getParent()).expand();
//                            section.expand();
//                        }
//                    }
//                } catch (ClassCastException cce) {
//                    System.out.println("5 ### COLAPSAR: " + ((SidebarSection) c).getName());
//                    cce.getMessage();
//                    ((SidebarSection) c).collapse(true);
//                }
                } else {

                    if (keepCurrentComponent != section) {
                        keepCurrentComponent = section;

                        JComponent comp;
                        for (int j = 0; j < Panels.modelOfFunc.size(); j++) {
                            comp = (JComponent) Panels.modelOfFunc.elementAt(j);
                            if (keepCurrentComponent == comp) {
                                //  if (isCollapsed(Panels.tecn) == false) {
                                collapseSpecific(Panels.tecn);
                                //  }
                                //  if (isCollapsed(Panels.mail) == false) {
                                collapseSpecific(Panels.mail);
                                // }
                                //  if (isCollapsed(Panels.func) == true) {
                                expandSpecific(Panels.func);
                                //  }
                                ((SidebarSection) keepCurrentComponent).expand();

                                break;

                            } else {
                                ((SidebarSection) comp).collapse(true);
                            }
                        }
                        for (int k = 0; k < Panels.modelOfTecn.size(); k++) {
                            comp = (JComponent) Panels.modelOfTecn.elementAt(k);
                            if (keepCurrentComponent == comp) {

                                //  if (isCollapsed(Panels.tecn) == true) {
                                expandSpecific(Panels.tecn);
                                //  }
                                // if (isCollapsed(Panels.mail) == false) {
                                collapseSpecific(Panels.mail);
                                //   }
                                //  if (isCollapsed(Panels.func) == false) {
                                collapseSpecific(Panels.func);
                                // }
                                ((SidebarSection) keepCurrentComponent).expand();

                                break;

                            } else {
                                ((SidebarSection) comp).collapse(true);
                            }
                        }
                        for (int l = 0; l < Panels.modelOfMail.size(); l++) {
                            comp = (JComponent) Panels.modelOfMail.elementAt(l);
                            if (keepCurrentComponent == comp) {

                                //  if (isCollapsed(Panels.tecn) == false) {
                                collapseSpecific(Panels.tecn);
                                //  }
                                //  if (isCollapsed(Panels.mail) == true) {
                                expandSpecific(Panels.mail);
                                // }
                                //  if (isCollapsed(Panels.func) == false) {
                                collapseSpecific(Panels.func);
                                //  }
                                ((SidebarSection) keepCurrentComponent).expand();

                                break;

                            } else {
                                ((SidebarSection) comp).collapse(true);
                            }
                        }
                    }

                }

            }
        } else {
            System.out.println("NADA");
//            if (section.getOwner().isCurrentExpandedSection(section)) {
//                System.out.println("sou eu mesmo :)");
//                
//            } else {
//                System.out.println("é mentira");
//            }
        }
        //    Thread.sleep(1000);
//        for (Component sec : sideBar.getComponents()) {
//            System.out.println("SIDEBAR SECTION IS: ");
//                System.out.println(((SideBar)sec).getName());
//            for (Component sec2 : ((SidebarSection) sec).getComponents()) {
//                System.out.println("SIDEBAR SECTION IS: ");
//                System.out.println(((SidebarSection)sec2).getName());
//            }
//        }
//        Panels.finalFrame.repaint();
//        logger.info("COLLAPSING ALL" + " @ " + new Object() {
//        }.getClass().getEnclosingMethod().getName());
//        collapseAllTecn();
//        collapseAllFunc();
//        Panels.mail.collapse(true);
//        isAllCollapsed = true;
    }

    public static void collapseMail() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.mail.collapse(true);
        collapseMap.put(Panels.mail, "true");
        isMailCollapsed = true;
    }

    public static void collapseAllTecn() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.noviQuestSection.collapse(true);

        Panels.noviDashSection.collapse(true);

        Panels.noviGestSection.collapse(true);

        Panels.noviPemSection.collapse(true);

        Panels.postgreSQLSection.collapse(true);

        Panels.internalSection.collapse(true);

        Panels.dashBoardSection.collapse(true);

        Panels.vpnSection.collapse(true);

        Panels.tecn.collapse(true);

        isAllTecnCollapsed = true;
        collapseMap.put(Panels.tecn, "true");
        collapseMap.put(Panels.noviQuestSection, "true");
        collapseMap.put(Panels.noviDashSection, "true");
        collapseMap.put(Panels.noviGestSection, "true");
        collapseMap.put(Panels.noviPemSection, "true");
        collapseMap.put(Panels.postgreSQLSection, "true");
        collapseMap.put(Panels.internalSection, "true");
        collapseMap.put(Panels.dashBoardSection, "true");
        collapseMap.put(Panels.vpnSection, "true");

    }

    public static void collapseAllFunc() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.confNgSection.collapse(true);

        Panels.radiNgSection.collapse(true);
        Panels.func.collapse(true);
        isAllFuncCollapsed = true;
        collapseMap.put(Panels.func, "true");
        collapseMap.put(Panels.confNgSection, "true");
        collapseMap.put(Panels.radiNgSection, "true");
    }

    public static void collapseSpecific(SidebarSection bar) throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        bar.collapse(true);
        isSpecificCollapsed = true;
        collapseMap.put(bar, "true");
    }

    public static void expandAll() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        expandAllTecn();

        expandAllFunc();
        isAllCollapsed = false;
    }

    public static void expandAllTecn() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.tecn.expand();

        Panels.noviQuestSection.expand();

        Panels.noviDashSection.expand();

        Panels.noviGestSection.expand();

        Panels.noviPemSection.expand();

        Panels.postgreSQLSection.expand();

        Panels.internalSection.expand();

        Panels.dashBoardSection.expand();

        Panels.vpnSection.expand();
        isAllTecnCollapsed = false;
        collapseMap.put(Panels.tecn, "false");
        collapseMap.put(Panels.noviQuestSection, "false");
        collapseMap.put(Panels.noviDashSection, "false");
        collapseMap.put(Panels.noviGestSection, "false");
        collapseMap.put(Panels.noviPemSection, "false");
        collapseMap.put(Panels.postgreSQLSection, "false");
        collapseMap.put(Panels.internalSection, "false");
        collapseMap.put(Panels.dashBoardSection, "false");
        collapseMap.put(Panels.vpnSection, "false");
    }

    public static void expandAllFunc() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.func.expand();

        Panels.confNgSection.expand();

        Panels.radiNgSection.expand();
        isAllFuncCollapsed = false;
        collapseMap.put(Panels.func, "false");
        collapseMap.put(Panels.confNgSection, "false");
        collapseMap.put(Panels.radiNgSection, "false");
    }

    public static void expandFunc() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.func.expand();
        isFuncCollapsed = false;
        collapseMap.put(Panels.func, "false");
    }

    public static void expandMail() {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.mail.expand();
        isMailCollapsed = false;
        collapseMap.put(Panels.mail, "false");
    }

    public static void expandTecn() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.tecn.expand();
        isTecnCollapsed = false;
        collapseMap.put(Panels.tecn, "false");
    }

    public static void collapseTecn() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.func.collapse(true);
        isTecnCollapsed = true;
        collapseMap.put(Panels.tecn, "true");
    }

    public static void collapseFunc() throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        Panels.tecn.collapse(true);
        isFuncCollapsed = true;
        collapseMap.put(Panels.func, "true");
    }

    public static void expandSpecific(SidebarSection bar) throws InterruptedException {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();

        bar.expand();
        isSpecificCollapsed = false;
        collapseMap.remove(bar);
        collapseMap.put(bar, "false");
    }

    public static boolean isCollapsed(SidebarSection bar) {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();
        boolean state = true;
        if (collapseMap.containsKey(bar)) {
            state = !collapseMap.get(bar).equals("false");
        }

        return state;
    }

    public static void callDisplayResult(String searchString) throws Exception {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);

//        Interface anInterface = new Interface();
//        anInterface.displayResult();
        String search = searchString;
        String itemFromList = searchAlgorithm(search);
        if (itemFromList != null && !"NO RESULTS".equals(itemFromList)) {
            Panels panel = new Panels();
            try {
                panel.doSelectionMethod(itemFromList);
            } catch (InterruptedException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static String removeAccents(String name) {
         String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        
        System.out.println(methodName);
        String fixed = name;
        for (int i = 0; i < fixed.length(); i++) {
            char accented = fixed.charAt(i);
            switch (accented) {
                case 'á':
                case 'à':
                case 'â':
                case 'ã':
                case 'Á':
                case 'À':
                case 'Â':
                case 'Ã': {
                    fixed = fixed.replace(accented, 'a');
                    //  System.out.println("NO A! " + fixed);
                    break;
                }
                case 'é':
                case 'è':
                case 'ê':
                case 'É':
                case 'È':
                case 'Ê': {
                    fixed = fixed.replace(accented, 'e');
                    // System.out.println("NO e! " + fixed);
                    break;
                }
                case 'í':
                case 'ì':
                case 'î':
                case 'Í':
                case 'Ì':
                case 'Î': {
                    fixed = fixed.replace(accented, 'i');
                    // System.out.println("NO i! " + fixed);
                    break;
                }
                case 'ó':
                case 'ò':
                case 'ô':
                case 'õ':
                case 'Ó':
                case 'Ò':
                case 'Ô':
                case 'Õ': {
                    fixed = fixed.replace(accented, 'o');
                    // System.out.println("NOo! " + fixed);
                    break;
                }
                case 'ú':
                case 'ù':
                case 'û':
                case 'Ú':
                case 'Ù':
                case 'Û': {
                    fixed = fixed.replace(accented, 'u');
                    //  System.out.println("NO u! " + fixed);
                    break;
                }
                case 'ç':
                case 'Ç': // BIOS problem
                {
                    fixed = fixed.replace(accented, 'c');
                    // System.out.println("NO c! " + fixed);
                    break;
                }
                case '!':
                case '"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                case ':':
                case ';':
                case '<':
                case '=':
                case '>':
                case '?':
                case '@':
                case '[':
                case '\\':
                case ']':
                case '^':
                case '_':
                case '`':
                case '{':
                case '|':
                case '}':
                case '~':
                case '´':
                case '¨': {
                    fixed = fixed.replace(accented, ' ');
                    // System.out.println("NO soace! " + fixed);
                    break;
                }

            }
        }
        return fixed;
    }

//    public static void selectItemOnList(String searchString) {
//        
//
//    }
    public static String searchAlgorithm(String search) {
        
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        
        System.out.println(methodName);
        System.out.println("####### I AM SEARCHING FOR :  "+search);
        // Panels.finalFrame.repaint();
        String userInput = removeAccents(search);
        System.out.println("####### MY ACTUAL SEARCH IS: "+userInput);
        String finalResultStr;
        if (!Panels.searchPdfField.getText().equals("")) {
            Iterator finalResult;
            String s = null;
            if (Main.ocNumber == -1 || !Main.finalListOfLists.contains(userInput)) {
                finalResult = Main.listOfLists.iterator();

                while (finalResult.hasNext()) {
                    s = (String) finalResult.next();
//                     System.out.println("### ORIGINAL: " + s.toLowerCase());
//                        System.out.println("### MUDADO: " + removeAccents(s).toLowerCase());
//                        System.out.println("### COMPARADO: " + userInput.toLowerCase());
//                        System.out.println("### IS TRUE??? " + removeAccents(s).toLowerCase().contains(userInput.toLowerCase()));
                    if (removeAccents(s).toLowerCase().contains(removeAccents(userInput).toLowerCase())) {
                        Main.finalListOfLists.add(s);
                    }
                }
            }

            ++Main.ocNumber;
            if (Main.ocNumber < Main.finalListOfLists.size() - 1) {

                // return Main.finalListOfLists.get(Main.ocNumber);
            } else {
                Main.ocNumber = -1;
                if (Main.ocNumber == -1) {
                    finalResult = Main.listOfLists.iterator();

                    while (finalResult.hasNext()) {
                        s = (String) finalResult.next();
//                        System.out.println("### ORIGINAL: " + s.toLowerCase());
//                        System.out.println("### MUDADO: " + removeAccents(s).toLowerCase());
//                        System.out.println("### COMPARADO: " + userInput.toLowerCase());
//                        System.out.println("### IS TRUE??? " + removeAccents(s).toLowerCase().contains(userInput.toLowerCase()));
                        if (removeAccents(s).toLowerCase().contains(removeAccents(userInput).toLowerCase())) {
                            Main.finalListOfLists.add(s);
                        }
                    }
                }

                ++Main.ocNumber;
                if (Main.ocNumber < Main.finalListOfLists.size() - 1) {

                }
            }

            finalResult = null;

            if (Main.finalListOfLists.isEmpty()) {
                finalResultStr = "NO RESULTS";
                JOptionPane.showMessageDialog(Panels.finalFrame, "Não foram encontrados resultados para '" + userInput + "'", "Erro", 0);
            } else {
//                 System.out.println("### ORIGINAL: " + s.toLowerCase());
//                        System.out.println("### MUDADO: " + removeAccents(s).toLowerCase());
//                        System.out.println("### COMPARADO: " + userInput.toLowerCase());
//                        System.out.println("### IS TRUE??? " + removeAccents(s).toLowerCase().contains(userInput.toLowerCase()));
                finalResultStr = Main.finalListOfLists.get(Main.ocNumber);
            }
            String ignoreThisString = "donotuse";
            return finalResultStr;
        } else {

            JOptionPane.showMessageDialog(Panels.finalFrame, "O campo de pesquisa não pode estar em branco", "Erro", 0);
            return null;
        }

    }

    public void displayResult() throws Exception {
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
        Panels.finalFrame.repaint();
        String userInput = Panels.searchPdfField.getText();
        if (!Panels.searchPdfField.getText().equals("")) {
            Iterator finalResult;
            String s;
            if (Main.ocNumber == -1 || !Main.finalListOfLists.contains(userInput)) {
                finalResult = Main.listOfLists.iterator();

                while (finalResult.hasNext()) {
                    s = (String) finalResult.next();
                    if (s.toLowerCase().contains(userInput)) {
                        Main.finalListOfLists.add(s);
                    }
                }
            }

            ++Main.ocNumber;
            if (Main.ocNumber < Main.finalListOfLists.size() - 1) {

            } else {
                Main.ocNumber = -1;
                if (Main.ocNumber == -1) {
                    finalResult = Main.listOfLists.iterator();

                    while (finalResult.hasNext()) {
                        s = (String) finalResult.next();
                        if (s.toLowerCase().contains(userInput.toLowerCase())) {
                            Main.finalListOfLists.add(s);
                        }
                    }
                }

                ++Main.ocNumber;
                if (Main.ocNumber < Main.finalListOfLists.size() - 1) {

                }
            }

            finalResult = null;
            String finalResultStr;
            if (Main.finalListOfLists.isEmpty()) {
                finalResultStr = "NO RESULTS";
            } else {
                finalResultStr = Main.finalListOfLists.get(Main.ocNumber);
            }
            String ignoreThisString = "donotuse";
        } else {

            JOptionPane.showMessageDialog(Panels.finalFrame, "O campo de pesquisa não pode estar em branco", "Erro", 0);
        }

//            byte var4 = -1;
//            switch (finalResultStr.hashCode()) {
//
//                case -1964957742:
//                    if (finalResultStr.equals("Newtom")) {
//                        var4 = 16;
//                    }
//                    break;
//                case -1781612439:
//                    if (finalResultStr.equals("Triana")) {
//                        var4 = 25;
//                    }
//                    break;
//                case -1752101933:
//                    if (finalResultStr.equals("DashBoard Reports")) {
//                        var4 = 45;
//                    }
//                    break;
//                case -1747248009:
//                    if (finalResultStr.equals("NO RESULTS")) {
//                        var4 = 46;
//                    }
//                    break;
//                case -1732228713:
//                    if (finalResultStr.equals("VixWin")) {
//                        var4 = 27;
//                    }
//                    break;
//                case -1642945380:
//                    if (finalResultStr.equals("RayMage")) {
//                        var4 = 20;
//                    }
//                    break;
//                case -1630208909:
//                    if (finalResultStr.equals("Gestão de Stocks - Geral")) {
//                        var4 = 5;
//                    }
//                    break;
//                case -1476472580:
//                    if (finalResultStr.equals("Atualizações Automáticas")) {
//                        var4 = 40;
//                    }
//                    break;
//                case -1460115353:
//                    if (finalResultStr.equals("Server NoviPem")) {
//                        var4 = 36;
//                    }
//                    break;
//                case -1448655883:
//                    if (finalResultStr.equals("Quickvision")) {
//                        var4 = 19;
//                    }
//                    break;
//                case -1422871619:
//                    if (finalResultStr.equals("RioView")) {
//                        var4 = 21;
//                    }
//                    break;
//                case -1404066577:
//                    if (finalResultStr.equals("NemoStudio")) {
//                        var4 = 15;
//                    }
//                    break;
//                case -1403930873:
//                    if (finalResultStr.equals("Montar interface clientes")) {
//                        var4 = 38;
//                    }
//                    break;
//                case -1355422362:
//                    if (finalResultStr.equals("EzDent_i")) {
//                        var4 = 11;
//                    }
//                    break;
//                case -1304128311:
//                    if (finalResultStr.equals("Sopro Imaging")) {
//                        var4 = 24;
//                    }
//                    break;
//                case -1252482355:
//                    if (finalResultStr.equals("Romexis")) {
//                        var4 = 17;
//                    }
//                    break;
//                case -1219574264:
//                    if (finalResultStr.equals("Instaladores Windows")) {
//                        var4 = 42;
//                    }
//                    break;
//                case -981237589:
//                    if (finalResultStr.equals("Formação Inicial")) {
//                        var4 = 0;
//                    }
//                    break;
//                case -962088060:
//                    if (finalResultStr.equals("Posto NoviGest")) {
//                        var4 = 32;
//                    }
//                    break;
//                case -936337795:
//                    if (finalResultStr.equals("Cartao Cidadao")) {
//                        var4 = 31;
//                    }
//                    break;
//                case -934740242:
//                    if (finalResultStr.equals("Proimage")) {
//                        var4 = 18;
//                    }
//                    break;
//                case -759388280:
//                    if (finalResultStr.equals("CS Imaging")) {
//                        var4 = 7;
//                    }
//                    break;
//                case -682461168:
//                    if (finalResultStr.equals("Requisições de Exames")) {
//                        var4 = 3;
//                    }
//                    break;
//                case -678174455:
//                    if (finalResultStr.equals("Instaladores Macintosh")) {
//                        var4 = 43;
//                    }
//                    break;
//                case -545065269:
//                    if (finalResultStr.equals("Sidexis")) {
//                        var4 = 22;
//                    }
//                    break;
//                case -510500209:
//                    if (finalResultStr.equals("Orçamentos com Tópicos")) {
//                        var4 = 2;
//                    }
//                    break;
//                case -362445543:
//                    if (finalResultStr.equals("Replicação PostgreSQL")) {
//                        var4 = 37;
//                    }
//                    break;
//                case -292815098:
//                    if (finalResultStr.equals("Certificados ZeroSSL")) {
//                        var4 = 44;
//                    }
//                    break;
//                case -151031829:
//                    if (finalResultStr.equals("MediaDent")) {
//                        var4 = 13;
//                    }
//                    break;
//                case -113915849:
//                    if (finalResultStr.equals("VistaSoft")) {
//                        var4 = 26;
//                    }
//                    break;
//                case -20430276:
//                    if (finalResultStr.equals("Upgrades NoviGest")) {
//                        var4 = 41;
//                    }
//                    break;
//                case 352038912:
//                    if (finalResultStr.equals("CliniView")) {
//                        var4 = 8;
//                    }
//                    break;
//                case 451064389:
//                    if (finalResultStr.equals("Server NoviGest Mac OS")) {
//                        var4 = 33;
//                    }
//                    break;
//                case 524940886:
//                    if (finalResultStr.equals("Softysdental")) {
//                        var4 = 23;
//                    }
//                    break;
//                case 613558214:
//                    if (finalResultStr.equals("Atalho como Administrador")) {
//                        var4 = 30;
//                    }
//                    break;
//                case 645664978:
//                    if (finalResultStr.equals("AIS SETELEC")) {
//                        var4 = 6;
//                    }
//                    break;
//                case 693221841:
//                    if (finalResultStr.equals("DeepView")) {
//                        var4 = 9;
//                    }
//                    break;
//                case 1115875401:
//                    if (finalResultStr.equals("Gestão de Stocks - Folha de Produtos")) {
//                        var4 = 4;
//                    }
//                    break;
//                case 1343532513:
//                    if (finalResultStr.equals("MyRayIrys")) {
//                        var4 = 14;
//                    }
//                    break;
//                case 1344015353:
//                    if (finalResultStr.equals("HandyDentist")) {
//                        var4 = 12;
//                    }
//                    break;
//                case 1575176351:
//                    if (finalResultStr.equals("Configuração NoviQuest")) {
//                        var4 = 28;
//                    }
//                    break;
//                case 1594509726:
//                    if (finalResultStr.equals("Configurar Atalhos")) {
//                        var4 = 1;
//                    }
//                    break;
//                case 1605585318:
//                    if (finalResultStr.equals("Especificações PCs")) {
//                        var4 = 39;
//                    }
//                    break;
//                case 1624446099:
//                    if (finalResultStr.equals("Server NoviGest Windows")) {
//                        var4 = 34;
//                    }
//                    break;
//                case 1980703267:
//                    if (finalResultStr.equals("Server NoviDash")) {
//                        var4 = 29;
//                    }
//                    break;
//                case 2025237050:
//                    if (finalResultStr.equals("Troubleshooting")) {
//                        var4 = 35;
//                    }
//                    break;
//                case 2046930748:
//                    if (finalResultStr.equals("Digora")) {
//                        var4 = 10;
//                    }
//                    break;
//                default:
//                    switch (finalResultStr) {
//                        case ("OpenVPN"):
//                            var4 = 64;
//                            break;
//                        case ("SoftEtherVPN"):
//                            var4 = 65;
//                            break;
//                        case ("DIS Mac"):
//                            var4 = 66;
//                            break;
//                        case ("WillMaster"):
//                            var4 = 67;
//                            break;
//                        case ("Pack SMS Comunicações"):
//                            var4 = 68;
//                            break;
//                        case ("NoviPem Prescrição Electrónica"):
//                            var4 = 69;
//                            break;
//                        case ("Introdução de Tabelas"):
//                            var4 = 70;
//                            break;
//                        case ("Consentimentos RGPD"):
//                            var4 = 71;
//                            break;
//                        case ("Características PCs Recomendadas"):
//                            var4 = 72;
//                            break;
//                        case ("Formulário Potencial Cliente"):
//                            var4 = 73;
//                            break;
//                    }
//
//                    break;
//
//            }
//         //   logger.info("ESTOU AQUI E OS VALORES ESTAO CHINADOS");
//        //    logger.info(finalResultStr);
//       //     logger.info(var4);
//
//            switch (var4) {
//                case 68:
//                case 69:
//                case 70:
//                case 71:
//                case 72:
//                case 73: {
//
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//
//                    if (isCollapsed(Panels.mail)) {
//                        collapseAll();
//                        expandMail();
//
//                    }
//
//                    if (var4 == 68) {
//                        Panels.mailList.setSelectedIndex(0);
//                    }
//                    if (var4 == 69) {
//                        Panels.mailList.setSelectedIndex(1);
//                    }
//                    if (var4 == 70) {
//                        Panels.mailList.setSelectedIndex(2);
//                    }
//                    if (var4 == 71) {
//                        Panels.mailList.setSelectedIndex(3);
//                    }
//                    if (var4 == 72) {
//                        Panels.mailList.setSelectedIndex(4);
//                    }
//                    if (var4 == 73) {
//                        Panels.mailList.setSelectedIndex(5);
//                    }
//
//                    break;
//                }
//                case 65:
//                case 64: {
//                    //   logger.info(isCollapsed(Panels.vpnSection));
//                    //   logger.info(isCollapsed(Panels.vpnSection));
////                    if (Panels.vpnSection.)
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//
//                    }
//
//                    if (isCollapsed(Panels.vpnSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.vpnSection);
//                    }
//
//                    if (var4 == 64) {
//                        Panels.tecnList8.setSelectedIndex(0);
//                    }
//                    if (var4 == 65) {
//                        Panels.tecnList8.setSelectedIndex(1);
//                    }
//                    // collapseAll();
//                    // expandTecn();
//                    // expandSpecific(Panels.vpnSection);
//                    //    Panels.openPdf("/pdf/OpenVPN.pdf",var4, ignoreThisString);
//                    break;
//                }
//                case 67:
//                case 66: {
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/VixWin.pdf"), var4, ignoreThisString);
//                    if (var4 == 66) {
//                        Panels.funcList2.setSelectedIndex(22);
//                    }
//                    if (var4 == 67) {
//                        Panels.funcList2.setSelectedIndex(23);
//                    }
//                    break;
//                }
//
//                case 0:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.confNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.confNgSection);
//                    }
//
//                    Panels.funcList1.setSelectedIndex(0);
//                    // logger.info("im here :\\)");
//                    //  Panels.openPdf("/pdf/Formação Inicial.pdf", var4, ignoreThisString);
//                    break;
//                case 1:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.confNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.confNgSection);
//                    }
//
//                    //   Panels.openPdf("/pdf/Configurar Atalhos.pdf", var4, ignoreThisString);
//                    Panels.funcList1.setSelectedIndex(1);
//                    break;
//                case 2:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.confNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.confNgSection);
//                    }
//
//                    //   Panels.openPdf("/pdf/Orçamentos com Tópicos.pdf", var4, ignoreThisString);
//                    Panels.funcList1.setSelectedIndex(2);
//                    break;
//                case 3:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.confNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.confNgSection);
//                    }
//
//                    // Panels.openPdf("/pdf/Requisições de Exames.pdf", var4, ignoreThisString);
//                    Panels.funcList1.setSelectedIndex(3);
//                    break;
//                case 4:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.confNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.confNgSection);
//                    }
//
//                    //      Panels.openPdf("/pdf/Gestão de Stocks - Folha de Produtos.pdf", var4, ignoreThisString);
//                    Panels.funcList1.setSelectedIndex(4);
//                    break;
//                case 5:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.confNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.confNgSection);
//                    }
//
//                    //    Panels.openPdf("/pdf/Gestão de Stocks - Geral.pdf", var4, ignoreThisString);
//                    Panels.funcList1.setSelectedIndex(5);
//                    break;
//                case 6:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/AIS SETELEC.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(0);
//                    break;
//                case 7:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/CS Imaging.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(1);
//                    break;
//                case 8:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/CliniView.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(2);
//                    break;
//                case 9:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/DeepView.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(3);
//                    break;
//                case 10:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Digora.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(4);
//                    break;
//                case 11:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/EzDent_i.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(5);
//                    break;
//                case 12:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/HandyDentist.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(6);
//                    break;
//                case 13:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/MediaDent.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(7);
//                    break;
//                case 14:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/MyRayIrys.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(8);
//                    break;
//                case 15:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/NemoStudio.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(9);
//                    break;
//                case 16:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Newtom.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(10);
//                    break;
//                case 17:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Romexis.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(11);
//                    break;
//                case 18:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Proimage.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(12);
//                    break;
//                case 19:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Quickvision.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(13);
//                    break;
//                case 20:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/RayMage.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(14);
//                    break;
//                case 21:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/RioView.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(15);
//                    break;
//                case 22:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Sidexis.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(16);
//                    break;
//                case 23:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Softysdental.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(17);
//                    break;
//                case 24:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Sopro Imaging.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(18);
//                    break;
//                case 25:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Triana.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(19);
//                    break;
//                case 26:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/VistaSoft.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(20);
//                    break;
//                case 27:
//                    if (!isCollapsed(Panels.tecn)) {
//                        collapseAllTecn();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.func)) {
//                        collapseAll();
//                        expandFunc();
//                    }
//
//                    if (isCollapsed(Panels.radiNgSection)) {
//                        collapseAllFunc();
//                        expandFunc();
//                        expandSpecific(Panels.radiNgSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/VixWin.pdf"), var4, ignoreThisString);
//                    Panels.funcList2.setSelectedIndex(21);
//                    break;
//                case 28:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviQuestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviQuestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Configuração NoviQuest.pdf"), var4, ignoreThisString);
//                    Panels.tecnList1.setSelectedIndex(0);
//                    break;
//                case 29:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviDashSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviDashSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Server NoviDash.pdf"), var4, ignoreThisString);
//                    Panels.tecnList2.setSelectedIndex(0);
//                    break;
//                case 30:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviGestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviGestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Atalho como Administrador.pdf"), var4, ignoreThisString);
//                    Panels.tecnList3.setSelectedIndex(0);
//                    break;
//                case 31:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviGestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviGestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Cartao Cidadao.pdf"), var4, ignoreThisString);
//                    Panels.tecnList3.setSelectedIndex(1);
//                    break;
//                case 32:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviGestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviGestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Posto NoviGest.pdf"), var4, ignoreThisString);
//                    Panels.tecnList3.setSelectedIndex(2);
//                    break;
//                case 33:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviGestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviGestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Server NoviGest Mac OS.pdf"), var4, ignoreThisString);
//                    Panels.tecnList3.setSelectedIndex(3);
//                    break;
//                case 34:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviGestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviGestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Server NoviGest Windows.pdf"), var4, ignoreThisString);
//                    Panels.tecnList3.setSelectedIndex(4);
//                    break;
//                case 35:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviGestSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviGestSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Troubleshooting.pdf"), var4, ignoreThisString);
//                    Panels.tecnList3.setSelectedIndex(5);
//                    break;
//                case 36:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.noviPemSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.noviPemSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Server NoviPem.pdf"), var4, ignoreThisString);
//                    Panels.tecnList4.setSelectedIndex(0);
//                    break;
//                case 37:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.postgreSQLSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.postgreSQLSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Replicação PostgreSQL.pdf"), var4, ignoreThisString);
//                    Panels.tecnList5.setSelectedIndex(0);
//                    break;
//                case 38:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Montar interface clientes.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(0);
//                    break;
//                case 39:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Especificações PCs.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(1);
//                    break;
//                case 40:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Atualizações Automáticas.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(2);
//                    break;
//                case 41:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Upgrades NoviGest.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(3);
//                    break;
//                case 42:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Instaladores Windows.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(4);
//                    break;
//                case 43:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Instaladores Macintosh.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(5);
//                    break;
//                case 44:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.internalSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.internalSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/Certificados ZeroSSL.pdf"), var4, ignoreThisString);
//                    Panels.tecnList6.setSelectedIndex(6);
//                    break;
//                case 45:
//                    if (!isCollapsed(Panels.func)) {
//                        collapseAllFunc();
//                    }
//                    if (!isCollapsed(Panels.mail)) {
//                        collapseMail();
//                    }
//                    if (isCollapsed(Panels.tecn)) {
//                        collapseAll();
//                        expandTecn();
//                    }
//
//                    if (isCollapsed(Panels.dashBoardSection)) {
//                        collapseAllTecn();
//                        expandTecn();
//                        expandSpecific(Panels.dashBoardSection);
//                    }
//
////                    Panels.openPdf(this.getClass().getResource("/kb/files/pdf/DashBoard Reports.pdf"), var4, ignoreThisString);
//                    Panels.tecnList7.setSelectedIndex(0);
//                    break;
//                case 46:
//                    logger.info("NO RESULTS" + " @ " + new Object() {
//                    }.getClass().getEnclosingMethod().getName());
//                    JOptionPane.showMessageDialog(Panels.finalFrame, "Não existe nenhuma ocorrência de '" + Panels.searchPdfField.getText() + "' na lista", "Erro", 0);
//                    break;
//                default:
//                    var99 = -9999;
//                    throw new IllegalStateException("Unexpected value: " + var4 + " " + finalResultStr);
//
//            }
//            if (var4 != 46 && var99 != -9999) {
//                logger.info("NAO VOU FAZER DOUBLE!");
//                // Panels.openPdf("/pdf/" + finalResultStr + ".pdf", -9000, "Porque nunca fiz isto desta maneira é-me um mistério...");
//            }
    }
}
