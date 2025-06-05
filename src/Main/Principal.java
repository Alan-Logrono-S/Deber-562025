package main;

import modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Participante> participantes = new ArrayList<>();

        // Curso de ejemplo
        Curso cursoNatacion = new Curso("Natación Inicial", "Natación", 8, 15, "Lunes 10:00");
        cursos.add(cursoNatacion);

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar Participante");
            System.out.println("2. Inscribir en Curso");
            System.out.println("3. Ver Inscritos por Curso");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Cédula: ");
                    String cedula = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();

                    Participante p = new Participante(nombre, cedula, edad);
                    participantes.add(p);
                    System.out.println("Participante registrado.");
                }
                case 2 -> {
                    if (participantes.isEmpty()) {
                        System.out.println("No hay participantes registrados.");
                        break;
                    }

                    System.out.print("Ingrese cédula del participante: ");
                    String cedula = scanner.nextLine();

                    Participante seleccionado = null;
                    for (Participante p : participantes) {
                        if (p.getCedula().equals(cedula)) {
                            seleccionado = p;
                            break;
                        }
                    }

                    if (seleccionado == null) {
                        System.out.println("Participante no encontrado.");
                        break;
                    }

                    System.out.println("Cursos disponibles:");
                    for (int i = 0; i < cursos.size(); i++) {
                        Curso c = cursos.get(i);
                        System.out.println((i + 1) + ". " + c.getDisciplina() + " - " + c.getHorario());
                    }

                    System.out.print("Seleccione curso (número): ");
                    int num = scanner.nextInt();
                    scanner.nextLine();

                    if (num > 0 && num <= cursos.size()) {
                        Curso curso = cursos.get(num - 1);
                        if (curso.inscribir(seleccionado)) {
                            System.out.println("Inscripción exitosa.");
                        } else {
                            System.out.println("No se pudo inscribir (edad o cupo).");
                        }
                    } else {
                        System.out.println("Selección inválida.");
                    }
                }
                case 3 -> {
                    for (Curso c : cursos) {
                        c.mostrarInscritos();
                    }
                }
                case 4 -> System.out.println("Fin del programa.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
