package com.java.java14.demo.java14Demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NullPointerExceptionTest {

    @Test
    public void null_field_test(){

        try {
            String str = null;
            System.out.println(str.toUpperCase());
        }catch (Exception ex){
            assertTrue(ex instanceof NullPointerException);
        }
    }

    @Test
    public void custom_object_null_field(){
        try {

            var customer = new Customer();
            customer.setFirstName("Pawan");
            System.out.println(customer.getFirstName().toUpperCase());
            System.out.println(customer.getLastName().toUpperCase());
        }catch(Exception ex){
            assertTrue(ex instanceof NullPointerException);
//            throw ex; // Un- Comment this to view the logs
            /*
            Cannot invoke "String.toUpperCase()" because the return value of "com.java.java14.demo.java14Demo.Customer.getLastName()" is null
java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because the return value of "com.java.java14.demo.java14Demo.Customer.getLastName()" is null
             */
        }
    }

}

class Customer {
    String firstName;
    String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
