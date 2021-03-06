package baekJoontest.recursiontest;


import baekJoon.recursion.FactorialRec;
import baekJoon.recursion.FibonacciRec;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecursionTest {

    private FactorialRec factorialRec;
    private FibonacciRec fibonacciRec;

    @BeforeEach
    void setUp() {
        factorialRec = new FactorialRec();
        fibonacciRec = new FibonacciRec();
    }

    @Test
    public void getFactorialRecTest() {
        assertThat(FactorialRec.getFactorialRec(10), is(3628800));
        assertThat(FactorialRec.getFactorialRec(5), is(120));
    }

    @Test
    public void getFibonacciRecTest() {
        assertThat(FibonacciRec.getFibonacciRec(8), is(21));
//        assertThat(FibonacciRec.getDynamicFibonacci(10), is(55));
    }

}
