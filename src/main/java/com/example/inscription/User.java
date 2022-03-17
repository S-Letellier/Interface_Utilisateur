package com.example.inscription;

public class User {

    private int IdUser;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private Boolean estAdmin;
    private int code; // pas dans la BDD

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public User(int IdUser, String nom , String prenom, String mail, String mdp, Boolean estAdmin){
        this.IdUser = IdUser;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.estAdmin = estAdmin;
    }

}
