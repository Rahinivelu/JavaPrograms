package JavaProgram;

public class arrayStack<T> {

    static final int MAX_SIZE=10;
    T arr[]=(T[])new Object[MAX_SIZE];
    int top;

    arrayStack(){
        top=-1;
    }

    void push(T val){
        if(top==MAX_SIZE-1)
            throw new IndexOutOfBoundsException("The array is full");
        arr[++top]=val;
    }

    T pop()
    {
        if(top==-1)
            throw new IndexOutOfBoundsException("The array is empty");
        return arr[top--];
    }

    T peek(){
        return  arr[top];
    }

    boolean isEmpty(){
        return top==-1;
    }
}
