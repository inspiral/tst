
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList nameList = new LinkedList();
		nameList.add("Jozsi");
		nameList.add("John");
		nameList.add("Jane");
		nameList.add("Jozsi");
		
		System.out.println(nameList.toString());
		System.out.println(nameList.toString());
		System.out.println(nameList.get(2));
		System.out.println(nameList.toString());
		nameList.remove("Jozsi");
		System.out.println(nameList.toString());
		
		nameList.set("Joe",3);
		System.out.println(nameList.toString());
		nameList.set("Sanyi",1);
		System.out.println(nameList.toString());
		nameList.set("Sanyi",11);
		System.out.println(nameList.toString());		
		

		
		
		
	}

}
