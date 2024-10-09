public class InsertionSort {
    public void Insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int cur=arr[i];
            int prev=i-1;
            // here finding out the corect position for insert
            while(prev>=0 && arr[prev]>cur ){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserating
            arr[prev+1]=cur;
        }
    }
    public void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        InsertionSort i=new InsertionSort();
        int array[]={5,4,1,3,2};
        i.Insertion(array);
        i.print(array);
    }
}
