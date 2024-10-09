import java.util.Scanner;
import java.util.Random;
public class ArraySearch {
    public int search(int arr[],int n){
        int v=arr.length;
        for(int i=0; i<v; i++){
            if(arr[i]==n){
                return 1;
            }
        }
        return 0;

    }



    public static void main(String[] args) {
        ArraySearch aa=new ArraySearch();
        long stime= System.nanoTime();
        Scanner obj=new Scanner(System.in);
        Random rd=new Random();
        System.out.println("Enter the size of array here");
        int size=obj.nextInt();
        int arr[]=new int[size];
        for(int i=0; i< arr.length; i++){
            arr[i]=rd.nextInt(10);

        }
        System.out.println("Enter the number here that you want to search in random array");
        int b= obj.nextInt();
         int d=aa.search(arr,b);

        System.out.println("if number found then return 1 otherwise it  return 0 ");
        System.out.println(d);
        long endtime=System.nanoTime();
        long totaltime=endtime-stime;
        System.out.println("total time that is taken by itretive is:");
        System.out.println(totaltime);
        System.out.println("Array is here that gunrete random");
        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }



    }
}
