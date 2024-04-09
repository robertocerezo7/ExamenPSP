/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenrobertocerezo;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/**
 *
 * @author DAM2B_03
 */
public class ObjetoCompartido {

    HashMap<String, Socket> general;
    TreeMap<String, Integer> tm;

    public ObjetoCompartido() {
        this.general = new HashMap<>();
        this.tm = new TreeMap<>();
    }
    
    public synchronized void altaUsuario(String id, Socket s) {
        this.general.put(id, s);

    }

    public synchronized void bajaUsuario(String id) {
        this.general.remove(id);
    }
    
    public synchronized void votos(String a){
        if (tm.containsKey(a)) {
            tm.replace(a, tm.get(a) + 1);
        }else{
            tm.put(a, 1);
        }
        System.out.println("====================");
        for (String b : tm.keySet()) {
            System.out.println(b + ": " + tm.get(b));
        }
        System.out.println("====================");
    }
}
