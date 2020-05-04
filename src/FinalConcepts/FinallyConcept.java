package FinalConcepts;

public class FinallyConcept {

	public static void main(String[] args) {
       // test1();
	   //test2();
		division();
	}
	
	
	//Property of Finally keyword is it will execute the method despite any type exception come into the program
	//finally keyword is always used with try catch block and it is a block
	
	public static void test1() {
		
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
		    System.out.println("inside catch block");
	}
       finally
    {
	System.out.println("inside finally block");
    }
	}
		//finally block will executed always despite we didn't handle the exception through catch block
		public static void test2() {
		try {
			System.out.println("inside test2");
		}
		finally {
			System.out.println("finally code in test2 method");
		}
		
		  }
//
		public static void division() {
			int i=10;
			try {
				System.out.println("inside try block");
				int k = i/0;
			}
			catch(NullPointerException e) {
				System.out.println("inside catch block");
				System.out.println("divide by zero error");
				}
			finally {
				System.out.println("execute this code even after any exception");
			}
			
			
			
			
			
		}



}
