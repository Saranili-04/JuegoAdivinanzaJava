import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {

  public static void adivinar_numero (int numIntentos, int numAleatorio) {
        try (Scanner scanner = new Scanner(System.in)) {
      
            while (numIntentos > 0 ){
                System.out.print("\n");
                System.out.println("Ingrese un número entre 1 y 100.");
                int num_usuario = scanner.nextInt();
                scanner.nextLine();
                System.out.print("\n");

                if(numAleatorio == num_usuario){
                    System.out.println("¡¡¡Felicidades has adivinado el numero!!! :D");
                    break;
                }
                
                numIntentos--;

                if (numIntentos > 1){
                    System.out.println("Te equivocaste, te quedan: "+ numIntentos + " intentos.");
                } 
                else if (numIntentos == 1){
                    System.out.println("Te equivocaste, te queda: 1 intento.");
                } 
                else {
                    System.out.println("Te quedaste sin intentos, suerte para la próxima :c");
                    System.out.println("El número a adivinar era: " + numAleatorio + ".");
                }
                
            }
        }
  }
  
  public static void main (string[] args){

    Random random = new Random();
    int numAleatorio = random.nextInt(100) + 1;
    
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("----------- Bienvenido al Juego de Adivinar el Numero -----------");
    System.out.print("\n");
    System.out.println("REGLAS: Tienes 5 intentos para adivinar el numero.");
    System.out.print("\n");
    
    int numIntentos = 5;
    adivinar_numero(numIntentos, numAleatorio);
  
  }
}
