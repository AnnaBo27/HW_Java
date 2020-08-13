package com.telran;

public class OurArrayListEmptyException extends RuntimeException {
    public OurArrayListEmptyException(){
        super();
    }

    public OurArrayListEmptyException (String message){
        super(message);
    }
}
