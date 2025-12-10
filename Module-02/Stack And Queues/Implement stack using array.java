// Problem Link: https://www.geeksforgeeks.org/problems/implement-stack-using-array/1#

//code: 

class myStack {
    int arr[];
    int top;
    public myStack(int n) {
        // Define Data Structures
        arr = new int[n];
        top = -1;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        return (top == -1);
    }

    public boolean isFull() {
        // check if the stack is full
        return (top == arr.length-1);
    }

    public void push(int x) {
        // Inserts x at the top of the stack
        if (!isFull()) { // Overflow 
            top+=1;
            arr[top] = x;
        }
        
    }

    public void pop() {
        // Removes an element from the top of the stack
        if (!isEmpty()) // Underflow
            top-=1;
    }

    public int peek() {
        // Returns the top element of the stack
        if (top == -1) {
            return -1;
        }
        
        return arr[top];
    }
}
