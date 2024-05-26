package com.designPattern.factory;

import com.designPattern.factory.phone.Android;
import com.designPattern.factory.phone.IOS;
import com.designPattern.factory.phone.Windows;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Open"))
            return new Android();
        else if(str.equals("Close"))
            return new IOS();
        else
            return new Windows();
    }
}
