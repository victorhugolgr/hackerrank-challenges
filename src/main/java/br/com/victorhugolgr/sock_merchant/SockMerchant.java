package br.com.victorhugolgr.sock_merchant;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Function;
import java.util.regex.*;
import java.util.stream.Collectors;

class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        return Arrays.stream(ar)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(el-> el >= 2)
                .map(el-> el / 2 )
                .map(el -> el.intValue())
                .reduce(0, Integer::sum);
    }
}
