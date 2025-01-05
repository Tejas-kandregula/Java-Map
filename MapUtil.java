package maap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapUtil<T1,T2>
{
	public Map<T1, T2> chosseMapType()
	{
		Map<T1, T2> map = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("1 for HashMap");
		System.out.println("2 for LinkedHashMap");
		System.out.println("3 for TreeMap");
		int choice = sc.nextInt();
		switch (choice) {
		case 1: map = new HashMap<T1, T2>();
					break;
		case 2: map = new LinkedHashMap<T1, T2>();
					break;
		case 3: map = new TreeMap<T1, T2>();
		}
		return map;
	}
	
	

}
