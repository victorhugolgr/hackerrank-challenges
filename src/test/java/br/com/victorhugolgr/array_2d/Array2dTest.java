package br.com.victorhugolgr.array_2d;

import org.junit.Assert;
import org.junit.Test;

public class Array2dTest {

    @Test
    public void case0(){
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        };
        int sum = Array2d.hourglassSum(arr);
        Assert.assertEquals(19, sum);
    }

    @Test
    public void case1(){
        int[][] arr = {
                {1, 1,  1,  0,  0, 0},
                {0, 1,  0,  0,  0, 0},
                {1, 1,  1,  0,  0, 0},
                {0, 9,  2, -4, -4, 0},
                {0, 0,  0, -2,  0, 0},
                {0, 0, -1, -2, -4, 0}
        };
        int sum = Array2d.hourglassSum(arr);
        Assert.assertEquals(13, sum);
    }

    @Test
    public void case2() {
        int[][] arr = {
                {-9, -9, -9,  1, 1, 1},
                { 0, -9,  0,  4, 3, 2},
                {-9, -9, -9,  1, 2, 3},
                { 0,  0,  8,  6, 6, 0},
                { 0,  0,  0, -2, 0, 0},
                { 0,  0,  1,  2, 4, 0}
        };
        int sum = Array2d.hourglassSum(arr);
        Assert.assertEquals(28, sum);
    }

    @Test
    public void case04() {
        int[][] arr = {
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        };
        int sum = Array2d.hourglassSum(arr);
        Assert.assertEquals(-6, sum);
    }
}
