package com.vaadin.example.gxt.companydashboard.ui.views;

import com.vaadin.example.gxt.companydashboard.shared.migration.Views;
import com.vaadin.example.gxt.companydashboard.ui.migration.ViewWrapper;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.LegacyWrapper;
import com.vaadin.ui.CssLayout;

@Route(value = DashboardView.VIEW_NAME, layout = MainLayout.class)
public class DashboardView extends Div implements BeforeEnterObserver {

    public static final String VIEW_NAME = "dashboard";
    ViewWrapper viewWrapper = new ViewWrapper();

    public DashboardView() {

        viewWrapper.setSizeFull();
        CssLayout rootPanel = new CssLayout(viewWrapper);
        rootPanel.setSizeFull();

        LegacyWrapper legacyWrapper = new LegacyWrapper(rootPanel);
        legacyWrapper.setSizeFull();

        add(legacyWrapper);
        setSizeFull();
    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        viewWrapper.getState().view = Views.VIEW_DASHBOARD;
    }
}
