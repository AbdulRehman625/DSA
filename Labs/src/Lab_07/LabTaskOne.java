import java.util.Scanner;

public class LabTaskOne {
    int dsc(int n){
        if(n==0){
            return 1;
        }
        else{
            System.out.print(n+" ");
            return dsc(n-1);


        }

    }
    void asc(int n){
        if(n==0){
            System.out.println();
        }else {
//        System.out.print(n+" ");
            asc(n - 1);
            System.out.print(n + " ");
        }
    }
    public void Alphabet(int n){
        if(n>122){
            System.out.println();
        }
        else{
            int i=n;
            char ch;
            ch=(char)n;
            System.out.print(ch+" ");
            Alphabet(i+1);
            System.out.print(ch+" ");
        }

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LabTaskOne ll=new LabTaskOne();
        System.out.println("Enter the number here for asceinding and decending order");

        int b=sc.nextInt();
        System.out.print("Desecnding order up to  ");
        System.out.println(b);
        ll.dsc(b);
        System.out.println();

        System.out.println("Assceding oreder up to ");
        ll.asc(b);
        System.out.println();
        System.out.println("Enter Asci number here+" );
        int d=sc.nextInt();
        ll.Alphabet(d);
      //  System.out.println(ll.asc(b));

    }
}
