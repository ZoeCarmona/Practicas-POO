/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class animalAereo extends Animal{
    //Atributo
    private int numAlas;

    //Constructor vacio
    public animalAereo() {
    }

    /***
     * Constructor: construye objetos con atributos heredados de Animal
     * @param numAlas Numero de alas del animal aereo
     * @param nombre Heredado
     * @param origen Heredado
     * @param color  Heredado
     */
    public animalAereo(int numAlas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAlas = numAlas;
    }
    
    //Getters y Setters
    /***
     * Obtiene el numero de alas del animal aereo
     * @return Regresa el numero de alas del animal aereo
     */
    public int getNumAlas() {
        return numAlas;
    }

    /***
     * Metodo que modifica el numero de alas de un animal aereo
     * @param numAlas Numero de alas de un animal aereo
     */
    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }
    
    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa los datos dentro de esta clase
     */
    @Override
    public String toString() {
        return "animalAereo{" + "numAlas=" + numAlas + '}';
    }
}
