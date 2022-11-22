package poop4;

/**
 *
 * @author Zoe
 */
public class Coche {
    String modelo;
    String color;
    float velMax;
    int año;
    int numLlantas;
    
    public Coche(){
        
    }
    
    //Constructores
    public Coche(String modelo, String color, float velMax, int año, int numLlantas){
        this.modelo = modelo;
        this.color = color;
        this.velMax = velMax;
        this.año = año;
        this.numLlantas = numLlantas;
        
    }
    
    //Metodos
    public void acelerar(){
        System.out.println("Acelerando");
    }
    
    public void frenar(){
        System.out.println("Frenando");
    }
    
    public void estacionarse(){
        System.out.println("Estacionandome");
    }
    
    public void derrapar(){
        System.out.println("Derrapando");
    }
    
    public void chocar(){
        System.out.println("Chocando");
    }
    
}


