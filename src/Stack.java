import java.util.Random;

public class Stack {
    private final int maxSize;
    private final int[] stack;
    private int top;

    public Stack (int size) {
        this.maxSize = size;
        this.stack = new int[size];
        this.top = -1;
    }

    public boolean isFull() {
        return this.top == this.maxSize -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        stack[++top] = item;
        System.out.println("Added " + item + " to the stack");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        int item = stack[top--];
        System.out.println(("Removed " + item + " from the stack"));
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("The top element is " + stack[top]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Stack stack = new Stack(10);
        for (int i = 0; i < 10; i++) stack.push(rand.nextInt(100));
        stack.display();
        stack.pop();
        stack.display();
        stack.peek();
    }
}
