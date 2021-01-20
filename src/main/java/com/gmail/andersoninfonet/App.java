package com.gmail.andersoninfonet;

import java.math.BigInteger;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        NumberConversion service = new NumberConversion();
        NumberConversionSoapType proxy = service.getNumberConversionSoap12();
        System.out.println(proxy.numberToWords(new BigInteger("1485236743")));
    }
}
