package poop4;

/**
 *
 * @author poo01alu07
 */
public class Profesor {
    //Atributos
    String nombre;
    int edad;
    String tipoEvaluacion;
    boolean esBuenaOnda;
    String materia;

    //Constructor
    public Profesor() {
    }

    public Profesor(String nombre, int edad, String tipoEvaluacion, boolean esBuenaOnda, String materia) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoEvaluacion = tipoEvaluacion;
        this.esBuenaOnda = esBuenaOnda;
        this.materia = materia;
    }

    public void dejarTarea(){
        System.out.println("Tienen tarea");
    }
    
    public void contarHistoria(){
        System.out.println("Erase una vez ...");
    }
    
    public void aplicarExamenSorpresa(){
        System.out.println("Jovenes, saquen una hoja...");
    }
    
    public void presentarCurso(){
        System.out.println("El metodo de evaluacion es.....");
    }
    
    public void imprimirDatos(){
        System.out.println("\nProfesor "+
                nombre+" "+
                edad+" "+
                tipoEvaluacion+" "+
                esBuenaOnda+" "+
                materia);
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", edad=" + edad + ", tipoEvaluacion=" + tipoEvaluacion + ", esBuenaOnda=" + esBuenaOnda + ", materia=" + materia + '}';
    }
    
    
    
}
