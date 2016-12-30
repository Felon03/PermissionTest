package com.example.permissiontest;

import java.util.List;

/**
 * Created by Freedom.Ly on 2016-12-30 17:13
 * Email  Freedom.JFL@Live.com
 */

public class Util {

    public void test() {
        BaseActivity.requestRuntimePermission(new String[] {}, new PermissionListener() {
            @Override
            public void onGranted() {

            }

            @Override
            public void onDenied(List<String> deniedPermission) {

            }
        });
    }


}
