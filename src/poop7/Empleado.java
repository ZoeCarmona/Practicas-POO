/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu07
 */
public class Empleado extends Object{
    //Escribimos atributos
    private String nombre;
    private int numEmpleado, sueldo;
    
    /***
     * Asignamos sueldo al empleado (Guion bajo para entender que son 10,000)
     */
    public Empleado() {
        this.sueldo = 10_000;
    }

    /***
     * Constructor
     * @param nombre Nombre del empleado
     * @param numEmpleado Numero del empleado
     * @param sueldo Sueldo del empleado
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    //Ecribimos los getters y setters
    /**
     * Obtiene el nombre del empleado
     * @return Regresa el nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el numero de numero de empleado
     * @return Regresa el numero del empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    
    /**
     * Obtiene el sueldo del empleado
     * @return Regresa el sueldo del empleado
     */
    public int getSueldo() {
        return sueldo;
    }
    
/**
 * Metodo que modifica el valor del nombre
 * @param nombre El nombre de un empleado
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que modifica el valor de un empleado
     * @param numEmpleado El numero de un empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    
    /***
     * Metodo que modifica el sueldo, casteamos para que no haya problemas y no se convierta en flotante ya que
     * forzamos a que se vuelva entero
     * @param porcentaje Porcentaje de sueldo
     */
    public void setSueldo(int porcentaje) {
        this.sueldo += (int)(this.sueldo * porcentaje / 100);
    } 
    
    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa todos los datos correspondientes al empleado y objeto(ya que de este lo hereda)
     */
    @Override
    public String toString() {
        return "Empleado{" +super.toString() + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
}
