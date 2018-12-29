/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capa.negocio;


import java.util.Calendar;


/**
 *
 * @author Omar Castillo
 */
public class Fecha {
    public int fechaAtcual(){
        Calendar calendario = Calendar.getInstance();
        int mes = calendario.get(Calendar.MONTH);
        //int dia = calendario.getLeastMaximum(mes+1);
        System.out.println(mes);
        int año=0;
        switch(mes+1){
            case 1:  // Enero
            case 3:  // Marzo
            case 5:  // Mayo
            case 7:  // Julio
            case 8:  // Agosto
            case 10:  // Octubre
            case 12: // Diciembre
                return 31;
            case 4:  // Abril
            case 6:  // Junio
            case 9:  // Septiembre
            case 11: // Noviembre
                return 30;
            case 2:  // Febrero
                if ( ((año%100 == 0) && (año%400 == 0)) ||
                        ((año%100 != 0) && (año%  4 == 0))   )
                    return 29;  // Año Bisiesto
                else
                    return 28;
            default:
                throw new java.lang.IllegalArgumentException("Valor mes incorrecto");
        }
    }
}
