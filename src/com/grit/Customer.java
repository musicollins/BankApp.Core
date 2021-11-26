package com.grit;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    //State
    private int personnummer;
    private String personnamn;
    private List<Account> accounts;
    //Constructor
    public Customer (String pnm, int pnmm){
        personnamn = pnm;
        personnummer = pnmm;
        accounts = new ArrayList<>();
    }
    //Behaviour

}
