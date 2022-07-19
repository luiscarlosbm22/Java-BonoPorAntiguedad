/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbm.bonoporantiguedad;

import java.util.Scanner;

/**
 *
 * @author MenDark
 */
public class LBMBonoPorAntiguedad {

      Scanner sc = new Scanner(System.in);
   
   //double antiguedad = 200;
   
   
    private double bonoMensual = 0;
    private double bono_antiguedad =0;
    private double bono_sueldo =0;
    
    
    
    public void PrimerSuelo (double sueldo, double antiguedad){
       
        if(antiguedad > 2 && antiguedad < 5){
        bono_antiguedad = sueldo * 0.2;
        }
    }
    public void SegundoSuelo (double sueldo, double antiguedad){
        if(antiguedad >= 5){
        bono_antiguedad = sueldo * 0.3;
        }
    }
    public void TercerSuelo (double sueldo, double antiguedad){
        if(sueldo <= 1000){
        bono_sueldo = sueldo * 0.25;
        }
    }
    public void CuartoSuelo (double sueldo){
        if(sueldo < 1000 && sueldo <=3500){
        bono_sueldo = sueldo * 0.15;
        }
    }
    public void QuintoSuelo (double sueldo){
        if(sueldo >3500){
        bono_sueldo = sueldo * 0.1;
        }
    }
    public void Ultimo (){
        if(bono_antiguedad > bono_sueldo){
        bonoMensual = bono_antiguedad;
        }else{
            bonoMensual = bono_sueldo;
        }
    }
    public double obtenerBonoMensual(){
        return bonoMensual;
        
    }
    public double obtenerBonoporSueldo(){
        return bono_sueldo;
    }
    public double obtenerBonoporAntiguedad(){
        return bono_antiguedad;
    }
    public static void main(String[] args) {
        LBMBonoPorAntiguedad mi = new LBMBonoPorAntiguedad();
        
    System.out.print("Bono Mensual: " + (mi.obtenerBonoMensual()));
    System.out.print("Bono por Antiguedad: " + (mi.obtenerBonoporAntiguedad()));
    System.out.print("Bono Sueldo: " + (mi.obtenerBonoporSueldo()));
    }
    
}
