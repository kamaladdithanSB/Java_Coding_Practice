package Data_Structures.linkedlist;

class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this.next = null;
    }
}
class singlelylinkedlist{
    node head;
    //insertion at end
    public void insert(int data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        node temp = head;
        while(temp.next != null){
            temp  =temp.next;
        }
        temp.next = newnode;
    }
    //insertion at beggining
    public void insertatbeggining(int data){
        node newNode = new node(data);
        newNode.next = head;
        head = newNode;
    }

    //insert at a position
    public void insertatposition(int index,int data){
        if(index == 0){
            insertatbeggining(data);
            return;
        }
        node newnNode = new node(data);
        node temp = head;
        for(int i = 0;i<index-1 && temp != null;i++){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Index out of bounds");
            return;
        }
        newnNode.next = temp.next;
        temp.next = newnNode;
    }
    //delete at beggining
    public void deleteatbeginning(){
        if(head!=null){
            head = head.next;
        }
    }
    //delete at end
    public void deleteatend(){
        if(head==null||head.next==null){
            head = null;
            return;        
        }
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    //delete at a given position
    public void deleteatgivenposition(int index){
        if(index == 0){
            deleteatbeginning();
            return;
                
        }
        node temp = head;
        for(int i =0;i<index-1&& temp !=null;i++){
            temp = temp.next;
        }
        if(temp == null||temp.next == null){
            System.out.println("index out of bound");
            return;
        }
        temp.next = temp.next.next;
    }
        //traversal
        public void printList(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }



    public class CRUDoperations{
        public static void main(String[] args){
            singlelylinkedlist list = new singlelylinkedlist();
            list.insert(10);
           list.insert(20);
            list.insert(30);
            list.printList();

            list.insertatbeggining(5);
            list.printList();

            list.insertatposition(2,15);
            list.printList();

            list.deleteatgivenposition(3);
            list.printList();

            list.deleteatend();
            list.printList();
        
        }
    }



    
    



