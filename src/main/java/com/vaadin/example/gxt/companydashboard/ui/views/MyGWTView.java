package com.vaadin.example.gxt.companydashboard.ui.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.LegacyWrapper;
import org.example.MyComponent;

@Route(value = MyGWTView.VIEW_NAME, layout = MainLayout.class)
public class MyGWTView extends Div {

    public static final String VIEW_NAME = "gwt";
    MyComponent myComponent = new MyComponent();

    public MyGWTView() {
        add(new Span("MY GWT COMPONENT"));
        add(new LegacyWrapper(myComponent));
        setSizeFull();
    }
}
