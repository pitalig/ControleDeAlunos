package com.mycompany.controledealunos.modelo;

public class Disciplina {
	private Long id;
	private String nome;
	private int creditos;
	private int vagas;

    public Disciplina() {
    }

    public Disciplina(Long id, String nome, int creditos, int vagas) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
        this.vagas = vagas;
    }

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
}