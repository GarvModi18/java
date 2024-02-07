import java.util.*;
class VectorEx{

	static VectorEx obj;//Static object to access methods of class VectorEx


	void create(Vector <Integer> a){
		int size;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of Vector");
		size=sc.nextInt();

		System.out.println("Enter Vector");
		for (int i=0;i<size;i++) {
			a.add(sc.nextInt());//add - to add element 
		}

		
	}

	void menu(Vector <Integer> a){

		int choice,size=a.size();
		Scanner sc=new Scanner(System.in);

		do{
			System.out.println("\n--------------------Vector--------------------\n");
			System.out.println("1.display(get)\n2.insert(add)\n3.insert(addElement)\n4.insert all(AddAll)\n5.delete(remove)\n6.delete(removeElementAt)\n7.delete all(removeAll)\n8.capicity(capicity)\n9.first element(firstElement)\n10.last element(lastElement)\n11.exit\n12.sort\n13.empty\n14.check\n");
			choice=sc.nextInt();

			switch(choice){

			case 1:
				display(a);
				break;
			case 2:
				System.out.println("Enter a num to Vector");
				a.add(sc.nextInt());
				size=a.size();
				System.out.println();
				break;
			
		//addElement()
		//It is functionally equivalent to ' add() '
		//addElement() is synchronized, which means it is thread-safe. In a multithreaded environment,
		// using addElement can help avoid concurrent modification issues.
			case 3:
				System.out.println("Enter a element to add");
				a.addElement(sc.nextInt());
				break;
			
			case 4:
				System.out.println("Enter length of nums you want to add");
					int add_size=sc.nextInt();

			// Creating a temporary Vector to store user input
				Vector <Integer> arr=new Vector <Integer>();	
			
				System.out.println("Enter nums to Vector");					
					for (int i=0;i<add_size;i++) {
							arr.add(sc.nextInt());
					}
				a.addAll(arr);	
				size=a.size();
				System.out.println();
				break;

			case 5:
				System.out.println("Enter index for delete");
				int i=sc.nextInt();
				if(i<0 || i>=size){
					System.out.println("Invalid Index");
						}
				else{
				a.remove(i);
				size=a.size();
				}
				System.out.println();
				break;

			case 6:
				System.out.println("Enter index for delete");
				int remove_index=sc.nextInt();
				if(remove_index<0 || remove_index>=size){
					System.out.println("Invalid Index");
						}
				else{
				a.removeElementAt(remove_index);
				}
				size=a.size();
				System.out.println();
				break;	

			case 7:
			    System.out.println("Enter length of nums to remove");    
			    int remove_size = sc.nextInt();
			    
			    Vector<Integer> rem_arr = new Vector<Integer>();

			    System.out.println("Enter nums to remove");                
			    for (int j = 0; j < remove_size; j++) {
			        rem_arr.add(sc.nextInt());    
			    }

			    a.removeAll(rem_arr);
			    
			    size = a.size();

			    System.out.println("Desired elements are removed\n");
			    break;
	
			case 8:
				System.out.println("Capacity : "+a.capacity()+"\n");
				break;

			case 9:
				System.out.println("First element : "+a.firstElement()+"\n");
				break;

			case 10:
				System.out.println("Last element : "+a.lastElement()+"\n");
				break;

			case 11:
				System.out.println("Exiting");
				System.out.println();
				break;
				
			//This are functions of ArrayList which can also be used in Vector and This are not included in mam's ppt.		
			case 12:
				Collections.sort(a);
				System.out.println("Vector is sorted\n");
				break;
			case 13:
				if(a.isEmpty()){  System.out.println("Vector is empty\n"); }
				else { System.out.println("Vector is not empty\n");}
				break;
			case 14:
				if(a.contains(sc.nextInt())){
					System.out.println("Its available\n");
				}
				else{
					System.out.println("Its not available\n");
				}
				break;
			case 15:
				a.clear();
				System.out.println("Vector is cleared\n");
				size=a.size();
				break;	

			default:
				System.out.println("Invalid Choice");
				System.out.println();

			}

		}while(choice!=11);	



	}

	void display(Vector <Integer> a){
		int size=a.size();
			System.out.println("Vector using get()");

		for (int i=0;i<size;i++) {
			System.out.print(" "+a.get(i)+" ");//get - get perticular element
		}
		System.out.println("\nVectors");
		System.out.println(a+"\n");


	}

	public static void main(String[] args) {
			
		Vector <Integer> a=new Vector <Integer>();
		
		obj=new VectorEx();//we have already declared obj ,now creating a instance of class VectorEx to access non static methids from static method(main func)

		obj.create(a);
		obj.menu(a);
		


	}
}