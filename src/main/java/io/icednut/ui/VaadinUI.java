package io.icednut.ui;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-11-08
 */
@Theme(ValoTheme.THEME_NAME)
@SpringUI
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Panel panel = getPanel(getContentLayout());

        setContent(panel);
    }

    private Panel getPanel(Component content) {
        Panel panel = new Panel(content);

        panel.setWidth(100, Unit.PERCENTAGE);
        panel.setHeight(150, Unit.PIXELS);
        panel.setCaption("My Panel");
        return panel;
    }

    private VerticalLayout getContentLayout() {
        VerticalLayout contentLayout = new VerticalLayout();

        contentLayout.setWidth(100, Unit.PERCENTAGE);
        contentLayout.setHeight(300, Unit.PIXELS);
        contentLayout.addComponents(new Label("Hello, world!"), new Label("Hello, vaadin!"), new Label("Hello, spring!"));
        contentLayout.setMargin(true);
        return contentLayout;
    }
}
