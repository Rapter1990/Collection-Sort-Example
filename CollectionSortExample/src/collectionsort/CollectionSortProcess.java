package collectionsort;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import model.Person;
import util.ShowProcess;

public class CollectionSortProcess {


	public static void byId(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Long.compare(p0.getId(), p1.getId());
			}
		};

		sortListAndShowResult(personList, compTr);
		
	}

	public static void byLastName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getLastname(), p1.getLastname());
			}
		};

		sortListAndShowResult(personList, compTr);
	}

	public static void byName(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				Collator collator = Collator.getInstance(new Locale("tr", "TR"));
				return collator.compare(p0.getName(), p1.getName());
			}
		};

		sortListAndShowResult(personList, compTr);
	}

	public static void byAge(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				return Integer.compare(p0.getAge(), p1.getAge());
			}
		};

		sortListAndShowResult(personList, compTr);
	}

	public static void byRegisterDate(ArrayList<Person> personList) {
		Comparator<Person> compTr = new Comparator<Person>() {
			@Override
			public int compare(Person p0, Person p1) {
				if (p0.getRegisterDate().before(p1.getRegisterDate())) {
					return -1;
				} else if (p0.getRegisterDate().after(p1.getRegisterDate())) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		sortListAndShowResult(personList, compTr);
	}
	
	private static void sortListAndShowResult(ArrayList<Person> personList, Comparator<Person> compTr) {
		Collections.sort(personList, compTr); 
		ShowProcess.showValues(personList);
	}
}
