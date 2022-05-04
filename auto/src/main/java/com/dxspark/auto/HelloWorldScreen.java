package com.dxspark.auto;

import androidx.annotation.NonNull;
import androidx.car.app.CarContext;
import androidx.car.app.Screen;
import androidx.car.app.model.Pane;
import androidx.car.app.model.PaneTemplate;
import androidx.car.app.model.Row;
import androidx.car.app.model.Template;

public class HelloWorldScreen extends Screen {

    protected HelloWorldScreen(@NonNull CarContext carContext) {
        super(carContext);
    }

    static HelloWorldScreen create(@NonNull CarContext carContext) {
        return new HelloWorldScreen(carContext);
    }

    @NonNull
    @Override
    public Template onGetTemplate() {
        Row row = new Row.Builder().setTitle("Hello World").addText("Hello!!!").build();
        return new PaneTemplate.Builder(new Pane.Builder().addRow(row).build()).setTitle("Hello World").build();
    }
}