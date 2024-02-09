package projet1;
import java.util.Scanner;
import java.util.Random;

public class file1 {

	public static void main(String[] args) {
		int a;
		System.out.println("entrer un nombre");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();

	    Random random = new Random();
	    int b = random.nextInt();
	    
	    
	    
	    while( b != a ){
		if( a< b) {
			System.out.println("le nombre saisie est inferieur a au nombre secret");
			
		}
		else if( a > b) {
			System.out.println("le nombre saisie est superieur a au nombre secret");
		}
		
		System.out.println("entrer un autre nombre");
		a = sc.nextInt();
	    }	
	    

	    if (a == b){
			System.out.println("Bravo vous avez gagné le jeux");
		}
		
		
	}

}
