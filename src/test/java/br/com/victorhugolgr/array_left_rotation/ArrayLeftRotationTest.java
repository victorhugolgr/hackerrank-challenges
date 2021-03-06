package br.com.victorhugolgr.array_left_rotation;

import org.junit.Assert;
import org.junit.Test;

public class ArrayLeftRotationTest {
    @Test
    public void case0(){
        int d = 4;
        int[] a = {1, 2, 3, 4, 5};
        int[] rotLeft = ArrayLeftRotation.rotLeft(a, d);
        Assert.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, rotLeft);
    }

    @Test
    public void case1(){
        int d = 10;
        int[] a = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};//0-19
        int[] rotLeft = ArrayLeftRotation.rotLeft(a, d);
        Assert.assertArrayEquals(new int[]{77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77}, rotLeft);//51 -> 9
    }

    @Test
    public void case2(){
        int d = 13;
        int[] a = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        int[] rotLeft = ArrayLeftRotation.rotLeft(a, d);
        Assert.assertArrayEquals(new int[]{87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60}, rotLeft);
    }

}
