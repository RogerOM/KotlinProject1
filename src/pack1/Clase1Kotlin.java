package pack1;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.ArrayList;
import java.util.HashMap;

public class Clase1Kotlin {

    String name;
    int edad;
    String[] listaAlumnos;
    ArrayList<String> listaNotas;
    HashMap<String, Double> mapaNotas;

    public static void main(String[] Args) {
        System.out.println("Hello World 2222!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(String[] listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<String> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<String> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public HashMap<String, Double> getMapaNotas() {
        return mapaNotas;
    }

    public void setMapaNotas(HashMap<String, Double> mapaNotas) {
        this.mapaNotas = mapaNotas;
    }
}
