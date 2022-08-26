package com.vaadin.example.gxt.companydashboard.ui;

import com.vaadin.example.gxt.companydashboard.shared.migration.Views;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;

public class AppMenuLayout extends AppMenuLayoutDesign implements ViewDisplay {

	public AppMenuLayout() {
		dashboard.addClickListener(event -> UI.getCurrent().getNavigator().navigateTo(Views.VIEW_DASHBOARD));
		reports.addClickListener(event -> UI.getCurrent().getNavigator().navigateTo(Views.VIEW_REPORTS));
	}

	@Override
	public void showView(View view) {
		content.removeAllComponents();
		((Component) view).setSizeFull();
		content.addComponents((Component) view);
	}
}
