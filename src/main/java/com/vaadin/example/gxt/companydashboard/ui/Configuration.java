package com.vaadin.example.gxt.companydashboard.ui;

import com.vaadin.annotations.Push;
import com.vaadin.annotations.Widgetset;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.mpr.core.MprTheme;
import com.vaadin.mpr.core.MprWidgetset;

@Push
@MprTheme("mytheme")
@MprWidgetset("CompanyDashboard")
public class Configuration implements AppShellConfigurator {

    public Configuration() {
        System.out.println("Configuration");
    }
}
