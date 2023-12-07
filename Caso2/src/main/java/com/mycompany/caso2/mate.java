/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso2;

/**
 *
 * @author alext
 */
public class mate {
    private String moneda= "dolares";
    private double montoT;
    private int participantes[]={0,0,0,0,0,0};
    private String lugar;
    private int  movimiento;
    private int cantidadParticipantes;
    private int pago; 

    public mate(double montoT, String lugar, int movimiento, int cantidadParticipantes, int pago) {
        this.montoT = montoT;
        this.lugar = lugar;
        this.movimiento = movimiento;
        this.cantidadParticipantes = cantidadParticipantes;
        this.pago = pago;
    }

    
    
    public void participante(int posi){
        
    }
    public double getPromedio(){
        return montoT / cantidadParticipantes;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getMontoT() {
        return montoT;
    }

    public void setMontoT(double montoT) {
        this.montoT = montoT;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public int getCantidadParticipantes() {
        return cantidadParticipantes;
    }

    public void setCantidadParticipantes(int cantidadParticipantes) {
        this.cantidadParticipantes = cantidadParticipantes;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    public double getParticipantes(int posi){
        return participantes[posi];
    }
     public void setParticipantes(int posi){
         participantes[posi]= 1;
    }
    
}
