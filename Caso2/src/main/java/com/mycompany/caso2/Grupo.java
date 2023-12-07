/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso2;

/**
 *
 * @author alext
 */
public class Grupo {
    private int amigo;
    private double amigos[]= {0,0,0,0,0,0};
    
    
    public void setD2F(int posi, double montoT){
        this.amigos[posi] = montoT;
    }
    
    public double getD2F(int pos){
        return amigos[pos];
    }
    
    public int getFN(){
        return amigo;
    }
    
    public Grupo(int amigo){
        this.amigo= amigo;
    
    }
            
}
