package CribaEratostenes.tests;

import CribaEratostenes.CribaEratostenes;
import org.junit.Test;

import static org.junit.Assert.*;

public class CribaEratostenesTest {

    @Test
    public void cribaTest() {
        CribaEratostenes c = new CribaEratostenes();
        int [] primes = c.generateCriba(20);
        assertArrayEquals(new int[]{2,3,5,7,11,13,17,19}, primes);
    }

    @Test
    public void lessThan2Test() {
        CribaEratostenes c = new CribaEratostenes();
        int [] primes = c.generateCriba(1);
        assertArrayEquals(new int[0], primes);
    }

}