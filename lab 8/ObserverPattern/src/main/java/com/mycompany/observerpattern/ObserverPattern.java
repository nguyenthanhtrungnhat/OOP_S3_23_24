/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.observerpattern;

/**
 *
 * @author Dell
 */
public class ObserverPattern {

    public static void main(String[] args) {
        Stock appleStock = new ConcreteStock("APPLE", 100);
        Stock dellStock = new ConcreteStock("DELL", 100);

        Investor tomInvestor = new simpleInvestor("Tom");
        Investor bobInvestor = new simpleInvestor("Bob");
        appleStock.addObserver(bobInvestor);
        appleStock.addObserver(tomInvestor);
        dellStock.addObserver(tomInvestor);

        appleStock.noitifyInvestors(100);
        appleStock.noitifyInvestors(40);
        appleStock.noitifyInvestors(10);
        appleStock.noitifyInvestors(5);
        dellStock.noitifyInvestors(300);
          dellStock.noitifyInvestors(200);
    }
}
