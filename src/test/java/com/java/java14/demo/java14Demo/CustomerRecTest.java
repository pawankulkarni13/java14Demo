package com.java.java14.demo.java14Demo;

import org.assertj.core.internal.IntArrays;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerRecTest {

    @Test
    public void customer_record_test(){

        CustomerRec rec = new CustomerRec("Pawan","Kulkarni");

        assertEquals("PawanKulkarni", rec.getName());
        assertEquals("Pawan", rec.firstName());
        assertEquals("Kulkarni", rec.lastName());
    }

}
