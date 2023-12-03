package Curso;
import java.util.ArrayList;

import Disciplina.Disciplina;

class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas.toArray(new Disciplina[disciplinas.size()]);
    }
}