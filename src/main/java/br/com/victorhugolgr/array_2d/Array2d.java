package br.com.victorhugolgr.array_2d;

public class Array2d {

    static int hourglassSum(int[][] arr) {

        int count = 0;
        for (int k = 0; k < arr[1].length-2; k++) {
            for (int i = 0; i < arr.length-2; i++) {

                for (int j = 0; j < 3; j++) {
                    int linha = i + j;
                    if(linha%2==0){
                        count += arr[linha][k] + arr[linha][1+k] + arr[linha][2+k];
                    }else {
                        count += arr[linha][1+k];
                    }
                }

            }
        }

        return count;
    }
}
