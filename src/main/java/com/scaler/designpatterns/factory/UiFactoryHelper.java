package com.scaler.designpatterns.factory;

public class UiFactoryHelper {

    public static UiFactory getUiFactoryFactory(SupportedPlatforms platform){
        if(platform.equals(platform.ANDROID)){
            return new AndroidUiFactory();
        }
        else if (platform.equals(platform.IOS)) {
            return new IosUiFactory();
        }
        return null;
    }
}
