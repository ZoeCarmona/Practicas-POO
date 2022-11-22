/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class Animal {
    //Escribimos atributos
    private String nombre, origen, color;
    
    //Constructor vacio
    public Animal() {
    }

    /***
     * Constructor: construye objetos
     * @param nombre Nombre del animal
     * @param origen Origen del animal
     * @param color Color del animal
     */
    public Animal(String nombre, String origen, String color) {
        this.nombre = nombre;
        this.origen = origen;
        this.color = color;
    }
    
    //Insertamos getter y setters
    /**
     * Obtiene el nombre del animal
     * @return Regresa el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene el origen del animal
     * @return Regresa el origen del animal
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Obtiene el color del animal
     * @return Regresa el color del animal
     */
    public String getColor() {
        return color;
    }

    /***
     * Metodo que modifica el nombre de un animal
     * @param nombre Nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /***
     * Metodo que modifica el origen de un animal
     * @param origen Origen del animal
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /***
     * Metodo que modifica el color de un animal
     * @param color Color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }

    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa los datos dentro de esta clase
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", origen=" + origen + ", color=" + color + '}';
    }
}
