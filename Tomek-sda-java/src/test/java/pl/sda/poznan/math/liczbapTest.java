package pl.sda.poznan.math;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class liczbapTest {

    public liczbapTest(int number, boolean isPrime) {
        this.number = number;
        this.isPrime = isPrime;
    }

    private int number;
private boolean isPrime;

@Parameters
public static Collection<Object[]> data(){
    return Arrays.asList(new Object[][]{
        {2, true},
        {3, true},
        {4, false},
        {5, true},
        {6, false},
        {7, true}
    });
}


@Test
public void isPrime(){
    assertEquals(liczbap.lpier(number),isPrime);
}

}