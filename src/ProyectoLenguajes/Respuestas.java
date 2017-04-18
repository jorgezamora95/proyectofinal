/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoLenguajes;

import java.util.StringTokenizer;
public class Respuestas {
    
    String[] respuestas = {
  "5 de Febrero","21 de Marzo","5 de Mayo",
  "16 de Septiembre","24 de Febrero","18 de Marzo",
  "13 de Septiembre","12 de Octubre","20 de Noviembre",
  "2 de Octubre"
    };
  
  String[] radioR = {
        "9 de Febrero,5 de Febrero,5 de Enero,6 de Mayo",
        "14 de Febrero,20 de Marzo,21 de Marzo,15 de Abril",
        "5 de Mayo,5 de Marzo,6 de Mayo,6 de Agosto",
        "13 de Septiembre,10 de Octubre,20 de Noviembre,16 de Septiembre", 
        "24 de Enero,15 de Febrero,24 de Febrero,18 de Marzo",
        "15 de Marzo,18 de Marzo,12 de Julio,18 de Mayo",
        "16 de Septiembre,12 de Agosto,13 de Septiembre,25 de Octubre",
        "12 de Octubre,2 de Octubre,12 de Diciembre,24 de Febrero",
        "20 de Mayo,21 de Noviembre,20 de Noviembre,15 de Septiembre",
        "2 de Octubre,4 de Octubre,2 de Noviembre,15 de Julio"
    };
  
  public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
  
   public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[15];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); 
            i++;
        }
        
        return a;
   }
   
   public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
}
