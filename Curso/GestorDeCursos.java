package Curso;

import java.util.ArrayList;
import java.util.Scanner;

import Disciplina.Disciplina;

public class GestorDeCursos {
  private static ArrayList<Curso> cursos = new ArrayList<>();
  private static ArrayList<Disciplina> disciplinas = new ArrayList<>();
  private Scanner scanner = new Scanner(System.in);

  public void gerenciarCursos() {

    int opcao;
    do {
      System.out.println("\n");
      System.out.println("===================================");
      System.out.println("          GERENCIAR CURSOS         ");
      System.out.println("===================================");
      System.out.println(" 1 - Adicionar Curso ");
      System.out.println(" 2 - Listar Cursos ");
      System.out.println(" 3 - Remover Curso ");
      System.out.println(" 4 - Voltar ao Menu Principal ");
      System.out.println("===================================");
      System.out.print("Escolha uma opção (1 - 4): ");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          adicionarCurso();
          break;
        case 2:
          listarCursos();
          break;
        case 3:
          removerCurso();
          break;
      }
    } while (opcao != 4);
  }

  private void adicionarCurso() {
    System.out.println("\n");
    System.out.print("Nome do curso: ");
    String nome = scanner.nextLine();

    Curso curso = new Curso(nome);
    cursos.add(curso);

    System.out.println("Deseja adicionar disciplinas ao curso? (S/N)");
    char opcao = scanner.next().charAt(0);

    if (opcao == 'S' || opcao == 's') {
      adicionarDisciplinasAoCurso(curso);
    }

    System.out.println("Curso adicionado com sucesso!");
    System.out.println("-----------------------");
  }

  private void adicionarDisciplinasAoCurso(Curso curso) {
    int opcao;
    do {

      System.out.println("DISCIPLINAS DISPONÍVEIS PARA ADICIONAR AO CURSO:");
      for (int i = 0; i < disciplinas.size(); i++) {
        System.out.println((i + 1) + ". " + disciplinas.get(i).getNome());
      }
      System.out.println("-----------------------");
      System.out.print("Escolha o número da disciplina a ser adicionada ao curso (0 para sair): ");
      opcao = scanner.nextInt();

      if (opcao > 0 && opcao <= disciplinas.size()) {
        curso.adicionarDisciplina(disciplinas.get(opcao - 1));
        System.out.println("Disciplina adicionada ao curso.");
        System.out.println("-----------------------");
      } else if (opcao != 0) {
        System.out.println("Opção inválida. Tente novamente.");
      }
    } while (opcao != 0);
  }

  private void listarCursos() {
    System.out.println("LISTA DE CURSOS");
    for (Curso curso : cursos) {
      System.out.println("Curso: " + curso.getNome());

      System.out.println("Disciplinas do Curso:");
      for (Disciplina disciplina : curso.getDisciplinas()) {
        System.out.println("- " + disciplina.getNome());
      }
      System.out.println("-----------------------");
    }
  }

  private void removerCurso() {
    System.out.print("Nome do curso a ser removido: ");
    String nome = scanner.nextLine();

    for (Curso curso : cursos) {
      if (curso.getNome().equalsIgnoreCase(nome)) {
        cursos.remove(curso);
        System.out.println("Curso removido com sucesso!");
        System.out.println("-----------------------");
        return;
      }
    }

    System.out.println("Curso não encontrado.");
  }
}
