/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uniensinojavaswing.murilo.calculadoramvc;

import com.uniensinojavaswing.murilo.calculadoramvc.visao.Tela;

/**
 *
 * @author muril
 */
public class CalculadoraMVC {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
}
