package com.gg.calculation.model;

import io.sentry.Sentry;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ValueNode implements CalculationObject {
	private Double value;

	public ValueNode(Double i) {
		value = i;
	}

	public String toString() {
		return value.toString();
	}

	public Double getValue() {
		return value;
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
                        Logger.getLogger(ValueNode.class.getName()).log(Level.SEVERE, null, ex1);
                    }
			ex.printStackTrace();
			return null;
		}
	}
}
