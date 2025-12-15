package com.scaler.designpatterns.factory;

import com.scaler.designpatterns.factory.menu.Menu;
import com.scaler.designpatterns.factory.buttons.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter=new Flutter();
        UiFactory uiFactory = flutter.getUiFactoryForPlatform(SupportedPlatforms.IOS);

        Button button =uiFactory.createButton();
        button.click();

        Menu menu = uiFactory.createMenu();
        menu.showMenu();
    }
}
