package com.proxycode.CDI;

import javax.inject.Named;

@Named("fordAutoService")
public class Ford implements AutoService{

    public void getService() {
        System.out.println("You chose Ford auto service");
    }
}