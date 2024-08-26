/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uniensinojavaswing.murilo.calculadoramvc.controle;

import com.uniensinojavaswing.murilo.calculadoramvc.enums.EnumOperacao;

/**
 *
 * @author muril
 */
public class CalculadoraControler {
    private Double total;
    
    
    public CalculadoraControler(){
        total = 0.0;
    }
    
    
    public Double realizarOperacao(EnumOperacao operacao, Double valor )
    {
        switch (operacao) {
            case SOMA:
                total += valor;
                break;
            case SUBTRACAO:
                total -= valor;
                break;
            case MULTIPLICACAO:
                total *= valor;
                break;
            case DIVISAO:
                total /= valor;
                break;
            default:
                break;
        }
        
        return total;
    }

    public Double getTotal() {
        return total;
    }
    
    public void setTotal(Double total){
        this.total = total;
    }
    
    public void zerar(){
        total = 0.0;
    }
    
}
