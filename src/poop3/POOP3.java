package poop3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class POOP3 {
    public static void main(String[] args) {
        try {
            //Arreglos
            System.out.println("####Arreglos###");
            int arreglo0[];
            int [] arreglo1;
            int [] arreglo2={1,2,3,4,5};
            for(int i=0;i<arreglo2.length;i++){
                System.out.println(arreglo2[i]);
            }
            
            //Wrappers
            System.out.println("\n##### Wrapper ####");
            Integer k = new Integer (7);
            Integer m=7;
            int w=5;
            
            int z=k;
            int n=5;
            Integer nW=n;
            String str =nW.toString();
            System.out.println(str);
            String str2 = n + "";
            System.out.println(str2);
            
            //Colecciones
            System.out.println("\n#### Colecciones ###");
            System.out.println("\n#### Arraylist ###");
            
            ArrayList<Integer> miArrayList = new ArrayList<Integer>();
            miArrayList.add(n);
            miArrayList.add(66);
            miArrayList.add(3);
            
            System.out.println("\nTamaño del ArrayList: "+miArrayList.size());
            miArrayList.add(0, 222);
            miArrayList.add(66);
            System.out.println("\nTamaño del ArrayList: "+miArrayList.size());
            System.out.println("\nNuestro arreglo: ");
            for(Integer integer : miArrayList){
                System.out.print(integer+", "); //println se imprime en una linea
            }
            
            //HashMap
            System.out.println("\n\n### HashMap ###");
            Hashtable<Integer,String>agenda=new Hashtable<Integer,String>();
            agenda.put(1989, "Album");
            agenda.put(1994, "Harry");
            agenda.put(1991, "Louis");
            agenda.put(1989,"Taylor");
            
            //Enumerador
            System.out.println("### Enumerador ###");
            Integer llave;
            String valor;
            Enumeration<Integer>llaves = agenda.keys();
            System.out.println("\nElementos en tabla: "+agenda.size());//size para saber cuantos elementos hay
            for(String tempValor : agenda.values()){
                System.out.println(tempValor); //Obteniendo valores
            }
            
            while(llaves.hasMoreElements()){
                llave = llaves.nextElement();
                valor = agenda.get(llave);
                System.out.println("Llave: "+llave+" Valor: "+valor);
            }
            
            //Math
            System.out.println("\n### Math ###");
            System.out.println(Math.PI);
            System.out.println(Math.abs(-5));
            System.out.println(Math.pow(3, 2)); //3 al cuadrado
            System.out.println(Math.sqrt(9));
            
            //Date
            System.out.println("\n### Date ###");
            Date hoy = new Date();
            System.out.println(hoy);
            
            //Formato Date
            System.out.println("\n### Formato Date ###");
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(formatoFecha.format(hoy));
            
            //Calendario
            System.out.println("\n### Calendario ###");
            Calendar calendarioHoy = Calendar.getInstance();
            System.out.println(calendarioHoy);
            
            String fechaActual = calendarioHoy.get(Calendar.DAY_OF_MONTH)+
                    " de "+(calendarioHoy.get(Calendar.MONTH)+1)+" de "+
                    calendarioHoy.get(Calendar.YEAR);
            System.out.println(fechaActual);
            
            System.out.println("\n-------------------------------------------------------------------");
            //Ejercicio 1:
            
        System.out.println("Ejercicio 1: \n");
        Hashtable<String,String> palabras=new Hashtable<>();
        palabras.put("(Del lat.) Opinion o consideracion en que se tiene a alguien o algo.","Reputacion" );
        palabras.put("(Del lat.) Estado de grata satisfaccion espiritual y fisica.","Felicidad" );
        palabras.put("(Del lat.) Sentimiento de dolor producido por un suceso desfavorable.","Tristeza" );
        palabras.put("(Del lat.) Sensacion de angustia provocada por la presencia de un peligro.","Miedo" );
        palabras.put("(Del lat.) Mamifero carnivoro domestico de la familia de los cánidos.","Perro" );
        
        String llave1;
        String val;
        Enumeration<String> ll=palabras.keys();
        System.out.println("Palabras del diccionario: "+palabras.size());
        for(String tempValor : palabras.values()){
            System.out.println(tempValor);
        }
            System.out.println("\n");
        while(ll.hasMoreElements()){
            llave1=ll.nextElement();
            val=palabras.get(llave1);
            System.out.println("Significado de "+val +": "+llave1);
        }
            
            //Ejercicio 2: Realizar una agenda con 5 registros, guardando el nombre de la persona y su cumpleaños,
            //utilizando hash table con calendar para almacenar la fecha de cumpleaños
            
            System.out.println("\nEjercicio 2:");
            
            Hashtable<Integer,String>agenda1=new Hashtable<Integer,String>();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            
            Date p1 = formato.parse("1994-02-01");
            agenda1.put(1, "Harry Edward Styles");
            agenda1.get(1);
            System.out.println("\nNombre: "+agenda1.get(1));
            System.out.println("Cumpleaños: "+formato.format(p1));
            
            Date p2 = formato.parse("1989-12-13");
            agenda1.put(2, "Taylor Alison Swift");
            agenda1.get(2);
            System.out.println("\nNombre: "+agenda1.get(2));
            System.out.println("Cumpleaños: "+formato.format(p2));
            
            Date p3 = formato.parse("1991-12-24");
            agenda1.put(3, "Louis William Tomlinson");
            agenda1.get(3);
            System.out.println("\nNombre: "+agenda1.get(3));
            System.out.println("Cumpleaños: "+formato.format(p3));
            
            Date p4 = formato.parse("2003-02-20");
            agenda1.put(4, "Olivia Isabel Rodrigo");
            agenda1.get(4);
            System.out.println("\nNombre: "+agenda1.get(4));
            System.out.println("Cumpleaños: "+formato.format(p4));
            
            Date p5 = formato.parse("1998-08-08");
            agenda1.put(5, "Shawn Peter Raul Mendes");
            agenda1.get(5);
            System.out.println("\nNombre: "+agenda1.get(5));
            System.out.println("Cumpleaños: "+formato.format(p5));
            
     
        } catch (ParseException ex) {
            Logger.getLogger(POOP3.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        
    }
    
}
