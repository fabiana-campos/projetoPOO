package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class SistemaEscolar {

    private Scanner scanner;
    private List<Disciplina> disciplinas;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public SistemaEscolar() {
        this.scanner = new Scanner(System.in);
        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    private void removerElemento(List<?> lista, Object elemento) {
        if (lista.contains(elemento)) {
            lista.remove(elemento);
        } else {
            System.out.println("O elemento não existe na lista.");
        }
    }

    public void menu() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("O que você deseja fazer?");
            System.out.println("1. Cadastrar uma disciplina");
            System.out.println("2. Cadastrar um professor");
            System.out.println("3. Cadastrar um aluno");
            System.out.println("4. Remover uma disciplina");
            System.out.println("5. Remover um professor");
            System.out.println("6. Remover um aluno");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarDisciplina();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    cadastrarAluno();
                    break;
                case 4:
                    removerDisciplina();
                    break;
                case 5:
                    removerProfessor();
                    break;
                case 6:
                    removerAluno();
                    break;
            }
        }
    }

    private void cadastrarDisciplina() {
        System.out.println("Digite o nome da disciplina:");
        String nome = scanner.nextLine();
        disciplinas.add(new Disciplina(nome));
    }

    private void cadastrarProfessor() {
        System.out.println("Digite o nome do professor:");
        String nome = scanner.nextLine();
        professores.add(new Professor(nome));
    }

    public void cadastrarAluno() {
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        alunos.add(new Aluno(nome));
    }

    private void removerDisciplina() {
        System.out.println("Digite o nome da disciplina a ser removida:");
        String nome = scanner.nextLine();
        removerElemento(disciplinas, nome);
    }

    private void removerProfessor() {
        System.out.println("Digite o nome do professor a ser removido:");
        String nome = scanner.nextLine();
        removerElemento(professores, nome);
    }

    private void removerAluno() {
        System.out.println("Digite o nome do aluno a ser removido:");
        String nome = scanner.nextLine();
        removerElemento(alunos, nome);
    }

    public static void main(String[] args) {
        SistemaEscolar sistemaEscolar = new SistemaEscolar();
        sistemaEscolar.menu();
    }
}