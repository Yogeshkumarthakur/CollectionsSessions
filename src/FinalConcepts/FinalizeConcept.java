package FinalConcepts;

public class FinalizeConcept {
	
    public void finalize() {
	System.out.println("finalize method");
}
	
	
	public static void main(String[] args) {

		//Finalise keyword is used to perform the cleanup
		//it will delete all the objects which do not have any references
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		//gc: garbage collector method
		System.gc();
		
		
		
	}

}
