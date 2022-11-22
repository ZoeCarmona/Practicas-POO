/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *
 * @author Zoe
 */
public class Rectangulo {
    //Atributos
    String tipo;
    int lados;
    int paresLados;
    int angInter;
    int vertices;

    //Constructor
    public Rectangulo() {
    }

    public Rectangulo(String tipo, int lados, int paresLados, int angInter, int vertices){
        this.angInter = angInter;
        this.lados = lados;
        this.paresLados = paresLados;
        this.tipo = tipo;
        this.vertices = vertices;
    }

    
    //Métodos
    public void perimetro(){
        System.out.println("Su perimetro es igual a la suma de todos sus lados");
    }
    
    public void area(){
        System.out.println("Su area es igual al producto de dos de sus lados contiguos");
    
    }
    
    public void cancha(){
        System.out.println("Se encuentra en canchas de futbol");
    }
    
    public void puerta(){
        System.out.println("Se encuentran en puertas");
    }
    
    public void cuadro(){
        System.out.println("Se encuentra en pinturas");
    }
    
}
