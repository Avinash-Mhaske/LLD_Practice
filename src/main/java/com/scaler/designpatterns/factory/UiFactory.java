package com.scaler.designpatterns.factory;

import com.scaler.designpatterns.factory.buttons.Button;
import com.scaler.designpatterns.factory.menu.Menu;

//1.2 In this Factory interface we are only going to have factory methods
public interface UiFactory {
    Button createButton();

    Menu createMenu();

}
