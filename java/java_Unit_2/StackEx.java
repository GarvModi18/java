import java.util.*;

class StackEx {
    static StackEx obj; // Static object to access methods of class StackEx

    void menu(Stack<Integer> stack) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--------------------Stack--------------------\n");
            System.out.println("1.Push\n2.Pop\n3.Peek\n4.Search\n5.Check if empty\n6.Display\n7.Exit\n");
            choice = sc.nextInt();
//tshirt,pant,hoodie,  top=hoodie;
            switch (choice) {

                case 1:
                    System.out.println("Enter a num to push onto the stack");
                    stack.push(sc.nextInt());
                    System.out.println();
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped element: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty. Cannot pop.");
                    }
                    System.out.println();
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Top element (Peek): " + stack.peek());
                    } else {
                        System.out.println("Stack is empty. Cannot peek.");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Enter element to search");
                    int searchElement = sc.nextInt();
                    int position = stack.search(searchElement);
                    if (position != -1) {
                        System.out.println("Element found at position: " + position);
                    } else {
                        System.out.println("Element not found in the stack");
                    }
                    System.out.println();
                    break;

                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty\n");
                    } else {
                        System.out.println("Stack is not empty\n");
                    }
                    break;
//12 13 15 20
/*20
15
13
12*/                    
                case 6:
                    display(stack);
                    break;

                case 7:
                    System.out.println("Exiting");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println();

            }

        } while (choice != 7);
    }

    void display(Stack<Integer> stack) {
        System.out.println("Stack elements:");

        for (Integer num : stack) {
            System.out.print(" " + num + " ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        obj = new StackEx(); // Create an instance of class StackEx to access non-static methods from the static method (main function)

        obj.menu(stack);
    }
}
