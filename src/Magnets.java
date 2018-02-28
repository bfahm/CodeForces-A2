import java.util.Scanner;

public class Magnets {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String lastGp="00";
        int groupNum=1;
        int numOfMags=scanner.nextInt();
        String firstMag=scanner.next();
        if (firstMag.equals("01")){lastGp="01";}
        else if (firstMag.equals("10")){lastGp="10";}
        //else {lastGp="00"; System.exit(5);}

        for(int i=0;i<numOfMags-1;i++){
            String next=scanner.next();
            if ((lastGp.equals("01") && next.equals("10"))) {
                groupNum++;
                lastGp=next;
            }else if(lastGp.equals("10")&&next.equals("01")){
                groupNum++;
                lastGp=next;
            }
            /*else{
                if(!next.equals("01")||!next.equals("10"))
                System.exit(10);}*/
        }
        System.out.println(groupNum);

    }
}
