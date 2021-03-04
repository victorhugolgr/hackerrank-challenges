package br.com.victorhugolgr.jumping_on_the_clouds;

import java.util.*;
import java.util.stream.Collectors;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(int[] c) {

        int count = 0;
        int i = 0;
        while (i < c.length - 1) {
            if (i + 2 < c.length && c[i + 2] != 1) {
                count++;
                i = i + 2;
            } else {
                count++;
                i++;
            }
        }
        return count;
    }
}
