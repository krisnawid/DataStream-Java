/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ByteArrayStream;

import java.io.*;
/**
 *
 * @author asus
 */
public class ContohByteArrayInputStream {
    
    public static void main(String[] args) throws IOException {
        byte[] dataByte = {5,2,3,4,5};
        InputStream input = new ByteArrayInputStream(dataByte);
        int data ;
        while ((data = input.read()) !=-1 ) {            
            System.out.println("Data : "+data);
        }
        
    }
    
}
