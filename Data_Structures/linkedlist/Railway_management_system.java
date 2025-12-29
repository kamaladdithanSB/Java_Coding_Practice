package Data_Structures.linkedlist;



class node{
    String data;//the datatype of data
    node next;//
    node(String data){
        this.data=data;
        this.next=null;
    }
}


class Main_SingleLinked{
    node head;//pointing to the head=first node

    public void addstation(String data){
        node newnode = new node(data);
        if(head==null){
            head = newnode;
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public void addatendoftrack(String data){
        node newnode = new node(data);
        if(head==null){//checking whether my linkedlist has only one node!
            head = newnode;
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newnode;

    }

    public void addstationatbeggining(String data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
    }

    public void addstationatgivenposition(int position,String data){
        node newnode = new node(data);
        if(position==0){
            addstationatbeggining(data);
            return;
        }
        node temp = head;
        for(int i = 0;i<position-1&& temp!= null;i++){
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("index out of bounds");
            return;
        }
        newnode.next=temp.next;
        temp.next= newnode;
    }

    public void removestationatbeggining(){
        if(head!=null){
            head = head.next;
            return;
        }
    }

    public void removestationatgivenposition(int position){
        if(position==0){
            removestationatbeggining();
            return;
        }
       
        node temp = head;
        for(int i=0;i<position-1&&temp!=null;i++){
            temp = temp.next;
        }
        if(temp==null||temp.next==null){
            System.out.println("index out of bounds");
            return;
        }

        temp.next = temp.next.next;
    }

    public void printList(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Railway_management_system
{
    public static void main(String[] args)
     {
        Main_SingleLinked railway = new Main_SingleLinked();
        
        railway.addstation("chennai");
        railway.addstation("salem");
        railway.addstation("tirumala");
        railway.addstation("delhi");
        railway.printList();

        railway.addatendoftrack("chitoor");
        railway.printList();

        railway.addstationatgivenposition(2, "manali");
        railway.printList();
        
        railway.removestationatgivenposition(3);

        railway.printList();

    }
}
