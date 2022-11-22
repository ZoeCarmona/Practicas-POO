package poop4;

/**
 * @author Carmona Ayala Mariana Zoe
 */
public class POOP4 {
    public static void main(String[] args) {
System.out.println("----- Clase Punto: -----");
//---------------- CLASE PUNTO --------        
        //Punto -> clase
        //punto -> objeto
        //Punto() -> constructor
        Punto punto = new Punto();
        //automaticamente lo inicializa en 0 por defecto (cuano no le damos valores a x)
        punto.imprimirPunto();
        
//---------------- CLASE Alumno --------   
System.out.println("\n----- Clase Alumno: -----");
        Alumno alu01 = new Alumno();
        System.out.println("\nNombre del alumno: "+alu01.nombre);
        System.out.println("Numero de cuenta: "+alu01.numCuenta);
        
        alu01.nombre = "Zoe";
        alu01.numCuenta = "319018129";
        alu01.carrera = "Ingenieria en computacion";
        alu01.promedio = 9.1f; //f al final para que no exista promebla con float
        alu01.semestre = 3;
        
        System.out.println("\nAlumno: "+alu01.nombre+" "+
                        alu01.numCuenta+" "+
                        alu01.promedio+" "+
                        alu01.carrera+" "+
                        alu01.semestre);
        
        Alumno alu02 = new Alumno("Pedro","361728371",9.4f,"Medicina",5);
        System.out.println("\nAlumno: "+alu02.nombre+" "+
                        alu02.numCuenta+" "+
                        alu02.promedio+" "+
                        alu02.carrera+" "+
                        alu02.semestre);
        
        alu02.saltarseClase();
        float g = 9.81f;
        System.out.println(g); //Aqui pasamos valor
        System.out.println(alu02); //Aqui pasamos referencia
        
        Profesor prof = new Profesor("Antonio",29,"con proyectos", false,"POO");
                prof.imprimirDatos();
        
        System.out.println(prof);
        
        //Práctica 4: Realizar clases de coche, triangulo, rectangulo y gato
        
        //---------------- CLASE COCHE --------   
        System.out.println("\nPRACTICA 04");
        System.out.println("\n----- Clase Coche: -----");
        Coche co01 = new Coche();
        
        co01.modelo = "Porsche 911";
        co01.color = "Rojo";
        co01.velMax = 7500.2f;
        co01.año = 2018;
        co01.numLlantas = 4;
        
        System.out.println("\nModelo: "+co01.modelo+", Color: "+
                co01.color+", Año: "+
                co01.año+", Velocidad Maxima: "+
                co01.velMax+", Llantas: "+
                co01.numLlantas);
        
        //---------------- CLASE GATO -------- 
        System.out.println("\n----- Clase Gato: -----");
        Gato gato = new Gato ();
        
        gato.raza = "Bengalí";
        gato.color = "Naranja";
        gato.edad = 2.5f;
        gato.peso = 4.5f;
        gato.numPatas = 4;
        
        System.out.println("\nRaza: "+gato.raza+", Color: "+
                gato.color+", Edad: "+
                gato.edad+" anios, Peso: "+
                gato.peso+" kg, Numero de patas: "+
                gato.numPatas);
        
        //---------------- CLASE TRIANGULO -------- 
        System.out.println("\n----- Clase Triangulo: -----");
        Triangulo tri = new Triangulo();
        
        tri.angInteriores = 3;
        tri.nomOficial = "x";
        tri.numLados= 4;
        tri.tipo = "Escaleno";
        tri.vertices = 3;
        
        System.out.println("\nNombre Original: "+tri.nomOficial+", Tipos: "+
                tri.tipo+", Angulos interiores: "+
                tri.angInteriores+" Numero de lados: "+
                tri.numLados+" Vertices: "+
                tri.vertices);
        
        //---------------- CLASE RECTANGULO -------- 
        System.out.println("\n----- Clase Rectangulo: -----");
        Rectangulo rec = new Rectangulo();
        
        rec.angInter = 90;
        rec.lados = 4;
        rec.paresLados = 2;
        rec.tipo = "Cuadrilatero";
        rec.vertices = 4;
        
        System.out.println("\nTipo: "+rec.tipo+", Lados: "+
                rec.lados+", Pares de lados de igual longitud: "+
                rec.paresLados+" Angulos interiores: "+
                rec.angInter+"°, Vertices: "+
                rec.vertices);
    }
   
    
}
