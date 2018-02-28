import java.util.ArrayList;
import java.util.Scanner;

public class Sereja_and_Dima {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCards = scanner.nextInt();
        ArrayList<Integer> card = new ArrayList<>(numOfCards);
        int sereja = 0;
        int dima = 0;
        int max;
        boolean serStart = true;
        for (int i = 0; i < numOfCards; i++) {
            card.add(scanner.nextInt());
        }
        while (!(numOfCards == 0)) {
            if (card.get(0)>card.get(numOfCards-1)){
                max=card.get(0);
            }else {
                max=card.get(numOfCards-1);
            }
            if (serStart) {
                sereja += max;
                serStart = !serStart;
                card.remove(Integer.valueOf(max));
                numOfCards -= 1;
                max=0;
            } else {
                dima += max;
                serStart = !serStart;
                card.remove(Integer.valueOf(max));
                numOfCards -= 1;
                max=0;
            }
        }
        System.out.println(sereja + " " + dima);
    }
}