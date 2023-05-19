/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.utils;

import factory.CookieFactory;

/**
 *
 * @author AnataArisa
 */
public class CookieCreator {
    private static CookieCreator instance = null;
    private CookieFactory cf = new CookieFactory();
    
    public static CookieCreator Instance(){
        if(instance == null){
            instance = new CookieCreator();
        }
        return instance;
    }
}
