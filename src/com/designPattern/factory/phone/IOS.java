package com.designPattern.factory.phone;

import com.designPattern.factory.OS;

public class IOS implements OS {
    @Override
    public void spec() {
        System.out.println("Most secure OS");
    }
}
