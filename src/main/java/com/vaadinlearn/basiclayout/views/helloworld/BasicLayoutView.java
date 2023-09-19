package com.vaadinlearn.basiclayout.views.helloworld;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Basic Layouting Vaading")
@Route(value = "")
public class BasicLayoutView extends VerticalLayout {

    private VerticalLayout verticalLayout = new VerticalLayout();
    private H4 verticalTitle = new H4("Layout Vertical");
    private Text verticalText = new Text("Some text example placed on a vertical layout. Use Vertical layout for placing componen in vertical manner.");
    private Text anotherText = new Text("The order of which component added to the layout first depends on which child component is first added using the add method.");
    private Button verticalButton = new Button("A Button");

    private HorizontalLayout horizontalLayout = new HorizontalLayout();
    private H4 horizontalTitle = new H4("Layout Horizontal");
    private Text horizontalText = new Text("Text placed on a horizontal layout. Use Horizontal layout for placing component in horizontal manner.");
    private Button horizontalButton = new Button("Another button");

    public BasicLayoutView() {

        verticalButton.addClickListener(e -> {
            Notification.show("Button on a vertical layout");
        });
        horizontalButton.addClickListener(e -> {
            Notification.show("Button on a horizontal layout");
        });

        verticalLayout.addClassNames(LumoUtility.AlignItems.CENTER);
        verticalLayout.setWidthFull();
        verticalLayout.addClassNames(LumoUtility.Border.ALL);
        verticalLayout.addClassNames(LumoUtility.BorderRadius.MEDIUM);

        horizontalLayout.addClassName(LumoUtility.AlignItems.CENTER);
        horizontalLayout.addClassNames(LumoUtility.Border.ALL);
        horizontalLayout.addClassNames(LumoUtility.BorderRadius.MEDIUM);

        verticalLayout.add(verticalTitle, verticalText, anotherText, verticalButton);
        horizontalLayout.add(horizontalTitle, horizontalText, horizontalButton);

        add(verticalLayout, horizontalLayout);
    }

}
