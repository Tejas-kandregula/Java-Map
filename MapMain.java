package maap;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the below option for key type and value type");
		System.out.println("1 for key is Integer type and value is string type");
		System.out.println("2 for key is String type and value is Integer type");
		System.out.println("3 for key is Character type and value is Sting type");
		int option = sc.nextInt();
		switch(option)
		{
				case 1 : MapUtil<Integer,String> util = new MapUtil<Integer,String>();
				Map<Integer,String> map = new MapUtil<Integer,String>().chosseMapType();
				boolean con = true;
		
						do {
							System.out.println("Press 1 to add entries");
							System.out.println("Press 2 to remove entries");
							System.out.println("Press 3 to search for a value");
							System.out.println("Press 4 to replace");
							System.out.println("Press 5 to show all entries");
							System.out.println("Press 6 to show all keys");
							System.out.println("Press 7 to show all values");
							System.out.println("Press 8 to exit");
							int choice = sc.nextInt();
							switch (choice)
							{
							case 1: System.out.println("Enter the number of entries");
							         int entry = sc.nextInt();
							         for(int i=1;i<=entry;i++)
							         {
							        	 System.out.println("Enter the key");
							        	 int k = sc.nextInt();
							        	 System.out.println("Enter the value");
							        	 String v = sc.next();
							        	 map.put(k, v);
							         }
							         	break;
							case 2 : System.out.println("Enter the key to be removed");
								         int k = sc.nextInt();
								         map.remove(k);
								         break;
						   case 3 : System.out.println("Enter the value");
							         String v = sc.next();
							         map.containsValue(v);
							         break;
						   case 4 : System.out.println("Enter the key");
									 int k1 = sc.nextInt();
									 System.out.println("Enter the Value");
									 String v1 = sc.next();
									 map.replace(k1, v1);
									 break;
							case 5 : System.out.println(map);
										break;
							case 6 : Set<Integer> set = map.keySet();
										for(int i : set)
										{
											System.out.println(i);
										}
										break;
							case 7 : Collection<String> c = map.values();
										for(String val:c)
										{
											System.out.println(val);
										}
										break;
							case 8 : con = false;
							}
							
						} while (con);
				          break;
				case 2 : MapUtil<String,Integer> util1 = new MapUtil<String,Integer>();
									Map<String,Integer> map1 = new MapUtil<String,Integer>().chosseMapType();
									boolean con1 = true;
									
									do {
										System.out.println("Press 1 to add entries");
										System.out.println("Press 2 to remove entries");
										System.out.println("Press 3 to search for a value");
										System.out.println("Press 4 to replace");
										System.out.println("Press 5 to show all entries");
										System.out.println("Press 6 to show all keys");
										System.out.println("Press 7 to show all values");
										System.out.println("Press 8 to exit");
										int choice = sc.nextInt();
										switch (choice)
										{
										case 1: System.out.println("Enter the number of entries");
										         int entry = sc.nextInt();
										         for(int i=1;i<=entry;i++)
										         {
										        	 System.out.println("Enter the key");
										        	 String v = sc.next();
										        	 System.out.println("Enter the value");
										        	 int k = sc.nextInt();
										        	 map1.put(v, k);
										         }
										         	break;
										case 2 : System.out.println("Enter the key to be removed");
													 String v = sc.next();
											         map1.remove(v);
											         break;
									   case 3 : System.out.println("Enter the value");
									   			int k = sc.nextInt();
										         map1.containsValue(k);
										         break;
									   case 4 : System.out.println("Enter the key");
									   			String v1 = sc.next();
												 System.out.println("Enter the Value");
												 int k1 = sc.nextInt();
												 map1.replace(v1, k1);
												 break;
										case 5 : System.out.println(map1);
													break;
										case 6 : Set<String> set = map1.keySet();
													for(String i : set)
													{
														System.out.println(i);
													}
													break;
										case 7 : Collection<Integer> c = map1.values();
													for(int val:c)
													{
														System.out.println(val);
													}
													break;
										case 8 : con1 = false;
										}
										
									} while (con1);
									  break;
				case 3 : MapUtil<Character,String> util2 = new MapUtil<Character,String>();
						 Map<Character,String> map2 = new MapUtil<Character,String>().chosseMapType();
						 boolean con2 = true;
						 do {
							 	System.out.println("Press 1 to add entries");
								System.out.println("Press 2 to remove entries");
								System.out.println("Press 3 to search for a value");
								System.out.println("Press 4 to replace");
								System.out.println("Press 5 to show all entries");
								System.out.println("Press 6 to show all keys");
								System.out.println("Press 7 to show all values");
								System.out.println("Press 8 to exit");
								int choice = sc.nextInt();
								switch(choice)
								{
								case 1 : System.out.println("Enter the number of entries");
										 int entry = sc.nextInt();
										 for(int i=0;i<=entry-1;i++)
										 {
											 System.out.println("Enter the key");
											 char k = sc.next().charAt(0);
											 System.out.println("Enter the value");
								        	 String v = sc.next();
								        	 map2.put(k, v); 
								          }
										 break;
								case 2 :  System.out.println("Enter the key to be removed");
								 			char k = sc.next().charAt(0);
								 			 map2.remove(k);
									         break;
								case 3 :  System.out.println("Enter the value");
									         String v = sc.next();
									         map2.containsValue(v);
									         break;
								case 4 : System.out.println("Enter the key");
											char k1 = sc.next().charAt(0);
											 System.out.println("Enter the Value");
											 String v1 = sc.next();
											 map2.replace(k1, v1);
											 break;
								case 5 : System.out.println(map2);
											break;
								case 6 : Set<Character> set = map2.keySet();
											for(char i : set)
											{
												System.out.println(i);
								            }
											break;
								case 7 : Collection<String> c = map2.values();
											for(String val:c)
											{
												System.out.println(val);
											}
											break;	
								case 8 : con2 = false;
								}
						} while (con2);
			
		}
		
	}

}
