import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Stella on 21/12/2016.
 */
public class TestFibonacci {

    @Test
    public void test_should_return_the_lastNumberOfFibonacci_for_an_input(){
        Assert.assertEquals(8, Fibonacci.calc_fibonacci(6));
    }

    @Test
    public void test_should_return_fibonacci_calc() {

        Assert.assertEquals(0, Fibonacci.calc_fibonacci(0));
        Assert.assertEquals(1, Fibonacci.calc_fibonacci(1));
        Assert.assertEquals(1, Fibonacci.calc_fibonacci(2));
        Assert.assertEquals(8, Fibonacci.calc_fibonacci(6));
    }

    @Test
    public void test_should_return_fibonacci_calc2(){
        Assert.assertEquals(0, Fibonacci.calc_fibonacci2(0));
//        Assert.assertEquals(1, Fibonacci.calc_fibonacci2(1));
//        Assert.assertEquals(1, Fibonacci.calc_fibonacci2(2));
//        Assert.assertEquals(8, Fibonacci.calc_fibonacci2(6));
    }
}
