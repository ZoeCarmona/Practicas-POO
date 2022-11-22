/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class Perro extends animalTerrestre{
    //Atributo
    private int numManchas;

    //Constructor vacio
    public Perro() {
    }

    /***
     * Constructor: construye objetos con atributos heredados de animalTerrestre
     * @param numManchas Numero de manchas del animal terrestre
     * @param numPatas Heredado
     * @param nombre Heredado
     * @param origen Heredado
     * @param color  Heredado
     */
    public Perro(int numManchas, int numPatas, String nombre, String origen, String color) {
        super(numPatas, nombre, origen, color);
        this.numManchas = numManchas;
    }

    /***
     * Obtiene el numero de manchas del perro
     * @return Regresa el numero de manchas del perro
     */
    public int getNumManchas() {
        return numManchas;
    }

    /***
     * Metodo que modifica el numero de manchas del perro
     * @param numManchas Numero de manchas del perro
     */
    public void setNumManchas(int numManchas) {
        this.numManchas = numManchas;
    }

    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa los datos dentro de esta clase
     */
    @Override
    public String toString() {
        return "Perro{" + "numManchas=" + numManchas + '}';
    }
}
