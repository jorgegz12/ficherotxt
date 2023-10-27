
package ficherotxt;
import java.io.FileWriter;
import java.io.IOException;

public class Ficherotxt {
  
    public static void main(String[] args)throws IOException {
      FileWriter fichero = new FileWriter ("C:/Users/jorge/Documents/NetBeansProjects/ficherotxt/fichero.txt");
      for (int i = 0; i<10;i++){
          fichero.write("Fila Numerojorge"+i+ "\n");
        
    } fichero.close();
    } 
}
