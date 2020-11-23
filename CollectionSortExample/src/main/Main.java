package main;

import java.text.ParseException;
import java.util.ArrayList;

import collectionsort.CollectionSortProcess;
import model.Person;
import util.DefineValues;
import util.ShowProcess;

public class Main {

	private static ArrayList<Person> personList = new ArrayList<>();
	private static ArrayList<Person> sortedpersonList = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		
		
		personList = DefineValues.defineValues(personList);
		
		
		System.out.println("---------------------------------");
		System.out.println("BEFORE COLLECTION SORT byId");
		ShowProcess.showValues(personList);	
		

		System.out.println("AFTER COLLECTION SORT byId");
		CollectionSortProcess.byId(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE COLLECTION SORT byLastName");		
		ShowProcess.showValues(personList);				
		
		System.out.println("AFTER COLLECTION SORT byLastName");
		CollectionSortProcess.byLastName(personList);	
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE COLLECTION SORT byName");
		ShowProcess.showValues(personList);

		System.out.println("AFTER COLLECTION SORT byName");
		CollectionSortProcess.byName(personList);
		System.out.println("---------------------------------\n");
		
		System.out.println("BEFORE COLLECTION SORT byAge");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER COLLECTION SORT byAge");
		CollectionSortProcess.byAge(personList);
		System.out.println("---------------------------------");
		
		System.out.println("BEFORE COLLECTION SORT byRegisterDate");		
		ShowProcess.showValues(personList);

		System.out.println("AFTER COLLECTION SORT byRegisterDate");
		CollectionSortProcess.byRegisterDate(personList);
		System.out.println("---------------------------------");
	}
}
