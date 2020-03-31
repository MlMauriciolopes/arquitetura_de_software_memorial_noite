/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Edson Melo de Souza
 * @date 30/03/2020 POJO -> Plain Old Java Objects (Objetos Clássicos do Java)
 */
public class Aluno implements Serializable {

    // criando nossos atributos para o objeto
    private int id;
    private int ra;
    private String nome;
    private String curso;

    /**
     * Método construtor da classe
     */
    public Aluno() {
    }

    /**
     * Métodos getters & setters
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
