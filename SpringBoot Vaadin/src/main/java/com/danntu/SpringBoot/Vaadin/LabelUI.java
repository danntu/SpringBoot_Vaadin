package com.danntu.SpringBoot.Vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;



/**
 * Created by mdaniyar on 7/3/18.
 */
@SpringUI(path = "label")
@Theme("valo")
public class LabelUI extends UI {
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        VerticalLayout verticalLayout = new VerticalLayout();
        setContent(verticalLayout);
        Label label = new Label("This is a simple Label");
        label.addStyleName(ValoTheme.LABEL_H1);
        verticalLayout.addComponent(label);
    }
}
