package Professor;

import Pessoa.Pessoa;

class Professor extends Pessoa {
    private String departamento;

    public Professor(String nome, int idade, String departamento) {
        super(nome, idade);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Professor: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Departamento: " + getDepartamento());
    }
}