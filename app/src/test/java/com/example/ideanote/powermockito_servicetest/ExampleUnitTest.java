package com.example.ideanote.powermockito_servicetest;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.rule.PowerMockRule;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.mockito.Mockito.*;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
@PowerMockIgnore({ "org.mockito.*", "org.robolectric.*", "android.*" })
@PrepareForTest(MainService.class)
public class ExampleUnitTest {

    @Rule
    public PowerMockRule rule = new PowerMockRule();

    @Test
    public void sampleTest() {
        PowerMockito.mockStatic(MainService.class);
        when(MainService.createIntent()).thenReturn(null);

        MainActivity activity = new MainActivity();
        activity.onCreate(null);
    }
}