package projeto;

import java.util.ArrayList;

public class Professor {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
     
    public Professor (String nome){
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }
    public void removerDisciplina(Disciplina disciplina) {
        this.disciplinas.remove(disciplina);
    }
}
