package com.scaler.designpatterns.factory;

import com.scaler.designpatterns.factory.buttons.Button;
import com.scaler.designpatterns.factory.buttons.IosButton;
import com.scaler.designpatterns.factory.menu.IosMenu;
import com.scaler.designpatterns.factory.menu.Menu;

public class IosUiFactory implements UiFactory{
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
