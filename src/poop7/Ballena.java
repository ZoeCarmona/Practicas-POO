/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class Ballena extends animalAcuatico{
    //Atributos
    private int largo;

    //Constructor vacio
    public Ballena() {
    }
    
    /***
     * Constructor: construye objetos con atributos heredados de animalAcuatico
     * @param largo
     * @param numAletas
     * @param nombre
     * @param origen
     * @param color 
     */
    public Ballena(int largo, int numAletas, String nombre, String origen, String color) {
        super(numAletas, nombre, origen, color);
        this.largo = largo;
    }
    
    //Getters y setters
    /***
     * Obtiene el largo de la ballena
     * @return Regresa el alrgo de ballenao
     */
    public int getLargo() {
        return largo;
    }

    /***
     * Metodo que modifica el largo de la ballena
     * @param largo Largos de ballena
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }

    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa los datos dentro de esta clase
     */
    @Override
    public String toString() {
        return "Ballena{" + "largo=" + largo + '}';
    }
}
