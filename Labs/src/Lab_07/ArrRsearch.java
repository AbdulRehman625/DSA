import java.util.Scanner;
import java.util.Random;
public class ArrRsearch {
    public void search(int arr[],int n,int index){
        if(index<arr.length)
            if(arr[index]==n){
                System.out.println("elememnt found at "+index);
                return;
            }

        else{
            search(arr,n,index+1);
        }

        if(index==arr.length)

            System.out.println("element not found at "+index);

    }

    public static void main(String[] args) {
        ArrRsearch aa =new ArrRsearch();
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
        aa.search(arr,b,0);




        long endtime=System.nanoTime();
        long totaltime=endtime-stime;
        System.out.println("total time that is taken by recursion is:");
        System.out.println(totaltime);
        System.out.println("Array is here that gunrete random");
        for(int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }



    }

}
