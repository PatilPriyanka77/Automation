package HRM1;

import java.util.HashMap;


public class FetchingChar {
	public static void getCount(String name) {
		HashMap<Character,Integer> charmap = new HashMap<Character,Integer>();
		char strArray []= name.toCharArray();
		for (char c : strArray) {
		if(charmap.containsKey(c)) {
		   charmap.put(c, charmap.get(c)+1);
		}
		else 
		{
			charmap.put(c,1);
		}
		
		}
	    System.out.println(name+":"+ charmap);	
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        getCount("PRIYANKA");
        getCount("YOGESH");
	}

}
