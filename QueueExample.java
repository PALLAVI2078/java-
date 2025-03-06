import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a queue
        Queue<Integer> queue = new LinkedList<>();
        
        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        
        // Displaying the queue
        System.out.println("Queue: " + queue);
        
        // Removing an element from the queue (FIFO order)
        int removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        
        // Checking the front element without removing it
        int frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
        
        // Displaying the updated queue
        System.out.println("Updated Queue: " + queue);
    }
}