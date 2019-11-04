/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos_ad05;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author dam2
 */
public class Archivos_AD05 {
    
    public static void mostrarDirFile () throws IOException {     
        
        File direcotrio = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        
        String[] ficheros = direcotrio.list();
        
        for(int x=0;x<ficheros.length;x++){
            
            System.out.println(ficheros[x]);
            
        }
        
        
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Archivos_AD05.mostrarDirFile();
    }
    
}
