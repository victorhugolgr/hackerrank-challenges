package br.com.victorhugolgr.counting_valleys;

public class CountingValleys {

    public static int countingValleys(int steps, String path) {
        char[] hikes = path.toCharArray();

        Integer countValley = 0;
        Integer countSetps = 0;
        for (int i = 0; i < hikes.length; i++) {

            char passoAtual = hikes[i];

            if(passoAtual == 'U'){
                countSetps++;
            }else if(passoAtual == 'D'){
                countSetps--;
            }

            if(countSetps == 0 && passoAtual == 'U'){
                countValley++;
            }
        }
        return countValley;
    }
}
