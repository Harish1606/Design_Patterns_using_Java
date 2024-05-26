package com.designPattern.factory.phone;

import com.designPattern.factory.OS;

public class Windows implements OS {
    @Override
    public void spec() {
        System.out.println("Most user friendly OS");
    }
}
