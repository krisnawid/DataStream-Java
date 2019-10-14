/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileInputStream;

import java.io.*;
/**
 *
 * @author asus
 */
public class contohFileInputStream {
    
    public static void main(String[] args) {
        try {
            FileInputStream data = new FileInputStream("E:\\KRISNA\\JAVA\\Java-Programming\\CV.txt");
            int i = 0;
            while ((i = data.read()) !=-1) {                
                System.out.print((char)i);
                //add some looping for every char data
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
