package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DesafioApplication {

    private static List<Integer> fibonacciResult;

    /**
     * Method that calculates and returns a list with the first numbers of the Fibonacci series until it exceeds 350.
     *
     * @return
     */
    public static List<Integer> fibonacci() {
        fibonacciResult = new ArrayList<>();

        fibonacciResult = Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(15)
                .map(n -> n[0])
                .collect(toList());
        return fibonacciResult;
    }

    /**
     * Checks whether the number received by parameter is among the Fibonnaci sequence numbers.
     *
     * @param number
     * @return
     */
    public static Boolean isFibonacci(final Integer number) {
        return fibonacciResult.contains(number);
    }

}