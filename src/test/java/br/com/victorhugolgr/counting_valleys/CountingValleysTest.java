package br.com.victorhugolgr.counting_valleys;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {

    @Test
    public void case0(){
        int steps = 8;
        String path = "UDDDUDUU";
        int totalVales = CountingValleys.countingValleys(steps, path);
        Assert.assertEquals(1, totalVales);
    }

    @Test
    public void case1(){
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        int totalVales = CountingValleys.countingValleys(steps, path);
        Assert.assertEquals(2, totalVales);
    }
}
