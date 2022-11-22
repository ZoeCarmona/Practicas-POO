package poop2;

/**
 * @author Carmona Ayala Mariana Zoe
 */
public class POOP2 {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println("##########################");
        
        int a;
        a=15;
        
        System.out.println("a = "+a);
        
        int b=10;
        
        System.out.println("b = "+b);
        
        //Sentencia If-else/
        
        if(a<b)
            System.out.println("\na es menor que b");
        else if(a==b)
            System.out.println("\na es igual que b");
        else if(a>b)
            System.out.println("\na es mayor que b");
            
        System.out.println("\n########### IF-ELSE ###############");
        
        if(metodoComparadorMenorQue(a,b)) //metodos con lower case/
            System.out.println("\na es menor que b");
        else
            System.out.println("\na es mayor que b");
        
        //Sentencia Switch/
        System.out.println("\n######## SWITCH 1 ##################");
        
        int dia=5;
        switch (dia) {
            case 1:
                System.out.println("\nHoy es: Lunes");
                break;
                
            case 2:
                System.out.println("\nHoy es: Martes");
                break;
            case 3:
                System.out.println("\nHoy es: Miercoles");
                break;
                
            case 4:
                System.out.println("\nHoy es: Jueves");
                break;
            case 5:
                System.out.println("\nHoy es: Viernes");
                break;
            case 6:
                System.out.println("\nHoy es: Sabado");
                break;
                
            case 7:
                System.out.println("\nHoy es: Domingo");
                break;
            default:
                System.out.println("\nDia incorrecto");  
        }
        
        System.out.println("\n######## SWITCH 2 ##################");

        char vocal='9';
        switch (vocal) {
            case 'a':
                System.out.println("\nVocal: a");
                break;
            case 'e':
                System.out.println("\nVocal: e");
                break;
            case 'i':
                System.out.println("\nVocal: i");
                break;
            case 'o':
                System.out.println("\nVocal: o");
                break;
            case 'u':
                System.out.println("\nVocal: u");
                break;
            default:
                System.out.println(vocal + " no es una vocal");
        }
        
        //Sentencia while/
        System.out.println("\n######## WHILE ##################\n");
        
        int n=0;
        while (n<10) {
            System.out.println("Contando hacia arriba "+n);
            n++;
        }
        System.out.println("\nValor n = "+n);
        System.out.println("\n");
        while (n>0) {
            System.out.println("Contando hacia abajo "+n);
            n--;
        }
        System.out.println("\nValor de n = "+n);
        
        //Sentencia for/
        System.out.println("\n######## For ##################\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Contando hacia arriba "+i);
        }
        for (int i = 10; i > 10; i--) {
            System.out.println("Contando hacia abajo ");
        }
        
        //for each
        System.out.println("\n######## For arreglos ##################\n");
        int[] arreglo={1,2,3,4,5};
        int numElem=arreglo.length;
        System.out.println("Elementos en el arreglo: "+numElem);
        
        int[] arreglo2=new int[10];
        System.out.println("\nElementos en el arreglo 2: "+arreglo2.length);
        
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i]=i*10;
        }
        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println(arreglo2[i]);
        }
        
        System.out.println("\n######## For each ##################\n");
        
        System.out.println("Porcentaje de carga\n");
        for (int i : arreglo2) {
            System.out.println(i+"%");
        }
        System.out.println("100% - Se completó la carga");
        
        //Actividad Practica 2: Tablas de multiplicar
        //1 a 5 con for
        //6 al 10 con foreach (arreglos)
        
        System.out.println("\nTablas de multiplicar");
        System.out.println("\nUtilizando ciclo for");
        
        //Ciclo For del 1 al 5
        for(int i=0; i<=5;i++){
            System.out.println("\nTabla del "+i);
            for (int j =0; j<= 10; j++) 
                System.out.println(i+" x "+j+" = "+i*j);
        }
        
        //Ciclo For each del 6 al 10
        System.out.println("\nUtilizando ciclo for each");
        int[] tablas={6,7,8,9,10};
        int[] numeros={0,1,2,3,4,5,6,7,8,9,10};
        
        for(int i=0; i<numeros.length; i++)
            numeros[i]=i*1;
        
        for(int i :tablas){
            System.out.println("\nTabla del "+i);
            for(int j : numeros){
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }
        
    }

    private static boolean metodoComparadorMenorQue(int a, int b) {
        /*boolean c;
        c=a<b;
        return c;*/
        return a<b;   //regresa un false pq a no es menor que b/
    }
    
}