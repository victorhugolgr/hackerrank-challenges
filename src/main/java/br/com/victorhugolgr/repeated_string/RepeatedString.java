package br.com.victorhugolgr.repeated_string;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.regex.*;
import java.util.stream.Collectors;
public class RepeatedString {

    static long repeatedString(String s, long n) {

        int sizeString = s.length();
        long qtdPedacos = n/sizeString;
        Long restoPedacos = n%sizeString;
        long qtdOcorrencia = s.chars().filter(ch-> ch == 'a').count();

        long countOcorrencia = qtdOcorrencia * qtdPedacos;

        if(restoPedacos != 0) {
            long qtdOcorrenciaResto = s.substring(0,  restoPedacos.intValue()).chars().filter(ch-> ch == 'a').count();
            countOcorrencia += qtdOcorrenciaResto;
        }

        return countOcorrencia;
    }
}
