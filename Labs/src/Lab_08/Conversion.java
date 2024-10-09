package Lab_08;

public class Conversion {
    public static String DTB(int num){
        if(num==1){
            return "1";
        }
        return DTB(num/2)+(num%2);

    }

    public static void main(String[] args) {
        int num=13;
        System.out.println(DTB(13));
    }
}
