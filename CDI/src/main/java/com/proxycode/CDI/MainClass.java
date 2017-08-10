package com.proxycode.CDI;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class MainClass {
	 public static void main(String[] args) {
	    	Weld weld = new Weld();
	    	WeldContainer container = weld.initialize();
	    	AutoServiceCallerImp  autoServiceCallerImp=container.instance().select(AutoServiceCallerImp.class).get();
	    	autoServiceCallerImp.callAutoService();
	    	weld.shutdown();
		}
}
