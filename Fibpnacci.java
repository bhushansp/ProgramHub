package programsToPractice;

import java.util.Scanner;

public class Fibpnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number A");
		int x=s.nextInt();
		System.out.println("Enter number B");
		int y=s.nextInt();
		System.out.println("Enter number of elements");
		int z=s.nextInt();
		
		
		for(int i=0;i<z;i++){
			int a;
			a=x+y;
			System.out.print(" "+a);
			x=y;
			y=a;
		}
	}

}
