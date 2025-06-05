package Modelo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

    public class Cancha {
        private String nombre;
        private String disciplina;
        private ArrayList<String> horarios;

        public Cancha(String nombre, String disciplina) {
            this.nombre = nombre;
            this.disciplina = disciplina;
            this.horarios = new ArrayList<>();
        }

        public void asignarHorario(String horario) {
            if (!horarios.contains(horario)) horarios.add(horario);
        }

        public ArrayList<String> getHorarios() { return horarios; }

        public void mostrarHorarios() {
            System.out.println("Cancha: " + nombre + " - " + disciplina);
            for (String h : horarios) System.out.println("Horario: " + h);
        }
}
