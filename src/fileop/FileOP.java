/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author sooryagangarajk
 */
public class FileOP {///// S G K /////

    /**
     * @param args the command line arguments
     */
    static String path = "/Users/sooryagangarajk/NetBeansProjects/sgApp/src/sgapp/source.txt";
    public static void main(String[] args) {
         Frame np=new Frame();
         np.setVisible(true);
         np.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        // TODO code application logic here
    }
    
     public static void writeFile(String str) {
        try {
            
            PrintWriter writer = new PrintWriter(path, "UTF-8");
            writer.print(str);
            
            writer.close();
        } catch (IOException e) {
            // do something
        }
    }
     public static void setPath(String str){
         path=str;
     }
      public static String getFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(path));
        String str = "";///// S G K /////
        while (sc.hasNextLine()) {
            String str1 = sc.nextLine();
            str += str1 + "\n";
        }
        return str;

    }

    
}
