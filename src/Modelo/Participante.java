package Modelo;

public class Participante extends Persona{
    public Participante(String nombre,String cedula, int edad){
        super(nombre, cedula, edad);
    }
    @Override
    public void mostrarDatos(){
        System.out.println("PARTICIPANTES: "+ nombre +" EDAD: "+ edad);
    }
}
