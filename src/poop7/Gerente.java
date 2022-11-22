/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop7;

/**
 *
 * @author poo01alu07
 */
public class Gerente extends Empleado{
    //Atributo
    private int presupuesto;

    //Generamos constructor vacio 
    public Gerente() {
    }
    
    /***
     * Constructor: construye objetos con atributos heredados de Empleado
     * @param nombre Nombre del gerente(desde la clase empleado)
     * @param numEmpleado Numero del gerente (desde la clase empleado)
     * @param sueldo Sueldo del gerente (desde la clase empleado)
     * @param presupuesto Presupuesto del gerente
     */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);//Atributos de empleado, super llama a la superclase, this hace referencia a la clase en la que estamos
        //Llama al constructor padre, super inicializa los tributos en padre
        this.presupuesto = presupuesto;
    }

    //Getter y Setters
    /***
     * Obtiene el presupuesto del gerente
     * @return Regresa el presupuesto del gerente
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /***
     * Metodo que modifica el presupuesto del gerente, donde ademas, validamos presupuesto
     * @param presupuesto Presupuesto del gerente
     */
    public void setPresupuesto(int presupuesto) {
        if(presupuesto < 0)
            presupuesto = 0;
        this.presupuesto = presupuesto;
    }

    /***
     * Mantenemos el modificador de acceso original al sobreescribir el método con un to-String
     * @return Regresa todos los datos correspondientes al gerente y empleado(ya que de este lo hereda) [gerente es un empleado]
     */
    @Override
    public String toString() {
        return "Gerente{" +super.toString()+ "presupuesto=" + presupuesto + '}';
    }
}
