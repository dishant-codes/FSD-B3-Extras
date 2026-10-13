public class HeapDS {

    private int[] data;
    private int capacity;
    private int size;

    public HeapDS(int capacity){
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;
    }

    public void swap(int i, int j){
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void insert(int value){
        data[size] = value;
        size++;
        shiftUp(size-1);
    }


    private int parent(int i) {
            return (i-1/2);
    }

    private void shiftUp(int index){

        while ((index > 0) && data[index] < data[parent(index)]){
            int pIdx = parent(index);
            swap(index, pIdx);
            index = pIdx;
        }

    }

    public void printArray(){
        System.out.print("[");
        for (int i = 0; i< size;i++){
            System.out.print(data[i]+(i < size - 1 ? ", " : ""));
        }
        System.out.print("]");
    }

    static void main(String[] args) {

        HeapDS heap = new HeapDS(8);

        int[] values = {15, 13, 14, 16, 17};


        for (int val: values){
            heap.insert(val);
            heap.printArray();
        }
    }
}
