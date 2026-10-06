
class myNode{
    int data;
    myNode next;

    public myNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedListIntro {

    myNode head;

    public void insertAtBeginning(int data){
        myNode newNode = new myNode(data); // 20 -> null
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head; //  head = 10-> null
        // newNode =  20 -> 10 -> null;
        // 30 -> 20 -> 10 -> null
        // 40 -> 30 -> 20 -> 10 -> null
        head = newNode;
    }



    public void printList(){
        myNode curr = head;
        while(curr != null){
            System.out.print(curr.data+"-> ");
            curr = curr.next;
        }
        System.out.print(" null");
        System.out.println();
    }


    public int delete(){

        int deleted = head.data;

        head = head.next;

        return deleted;
    }


    public int deleteByKey(int key){

        myNode curr = head;

        try{
            while(curr != null){

                //  key = 50
                if (curr.next.data == key){
                    int deleted = curr.next.data;

                    // 60 -> 50 -> 40 -> 30 -> 20 -> 10

                    // 60 -> 40 -> 30 -> 20 -> 10 -> null
                    curr.next = curr.next.next;
                    return deleted;
                }
                curr = curr.next;
            }
        } catch (Exception e) {
            System.out.println("Error is :"+e.getMessage());
        }

        System.out.println("key not found");

        return -1;
    }


    public boolean find(int key){
        myNode curr = head;
        while(curr != null){
            if (curr.data == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }


    public void reverse(){

        myNode curr = head;


        while(curr != null){
          myNode prev = curr.next;





        }


    }



    // curr = head
    // curr = 30 -> 20 -> 10 -> null

    // head = head.next
    // head = 20 -> 10 -> null



    // curr.data = 30
    // curr = curr.next

    // curr = 20 -> 10 -> null
    // curr.data = 20
    // curr = curr.next


    // curr = 10 -> null
    // curr.data = 10
    // curr = curr.next

    // curr = null
    //
    static void main(String[] args) {

        LinkedListIntro list = new LinkedListIntro();


        list.insertAtBeginning(10); // 10 -> null
        list.insertAtBeginning(20); // 20 -> 10 -> null
        list.insertAtBeginning(30); // 30 -> 20 -> 10 -> null
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        list.insertAtBeginning(60);
        list.insertAtBeginning(70);

        list.printList();


//        list.delete();
        list.deleteByKey(50);


        list.printList();


        if (list.find(50)){
            System.out.println("Element Found");
        }
        else {
            System.out.println("Element not found");
        }
//        myNode head = new myNode(10);
//
//        // 10 -> null
//
//        head.next = new myNode(20);
//
//        // 10 -> 20 -> null
//
//
//        head.next.next = new myNode(30);
//
//        // 10 -> 20 -> 30 -> null
//
//        System.out.print(head.data+"->");
//        System.out.print(head.next.data+"->");
//        System.out.print(head.next.next.data +"->");
//        System.out.print(head.next.next.next);




    }

}
