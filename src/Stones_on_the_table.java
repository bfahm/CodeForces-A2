import java.util.Scanner;

public class Stones_on_the_table {
    public static void main(String[]args){
        Stones_on_the_table forRem=new Stones_on_the_table();
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String input=scanner.next();
        System.out.println(input+","+num);
        System.out.println(forRem.remover(input,num));


    }
    private String remover(String input,int num){
        StringBuilder stringBuilder =new StringBuilder(input);
        //boolean stay=false;
        boolean smthChanged=true;
        while (true){
            int index=1;
            char current=stringBuilder.charAt(index);
            char next=stringBuilder.charAt(index+1);
            while (smthChanged) {
                smthChanged=false;
                if (stringBuilder.charAt(index) == stringBuilder.charAt(index - 1)) {
                    stringBuilder.deleteCharAt(index);
                    smthChanged=true;
                }
            }
            if(!(current==next)){
                index+=1;
            }
            if(index>num){
                break;
            }
        }
        return stringBuilder.toString();
    }
}