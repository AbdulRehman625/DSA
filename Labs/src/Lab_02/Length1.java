//public class Length1 {
//
//        Node head;
//        int data;
//
//        public void add(int data) {
//            Node newnode = new Node(data);
//
//            if (head == null) {
//                head = newnode;
//            } else {
//                Node temp = head;
//                while (temp.next != null) {
//
//                    temp=temp.next;
//                }
//               temp.next = newnode;
//            }
//        }
//        int num=0;
//        void Print(){
//            if(head==null){
//                System.out.println("Linklist is empty:");
//            }
//            else{
//                Node temp=head;
//                while(temp!=null){
//                    System.out.print(temp.data+" ");
//                    temp=temp.next;
//                    num++;
//
//                }
//                System.out.println();
//
//            }
//        }
//
//
//
//        public static void main(String[] args) {
//            Length1 LL = new Length1();
//           LL.add(5);
//            LL.add(10);
//            LL.add(15);
//            LL.add(20);
//            LL.add(25);
//            LL.Print();
//            System.out.println("lenth is here: "+LL.num);
//        }
//
//    }
//
//
//
//
//
