package io.icednut.ui;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinService;
import com.vaadin.server.WrappedSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.Cookie;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * @author wangeun.lee@sk.com
 * @since 2016-11-08
 */
@RunWith(MockitoJUnitRunner.class)
public class VaadinUITest {

    private VaadinUI vaadinUI = new VaadinUI();

    @Mock
    private VaadinRequest vaadinRequest;

    @Test
    public void testUI() {
        vaadinUI.init(vaadinRequest);
    }

}