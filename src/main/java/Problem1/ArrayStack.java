package Problem1;

//Stack is First In Last Out (FILO).
//Stack of dishes. top, bottom, pop off push in
//https://www.youtube.com/watch?v=sFVxsglODoo used this video to understand

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        data = (T[]) new Stack[size];
        this.size = 0;

    }

    @Override
    public boolean push(T val) { //add top
        if(data.length == size) {
            return false;
        } else {
            int top = size -1;
            data[++top] = val; //data[top++] = val;
            return true;
        }
    }

    @Override
    public T pop() { //remove top
        int top = size -1;
        if(top == -1) { //if(top == 0)
            System.out.println("Empty");
            return null;
        } else {
            T val = data[size - 1];
            data[--top] = null; //data[top--] = null;
            return val;
        }
    }

    @Override
    public T peek() { //get first
        int top = size -1 ;
        if(top == 0) { //if(top == 0)
            System.out.println("Empty");
            return null;
        } else {
            return data[top];
        }
    }

    @Override
    public int size() {
        return size;
    }
}
