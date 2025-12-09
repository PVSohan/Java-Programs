import java.util.Scanner;.*

/**
 * singlelinkedlist
 */
public class singlelinkedlist {

    class node {
        int data;
        node next;
    }

    public node(int data){
        this.data = data;
        this.next = null;
    }

    public static node head = tail,null,temp,temp1;

public void createnode(){
    scanner sc - new scanner(System.in);
    System.out.println("Enter the data:");
    int n = sc.nextint();

    for(int i=0;i<n;i++){
        System.out.println("Enter the data:");
        int val = sc.nextint();
        node newnode = new node (val);
        if(head == null){
            head=temp=newnode;
        }
        else{
            temp.next = newnode;
            temp = newnode; 
        }
    }
}

public void insert_at_beg(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data to insert at beg:");
    int val = sc.nextInt();
    node newnode = new node(val);
    if(head == null){
        head = newnode;

    }
    else{
        newnode.next = head
        head = newnode;
    }
}

    public void display() {
        int temp = head;
        while (temp.next != null) {
            System.out.println("%d\n", temp.data);
            temp = temp.next;
        }
    }

public void insert_at_end(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the data to insert at end:");
    int val = sc.nextint();
    node newnode = new node(val);
    if(head == null){
         head = newnode;
    }
    else{
        int temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
    temp.next - newnode;
    }
}

    public void insert_at_any_position() {
        temp = temp1 = head;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the data in any position:");
        int valx = sc.nextint();
        
        if (val == 1){
            insert_at_beg();

        }
        else{
          for(int i=0; i<val-1; i++){
          temp1 = temp;
          temp = temp.next;
          temp1.next = newnode;
          newnode.next = temp;

    }

}