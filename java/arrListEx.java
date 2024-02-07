import java.util.*;
class arrListEx{

	static arrListEx obj;//Static object to access methods of class arrListEx


	void create(ArrayList <Integer> a){
		int size;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter size of arrayList");
		size=sc.nextInt();

		System.out.println("Enter arrayList");
		for (int i=0;i<size;i++) {
			a.add(sc.nextInt());//add - to add element 
		}

		
	}

	void menu(ArrayList <Integer> a){

		int choice,size=a.size();
		Scanner sc=new Scanner(System.in);

		do{
			System.out.println("1.display(get)\n2.insert(add)\n3.insert all(AddAll)\n4.delete(remove)\n5.delete all(removeAll)\n6.clear(clear)\n7.sort\n8.check(isEmpty)\n9.search(contains)\n10.exit");
			choice=sc.nextInt();

			switch(choice){

			case 1:
				
				display(a);
				break;
			case 2:

				System.out.println("Enter a num to arrayList");
				a.add(sc.nextInt());
				size=a.size();
				System.out.println();
				break;
			case 3:
				System.out.println("Enter length of nums you want to add");
					int s=sc.nextInt();

			// Creating a temporary ArrayList to store user input
				ArrayList <Integer> arr=new ArrayList <Integer>();	
			
				System.out.println("Enter nums to arrayList");					
					for (int i=0;i<s;i++) {
							arr.add(sc.nextInt());
					}
					//a.addAll(123,1123,423432,4534);
				a.addAll(arr);	
				size=a.size();
				System.out.println();
				break;
			case 4:
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

			/*case 5:
				System.out.println("Enter length of nums to remove");	
				int remove_size=sc.nextInt();
			
				ArrayList <Integer> rem_arr=new ArrayList <Integer>();

				System.out.println("Enter nums to remove");				
					for (int j=0;j<remove_size;j++) {
							rem_arr.add(sc.nextInt());	
					}

					a.removeAll(Collections.singleton(rem_arr));
				
				System.out.println("Desired elements are removed\n");
					
				break;*/
			case 5:
			    System.out.println("Enter length of nums to remove");    
			    int remove_size = sc.nextInt();
			    
			    ArrayList<Integer> rem_arr = new ArrayList<Integer>();//1 2 3 
			    													//og: 1 2 4 5 
			    System.out.println("Enter nums to remove");                
			    for (int j = 0; j < remove_size; j++) {
			        rem_arr.add(sc.nextInt());    
			    }

			    // Corrected: Remove elements using removeAll with rem_arr directly
			    a.removeAll(rem_arr);
			    
			    size = a.size();

			    System.out.println("Desired elements are removed\n");
			    break;
	
			case 6:
				a.clear();
				System.out.println("ArrayList is cleared\n");
				size=a.size();
				break;
			case 7:
				Collections.sort(a);
				System.out.println("ArrayList is sorted\n");
				break;
			case 8:
				//boolean xyz=a.isEmpty();
				//if(xyz=="true"){.......}
				if(a.isEmpty()){  System.out.println("ArrayList is empty\n"); }
				else { System.out.println("ArrayList is not empty\n");}
				break;
			case 9:
				if(a.contains(sc.nextInt())){
					System.out.println("Its available\n");
				}
				else{
					System.out.println("Its not available\n");
				}
				break;
			case 10:
				System.out.println("Exiting");
				System.out.println();
				break;
			default:
				System.out.println("Invalid Choice");
				System.out.println();

			}

		}while(choice!=10);	



	}

	void display(ArrayList <Integer> a){
		int size=a.size();
			System.out.println("arrayList using get()");

		for (int i=0;i<size;i++) {
			System.out.print(" "+a.get(i)+" ");//get - get perticular element
		}
		System.out.println("\narrayLists");
		System.out.println(a+"\n");


	}

	public static void main(String[] args) {
			
		ArrayList <Integer> a=new ArrayList <Integer>();
		
		obj=new arrListEx();//we have already declared obj ,now creating a instance of class arrListEx to access non static methids from static method(main func)

		obj.create(a);
		obj.menu(a);
		


	}
}