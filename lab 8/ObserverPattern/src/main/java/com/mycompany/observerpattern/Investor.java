/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.observerpattern;

/**
 *
 * @author Dell
 */
public interface Investor {
    String getName();
    Strategy adaptStrategy();
    void update(String stockSymbol, double priceChange);
}
