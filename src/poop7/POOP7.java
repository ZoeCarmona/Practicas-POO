package poop7;

/**
 *
 * @author Carmona Ayala Mariana Zoe
 */
public class POOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creamos un gerente y le ponemos datos
        Gerente ger = new Gerente();
        ger.setNombre("Pedro Escalante");
        ger.setNumEmpleado(12345);
       
        System.out.println("Actividades realizadas en clase:");
        System.out.println("Nombre: "+ger.getNombre());
        System.out.println("NumEmpleado: "+ger.getNumEmpleado());
        System.out.println("Sueldo: "+ger.getSueldo());
        
        ger.setSueldo(10);
        System.out.println("Sueldo aumentado: "+ger.getSueldo());
        
        ger.setPresupuesto(100_000);
        System.out.println("Presupuesto: "+ger.getPresupuesto());
        
        //Ejercicio toString
        System.out.println(ger); //Gerente es un empleado, no marca el preuspuesto
        
        //Actividades Práctica 07
        System.out.println("--------------------------------------------------");
        System.out.println("Actividades Práctica 07\n");
        
        Ballena bal = new Ballena();
        bal.setNombre("Orca");
        bal.setOrigen("Artico");
        bal.setColor("Negro");
        bal.setNumAletas(2);
        bal.setLargo(8);
        
        System.out.println("Ballena:");
        System.out.println("Nombre: "+bal.getNombre()+"\nOrigen: "+bal.getOrigen()+
                "\nColor: "+bal.getColor()+"\nNumAletas: "+bal.getNumAletas()+" aletas"+"\nLargo: "+bal.getLargo()+" metros");
        
        Perro per = new Perro();
        per.setNombre("Salchicha");
        per.setOrigen("Alemania");
        per.setColor("Cafe");
        per.setNumPatas(4);
        per.setNumManchas(0);
        
        System.out.println("\nPerro:");
        System.out.println("Nombre: "+per.getNombre()+"\nOrigen: "+per.getOrigen()+
                "\nColor: "+per.getColor()+"\nNumPatas: "+per.getNumPatas()+" patas"+"\nNum Manchas: "+per.getNumManchas()+" manchas");
        
        Pajaro par = new Pajaro();
        par.setNombre("Carpintero");
        par.setOrigen("Chile");
        par.setColor("Amarillo");
        par.setNumAlas(2);
        par.setTipoPico("Fuerte");
        
        System.out.println("\nPajaro:");
        System.out.println("Nombre: "+par.getNombre()+"\nOrigen: "+par.getOrigen()+
                "\nColor: "+par.getColor()+"\nNumAlas: "+par.getNumAlas()+" alas"+"\nPico: "+par.getTipoPico());
    }
    
}
