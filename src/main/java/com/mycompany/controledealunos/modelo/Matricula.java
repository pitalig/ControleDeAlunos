package com.mycompany.controledealunos.modelo;

public class Matricula {
	private Long id;
	private Long alunoId;
	private Long discId;

    public Matricula() {
    }

    public Matricula(Long id, Long alunoId, Long discId) {
        this.id = id;
        this.alunoId = alunoId;
        this.discId = discId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Long alunoId) {
        this.alunoId = alunoId;
    }

    public Long getDiscId() {
        return discId;
    }

    public void setDiscId(Long discId) {
        this.discId = discId;
    }
}