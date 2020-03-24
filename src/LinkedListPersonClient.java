
public class LinkedListPersonClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedListPerson llp = new LinkedListPerson();

		llp.insertNewPerson(new Person("Frank"));
		llp.insertNewPerson(new Person("Anne"));
		llp.insertNewPerson(new Person("Josh"));
		llp.insertNewPerson(new Person("Allen"));
		llp.insertNewPerson(new Person("Alan"));
		llp.insertNewPerson(new Person("Harry"));
		llp.insertNewPerson(new Person("Some random nibba"));
		llp.insertNewPerson(new Person("Ligma"));
		
		// Output all Persons in the linkedList
		llp.displayLinkedList();
	}

}
