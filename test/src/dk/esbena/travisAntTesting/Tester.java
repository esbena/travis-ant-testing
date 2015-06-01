package dk.esbena.travisAntTesting;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Tester {
    static {
        System.out.println("load class...");
    }

    @Test
    public void testSuccess () {
        System.out.println("testSuccess.......");
        assertTrue(true);
    }

    @Test
    public void testFail () {
        System.out.println("testFail.......");
        assertTrue(false);
    }

    @Test
    public void testCrash () {
        System.out.println("testCrash.......");
        throw new RuntimeException("Crashing...");
    }
}
