package Modelo;

public class Entrenador extends Persona {
    private String disciplina;

    public Entrenador(String nombre, String cedula, int edad, String disciplina) {
        super(nombre, cedula, edad);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Entrenador: " + nombre + ", Disciplina: " + disciplina);
    }
}
