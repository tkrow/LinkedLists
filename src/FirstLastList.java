
public class FirstLastList {
	
	// "Link" in texbook pg 198/223
	Person firstPerson;
	Person lastPerson;
	
	public FirstLastList() {
		firstPerson = null;
		lastPerson = null;
	}
	
	// check for empty list; this will help us determine
	// where to insert new elements
	public boolean isEmpty() {
		return (firstPerson == null);
	}
	
	// Two methods for insertion-
	// one at beginning, one at he end
	public void insertFirst(Person p) {
		
		Person newPerson = new Person(p.name);
		
		if(isEmpty()) {
			lastPerson = newPerson;
		}
		
		newPerson.nextPerson = firstPerson;
		firstPerson = newPerson;
	}
	
	public void insertLast(Person p) {
		Person newPerson = new Person(p.name);
		
		if(isEmpty()) {
			firstPerson = newPerson;
		}
		else {
			// append
			lastPerson.nextPerson = newPerson;
		}
		
		lastPerson = newPerson;
	}
	
	public void deleteTop() {
		Person temp = firstPerson;
		
		if(firstPerson.nextPerson == null) {
			lastPerson = null;
		}
		
		firstPerson = firstPerson.nextPerson;
		
	}
	
	public void deleteBottom() {
		Person temp = lastPerson;
		
		if(lastPerson == null) {
			firstPerson.nextPerson = null;
		}
		
		firstPerson = lastPerson.nextPerson;
	}
	
	public void displayFirstLastList() {
	// currentperson will change; firstPerson will not (
		
		for(Person p ) {
			System.out.println("Person: " + p);
		}
	}
}
