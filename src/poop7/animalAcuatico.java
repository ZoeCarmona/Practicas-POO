/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class animalAcuatico extends Animal{
    //Escribimos atributo
    private int numAletas;

    //Constructor vacio
    public animalAcuatico() {
    }

    /***
     * Constructor: construye objetos con atributos heredados de Animal
     * @param numAletas Número de aletas que contiene el animal acuatico
     * @param nombre heredado de la clase Animal
     * @param origen heredado de la clase Animal
     * @param color heredado de la clase Animal
     */
    public animalAcuatico(int numAletas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numAletas = numAletas;
    }

    //Getters y Setters
    /***
     * Obtiene el numero de aletas del animal acuatico
     * @return Regresa el numero de aletas del animal acuatico
     */
    public int getNumAletas() {
        return numAletas;
    }

    /***
     * Metodo que modifica el numero de aletas de un animal acuatico
     * @param numAletas 
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }

    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa los datos que se encuentran en esta clase
     */
    @Override
    public String toString() {
        return "animalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    
    
    
}
