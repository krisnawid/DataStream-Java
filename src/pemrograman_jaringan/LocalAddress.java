/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman_jaringan;

import java.util.*;
import java.net.*;
        
public class LocalAddress {
    
    public static void main(String[] args) {
        try {
            InetAddress address;
            address = InetAddress.getLocalHost();
            
            System.out.println(address);
        } catch (Exception e) {
            System.out.println("Local tidak ditemukan");
        }
    }
    
}
