package Modelo;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String disciplina;
    private int cupoMaximo = 30;
    private int edadMin;
    private int edadMax;
    private String horario;
    private Entrenador entrenador;
    private ArrayList<Participante> inscritos;

    public Curso(String nombre, String disciplina, int edadMin, int edadMax, String horario) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.edadMin = edadMin;
        this.edadMax = edadMax;
        this.horario = horario;
        this.inscritos = new ArrayList<>();
    }

    public boolean inscribir(Participante p) {
        if (inscritos.size() < cupoMaximo &&
                p.getEdad() >= edadMin &&
                p.getEdad() <= edadMax) {
            inscritos.add(p);
            return true;
        }
        return false;
    }

    public void mostrarInscritos() {
        System.out.println("Curso: " + nombre + " (" + horario + ")");
        for (Participante p : inscritos) {
            p.mostrarDatos();
        }
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getHorario() {
        return horario;
    }
}
