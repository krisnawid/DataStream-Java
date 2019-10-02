/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman_jaringan;

import java.util.*;
import java.net.*;

public class IPFinder {
    
    public static void main(String[] args) {
        String host;
        Scanner sc = new Scanner(System.in);
        InetAddress address;
        
        System.out.print("Masukkan nama host : ");
        host = sc.next();
        
        try {
            address = InetAddress.getByName(host);
            System.out.println("IP Adress : "+address.toString());
        } catch (UnknownHostException uhe) {
            System.out.println("Host tidak ditemukan "+host);
        }
        
    }
    
}
