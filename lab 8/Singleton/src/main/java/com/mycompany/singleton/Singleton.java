/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.singleton;

/**
 *
 * @author Dell
 */
public class Singleton {

    public static void main(String[] args) {
        CompanyInfo c = CompanyInfo.getInstance();
        c.displayInfo();
        c.setCompanyName("EIU");
        c.setAddress("NKKN");
        c.setPhoneNumber("3455233522");
        c.displayInfo();
    }
}
