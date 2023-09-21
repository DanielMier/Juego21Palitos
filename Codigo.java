package Examen;
import java.util.Scanner;
import java.util.Random;

public class Juego21Palitos {

	public static void main(String[] args) {
		
		int PalitosRestante = 21; 
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		 
		
		String Screen[] = {"|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|", "|"};
		
		for (int i = 0; i < Screen.length; i++){
			System.out.print(Screen[i]);
		}
		System.out.print("\n");
		
		while (PalitosRestante > 0) {
            // Turno del usuario
            System.out.print("Introduce la cantidad de palitos a tachar (1-4): ");
            String palitoUsuarioString = scanner.nextLine();
            int palitoUsuario = Integer.parseInt(palitoUsuarioString);
            try {
                
                if (palitoUsuario >= 1 && palitoUsuario <= 4) {
                    PalitosRestante -= palitoUsuario;

                    if (PalitosRestante <= 0) {
                        System.out.println("¡La Maquina Gana!\n");
                        break;
                    }
                    
                    // Actualiza y muestra la pantalla con el número de palitos restantes
                    for (int i = 0; i < PalitosRestante; i++) {
                        System.out.print(Screen[i]);
                    }
                    System.out.println(); // Salto de línea

                } else {
                    System.out.println("Por favor, introduce un número entre 1 y 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            }
            // Turno de la máquina
            int palitoMaquina = 5 - palitoUsuario ;
            
            PalitosRestante -= palitoMaquina;

            if (PalitosRestante <= 0) {
                System.out.println("¡El usuario Gana!");
                break;
            }
         // Actualiza y muestra la pantalla con el número de palitos restantes
            System.out.println("La maquina ha quitado " + palitoMaquina + " palito(s)");
            for (int i = 0; i < PalitosRestante; i++) {
                System.out.print(Screen[i]);
                
		        }
            System.out.println(); // Salto de línea
            	
       
        }

            
		
		
		
		
	}

	

}
