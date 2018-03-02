import java.util.Scanner;

public class Police_Recruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int event_num=scanner.nextInt();
        int crimes=0;
        int current_recruits=0;
        int leftUntreated=0;
        for (int i=0;i<event_num;i++){
            int scanned=scanner.nextInt();
            if (scanned<0){
                crimes=1;
            }else{
                current_recruits+=scanned;
            }
            if (current_recruits<crimes){
                leftUntreated+=1;
                crimes=0;
            }else if(crimes>0){
                current_recruits-=1;
                crimes=0;
            }
        }
        System.out.println(leftUntreated);
    }
}
