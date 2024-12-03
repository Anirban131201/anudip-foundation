import java.util.Scanner;

public class Splitting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of friends:");
		int f=sc.nextInt();
		System.out.println("Enter the number of teams:");
		int t=sc.nextInt();
		
		int friendsinateam=f/t;
		int leftout=f%t;
		
		System.out.println("The number of friends in a team is: "+friendsinateam+" and the left out friends are : "+leftout);
		
		sc.close();
	}

}