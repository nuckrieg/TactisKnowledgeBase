package com.gg.calculation.model;

import io.sentry.Sentry;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public abstract class EmptyNode implements CalculationObject {

	private String symbol;

	public EmptyNode(String stringRep) {
		this.symbol = stringRep;
	}

	public String toString() {
		return symbol;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
                    try {
                        // TODO Auto-generated catch block
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            pt.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);}
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(EmptyNode.class.getName()).log(Level.SEVERE, null, ex1);
                    }
			ex.printStackTrace();
			return null;
		}
	}
}
