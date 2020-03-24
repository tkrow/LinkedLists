
public class Client_FirstLastListPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstLastList fll = new FirstLastList();
		fll.insertFirst(new Person("Fred"));
		fll.insertFirst(new Person("Frank"));
		fll.insertFirst(new Person("Franz"));
		fll.insertFirst(new Person("Frederick"));
		fll.insertFirst(new Person("Freaky Frank"));
		fll.insertLast(new Person("Harold"));
		
		
		fll.deleteTop();
		
		
		fll.deleteBottom();
		
		
		fll.displayFirstLastList();
	}

}
