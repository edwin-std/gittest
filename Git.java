import java.io.*;
import java.util.*;

public class Git {
	public static void main(String[]args) throws Exception {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name:");
		String name = reader.readLine();

		System.out.println("Enter your surname: ");
		String surname = reader.readLine();

		if(name.isEmpty() || surname.isEmpty()){
			System.out.println("Enter your name or surname please.");
		}
		else {
			System.out.println("Welcome " + name + " " + surname +", have a good day!");
		}
	}
}