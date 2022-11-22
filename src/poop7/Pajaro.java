/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author Zoe
 */
public class Pajaro extends animalAereo{
    //Atributos
    private String tipoPico;

    //Constructor vacio
    public Pajaro() {
    }

    /***
     * Constructor: construye objetos con atributos heredados de animalAereo
     * @param tipoPico Tipo de pico del pajaro
     * @param numAlas Heredado
     * @param nombre Heredado
     * @param origen Heredado
     * @param color Heredado
     */
    public Pajaro(String tipoPico, int numAlas, String nombre, String origen, String color) {
        super(numAlas, nombre, origen, color);
        this.tipoPico = tipoPico;
    }

    /***
     * Obtiene el tipo de pico del pajaro
     * @return Regresa el tipo de pico del pajaro
     */
    public String getTipoPico() {
        return tipoPico;
    }
    
    /***
     * Metodo que modifica el tipo de pico del pajaro
     * @param tipoPico Tipo de pico del pajaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa los datos dentro de esta clase
     */
    @Override
    public String toString() {
        return "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
}
