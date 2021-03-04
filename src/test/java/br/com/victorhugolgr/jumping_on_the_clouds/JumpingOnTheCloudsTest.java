package br.com.victorhugolgr.jumping_on_the_clouds;

import org.junit.Assert;
import org.junit.Test;

public class JumpingOnTheCloudsTest {

    @Test
    public void case0(){
        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};
        int i = JumpingOnTheClouds.jumpingOnClouds(c);
        Assert.assertEquals(4, i);
    }

    @Test
    public void case1(){
        int[] c = new int[]{0, 0, 0, 1, 0, 0};
        int i = JumpingOnTheClouds.jumpingOnClouds(c);
        Assert.assertEquals(3, i);
    }
}
