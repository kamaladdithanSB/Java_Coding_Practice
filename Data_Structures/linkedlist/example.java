package Data_Structures.linkedlist;

import java.util.Scanner;

class node{
    String data;
    node next;
    node(String data){
        this.data=data;
        this.next=null;
    }
}

class singlelinked{
    node head;
    public void insert(String data){
        node newnode = new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    public void printList(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
}
public class example {
    public static void main(String[] args) {
        singlelinked sl = new singlelinked();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of task to add in linkedlist: ");
        int n = s.nextInt();
        s.nextLine();
        System.out.println("enter the tasks below: ");
        for(int i = 0;i<n;i++){
            String dt = s.nextLine();
            sl.insert(dt);

        }
        sl.printList();
        s.close();


    }
}
