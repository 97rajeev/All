package com.proxycode.CDI;

import javax.inject.Inject;
import javax.inject.Named;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class AutoServiceCallerImp implements AutoServiceCaller{

    @Inject
    @Named("bmwAutoService")
    private AutoService bmwAutoService;

    @Inject
    @Named("hondaAutoService")
    private AutoService hondaAutoService;

    @Inject
    @Named("fordAutoService")
    private AutoService fordAutoService;

    public void callAutoService() {
        // get bmw's auto service
        bmwAutoService.getService();

        // get ford's auto service
        fordAutoService.getService();

        // get honda's auto service
        hondaAutoService.getService();
    }
    
   
}