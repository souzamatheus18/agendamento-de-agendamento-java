package Classes;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Consulta> consultas;

    public Agenda(){
        this.consultas = new ArrayList<>();
    }

    public void marcarConsulta(int dia, int hora){
        if (dia <= 0 || dia > 31){
            System.out.println("Dia inválido!");
            return;
        }
        if (hora < 8 || hora > 18){
            System.out.println("As consultas são realizadas das 8:00 horas as 18:00 horas");
            return;
        }
        for (int i = 0; i < consultas.size(); i++){
            if(consultas.get(i).getDia() == dia && consultas.get(i).getHora() == hora){
                System.out.println("Você já tem uma consulta marcada nesse dia e horário!");
                return;
            }
        }
        consultas.add(new Consulta(dia, hora));
        System.out.println("Consulta marcada.");
    }

    public boolean temConsulta(){
        return !consultas.isEmpty();
    }

    public void desmarcarConsulta(int indice){
        if (consultas.isEmpty()){
            System.out.println("Não há consultas marcadas.");
            return;
        }
        if (indice < 1 || indice > consultas.size()){
            System.out.println("Opção inválida!");
            return;
        }
        consultas.remove(indice - 1);
        System.out.println("Consulta cancelada.");
    }

    public void listarConsultas(){
        if (consultas.isEmpty()){
            System.out.println("Não há consultas marcadas.");
            return;
        }
        System.out.println("---- Consultas Marcadas----");
        for (int i = 0; i < consultas.size(); i++){
            System.out.println(i + 1 + "." + consultas.get(i));
        }
        System.out.println("-----------------");
    }
}
