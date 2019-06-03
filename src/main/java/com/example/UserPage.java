package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("userpage")
@StyleSheet("styles/styles.css")
public class UserPage extends VerticalLayout {
	
	public UserPage() {
		// HEADER
				Span title = new Span("My application");
				Tab exit = new Tab(VaadinIcon.SIGN_OUT.create(), new RouterLink("Sign out", SignIn.class));
				HorizontalLayout header = new HorizontalLayout(title, exit);
				header.expand(title);
				header.setPadding(true);
				header.setWidth("100%");

				// WORKSPACE
				VerticalLayout workspace = new VerticalLayout(createCard());
				workspace.addClassName("workspace");
				workspace.setSizeFull();

				// FOOTER
				Tab actionButton1 = new Tab(VaadinIcon.HOME.create(), new RouterLink("Home", MyUI.class));
				Tab actionButton2 = new Tab(VaadinIcon.USERS.create(), new RouterLink("Suppliers", Suppliers.class));
				Tab actionButton3 = new Tab(VaadinIcon.PACKAGE.create(), new RouterLink("Products", Products.class));
				actionButton1.setClassName("tab");
				actionButton2.setClassName("tab");
				actionButton3.setClassName("tab");
				Tabs buttonBar = new Tabs(actionButton1, actionButton2, actionButton3);
				HorizontalLayout footer = new HorizontalLayout(buttonBar);
				footer.setJustifyContentMode(JustifyContentMode.CENTER);
				footer.setWidth("100%");

				// CONTAINER
				setSizeFull();
				setMargin(false);
				setSpacing(false);
				setPadding(false);
				add(header, workspace, footer);
			}
	
		private Component createCard() {
		Span card1Label = new Span("User information");
		FlexLayout card = new FlexLayout(card1Label);
		card.addClassName("card");
		card.setAlignItems(Alignment.CENTER);
		card.setJustifyContentMode(JustifyContentMode.CENTER);
		card.setWidth("100%");
		card.setHeight("1000px");
		return card;
		
		}
	}

