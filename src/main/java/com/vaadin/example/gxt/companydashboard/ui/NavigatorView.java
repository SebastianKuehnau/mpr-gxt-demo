package com.vaadin.example.gxt.companydashboard.ui;

import com.vaadin.example.gxt.companydashboard.ui.migration.ViewWrapper;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.mpr.LegacyWrapper;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;

@Route("navigator")
public class NavigatorView extends Div {

    public NavigatorView() {

        AppMenuLayout content = new AppMenuLayout();
		Navigator navigator = new Navigator(UI.getCurrent(), (ViewDisplay) content);
		navigator.addView("", ViewWrapper.class);
//		navigator.addView(Views.VIEW_DASHBOARD, ViewWrapper.class);
//		navigator.addView(Views.VIEW_REPORTS, ReportsView.class);

//		if (navigator.getState().isEmpty()) {
//			navigator.navigateTo(Views.VIEW_DASHBOARD);
//		}

        Panel rootPanel = new Panel(content);
        rootPanel.setSizeFull();
        LegacyWrapper legacyWrapper = new LegacyWrapper(rootPanel);
        legacyWrapper.setSizeFull();
        add(legacyWrapper);
        setSizeFull();

    }
}
