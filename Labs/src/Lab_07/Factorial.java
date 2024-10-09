public class Factorial {
    public int  fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
           return   n*fact(n-1);
        }
    }
    public int factorial(int n){
        int result=1;
        int i;
        for( i=2; i<=n; i++){
            result=result*i;

        }
        return result;
    }

    public static void main(String[] args) {
        long stime= System.nanoTime();
        Factorial ff=new Factorial();
        System.out.print("factorila of a number"+" is ");
        System.out.println( ff.fact(5));
        long et= System.nanoTime();
        long t=et-stime;
        System.out.println();
        System.out.println("timme taken by throug recusrsion is "+t);
        System.out.print("Factorial through itrtive is");
        int c=ff.factorial(3);
        System.out.println(c);
        long e=System.nanoTime();
        long tt=e-stime;
        System.out.println();
        System.out.println("time tkaen by through itretive is "+tt);


    }
}
