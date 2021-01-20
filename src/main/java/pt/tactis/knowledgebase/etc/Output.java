//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package pt.tactis.knowledgebase.etc;

import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Output extends PrintStream {
    public Output(OutputStream out) {
        super(out);
    }

    public void println(String string) {
        
        Class<?> enclosingClass = Runtime.getRuntime().getClass();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy hh:mm:ss a");
        Date today = new Date();
        String result = formatter.format(today);
        super.println(result + "\nINFO: " + string/* + " @ " + new Object(){}.getClass().getName()/* enclosingClass.getEnclosingMethod().getName()*/);
      //  if (enclosingClass != null) {

    //    } //else {
          //  super.println(result + this.getClass() + "\nINFO: " + string);
      //  }

    }
}
