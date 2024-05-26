package com.designPattern.factory.phone;

import com.designPattern.factory.OS;

public class Android implements OS {
    @Override
    public void spec(){
        System.out.println("Most powerful OS");
    }
}
