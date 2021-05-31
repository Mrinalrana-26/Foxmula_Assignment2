package com.foxmula.Assignment2;
import java.util.*;
public class Occurence_ArrayList {
	public static void count(ArrayList<String> arr)
    {
        HashSet<String> hash = new HashSet<>(arr);

        for(String s : hash)
        {
            System.out.println(s+": " + Collections.frequency(arr, s));
        }
    }
	public static void main(String args[])
	{
		ArrayList<String> Li = new ArrayList<>();
		Scanner sc = new Scanner (System.in);
		 System.out.println("Enter the String:");
		String n1 = sc.nextLine();
		String n2 = sc.nextLine();
		String n3 = sc.nextLine();
		String n4 = sc.nextLine();
		String n5 = sc.nextLine();
		
		
		Li.add(n1);
	    Li.add(n2);
	    Li.add(n3);
	    Li.add(n4);
	    Li.add(n5);
	    
		 
		count(Li);
		
		sc.close();
		
	}
}
