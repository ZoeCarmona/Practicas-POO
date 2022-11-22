package poop4;

/**
 *
 * @author Zoe
 */
public class Triangulo {
    String tipo;
    String nomOficial;
    int numLados;
    int vertices;
    int angInteriores;
    
    public Triangulo(){
        
    }
    
    //Constructores
    public Triangulo(String tipo, String nomOficial, int numLados, int vertices, int angInteriores){
        this.angInteriores = angInteriores;
        this.nomOficial = nomOficial;
        this.numLados = numLados;
        this.tipo = tipo;
        this.vertices = vertices;
    }
    
    //Metodos
    public void examenes(){
        System.out.println("Ejercicios de examenes");
    }
    
    public void area(){
        System.out.println("Utilizados para calcular areas de lugares");
    }
    
    public void rampas(){
        System.out.println("Se encuentra en rampas");
    }  
    
    public void piramides(){
        System.out.println("Se encuentra en piramides");
    }
    
    public void dieta(){
        System.out.println("Utilizados en dietas");
    }
    
}
