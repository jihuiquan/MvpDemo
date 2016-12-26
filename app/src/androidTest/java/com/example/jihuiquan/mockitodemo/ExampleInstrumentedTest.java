package com.example.jihuiquan.mockitodemo;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.jihuiquan.mockitodemo.module.LoginPresenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

/**suite
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private static final String TAG = "ExampleInstrumentedTest";
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.jihuiquan.mockitodemo", appContext.getPackageName());
    }
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

    }
    public void test(){
        LoginPresenter loginPresenter = new LoginPresenter();
        loginPresenter.login("xxx211258","123456");
    }
}
