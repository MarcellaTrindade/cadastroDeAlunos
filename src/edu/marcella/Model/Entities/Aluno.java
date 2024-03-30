package edu.marcella.Model.Entities;

public class Aluno {
    private int idAluno;
    private String nome;
    private String turma;
    private int turno;

    public Aluno(int idAluno, String nome, String turma, int turno) {
        this.idAluno = idAluno;
        this.nome = nome;
        this.turma = turma;
        this.turno = turno;
    }

    @Override
    public String toString(){
        return "DADOS DO ALUNO: \n" +
                "ID: " + this.idAluno + "\n" +
                "Nome: " + this.nome + "\n" +
                "Turma: " + this.turma + "\n" +
                "Turno: " + this.turno + "º \n";
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
