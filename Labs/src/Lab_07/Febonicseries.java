import java.util.Scanner;
public class Febonicseries {
    public int febonic(int n){
        if(n==0){
            return 0;

        }
        if(n==1){
            return 1;
        }
        return febonic(n-1)+febonic(n-2);

    }
    public void febonicc(int n){
        int a=0; int b=1;
        for(int i=0; i<n; i++){
            System.out.print(a+" ");
            //swap
            int c=b+a;
            a=b;
            b=c;
        }
    }

    public static void main(String[] args) {
        long stime= System.nanoTime();
        Febonicseries ff=new Febonicseries();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number here plz ");
        int c=obj.nextInt();
        System.out.println("febonic series up to number  through recuresion is here"+" ");

        for(int i=0; i<c; i++){
        System.out.print(ff.febonic(i));}
        long Etime= System.nanoTime();
        long total= Etime-stime;
        System.out.println();
        System.out.println("Time taken by recursion method is "+total);
        System.out.println();
        System.out.println("Febonic through itretive");
     //   System.out.println("Enter the number");
        ff.febonicc(c);
        long etime=System.nanoTime();
        long total1=etime-stime;
        System.out.println();
        System.out.println("Time taken by the itretive method is "+total1);




        }
    }



