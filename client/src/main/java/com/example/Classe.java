package com.example;

import java.util.ArrayList;

public class Classe {

    private int numero;
    private String sezione;
    private String aula;
    ArrayList<Studente> studenti = new ArrayList<Studente>();

    public Classe(int numero, String sezione, String aula) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
    }

    public Classe(){
        
    }

    public boolean addStudente(Studente s){
        return studenti.add(s);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Studente> getStudenti() {
        return studenti;
    }

    public void setStudenti(ArrayList<Studente> studenti) {
        this.studenti = studenti;
    }

    
    
    
    

}
