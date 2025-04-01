package com.ajaytest.testng.differnet;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "sanity")
    public void sanityRun(){
        System.out.println("Sanity");
    }
    @Test(groups = "reg sanity")
    public void RegRun(){
        System.out.println("Reg");
    }
    @Test(groups = "smoke")
    public void SmokeRun(){
        System.out.println("Smoke");
    }
    @Test(groups = {"smoke", "sanity"})
    public void sanitySmokeRun(){
        System.out.println("Smoke-Sanity");
    }

}
