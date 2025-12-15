package com.scaler.designpatterns.factory;

//1.1
public class Flutter {
    void refreshUI(){
        System.out.println("Refreshing url");
    }

    void setTheme(){
        System.out.println("setting theme");
    }

    UiFactory getUiFactoryForPlatform(SupportedPlatforms platform){
//        if(platform.equals(platform.ANDROID)){
//            return new AndroidUiFactory();
//        }
//        else if (platform.equals(platform.IOS)) {
//            return new IosUiFactory();
//        }
//        return null;
        return UiFactoryHelper.getUiFactoryFactory(platform);
    }
}


