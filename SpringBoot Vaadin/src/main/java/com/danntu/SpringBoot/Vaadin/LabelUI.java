package com.danntu.SpringBoot.Vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import javafx.scene.layout.Pane;


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

        Label label1 = new Label("Label can be dangerous");
        verticalLayout.addComponent(label1);
        TextField editor = new TextField(null,label1.getValue());
        editor.addValueChangeListener(valueChangeEvent -> {
            label1.setValue(valueChangeEvent.getValue());
        });
        verticalLayout.addComponent(editor);

        Panel panel = new Panel("Panel Containing a Label");
        panel.setWidth("300px");

        panel.setContent(new Label(
                "This is a Label inside a Panel. There is " +
                        "enough text in the label to make the text " +
                        "get truncated when it exceeds the width of the panel."
        ));
        verticalLayout.addComponent(panel);
        Label textLabel = new Label(
                "Text where formatting characters, such as \\n, " +
                        "and HTML, such as <b>here</b>, are quoted.",
                ContentMode.TEXT);

        Label preLabel = new Label(
                "Preformatted text is shown in an HTML <pre> tag.\n" +
                        "Formatting such as\n" +
                        "  * newlines\n" +
                        "  * whitespace\n" +
                        "and such are preserved. HTML tags, \n"+
                        "such as <b>bold</b>, are quoted.",
                ContentMode.PREFORMATTED);

        Label htmlLabel = new Label(
                "In HTML mode, all HTML formatting tags, such as \n" +
                        "<ul>"+
                        "  <li><b>bold</b></li>"+
                        "  <li>itemized lists</li>"+
                        "  <li>etc.</li>"+
                        "</ul> "+
                        "are preserved.",
                ContentMode.HTML);
        verticalLayout.addComponents(textLabel,preLabel,htmlLabel);
        verticalLayout.addComponents(new Label("&nbsp;",ContentMode.HTML));
        Label gap = new Label();
        gap.setHeight("5em");
        verticalLayout.addComponent(gap);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.setWidth("100%");

        Button button = new Button("I'm on the left");
        horizontalLayout.addComponent(button);
        Label expandingGap = new Label();
        expandingGap.setWidth("100%");
        horizontalLayout.addComponent(expandingGap);
        horizontalLayout.setExpandRatio(expandingGap,1.0f);

        Button button2 = new Button("I'm on the right");
        horizontalLayout.addComponent(button2);
        verticalLayout.addComponent(horizontalLayout);
    }
}
