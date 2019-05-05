package com.fitsum;

public class Main {

    public static void main(String[] args) {

        //
        int myInt = 5;
        float myFloat = 5;
        double myDobule = 5;

        System.out.println("Int value" + (myInt)/3);
        System.out.println("Float goes to 7 digits after decimal that is single precision");
        System.out.println("Float has single prcesion" + (myFloat)/3);
        System.out.println("Dobule goes to 16 digits after decimal it is called double precision");
        System.out.println("Double has double precision = " + (myDobule)/3);
        /*
        if we do not specify using f the default is double
        if we do not specify whole numbers the default is int
        see the below example for type cast error that can happend because of this
        * */
        // byte has a width of 8 -> -128 to 127
        // assigning literal in java is fine here we are assigning a literal which is a constant number
        // so java will not consider it as integer instead it will consider it as byte"since it is literal"
        // not the case if it was an expression
        byte myByte = 127;
        // passing the variable name and dividing it is an error this is because java consider
        // this as an expression not literal, so when java computes the value it defaults it to an integer
        // that is why it is not working the way to go around is to type cast it to byte
        myByte = (byte) ((myByte)/3); 


    }
}
