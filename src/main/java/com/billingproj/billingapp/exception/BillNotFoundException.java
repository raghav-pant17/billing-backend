package com.billingproj.billingapp.exception;

public class BillNotFoundException extends RuntimeException{

    public BillNotFoundException(Long id) {
        super("Could not found the bill with id " + id);
    }
}
