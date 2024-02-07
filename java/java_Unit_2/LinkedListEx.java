import java.util.*;

class LinkedListEx {
    static LinkedListEx obj; // Static object to access methods of class LinkedListEx

    void create(LinkedList<Integer> list) {
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of LinkedList");
        size = sc.nextInt();

        System.out.println("Enter LinkedList");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt()); // add - to add element
        }
    }

    void menu(LinkedList<Integer> list) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--------------------LinkedList--------------------\n");
            System.out.println("1.display(get)\n2.insert(add)\n3.insertFirst\n4.insertLast\n5.insertAll\n6.insertAll at index\n" +
                    "7.delete(remove)\n8.deleteFirst\n9.deleteLast\n10.delete at index\n11.clear\n12.contains\n13.indexOf\n" +
                    "14.lastIndexOf\n15.offer\n16.offerFirst\n17.offerLast\n18.display(descending order)\n19.exit\n");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    display(list);
                    break;

                case 2:
                    System.out.println("Enter a num to LinkedList");
                    list.add(sc.nextInt());
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Enter a element to add at the beginning");
                    list.addFirst(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Enter a element to add at the end");
                    list.addLast(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Enter length of nums you want to add");
                    int addSize = sc.nextInt();

                    LinkedList<Integer> addList = new LinkedList<>();
                    System.out.println("Enter nums to LinkedList");
                    for (int i = 0; i < addSize; i++) {
                        addList.add(sc.nextInt());
                    }
                    list.addAll(addList);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Enter index to add collection");
                    int index = sc.nextInt();
                    System.out.println("Enter length of nums you want to add at index " + index);
                    int addAtIndexSize = sc.nextInt();

                    LinkedList<Integer> addAtIndexList = new LinkedList<>();
                    System.out.println("Enter nums to LinkedList");
                    for (int i = 0; i < addAtIndexSize; i++) {
                        addAtIndexList.add(sc.nextInt());
                    }
                    list.addAll(index, addAtIndexList);
                    System.out.println();
                    break;

                case 7:
                    System.out.println("Enter index for delete");
                    int deleteIndex = sc.nextInt();
                    if (deleteIndex < 0 || deleteIndex >= list.size()) {
                        System.out.println("Invalid Index");
                    } else {
                        list.remove(deleteIndex);
                    }
                    System.out.println();
                    break;

                case 8:
                    list.removeFirst();
                    break;

                case 9:
                    list.removeLast();
                    break;

                case 10:
                    System.out.println("Enter index for delete");
                    int deleteAtIndex = sc.nextInt();
                    if (deleteAtIndex < 0 || deleteAtIndex >= list.size()) {
                        System.out.println("Invalid Index");
                    } else {
                        list.remove(deleteAtIndex);
                    }
                    System.out.println();
                    break;

                case 11:
                    list.clear();
                    System.out.println("LinkedList is cleared\n");
                    break;

                case 12:
                    System.out.println("Enter element to check if it's present");
                    int checkElement = sc.nextInt();
                    if (list.contains(checkElement)) {
                        System.out.println("Element is present\n");
                    } else {
                        System.out.println("Element is not present\n");
                    }
                    break;

                case 13:
                    System.out.println("Enter element to get its index");
                    int indexOfElement = sc.nextInt();
                    int indexResult = list.indexOf(indexOfElement);
                    if (indexResult != -1) {
                        System.out.println("Index of element: " + indexResult + "\n");
                    } else {
                        System.out.println("Element not found in the LinkedList\n");
                    }
                    break;

                case 14:
                    System.out.println("Enter element to get its last index");
                    int lastIndexOfElement = sc.nextInt();
                    int lastIndexResult = list.lastIndexOf(lastIndexOfElement);//If not found= -1 
                    if (lastIndexResult != -1) {
                        System.out.println("Last index of element: " + lastIndexResult + "\n");
                    } else {
                        System.out.println("Element not found in the LinkedList\n");
                    }
                    break;

                case 15:
                    System.out.println("Enter element to offer");
                    list.offer(sc.nextInt());
                    //a.offer();
                    System.out.println();
                    break;

                case 16:
                    System.out.println("Enter element to offer at the beginning");
                    list.offerFirst(sc.nextInt());
                    System.out.println();
                    break;

                case 17:
                    System.out.println("Enter element to offer at the end");
                    list.offerLast(sc.nextInt());
                    System.out.println();
                    break;

                case 18:
                    displayDescending(list);
                    break;

                case 19:
                    System.out.println("Exiting");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println();

            }

        } while (choice != 19);
    }

    void display(LinkedList<Integer> list) {
        System.out.println("LinkedList using get()");

        for (Integer num : list) {
            System.out.print(" " + num + " ");
        }
        System.out.println("\nLinkedList: " + list + "\n");
    }

    void displayDescending(LinkedList<Integer> list) {
        Iterator<Integer> descendingIterator = list.descendingIterator();
        System.out.println("LinkedList in descending order:");

        while (descendingIterator.hasNext()) {
            System.out.print(" " + descendingIterator.next() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        obj = new LinkedListEx(); // Create an instance of class LinkedListEx to access non-static methods from the static method (main function)

        obj.create(list);
        obj.menu(list);
    }
}
