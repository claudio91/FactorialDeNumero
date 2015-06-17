
package factorialnumero;
import java.util.Scanner;


public class FactorialNumero {

    
    public static void main(String[] args) {
    
        int numero,Calcularfactorial,i;  // Ubicamos nuestras variables a utilizar en nuestro metodo principal
        SaludoInicial();  // Invocamos nuestro metodo llamado SaludoInicial para que aparesca nuestro mensaje por pantalla
        SolicitarNumero(); //Invocamos nuestro metodo creado para solicitarle un numero al usuario
        numero=CapturaNumero(); //Aqui asigno que numero va a hacer nuestro metodo llamado CapturaNumero donde nuestro objeto previamente creado capturará un numero por teclado
        Calcularfactorial=Factorial(numero); //Para poder realizar la operacion tenemos que invocar nuestro metodo asignado a la variable Calcularfactorial nuestro metodo Factorial,el cual necesita de un valor osea el numero para realizar la operacion
        MostrarFactorial(Calcularfactorial,numero); // Finalmente para poder mostrar el resultado,Invocamos el metodo llamado MostrarFactorial con un valor el cual va hacer la operacion de Calcularfactorial
        
    }
    
     public static void SaludoInicial(){ //Procedimiento (metodo creado llamado SaludoIncial)
     System.out.println("Hola este programa realiza el Factorial de un numero");
}

     public static void SolicitarNumero(){  // Procedimiento (metodo creado llamado SolicitarNumero)
     System.out.println("Porfavor ingrese un numero :");
}
     public static int CapturaNumero(){ // Funcion (metodo creado llamado CapturaNumero,donde gracias a nuestro objeto utilizaremos su funcion)
         Scanner sc = new Scanner (System.in); // Creacion de nuestro Objeto
        int capturanumero=sc.nextInt(); // Asignacion de una variable que utilizara la funcion del objeto
        return capturanumero; // return que devolvera el numero ingresado a la variable numero
}

    public static int Factorial(int numero){ // Funcion (metodo creado llamado Factorial,donde se realizara la operacion matematica y logica
        int factorial=1;
        int i; 
        System.out.println("Factorial de " +numero+ " es :"); // salida que mostra un mensaje que el factorial del numero ingreaado sera :
        System.out.print(numero+ "!" + " = ");// salida estandar que mostrará numero!=
        for (i=numero;numero>1;i--){   // iteracion que realizara su funcion para que cumpla si el numero ingresado sea mayor a 1, una vez que no lo sea sale de la estructura
             factorial=factorial*i; //mientras se cumpla la iteracion se realizara la siguiente operacion aritmetica(factorial*numero ingresado) como se le restará cada vez que cumpla entonces se multiplicara por el antecesor del numero ingresado
            if (i>1){ // si el numero ingresado es mayor a 1 entonces que muestre la secuencia de la multiplicacion
                
                System.out.print(i+"x"); // secuencia repetitiva de la operacionde factorizacion
            }else{      // de lo contrario nos dara la operacion si o si
                return factorial*i; // nos devolvera la opercion de las multiplicaciones
            }
 
        }
        
        return numero;   
       }
    public static void MostrarFactorial(int Calcularfactorial,int numero){ //Funcion (metodo creado para mostrar nuestro resultado final por pantalla)
              if (numero==0){   // aqui decimos que si el numero ingresado es igual a 0, entonces que muestre por pantalla la salida estandar de abajo
                  System.out.println(numero+"!"+"="+1);
              }else{   // de los contrario mostrara solamente el resultado final
                  System.out.println(1+"="+Calcularfactorial); // Salida estandar que mostrará el valor de la factorizacion de 0
              }
             
             
    }
}



