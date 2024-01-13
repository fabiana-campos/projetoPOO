package projeto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Disciplina {

    private String nome;
    private Professor professor;
    private List<Aluno> alunos;
    private Map<Aluno, Nota> notas;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.notas = new HashMap<>();
    }

    public Disciplina(String nome2) {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public void addNota(Aluno aluno, Nota nota) {
        this.notas.put(aluno, nota);
    }

    public Nota getNota(Aluno aluno) {
        return this.notas.get(aluno);
    }
}