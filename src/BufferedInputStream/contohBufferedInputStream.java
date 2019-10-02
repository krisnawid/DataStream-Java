/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferedInputStream;

import java.io.*;
/**
 *
 * @author asus
 */
public class contohBufferedInputStream {
    
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("E:\\KRISNA\\JAVA\\Java-Programming\\CV.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            int i = 0;
            
            while ((i = bin.read()) !=-1) {                
                System.out.print((char)i);
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
