package com.vaadin.example.gxt.companydashboard.ui.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.router.RouterLink;

public class MainLayout extends AppLayout implements RouterLayout {

    public MainLayout() {
        DrawerToggle toggle = new DrawerToggle();

        H1 title = new H1("MyApp");
        title.getStyle()
                .set("font-size", "var(--lumo-font-size-l)")
                .set("margin", "0");

        Tabs tabs = getTabs();

        addToDrawer(tabs);
        addToNavbar(toggle, title);
    }

    private Tabs getTabs() {
        Tabs tabs = new Tabs();
        tabs.add(
                createTab(VaadinIcon.HOME, HomeView.VIEW_NAME, HomeView.class),
                createTab(VaadinIcon.DASHBOARD, DashboardView.VIEW_NAME, DashboardView.class),
                createTab(VaadinIcon.HAMMER, MyGWTView.VIEW_NAME, MyGWTView.class),
                createTab(VaadinIcon.TABLE, ReportsView.VIEW_NAME, ReportsView.class)
        );
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        return tabs;
    }

    private Tab createTab(VaadinIcon viewIcon, String viewName, Class<? extends Component> targetViewClass) {
        Icon icon = viewIcon.create();
        icon.getStyle()
                .set("box-sizing", "border-box")
                .set("margin-inline-end", "var(--lumo-space-m)")
                .set("margin-inline-start", "var(--lumo-space-xs)")
                .set("padding", "var(--lumo-space-xs)");

        RouterLink link = new RouterLink();
        link.add(icon, new Span(viewName));
        // Demo has no routes
        link.setRoute(targetViewClass);
        link.setTabIndex(-1);

        return new Tab(link);
    }

    @Override
    public void showRouterLayoutContent(HasElement content) {
        setContent((Component) content);
    }
}
