package maap;

import java.util.HashMap;
import java.util.Scanner;

// hash map
public class Maap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Scanner sc = new Scanner(System.in);
		boolean con = true;
		do {
			
			System.out.println("Press 1 to add entries");
			System.out.println("Press 2 to remove entries");
			System.out.println("Press 3 to search for a value");
			System.out.println("Press 4 to replace");
			System.out.println("Press 5 to show all entries");
			System.out.println("Press 6 to exit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 : System.out.println("Enter the number of entries");
			         int entry = sc.nextInt();
			         for(int i=1;i<=entry;i++)
			         {
			        	 System.out.println("Enter the key");
			        	 int k = sc.nextInt();
			        	 System.out.println("Enter the value");
			        	 String v = sc.next();
			        	 hm.put(k, v);
			         }
			         break;
			case 2 : System.out.println("Enter the key to be removed");
			         int k = sc.nextInt();
			         hm.remove(k);
			         break;
			case 3 : System.out.println("Enter the value");
			         String v = sc.next();
			         hm.containsValue(v);
			         break;
			case 4 : System.out.println("Enter the key");
					 int k1 = sc.nextInt();
					 System.out.println("Enter the Value");
					 String v1 = sc.next();
					 hm.replace(k1, v1);
					 break;
			case 5 : System.out.println(hm);
						break;
			case 6 :  con = false;
			}
		} while (con);
		
	}

}
