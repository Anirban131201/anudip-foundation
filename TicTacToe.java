import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any integer from 1 to 9 :");
		int n = sc.nextInt();
		
		if(n>=1 && n<=9) {
			int row = (n-1)/3;
			int coloumn = (n-1)%3;
			
			System.out.println("\n"+row+" "+coloumn);
		}else {
			System.out.println("Invalid input");
		}
		
		sc.close();

	}

}
