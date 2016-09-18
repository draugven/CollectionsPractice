package MinimumOfN;

import java.util.*;

/**
 * Created by Elizaveta Naimark on 18.09.2016.
 */

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an int");
        n = in.nextInt();

        List<Integer> consecutiveNumbers = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            consecutiveNumbers.add(i);
        }

        for (Integer element : consecutiveNumbers) {
            System.out.print(element + " ");
        }

        System.out.println();

        int x = n;

        consecutiveNumbers.subList(n/2, consecutiveNumbers.size()).clear();

        for (Integer element : consecutiveNumbers) {
            System.out.print(element + " ");
        }

        List<Integer> randomNumbers = new ArrayList<>();

        Random randomGen = new Random();

        for (int i = 1; i <= n; i++) {
            randomNumbers.add(randomGen.nextInt());
        }

        for (Object element : randomNumbers) {
            System.out.print(element + " ");
        }

        System.out.println();

        int randomNumbersMin = Collections.min(randomNumbers);
        int randomNumbersMax = Collections.max(randomNumbers);

        System.out.println("Min of randomNumbers: " + randomNumbersMin + "; Max of randomNumbers: " + randomNumbersMax);

        Collections.sort(randomNumbers);

        for (Object element : randomNumbers) {
            System.out.print(element + " ");
        }


    }
}
