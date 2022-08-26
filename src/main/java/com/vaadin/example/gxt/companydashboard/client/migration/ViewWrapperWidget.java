package com.vaadin.example.gxt.companydashboard.client.migration;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.ContentPanel;
import com.vaadin.example.gxt.companydashboard.client.CompanyDashboard;
import com.vaadin.example.gxt.companydashboard.shared.migration.Views;

public class ViewWrapperWidget extends ContentPanel {

	public ViewWrapperWidget() {
		setDeferHeight(false);
	}

	public void setView(String view) {
		switch (view) {
		case Views.VIEW_DASHBOARD:
			doSetView("Company Dashboard", GWT.create(CompanyDashboard.class));
			break;
		default:
			break;
		}

	}

	private void doSetView(String heading, IsWidget view) {
		if (getWidgetCount() > 0) {
			clear();
		}
		setHeading(heading);
		if (view instanceof Widget) {
			((Widget) view).setSize("100%", "100%");
		}
		add(view);
	}
}
