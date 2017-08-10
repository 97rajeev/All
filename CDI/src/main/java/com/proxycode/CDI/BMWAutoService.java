package com.proxycode.CDI;

import javax.inject.Named;

@Named("bmwAutoService")
public class BMWAutoService implements AutoService {
	 
	    public void getService() {
	        System.out.println("You chose BMW auto service");
	    }
}
