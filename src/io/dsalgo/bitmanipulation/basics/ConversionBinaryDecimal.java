package io.dsalgo.bitmanipulation.basics;

public class ConversionBinaryDecimal {
    public static String decimalToBinary(int num){
        String binary = "";
        while (num != 0) {
            if(num % 2 == 1) binary+= "1";
            else binary+= "0";
            num/= 2;
        }
        binary = new StringBuilder(binary).reverse().toString();
        return binary;
    }
    public static int binaryToDecimal(String binary){
        int decimal = -1;

        return decimal;
    }

    public static void main(String[] args) {
        // Convert a decimal number to its corresponding binary.
        int num = 12;
        String binaryEquivalent = decimalToBinary(num);
        System.out.println("Decimal: "+num+" Binary: "+binaryEquivalent);

        // Convert a binary number to its corresponding decimal number.
    }
}
