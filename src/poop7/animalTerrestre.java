/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class animalTerrestre extends Animal{
    //Escribimos atributos faltantes
    private int numPatas;
    
    //Constructor vacio
    public animalTerrestre() {
    }

    /***
     * Constructor: construye objetos con atributos heredados de Animal
     * @param numPatas Numero de patas del animal terrestre
     * @param nombre Heredado
     * @param origen Heredado
     * @param color Heredado
     */
    public animalTerrestre(int numPatas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numPatas = numPatas;
    }
    
    //Insertamos Getters y Setters
    /***
     * Obtiene el numero de patas del animal terrestre
     * @return Regresa el numero de patas del animal terrestre
     */
    public int getNumPatas() {
        return numPatas;
    }

    /***
     * Metodo que modifica el numero de patas de un animal terrestre
     * @param numPatas Numero de patas del animal terrestre
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa datos dentro de esta clase
     */
    @Override
    public String toString() {
        return "animalTerrestre{" + "numPatas=" + numPatas + '}';
    }
}
