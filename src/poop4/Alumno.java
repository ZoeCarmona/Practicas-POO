package poop4;

/**
 *
 * @author poo01alu07
 */

//Atributos
public class Alumno {
    String nombre;
    String numCuenta;
    float promedio;
    String carrera;
    int semestre;
    
    public Alumno(){
        
    }
    
    //Constructores
    public Alumno(String nombre,String numCuenta, float promedio, String carrera, int semestre){
        this.nombre = nombre;
        this.numCuenta = numCuenta;
        this.promedio = promedio;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    //Metodos
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    public void escribir(){
        System.out.println("Estoy escribiendoo");
    }
    
    public void leer(){
        System.out.println("Estoy leyendo");
    }
    
    public void saltarseClase(){
        System.out.println("No estoy en clase");
    }
    
    public void asistirClase(){
        System.out.println("Estoy en clase de POO");
    }
}
