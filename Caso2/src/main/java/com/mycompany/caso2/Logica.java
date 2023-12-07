/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caso2;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Logica {
    int transaccionesExitentes= 8;
    
    
    
    
    mate transacciones[]= new mate[80000];
    // agrega los datos ya preestableciodos en el ejemplo
    
    public void loadTransacciones(){
        // crea las cosas que estan en el ejemplo
        transacciones[0]=new mate(120,"desayuno coffeePrime",1, 6, guillermo);
        transacciones[0].setParticipantes(tavo);
        transacciones[0].setParticipantes(david);
        transacciones[0].setParticipantes(josua);
        transacciones[0].setParticipantes(greivin);
        transacciones[0].setParticipantes(guillermo);
        transacciones[0].setParticipantes(andres);
        for (int i = 0; i < 6; i++) {
            if (transacciones[0].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[0].getPromedio());
            }
            
        }
        transacciones[1]=new mate(200,"Almuerzo Pig Factory",2, 5, guillermo);
        transacciones[1].setParticipantes(guillermo);
        transacciones[1].setParticipantes(josua);
        transacciones[1].setParticipantes(tavo);
        transacciones[1].setParticipantes(greivin);
        transacciones[1].setParticipantes(andres);
        
        
        for (int i = 0; i < 6; i++) {
            if (transacciones[1].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[1].getPromedio());
            }
            
        }
        
        
        transacciones[2]=new mate(50,"Cena FastFood",3, 2, david);
        transacciones[2].setParticipantes(josua);
        transacciones[2].setParticipantes(david);
        
        for (int i = 0; i < 6; i++) {
            if (transacciones[2].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[2].getPromedio());
            }
            
        }
        
        transacciones[3]=new mate(100,"Pizza Hut",4, 4, tavo);
        transacciones[3].setParticipantes(guillermo);
        transacciones[3].setParticipantes(andres);
        transacciones[3].setParticipantes(greivin);
        transacciones[3].setParticipantes(tavo);
        
        for (int i = 0; i < 6; i++) {
            if (transacciones[3].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[3].getPromedio());
            }
            
        }
        
        transacciones[4]=new mate(150,"Quicksilver store",5, 1, greivin);
        transacciones[4].setParticipantes(guillermo);
        
        for (int i = 0; i < 6; i++) {
            if (transacciones[4].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[4].getPromedio());
            }
            
        }
           
        transacciones[5]=new mate(200,"Apple store",6, 1, josua);
        transacciones[5].setParticipantes(andres);
        
        for (int i = 0; i < 6; i++) {
            if (transacciones[5].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[5].getPromedio());
            }
            
        }
        
        transacciones[6]=new mate(150,"Desayuno chillis",7, 6, greivin);
        transacciones[6].setParticipantes(guillermo);
        transacciones[6].setParticipantes(andres);
        transacciones[6].setParticipantes(tavo);
        transacciones[6].setParticipantes(david);
        transacciones[6].setParticipantes(greivin);
        transacciones[6].setParticipantes(josua);
        for (int i = 0; i < 6; i++) {
            if (transacciones[6].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[6].getPromedio());
            }
            
        }
        
        transacciones[7]=new mate(180,"Almuerzo hooters",8, 6, tavo);
        transacciones[7].setParticipantes(guillermo);
        transacciones[7].setParticipantes(andres);
        transacciones[7].setParticipantes(tavo);
        transacciones[7].setParticipantes(david);
        transacciones[7].setParticipantes(greivin);
        transacciones[7].setParticipantes(josua);
        for (int i = 0; i < 6; i++) {
            if (transacciones[7].getPago()!= amigos[i].getFN() ){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[7].getPromedio());
            }
            
        }
    
    }
    Grupo amigos[]= new Grupo[6];
    int josua=2; 
    int greivin=3; 
    int guillermo=4;
    int andres=5; 
    int tavo=0; 
    int david=1;
    
    public void loadAmigos(){
        // otorga posiciones en el arreglo
        amigos[guillermo] = new Grupo(4);
        amigos[tavo] = new Grupo(0);
        amigos[david] = new Grupo(1);
        amigos[greivin] = new Grupo(3);
        amigos[josua] = new Grupo(2);
        amigos[andres] = new Grupo(5);
    }
    public void crearTransferencia(){
        
        
        String l = JOptionPane.showInputDialog("Introduzca el lugar");
        double h = Double.parseDouble(JOptionPane.showInputDialog("Cual es el total de la cuenta? (Dolares)"));
        int p = Integer.parseInt(JOptionPane.showInputDialog("Quien paga?"));
        int cP = Integer.parseInt(JOptionPane.showInputDialog("entre cuantos se divide la cuenta 1-6"));
        
        transacciones[transaccionesExitentes] = new mate(h, l, transaccionesExitentes+1, cP, p);
        
        
        for (int i = 0; i < cP; i++) {
            transacciones[transaccionesExitentes].setParticipantes(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el participante numero "+(i+1)+"\n1. Guillermo\n2. Tavo \n3. David \n4. Greivin \n5. Joshua \n6.Andres"))-1);
        }
        transaccionesExitentes++;
        for (int i = 0; i < 6; i++) {
            if (transacciones[transaccionesExitentes].getPago()!= amigos[i].getFN() && transacciones[transaccionesExitentes].getParticipantes(i)==1){
                amigos[i].setD2F(i, amigos[i].getD2F(i)+transacciones[transaccionesExitentes].getPromedio());
            }
            
        }
        transaccionesExitentes++;
        
    }
    public void checkDebts(int x){
        x--;
        String toShow ="El amigo tiene las siguientes deudas\n";
        double tempDouble;
        
        if(x != 4){
            //deber a guillermo
            tempDouble = amigos[x].getD2F(4)-amigos[4].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble;
            
        }
        if(x != 1){
            //david
            tempDouble = amigos[x].getD2F(1)-amigos[1].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble;
        
        }
        if(x != 2){
            //josua
            tempDouble = amigos[x].getD2F(2)-amigos[2].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble;
        
        }
        if(x != 0){
            //tavo
            tempDouble = amigos[x].getD2F(0)-amigos[0].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble;
        
        }
        if(x != 5){
            //andres
            tempDouble = amigos[x].getD2F(5)-amigos[5].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble;
        
        }
        if(x != 3){
            //greivin
            tempDouble = amigos[x].getD2F(3)-amigos[3].getD2F(x);
            toShow = toShow + "\n le debe a Guillermo: " + tempDouble;
        
        }
        
        JOptionPane.showMessageDialog(null, toShow);
    
    
}
}
