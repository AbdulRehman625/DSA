
class Node7
{
    int data;       // integer data
    Node7 next;

    Node7(int data) {
        this.data = data;
        this.next = null;
    }
    // pointer to the next node

};

class StackLinked
{
    private Node7 top;

    public StackLinked() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    Node7 head;
    public void push(int x) // insert at the beginning
    {
        Node7 newnode=new Node7(x);
        if(head==null){
            head=newnode;
            return;

        }
        else{
            newnode.next=head;
            head=newnode;

        }


        // Write your code here
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        if(head==null){
            return true;
        }
        return false;
        // Write your code here
    }

    // Utility function to return top element in a stack
    public int top()
    {
        // Write your code here
        return head.data;
    }

    // Utility function to pop top element from the stack and
 //   check for Stack underflow
    public int pop() // remove at the beginning
    {
        if(head==null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int temp = head.data;
       head=head.next;
        return temp;



        // Write your code here
    }
}

class StackImpl
{
    public static void main(String[] args)
    {
        StackLinked stack = new StackLinked();

        stack.push(1);
        stack.push(2);
        stack.push(3);
       // stack.push(4);

        System.out.println("Top element is " +  stack.top());

        stack.pop();
        stack.pop();
        stack.pop();

        if (stack.isEmpty()) {
            System.out.print("Stack is empty");
        } else {
            System.out.print("Stack is not empty");
        }
    }
}




