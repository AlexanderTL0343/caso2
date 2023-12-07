/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caso2;

import javax.swing.JOptionPane;

/**
 *
 * @author alext
 */
public class Caso2 {

    public static void main(String[] args) {
        Logica lojica = new Logica();
        
        lojica.loadAmigos();
        lojica.loadTransacciones();
        OUTER:
        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("1.Nueva transacciÃ³n \n2.Ver transacciones \n3.Salir"));
            switch (menu) {
                case 1:
                    lojica.crearTransferencia();
                    break;
                case 2:
                    lojica.checkDebts(Integer.parseInt(JOptionPane.showInputDialog("Introduzca el amigo a comprobar las deudas\n1. Guillermo\n2. Tavo \n3. David \n4. Greivin \n5. Joshua \n6.Andres")));
                    break;
                default:
                    break OUTER;
            
            }}}}

    
