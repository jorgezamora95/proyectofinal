/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProyectoLenguajes;

/**
 *
 * @author zamora
 */
public class Preguntas {
    String[] preguntas = {
        "¿En que fecha se celebra la constitucion de 1917?", 
       "¿Cuando se celebra el natalicio de Benito Juarez?", 
       "¿Cuando es el aniversario de la batalla de Puebla?",
        "¿En que fecha se celebra la consumacion de independencia?",
        "¿Cuando se celebra el dia de la bandera?", 
        "¿Cuando es el aniversario de la expropiacion petrolera?", 
        "¿Cuando es el aniversario de la batalla de Chapultepec?",
        "¿Que dia fue el descubrimiento de America?",
        "¿Cuando es el aniversario de la Revolucion Mexicana?",
        "¿Cuando es el aniversario del movimiento estudiantil?"
    }; 
   
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
}
