import java.util.Scanner;

import Aluno.GestorDeAlunos;
import Curso.GestorDeCursos;
import Disciplina.GestorDeDisciplinas;
import Professor.GestorDeProfessores;

public class SistemaEscolar {
    public static void main(String[] args) {
        GestorDeAlunos gestorDeAlunos = new GestorDeAlunos();
        GestorDeDisciplinas gestorDeDisciplina = new GestorDeDisciplinas();
        GestorDeCursos gestorDeCursos = new GestorDeCursos();
        GestorDeProfessores gestorDeProfessores = new GestorDeProfessores();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gestorDeAlunos.gerenciarAlunos();
                    break;
                case 2:
                    gestorDeProfessores.gerenciarProfessores();
                    break;
                case 3:
                    gestorDeDisciplina.gerenciarDisciplinas();
                    break;
                case 4:
                    gestorDeCursos.gerenciarCursos();
                    break;
            }

        } while (opcao != 5);

        System.out.println("Sistema encerrado.");
        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("===================================");
        System.out.println("             MENU PRINCIPAL        ");
        System.out.println("===================================");
        System.out.println(" 1 - Gerenciar ALUNOS ");
        System.out.println(" 2 - Gerenciar PROFESSORES ");
        System.out.println(" 3 - Gerenciar DISCIPLINAS ");
        System.out.println(" 4 - Gerenciar CURSOS ");
        System.out.println(" 5 - SAIR ");
        System.out.println("===================================");

        System.out.print("Escolha uma opção (1-5): ");
    }
}
