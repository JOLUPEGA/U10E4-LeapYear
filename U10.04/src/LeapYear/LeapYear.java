/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeapYear;

import Year.Year;

/**
 *
 * @author Jose Luis Perez
 */
public class LeapYear extends Year{
    private final int cantidadDias;

    
    public LeapYear(){
        this.cantidadDias = 366;
    }
    
    public int daysElapeds(MesEnum mes, int dia){
        switch(mes.getNumeroEnum()){
            case 2:
                  dia += 31;
                  break;
            case 3:
                  dia += 60;
                  break;
            case 4:
                  dia += 91;
                  break;
            case 5:
                  dia += 31;
                  break;
            case 6:
                  dia += 152;
                  break;
            case 7:
                  dia += 182;
                  break;
            case 8:
                  dia += 213;
                  break;
            case 9:
                  dia += 244;
                  break;
            case 10:
                  dia += 274;
                  break;
            case 11:
                  dia += 305;
                  break;
            case 12:
                  dia += 335;
                  break;
        }
        return dia;
    }
    
}