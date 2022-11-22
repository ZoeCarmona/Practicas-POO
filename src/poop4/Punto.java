package poop4;

/**
 *
 * @author poo01alu07
 */
public class Punto {
    int x,y;
    
    public Punto(){
        //x=0;    //Es obligatorio pero puede no inicilaizar variables
        //y=0;
    }
    
    public Punto(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public void imprimirPunto(){
        System.out.println("Punto ("+x+","+y+")");
    }
}
