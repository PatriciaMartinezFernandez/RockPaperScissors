import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		while(true) {
			String[] rps = {"r", "p", "s"};
			String computerMove = rps[new Random().nextInt(rps.length)];
			String playerMove;
			Scanner scanner = new Scanner(System.in);
			
			while(true){

				System.out.println("Por favor elige entre Piedra(r), Papel(p) o Tijera(s)");
				playerMove = scanner.nextLine();
				if (playerMove.equals("r") ||playerMove.equals("p") ||playerMove.equals("s")) {
					break;
				}
				
				System.out.println(playerMove + " no es un movimiento válido.");
			}
	
			System.out.println("El sistema elegió: " + computerMove);
				
			if (playerMove.equals(computerMove)) {
				System.out.println("Es un empate!");
				}
			else if (playerMove.equals("r")) {
				if (computerMove.equals("p")) {
				System.out.println("Has perdido!");
				
				} 
				else if (computerMove.equals("s")) {
				System.out.println("Has ganado!");
				}
			}
			
			else if (playerMove.equals("p")) {
				if (computerMove.equals("s")) {
				System.out.println("Has perdido!");
				
				} 
			else if (computerMove.equals("r")) {
			System.out.println("Has ganado!");
				}
			}
			
			else if (playerMove.equals("s")) {
				if (computerMove.equals("r")) {
				System.out.println("Has perdido!");
				
				} 
			else if (computerMove.equals("p")) {
			System.out.println("Has ganado!");
				}
			}
			
			System.out.println("Quieres jugar otra vez? (y/n)");
			String playAgain = scanner.nextLine();
			
			if (!playAgain.equals("y")){
				
				break;
				}
			}
		}
	}