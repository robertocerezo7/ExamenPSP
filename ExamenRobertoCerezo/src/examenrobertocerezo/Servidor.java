/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrobertocerezo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author DAM2B_03
 */
public class Servidor {
        public static void main(String[] args) throws IOException {
        
	ServerSocket sc;
        ObjetoCompartido oc;
        Socket s;
        int contador = 0;
        HiloServidor hs;
        
            sc = new ServerSocket(6500);
            oc = new ObjetoCompartido();
            do{
                contador++;
                s = sc.accept();
                hs = new HiloServidor(oc,s,contador);
                hs.start();
                
            }while(true);
        
        
    }
}
