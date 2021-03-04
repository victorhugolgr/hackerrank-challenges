package br.com.victorhugolgr.repeated_string;

import org.junit.Assert;
import org.junit.Test;

public class RepeatedStringTest {

    @Test
    public void case0(){
        long retorno = RepeatedString.repeatedString("aba", 10L);
        Assert.assertEquals(7, retorno);
    }

    @Test
    public void case1(){
        long retorno = RepeatedString.repeatedString("a", 1_000_000_000_000L);
        Assert.assertEquals(1_000_000_000_000L, retorno);
    }

    @Test
    public void case2(){
        long retorno = RepeatedString.repeatedString("abcac", 10);
        Assert.assertEquals(4, retorno);
    }
}
