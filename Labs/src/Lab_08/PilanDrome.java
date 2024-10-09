package Lab_08;

public class PilanDrome {
    public static boolean Pilandrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return Pilandrome(str,start+1,end-1);
    }

    public static void main(String[] args) {
        String str="racecar";
        System.out.println(Pilandrome(str,0,str.length()-1));
    }}
    

