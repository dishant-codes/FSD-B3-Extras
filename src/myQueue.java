public class myQueue {

    private int[] arr;
    private int front;
    private int rear;
    private int maxSize;
    private int size;

    public myQueue(int size){
        this.maxSize = size;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.arr = new int[size];
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        arr[++rear] = data;
        size++;
    }

    public void dequeue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        front++;
        size--;
    }


    public boolean isFull(){
        return size == maxSize;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printQueue(){

        System.out.println("Queue: ");
        for (int i = front; i <= rear; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }



    static void main(String[] args) {

        myQueue queue = new myQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);


        queue.printQueue();

        queue.dequeue();


        queue.printQueue();

    }
}
