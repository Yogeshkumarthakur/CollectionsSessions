package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; //Static array-- size is fixed
		
		
		//Dynamic array--Array List
		//1. can contain duplicate value or elements
		//2. maintain insertion order
		//3. Synchronised
		//4. allow random access to fetch the elements because it store the values on the basis of indexes
		
		ArrayList ar = new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());// Size of arraylist
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add("Test");
		ar.add('a');
		ar.add(true);
		
		
		System.out.println(ar.get(2));//To get the value from the index
		
		//To print all the values from Arraylist--for loop
		
		for (int i=0; i<ar.size();i++){
			System.out.println(ar.get(i));
		}
		
		//non generic vs Generic
		
		ArrayList<Integer> ar1 = new ArrayList <Integer>();
		ar1.add(60);
		ar1.add(70);
		
		ArrayList<String> ar2 = new ArrayList <String>();
		ar2.add("Hello");
		ar2.add("H");
		
		ArrayList<E> ar3 = new ArrayList <E>();

		//Employee class Objects:
		Employee e1 = new Employee("Naveen", 27,"QA");
		Employee e2 = new Employee("Tom", 28,"Dev");
		Employee e3 = new Employee("Peter", 29,"Admin");
		
		//Create arraylist:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		   
		//Iterator: To traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
	System.out.println("*********");
		//***************
		
		//addAll(): how to perform addAll method: by adding second list object into first list object as described below:
		// So this is the concept to add two separate arraylist into 1 by using addAll method below we are addind ar6 values into ar5
		
		ArrayList<String> ar5 = new ArrayList <String>();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList <String>();
		ar6.add("dev");
		ar6.add("jave");
		ar6.add("javaScript");
		
		ar5.addAll(ar6);
		
		for (int i=0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		System.out.println("*********");
		
		//removeAll:
		
		ar5.removeAll(ar6);
		
		for (int i=0; i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		
	}
		System.out.println("*********");
		
		// retainAll:  is used to print only common method
		
		ArrayList<String> ar7 = new ArrayList <String>();
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8= new ArrayList <String>();
		ar8.add("test");
		ar8.add("jave");
				
		ar7.retainAll(ar8);
		
		for (int i=0; i<ar7.size();i++) {
			System.out.println(ar7.get(i));
	}
}
}
