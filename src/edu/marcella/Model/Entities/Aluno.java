package edu.marcella.Model.Entities;

public class Aluno {
    private static int count = 0;
    private int idAluno;
    private String nome;
    private int turma;
    private int turno;

    public Aluno(String nome, int turma, int turno) {
        setIdAluno(++count);
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

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
