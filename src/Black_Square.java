import java.util.Scanner;

public class Black_Square {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int calorieIndex[]=new int[4];
        calorieIndex[0]=scanner.nextInt();
        calorieIndex[1]=scanner.nextInt();
        calorieIndex[2]=scanner.nextInt();
        calorieIndex[3]=scanner.nextInt();

        StringBuilder whichIndex=new StringBuilder(scanner.next());
        int chooser[]=new int[whichIndex.length()];

        for (int i=0;i<whichIndex.length();i++){
            chooser[i]=Character.getNumericValue(whichIndex.charAt(i));
        }
        for (int j=0;j<chooser.length;j++){
            sum+=calorieIndex[chooser[j]-1];
        }
        System.out.println(sum);
    }
}
