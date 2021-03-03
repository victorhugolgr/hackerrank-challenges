package br.com.victorhugolgr.sock_merchant;

import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest {

    @Test
    public void case0() {
        int n = 9;
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = SockMerchant.sockMerchant(n, ar);

        Assert.assertEquals(3, result);
    }

    @Test
    public void case1(){
        int n = 10;
        int[] ar = new int[]{1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        int result = SockMerchant.sockMerchant(n, ar);

        Assert.assertEquals(4, result);
    }
}
