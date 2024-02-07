import java.util.*;
class try_vector{

	public static void main(String[] args) {
		
		Vector <Integer> a=new Vector <Integer>();
		int size;
		Scanner sc=new Scanner(System.in);
		//create
		System.out.println("Enter vector size");
		size=sc.nextInt();

		System.out.println("Enter vector");
		for (int i=0;i<size;i++) {
			a.add(sc.nextInt());
		}
		System.out.println("\nvector:");
		for (int i=0;i<size;i++) {
			System.out.print(" "+a.get(i)+" ");
		}
		System.out.println("\nvector size :"+a.size()+"\n");


		//add()
		System.out.println("Enter a element to add(add)");
		a.add(sc.nextInt());

		System.out.println("\nvector:");
		for (int i=0;i<a.size();i++) {
			System.out.print(" "+a.get(i)+" ");
		}
		System.out.println("\nvector size (using add()):"+a.size()+"\n");


		//addElement()
		//It is functionally equivalent to ' add() '
		//addElement() is synchronized, which means it is thread-safe. In a multithreaded environment,
		// using addElement can help avoid concurrent modification issues.
		
		System.out.println("Enter a element to add(addElement)");
		a.add(sc.nextInt());

		System.out.println("\nvector:");
		for (int i=0;i<a.size();i++) {
			System.out.print(" "+a.get(i)+" ");
		}
		System.out.println("\nvector size (using addElement()):"+a.size()+"\n");


		//addAll()
		Vector <Integer> add_a=new Vector <Integer>();
		System.out.println("Enter size of vector you wanted to add");
		int add_size=sc.nextInt();

		System.out.println("Enter vector");
		for (int i=0;i<add_size;i++) {
			add_a.add(sc.nextInt());
		}

		a.addAll(add_a);

		System.out.println("\nvector:");
		for (int i=0;i<a.size();i++) {
			System.out.print(" "+a.get(i)+" ");
		}
		System.out.println("\nvector size(using addAll()) :"+a.size()+"\n");



	}
}