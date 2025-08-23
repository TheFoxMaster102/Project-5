package Proj5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;
public class WordCounter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input=new Scanner(System.in); //Gets the file
		System.out.print("What is the directory of the text file? ");
		File jobs = new File(input.nextLine());
		input.close();
		Scanner scanner= new Scanner(jobs);
		 Map<String, Integer> tm = new TreeMap<>();
		for(String i:scanner.nextLine().split(" "))
		{
			i=i.replaceAll("[^a-zA-Z]", "");
			i=i.toLowerCase();
			if (tm.containsKey(i)) {
	            tm.put(i, tm.get(i) + 1);
	        }
			else
			{
				tm.put(i,1);
			}

		}

		for(String i:tm.toString().substring(1,tm.toString().length()-1).split(" "))//formats the output
		{
			System.out.println(i);
		}
		
	}

}
