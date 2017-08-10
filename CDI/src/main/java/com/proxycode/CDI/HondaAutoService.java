package com.proxycode.CDI;

import javax.inject.Named;

@Named("hondaAutoService")
public class HondaAutoService implements AutoService{

    public void getService() {
        System.out.println("You chose Honda auto service");
    }
}