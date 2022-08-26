package com.vaadin.example.gxt.companydashboard.ui.views;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = ReportsView.VIEW_NAME, layout = MainLayout.class)
public class ReportsView extends VerticalLayout {

	public static final String VIEW_NAME = "reports";

	public ReportsView() {
		add(new Label("Not implemented yet"));
	}
}
