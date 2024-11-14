package Loops_For_While;

import java.math.BigDecimal;
import java.math.BigInteger;

public class task_chess64 {
    public static void main(String[] args) {
        /*Sahmat taxtasinda 1 ci xanadan baslayaraq her sonraki xanada 2 defe artan bugdanin  64-cu xanaya kimi
        hesablanmasi . */
        BigDecimal xana = BigDecimal.valueOf(1);
        for (var i=1; i<=64;i++){

            System.out.println(i+"="+xana);

            xana = xana.multiply(BigDecimal.valueOf(2));
        }
    }
}
