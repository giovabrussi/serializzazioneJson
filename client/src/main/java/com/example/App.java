package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Il client è partito");

        try {
            Socket s = new Socket("localhost", 3000);

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("Connessione effettuata");

            ObjectMapper objectMapper = new ObjectMapper();
            String stringaJson = in.readLine();
            Classe classe = objectMapper.readValue(stringaJson, Classe.class);

            System.out.println(classe.getNumero() + classe.getSezione());

            s.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("errore durante l'istanza del server");
            System.exit(1);
        }

    }
}
