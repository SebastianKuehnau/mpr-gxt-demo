package com.vaadin.example.gxt.companydashboard.ui.migration;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.example.gxt.companydashboard.shared.migration.ViewWrapperState;
import com.vaadin.ui.AbstractComponent;

public class ViewWrapper extends AbstractComponent implements View {

	public ViewWrapper() {

	}

	@Override
	public ViewWrapperState getState() {
		return (ViewWrapperState) super.getState();
	}

	@Override
	public void enter(ViewChangeEvent event) {
		getState().view = event.getViewName();
	}


}
