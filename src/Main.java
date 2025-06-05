import Modelo.Entrenador;
import Modelo.Participante;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }

    public static class Curso {
        private String nombre;private String disciplina;private int edad_max;private int edad_min;private String horario;
        private Entrenador entrenador; private List<Participante> inscritos;

        public Curso(String nombre,String disciplina, int edad_max, int edad_min, String horario, Entrenador entrenador, String participacion){
        this.nombre =  nombre;
        this.disciplina = disciplina;
        this.edad_max = edad_max;
        this.edad_min = edad_min;
        this.horario = horario;
        this.entrenador = entrenador;
        this.inscritos = new ArrayList<>(); }

        public
}