import java.util.Scanner;

public class Night_At_Museum {
    public static void main(String[] args) {

        int totalCount = 0;
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        if (myString.charAt(0) != 'a') {
            myString = "a" + myString;
        }
        for (int i = 0; i < myString.length() - 1; i++) {
            int aStraight = (int) myString.charAt(i) - 96;
            int zStraight = (int) myString.charAt(i + 1) - 96;

            //algorithm
            int ax = aStraight;
            int counterXSt = 0;
            int axi = aStraight;
            int counterXIn = 0;

            while (true) {
                if (ax == zStraight) {
                    break;
                } else if (ax == 26) {
                    ax = 1;
                    counterXSt += 1;
                } else {
                    ax += 1;
                    counterXSt += 1;
                }
            }

            while (true) {
                if (axi == zStraight) {
                    break;
                } else if (axi == 1) {
                    axi = 26;
                    counterXIn += 1;
                } else {
                    axi -= 1;
                    counterXIn += 1;
                }
            }

            if (counterXSt < counterXIn) {
                totalCount += counterXSt;
            } else {
                totalCount += counterXIn;
            }
        }
        System.out.println(totalCount);
    }
}