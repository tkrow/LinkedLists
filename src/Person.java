
public class Person {

	// Person leftPerson = null;
	Person nextPerson;	// Link to next
	String name;
	
	public Person(String name) {
		this.name = name;
		this.nextPerson = null;
	}
	
	public void displayPerson() {
		System.out.println("\nPerson - memory address: " + this);
		System.out.println("- name : " + this.name);
		System.out.println("- nextPerson: " + this.nextPerson);
	}
}
