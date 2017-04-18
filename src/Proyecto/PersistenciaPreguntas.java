/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Proyecto;
    import java.io.*;
public class PersistenciaPreguntas {

 
    /*
      Primer metodo de tipo accion guardar
    */
    public void guardar(Datos d)throws Exception{
        File file=new File("base-preguntas");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(d);
    }
    

}
