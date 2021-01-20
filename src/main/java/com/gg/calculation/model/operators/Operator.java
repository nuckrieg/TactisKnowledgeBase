package com.gg.calculation.model.operators;

import com.gg.calculation.model.CalculationObject;
import io.sentry.Sentry;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Operator implements CalculationObject {
	// level this operator is embedded in another calculation
	protected int embeddedLevel;

	public abstract String getSymbol();

	public abstract String getName();

	public abstract Long getIdentifier();

	protected boolean ignoreNulls = true;

	public String toString() {
		return getSymbol();
	}

	public Operator clone() {
		try {
			return (Operator)super.clone();
		} catch (CloneNotSupportedException ex) {
                    try {
                        if (InetAddress.getLocalHost().getHostName().equals("DESKTOP-FABREU")) {
                            ex.printStackTrace();
                        } else {
                            com.tactis.knowledgebase.etc.LocallyCaptureExceptions.send(ex);}
                    } catch (UnknownHostException exe) {
                        Logger.getLogger(Operator.class.getName()).log(Level.SEVERE, null, exe);
                    }
			ex.printStackTrace();
			return null;
		}
	}

}
