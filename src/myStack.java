public class myStack {

    private int[] stack;
    private int size;
    private int maxSize;
    private int top;



    public myStack(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        this.top = -1;
        this.stack = new int[maxSize];
    }

    // push(), pop(), peek(), isEmpty(), isFull()


    public void push(int data){
        if (isFull()){
            System.out.println("Stack is Overflow");
        }
        stack[++top] = data;
        size++;
    }


    public void showDeleted(){

        System.out.println(stack[top+1]);

    }

    public int pop(){

        if (isEmpty()){
            System.out.println("Stack is Underflow");
        }

        int temp = stack[top];
        top--;
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == maxSize;
    }


    public void display(){


        System.out.println("Stack : ");
        for (int i = 0; i < size; i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();

    }


    static void main(String[] args) {


        myStack stack1 = new myStack(10);

        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        stack1.push(60);
        stack1.push(70);

        stack1.display();
        stack1.pop();
        stack1.push(90);
        stack1.display();

        stack1.showDeleted();




    }

}
