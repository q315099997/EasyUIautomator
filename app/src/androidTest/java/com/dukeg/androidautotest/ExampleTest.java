package com.dukeg.androidautotest;


import android.os.RemoteException;
import android.support.test.filters.SdkSuppress;
import android.support.test.runner.AndroidJUnit4;

import com.dukeg.easyuiautomator.BasicEvent;
import com.dukeg.easyuiautomator.CheckEvent;
import com.dukeg.easyuiautomator.KeyEvent;
import com.dukeg.easyuiautomator.TouchEvent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@SdkSuppress(minSdkVersion = 19)
public class ExampleTest {
    private BasicEvent basic;
    private CheckEvent check;
    private KeyEvent key;
    private TouchEvent touch;

    @Test
    public void musicplayerTest() throws RemoteException {
        for (int i = 0; i < 10; i++) {
            basic.launch("com.android.music", 5000);
            basic.wait(5000);
            //if (check.isObjectExsitByRes("com.android.music:id/playbar_play")) {
                touch.clickByObjectResourceID("com.android.music:id/playbar_play", 5000);
                basic.wait(30000);
                touch.clickByObjectResourceID("com.android.music:id/playbar_play", 5000);
                basic.wait(3000);
                key.pressBack();
            //} else {
                key.pressHome();
            //}
            basic.wait(3000);
            key.pressRececntApps();
            touch.click(540, 1580);
            basic.wait(3000);
        }
    }

}