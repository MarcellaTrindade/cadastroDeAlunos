package edu.marcella.Application;

import edu.marcella.Model.Entities.Aluno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Aluno> alunos;

    public static void main(String[] args) {
        try {
            alunos = new ArrayList<>();
            menu();
        } catch (InputMismatchException erro) {
            System.out.println("Erro: Insira uma entrada válida do tipo inteiro.");
        }   catch (RuntimeException erro){
            System.out.println("Erro: RuntimeException");
        }
    }
    //função menu
    public static void menu(){
        System.out.println("(1) - Matricular alunos");
        System.out.println("(2) - Exibir alunos matriculados");
        System.out.println("(3) - Desfazer matrícula");
        System.out.println("(4) - Verificar Turma");
        System.out.println("(0) - Sair");
        System.out.print(": ");

        int opcMenu = sc.nextInt();
        sc.nextLine();

        switch (opcMenu) {
            case 0:
                System.exit(0);
                break;
            case 1:
                cadastrarAluno();
                menu();
                break;
            case 2:
                exibirAlunos(alunos);
                menu();
            case 3:
                removerAluno();
                menu();
            case 4:
                buscarTurma();
                menu();
        }
    }

    //função para cadastrar um aluno
    public static void cadastrarAluno(){
        int resp;
        System.out.println("CADASTRO DE ALUNO: \n");

        do {

            System.out.println("Nome do Aluno: ");
            String alunoNome = sc.nextLine();

            System.out.println("Turma do Aluno: ");
            int alunoTurma = sc.nextInt();

            System.out.println("Turno do Aluno: ");
            int alunoTurno = sc.nextInt();
            sc.nextLine();

            alunos.add(new Aluno(alunoNome, alunoTurma, alunoTurno));
            System.out.println(alunos.get(alunos.size() - 1));

            System.out.println("Deseja adicionar mais algum aluno?");
            System.out.println("Digite 0 - Não");
            System.out.println("Digite 1 - Sim");
            resp = sc.nextInt();

            sc.nextLine();
        }while (resp == 1);
    }

    //função para exibir a lista de alunos
    public static void exibirAlunos(List<Aluno> alunos) {
        System.out.println("Alunos Cadastrados");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    //função para buscar um aluno pelo Id

    public static Aluno buscarIdAluno(){
        System.out.println("Informe o Código do Aluno: ");
        int alunoCodId = sc.nextInt();

        for (Aluno aluno: alunos){
            if (alunoCodId == aluno.getIdAluno()){
                return aluno;
            }
        }
        return null;
    }

    //função para remover um aluno
    public static void removerAluno(){
        Aluno alunoEncontrado = buscarIdAluno();
        if (alunoEncontrado != null){
            System.out.println("Aluno Código '"+alunoEncontrado.getIdAluno()+"' Removido");
            alunos.remove(alunoEncontrado);
        }
    }

    public static Aluno buscarTurma(){

        System.out.println("Informe a Turma: ");
        int turmaNum = sc.nextInt();

        System.out.println("Informe o Turno");
        int turnoNum = sc.nextInt();

        for (Aluno aluno: alunos){
            if (turmaNum == aluno.getTurma() && turnoNum == aluno.getTurno()){
                System.out.println(aluno);
            }
        }
        return null;
    }
}
