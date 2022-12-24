package ua.gaponov.task2;

import java.util.Arrays;
import java.util.Objects;

public class NumberReplace {
    private String[] numbersOut;

    private final Object MONITOR = new Object();

    public void getNumbers(int n) {

        numbersOut = new String[n];

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                if ((i+1) % 3 == 0) {
                    synchronized (MONITOR) {
                        numbersOut[i] = "fizz";
                    }
                }
            }
        });


        Thread threadB = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                if ((i+1) % 5 == 0) {
                    synchronized (MONITOR) {
                        numbersOut[i] = "buzz";
                    }
                }
            }
        });

        Thread threadC = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                if (((i+1) % 3 == 0) && ((i+1) % 5 == 0)) {
                    synchronized (MONITOR) {
                        numbersOut[i] = "fizzbuzz";
                    }
                }
            }
        });

        Thread threadD = new Thread(() -> {
            for (int i = 0; i < n; i++) {
                if (((i+1) % 3 != 0) && ((i+1) % 5 != 0)) {
                    synchronized (MONITOR) {
                        numbersOut[i] = String.valueOf(i+1);
                    }
                }
            }
        });


        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();

        while (true){
            if (Arrays.stream(numbersOut).filter(Objects::nonNull).count() == n){
                System.out.println(Arrays.toString(numbersOut));
                break;
            }
        }

    }

}
