package com.example;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3000);
            Socket s = server.accept();

            System.out.println("Un client si è collegato");

            Studente s1 = new Studente("mario", "rossi", "01/05/2005");
            Studente s2 = new Studente("piero", "verdi", "03/10/2006");
            Studente s3 = new Studente("luca", "bianchi", "21/02/2003");
            Studente s4 = new Studente("alberto", "bianchi", "08/04/2000");
            Classe classe = new Classe(5, "CIA", "12-2W");
            classe.addStudente(s1);
            classe.addStudente(s2);
            classe.addStudente(s3);
            classe.addStudente(s4);

            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            ObjectMapper objectMapper = new ObjectMapper();
            String string = objectMapper.writeValueAsString(classe);

            out.writeBytes(string + "\n");

            s.close();
            server.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("errore durante l'istanza del server");
            System.exit(1);
        }
    }
}
