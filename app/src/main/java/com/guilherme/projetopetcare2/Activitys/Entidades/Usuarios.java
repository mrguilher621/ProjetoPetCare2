package com.guilherme.projetopetcare2.Activitys.Entidades;

import com.google.firebase.database.DatabaseReference;
import com.guilherme.projetopetcare2.Activitys.DAO.ConfigFireBase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guilh on 01/10/2017.
 */

public class Usuarios {

    private String Categoria;
    private String CEP;
    private String Id;
    private String Email;
    private String Senha;
    private String Nome;
    private String Sobrenome;
    private String CPF;
    private String NomePet;
    private String Endereço;

    public Usuarios() {
    }

    public void salvar(){
        DatabaseReference referenciaFirebase = ConfigFireBase.getFirebase();
        referenciaFirebase.child("usuario").child(String.valueOf(getId())).setValue(this);
    }

    public Map<String,Object> toMap(){
        HashMap<String,Object> hashMapUsuario = new HashMap<>();
        hashMapUsuario.put("id",getId());
        hashMapUsuario.put("email",getEmail());
        hashMapUsuario.put("senha",getSenha());

        return hashMapUsuario;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String nomePet) {
        NomePet = nomePet;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }
}
