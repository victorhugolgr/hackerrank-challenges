package br.com.victorhugolgr.array_left_rotation;

public class ArrayLeftRotation {
    static int[] rotLeft(int[] a, int d) {

        int resto = d % a.length;

        int[] retorno = new int[a.length];

        for (int i = a.length-1; i >= 0; i--) {
            Integer indexRetorno = i - d;
            if(indexRetorno < 0) {
                indexRetorno = a.length - Math.abs(indexRetorno);
            };
            retorno[indexRetorno] = a[i];
        }

        return retorno;
    }
}
