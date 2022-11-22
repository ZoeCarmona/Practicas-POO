package poop4;

/**
 *
 * @author Zoe
 */
public class Gato {
    String raza;
    String color;
    float peso;
    float edad;
    int numPatas;
    
    public Gato(){
        
    }
    
    //Constructores
    public Gato(String raza, String color, float peso, float edad, int numPatas){
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.peso = peso;
        this.numPatas = numPatas;
    }
    
    //Metodos
    public void rasguñar(){
        System.out.println("Rasguñado por el michi");
    }
    
    public void morder(){
        System.out.println("Mordido por el michi");
    }
    
    public void ronroneo(){
        System.out.println("Le caes bien");
    }
    
    public void trepar(){
        System.out.println("El michi se salio de la casa");
    }
    
    public void jugar(){
        System.out.println("El michi esta jugando");
    }
}
