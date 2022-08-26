package com.vaadin.example.gxt.companydashboard.ui.views;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@RouteAlias(value = HomeView.VIEW_NAME, layout = MainLayout.class)
@Route(value = "", layout = MainLayout.class)
public class HomeView extends Div {

    public static final String VIEW_NAME = "home";

    public HomeView() {

        add(new Span("Home"));
    }
}