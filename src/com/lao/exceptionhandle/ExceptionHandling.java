package com.lao.exceptionhandle;

public class ExceptionHandling {

    public String verifyInteger(int a){
        if(a<=0){

            throw new IllegalArgumentException("Wrong value for a");
        }
       return "Correct value";

    }

    public static void main (String args[]){
        ExceptionHandling tryexcept = new ExceptionHandling();
        try {
            tryexcept.verifyInteger(5);
            //File open
        } catch(IllegalArgumentException e){
            //e.printStackTrace();
            System.out.println("IllegalArgumentException" );
        }catch(Exception e){
            //e.printStackTrace();
            System.out.println("Invalid number" );
        }finally {
            //file close
            System.out.println("finally");
        }

        System.out.println("Program complete");
    }
}
