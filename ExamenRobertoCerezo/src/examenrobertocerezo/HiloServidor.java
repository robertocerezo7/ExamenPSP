/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrobertocerezo;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author DAM2B_03
 */
public class HiloServidor extends Thread {

    ObjetoCompartido oc;
    Socket s;
    String id;
    String nombre;

    public HiloServidor(ObjetoCompartido oc, Socket s, int contador) {
        this.oc = oc;
        this.s = s;
        this.id = Integer.toString(contador);
    }
    
        public void run() {

        DataInputStream dis = null;


        try {
            dis = new DataInputStream(s.getInputStream());          
            do {
                nombre = dis.readUTF();
                if (!nombre.equals("*")) {
                    oc.votos(nombre);
                }
            } while (true);
        } catch (Exception e) {
            System.out.println("Desconexion del cliente " + this.id);
        } finally {
            oc.bajaUsuario(this.id);
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException ex) {
                    System.out.println("Error cerrando el DataInputStream del cliente" + this.id);
                }
                try {
                    s.close();
                } catch (IOException ex) {
                    System.out.println("Error cerrando el socket del cliente " + this.id);
                }
            }

        }
    }
}
