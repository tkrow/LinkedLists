
public class LinkedListPerson {

	Person firstPerson = null;
	// int numberOfLinks = 0;
	
	public void insertNewPerson(Person p) {
		Person newPerson = p;
		newPerson.nextPerson = firstPerson;
		firstPerson = newPerson;
	}
	
	public void displayLinkedList() {
		Person currentPerson = firstPerson;
		
		// as long as we don't hit a null person
		while(currentPerson != null) {
			currentPerson.displayPerson();
			// reassign
			currentPerson = currentPerson.nextPerson;
		}
	}
}
