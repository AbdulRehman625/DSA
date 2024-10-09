import java.util.Stack;
import java.lang.String;

import java.util.Scanner;

public class BalancedB {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }}
    Node head;
    public  void addfrist(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }

    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
            while(temp!=null){
                temp=temp.next;

            }
            temp.next=newnode;
            temp=newnode;
        }
    }
    public void balanced(String str){
        Stack <Character> s1=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('|| str.charAt(i)=='{' || str.charAt(i)=='['){
                s1.push(str.charAt(i)); //All open breakts push here.
            }
            if(str.charAt(i)==')'){ //close breakt and open peek then pop
                if(s1.peek()=='('){
                    s1.pop();
                }
                else{
                    System.out.println("unblanced");
                    return;
                }
            }
            if(str.charAt(i)=='}'){
                if(s1.peek()=='{'){
                    s1.pop();
                }
                else{
                    System.out.println("unblanced");
                    return;
                }
            }
            if(str.charAt(i)==']'){
                if(s1.peek()=='['){
                    s1.pop();
                }
                else{
                    System.out.println("unblanced");
                    return;
                }
            }


        }
        if(s1.isEmpty()){
            System.out.println("Balanced brekts");
        }
        else{
            System.out.println("Unblanced breakts");

        }

    }


    public void Display(){
        if(head==null){
            System.out.println("linked list is empty");
            return ;
        }

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("->");
    }


      char firstSingleLetter ( String text , int n) {
          int n1 = text.length();
          for (int i = 0; i < n1; i++) {
              char current = text.charAt(i);
              boolean single = true;
              for (int j = 0; j < n; j++) {
                  if (i != j && current == text.charAt(j)) {
                      single = false;
                      break;

                  }
              }
              if (single) {
                  return current;
              }



          }
          return 0;
    }





          public static void main (String[]args){
              BalancedB ll = new BalancedB();
              Scanner sc = new Scanner(System.in);
              String str;
              System.out.println("Enter your string here" + " ");
              str = sc.nextLine();
            //  ll.balanced(str);
      System.out.println(ll.firstSingleLetter(str,str.length()));


          }}


