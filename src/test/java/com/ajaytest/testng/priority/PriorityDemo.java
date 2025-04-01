package com.ajaytest.testng.priority;

import org.testng.annotations.Test;

public class PriorityDemo {


    @Test(priority = 1)
    void demo1(){
        System.out.println("1");
    }

    @Test(priority = 3)
    void demo2(){
        System.out.println("2");
    }

    @Test(priority = 2)
    void demo3(){
        System.out.println("3");
    }
}
