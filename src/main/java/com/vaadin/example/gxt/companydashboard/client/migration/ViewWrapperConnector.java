package com.vaadin.example.gxt.companydashboard.client.migration;

import com.google.gwt.user.client.Element;
import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ServerConnector;
import com.vaadin.client.annotations.OnStateChange;
import com.vaadin.client.ui.AbstractComponentConnector;
import com.vaadin.client.ui.SimpleManagedLayout;
import com.vaadin.example.gxt.companydashboard.shared.migration.ViewWrapperState;
import com.vaadin.example.gxt.companydashboard.ui.migration.ViewWrapper;
import com.vaadin.shared.ui.Connect;
import com.vaadin.shared.ui.Connect.LoadStyle;

@Connect(value = ViewWrapper.class, loadStyle = LoadStyle.EAGER)
public class ViewWrapperConnector extends AbstractComponentConnector implements SimpleManagedLayout {

	private Element measuredElement;

	@OnStateChange({ "view" })
	private void onViewChange() {
		getWidget().setView(getState().view);
	}

	@Override
	public void setParent(ServerConnector parent) {
		if (parent != null) {
			measuredElement = ((ComponentConnector) parent).getWidget().getElement();
			getLayoutManager().registerDependency(this, measuredElement);
		}
		super.setParent(parent);
	}

	@Override
	public void onUnregister() {
		getLayoutManager().unregisterDependency(this, measuredElement);
	}

	@Override
	public ViewWrapperState getState() {
		return (ViewWrapperState) super.getState();
	}

	@Override
	public ViewWrapperWidget getWidget() {
		return (ViewWrapperWidget) super.getWidget();
	}

	@Override
	public void layout() {
		getWidget().setPixelSize(getLayoutManager().getInnerWidth(measuredElement),
				getLayoutManager().getInnerHeight(measuredElement));
	}
}
