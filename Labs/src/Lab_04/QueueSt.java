

public class QueueSt extends StackLinked{
    // Implement Queue using two stacks
        private StackLinked s1, s2;

        // Constructor
        QueueSt() {
            s1 = new StackLinked();
            s2 = new StackLinked();
        }

        // Enqueue an item to the queue
        public void enqueue(int data)
        {
            s1.push(data);


            // Write your code here
        }

        // Dequeue an item from the queue
        public int dequeue()
        {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            int temp=s2.pop();
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
            // Write your code here
            return temp;
        }

        public static void main(String[] args) {
            int[] keys = {1, 2, 3, 4, 5 };
            QueueSt q = new QueueSt();
// insert above keys
            for (int key : keys) {
                q.enqueue(key);
            }
            System.out.println(q.dequeue());
// print 1
            System.out.println(q.dequeue());
// print 2
        }
    }

