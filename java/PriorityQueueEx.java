import java.util.*;

class PriorityQueueEx {
    static PriorityQueueEx obj; // Static object to access methods of class PriorityQueueEx

    void menu(PriorityQueue<Integer> priorityQueue) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n--------------------PriorityQueue--------------------\n");
            System.out.println("0.Display\n1.Add\n2.Peek\n3.Poll\n4.Clear\n5.Contains\n6.Offer\n7.Exit\n");
            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Priority Queue: ");
                    for(Integer i:priorityQueue){
                        System.out.print(" "+i+" ");
                    }
                        System.out.println();
                    break;        
                case 1:
                    System.out.println("Enter a num to add to the priority queue");
                    int numToAdd = sc.nextInt();
                    boolean added = priorityQueue.add(numToAdd);
                    System.out.println("Element added successfully: " + added);
                    break;

                case 2:
                    Integer head = priorityQueue.peek();
                    System.out.println("Head of the priority queue: " + head);
                    break;

                case 3:
                    Integer polled = priorityQueue.poll();
                    if (polled != null) {
                        System.out.println("Polled element: " + polled);
                    } else {
                        System.out.println("Priority queue is empty. Cannot poll.");
                    }
                    break;

                case 4:
                    priorityQueue.clear();
                    System.out.println("PriorityQueue is cleared\n");
                    break;

                case 5:
                    System.out.println("Enter element to check if it's present");
                    int checkElement = sc.nextInt();
                    if (priorityQueue.contains(checkElement)) {
                        System.out.println("Element is present\n");
                    } else {
                        System.out.println("Element is not present\n");
                    }
                    break;

                case 6:
                    System.out.println("Enter a num to offer to the priority queue");
                    int numToOffer = sc.nextInt();
                    boolean offered = priorityQueue.offer(numToOffer);
                    System.out.println("Element offered successfully: " + offered);
                    break;

                case 7:
                    System.out.println("Exiting");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println();

            }

            System.out.println("Priority Queue: " + priorityQueue);

        } while (choice != 7);
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        obj = new PriorityQueueEx(); // Create an instance of class PriorityQueueEx to access non-static methods from the static method (main function)

        obj.menu(priorityQueue);
    }
}
