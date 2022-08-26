package com.vaadin.example.gxt.companydashboard.ui;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.example.gxt.companydashboard.shared.migration.Views;
import com.vaadin.example.gxt.companydashboard.ui.migration.ViewWrapper;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewDisplay;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
//@Theme("mytheme")
//@Widgetset("CompanyDashboard")
public class MyUI {//extends UI {

//    @Override
//    protected void init(VaadinRequest vaadinRequest) {
//		AppMenuLayout content = new AppMenuLayout();
//		setContent(content);
//		Navigator navigator = new Navigator(this, (ViewDisplay) content);
//		navigator.addView(Views.VIEW_DASHBOARD, ViewWrapper.class);
//		navigator.addView(Views.VIEW_REPORTS, ReportsView.class);
//		setNavigator(navigator);
//
//		if (navigator.getState().isEmpty()) {
//			navigator.navigateTo(Views.VIEW_DASHBOARD);
//		}
//    }

//	@WebServlet(urlPatterns = { "/ui/*", "/VAADIN/*" }, name = "MyUIServlet", asyncSupported = true)
//    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
//    public static class MyUIServlet extends VaadinServlet {
//    }
}
