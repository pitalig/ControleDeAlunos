package com.mycompany.controledealunos.modelo;

public class Matricula {
	private Long id;
	private Aluno aluno = new Aluno();
	private Disciplina disciplina = new Disciplina();

    public Matricula() {
    }

    public Matricula(Long id, Long alunoId, Long discId) {
        this.id = id;
        this.aluno.setId(alunoId);
        this.disciplina.setId(discId);
    }

    public Matricula(Long alunoId, Long discId) {
        this.aluno.setId(alunoId);
        this.disciplina.setId(discId);
    }

    public Matricula(Long id, 
                     Long alunoId, 
                     String nomeAluno,
                     String email,
                     String endereco,
                     Long discId,
                     String nomeDisc, 
                     int creditos, 
                     int vagas) {
        this.id = id;
        this.aluno.setId(alunoId);
        this.aluno.setNome(nomeAluno);
        this.aluno.setEmail(email);
        this.aluno.setEndereco(endereco);
        this.disciplina.setId(discId);
        this.disciplina.setNome(nomeDisc);
        this.disciplina.setCreditos(creditos);
        this.disciplina.setVagas(vagas);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Long getAlunoId() {
        return aluno.getId();
    }

    public void setAlunoId(Long alunoId) {
        this.aluno.setId(alunoId);
    }

    public Disciplina getDisc() {
        return disciplina;
    }

    public Long getDiscId() {
        return disciplina.getId();
    }

    public void setDiscId(Long discId) {
        this.disciplina.setId(discId);
    }
}