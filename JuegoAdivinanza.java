import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {

  public static void adivinar_numero (int numIntentos, int numAleatorio, int op) {
        try (Scanner scanner = new Scanner(System.in)) {
          
            int inicioRango;
            int finRango;

            if (op == 1){
                inicioRango = numAleatorio-11;
                finRango = numAleatorio+11;
            } else {
                inicioRango = numAleatorio-12;
                finRango = numAleatorio+12;
            }
      
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
                    System.out.println("PISTA: El número es mayor que " + inicioRango + " y menor que " + finRango + ".");
                } 
                else if (numIntentos == 1){
                    System.out.println("Te equivocaste, te queda: 1 intento.");
                    System.out.println("PISTA: El número es mayor que " + inicioRango + " y menor que " + finRango + ".");
                } 
                else {
                    System.out.println("Te quedaste sin intentos, suerte para la próxima :c");
                    System.out.println("El número a adivinar era: " + numAleatorio + ".");
                }

                inicioRango = inicioRango+3;
                finRango = finRango-3;
            }
        }
  }
  
  public static void main (String[] args){

    Random random = new Random();
    int numAleatorio = random.nextInt(100) + 1;
    
    System.out.println("----------- Bienvenido al Juego de Adivinar el Numero -----------");
    System.out.print("\n");
    
    int numIntentos = 5;
    // System.out.println("Numero: " + numAleatorio);
    
    try (Scanner scanner = new Scanner(System.in)) {

      System.out.println("REGLAS: Tienes 5 intentos para adivinar el numero.");
      System.out.print("\n");
      System.out.println("---- Menu ----");
      System.out.println("1. Facil");
      System.out.println("2. Dificil");
      System.out.println("Ingrese 1 o 2 para elegir la dificultad del juego:");
      int op = scanner.nextInt();
      scanner.nextLine();

      while ((op < 1) || (op > 2)){
          System.out.println("ERROR: Opción no valida.");
          System.out.println("Ingrese 1 o 2 para elegir la dificultad del juego:");
          op = scanner.nextInt();
          scanner.nextLine();
      }
      
      adivinar_numero(numIntentos, numAleatorio, op);
    }
  }
}
