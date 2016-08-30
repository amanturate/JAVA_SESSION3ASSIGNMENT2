import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class ASSIGNMENT2{
	public static void main(String[] args)throws IOException {
		
		String S1;
		String S2;
		boolean same;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter First String :");
		S1 = br.readLine();
		
		System.out.println("Enter Second String :");
		S2 = br.readLine();
		
		same = S1.equals(S2) ? true : false;
		
		System.out.println("The strings are same? " + same);
		
	}
}
