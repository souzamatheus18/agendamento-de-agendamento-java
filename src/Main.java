import Classes.Agenda;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao;

        do {
            System.out.println("### MARCAR CONSULTAS ###");
            System.out.println("1. Marcar consulta");
            System.out.println("2. Listar consultas");
            System.out.println("3.Cancelar consulta.");
            System.out.println("0. Sair");
            System.out.println("Escolha:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Para que dia é a consulta?");
                    int dia = sc.nextInt();
                    System.out.println("Qual horário você deseja?");
                    int hora = sc.nextInt();
                    agenda.marcarConsulta(dia, hora);
                    break;
                case 2:
                    agenda.listarConsultas();
                    break;
                case 3:
                    agenda.listarConsultas();
                    if (agenda.temConsulta()) {
                        System.out.println("Número da consulta para cancelar:");
                        agenda.desmarcarConsulta(sc.nextInt());
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (true);
    }
}