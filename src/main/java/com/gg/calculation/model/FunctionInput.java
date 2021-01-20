package com.gg.calculation.model;

import io.sentry.Sentry;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FunctionInput implements CalculationObject {
	private String name;
	private CalculationObject value;

	public FunctionInput(String name, CalculationObject co) {
		this.name = name;
		value = co;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CalculationObject getValue() {
		return value;
	}

	public void setValue(CalculationObject value) {
		this.value = value;
	}

	public String toString() {
		return name;
	}

	public Object clone() {
		try {
			FunctionInput fi = (FunctionInput) super.clone();
			fi.setValue((CalculationObject) value.clone());
			return fi;
		} catch (CloneNotSupportedException ex) {
                    try {
                        // TODO Auto-generated catch block
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);}
                    } catch (UnknownHostException ex1) {
                        Logger.getLogger(FunctionInput.class.getName()).log(Level.SEVERE, null, ex1);
                    }
			ex.printStackTrace();
			return null;
		}
	}
}
