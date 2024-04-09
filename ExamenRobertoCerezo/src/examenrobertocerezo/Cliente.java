/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrobertocerezo;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author DAM2B_03
 */
public class Cliente {
        public static void main(String[] args) {
        Socket s = null;
        Scanner sc = new Scanner(System.in);
        String msg = "";
        DataOutputStream dos = null;
        try {
            s = new Socket("localhost", 6500);
            dos = new DataOutputStream(s.getOutputStream());
           
            do {
                msg = sc.nextLine();
               dos.writeUTF(msg);
            } while (!(msg.equals("*")));
        } catch (Exception e) {
            System.out.println("Error en la comunicación");
        } finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException ex) {
                    System.out.println("Error cerrando DataOutputStream");
                }
            }
            if (s != null) {
                try {
                    s.close();
                } catch (IOException ex) {
                    System.out.println("Error cerrando el Socket");
                }
            }
        }

    }
}
