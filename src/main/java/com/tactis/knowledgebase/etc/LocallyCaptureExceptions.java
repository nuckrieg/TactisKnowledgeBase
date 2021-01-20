/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tactis.knowledgebase.etc;

import io.sentry.Sentry;

/**
 *
 * @author FabioAbreu
 */
public class LocallyCaptureExceptions {
    
    public LocallyCaptureExceptions() {
//        com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);
    }
    
    public static void send(Throwable ex) {
        System.out.println("CAPTURED "+ ex.getClass().getName());
        Sentry.captureException(ex);
        System.out.println("SENT TO SENTRY!");
    }
}
