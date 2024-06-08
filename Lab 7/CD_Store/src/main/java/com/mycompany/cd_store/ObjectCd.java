/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cd_store;

/**
 *
 * @author Dell
 */
public class ObjectCd {

    private String title;
    private String colletion;
    private String type;
    private String price;

    public ObjectCd() {
    }

    public ObjectCd(String title, String colletion, String type, String price) {
        this.title = title;
        this.colletion = colletion;
        this.type = type;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getColletion() {
        return colletion;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColletion(String colletion) {
        this.colletion = colletion;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
