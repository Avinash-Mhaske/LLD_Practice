package com.scaler.designpatterns.factory;

import com.scaler.designpatterns.factory.buttons.AndroidButton;
import com.scaler.designpatterns.factory.buttons.Button;
import com.scaler.designpatterns.factory.menu.AndroidMenu;
import com.scaler.designpatterns.factory.menu.Menu;

public class AndroidUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
