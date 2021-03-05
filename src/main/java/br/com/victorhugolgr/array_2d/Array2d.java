package br.com.victorhugolgr.array_2d;

public class Array2d {

    static int hourglassSum(int[][] arr) {

        Integer count = null;
        for (int k = 0; k < arr[1].length-2; k++) {
            for (int i = 0; i < arr.length-2; i++) {
                Integer countHourGlass = 0;

                for (int j = 0; j < 3; j++) {
                    int linha = i + j;
                    if(j%2==0){
                        countHourGlass += arr[linha][k] + arr[linha][1+k] + arr[linha][2+k];
                    }else {
                        countHourGlass += arr[linha][1+k];
                    }
                }

                count = (count == null || countHourGlass > count) ? countHourGlass : count;
            }
        }

        return count;
    }
}
