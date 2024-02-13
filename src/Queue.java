import java.util.Random;

public class Queue {
    private final int[] queue;
    private int front;
    private int rear;
    private final int maxSize;
    private int currentSize;

    public Queue(int size) {
        this.maxSize = size;
        this.queue = new int[size];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public boolean isFull() {
        return this.currentSize == this.maxSize;
    }

    public boolean isEmpty() {
        return this.currentSize == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % maxSize;
        queue[rear] = item;
        currentSize++;
        System.out.println("Added " + item + " to the queue");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int item = queue[front];
        front = (front + 1) % maxSize;
        currentSize--;
        System.out.println("Removed " + item + " from the queue");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < currentSize; i++) {
            System.out.print(queue[(front + i) % maxSize] + " ");
        }
        System.out.println();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Queue queue = new Queue(5);
        for (int i = 0; i < 5; i++) {
            queue.enqueue(rand.nextInt(100));
        }
        queue.display();
        queue.dequeue();
        queue.display();
        System.out.println("Peek: " + queue.peek());
        System.out.println("Size: " + queue.size());
    }
}

