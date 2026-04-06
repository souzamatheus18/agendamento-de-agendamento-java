package Classes;

public class Consulta {
    private int dia;
    private int hora;

    public Consulta(int dia, int hora) {
        this.dia = dia;
        this.hora = hora;
    }

    public int getDia(){
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public String toString(){
        return "Consulta marcada dia " + dia + " às " + hora + " horas.";
    }
}
