package com.example.permissiontest;

import java.util.List;

/**
 * Created by Freedom.Ly on 2016-12-30 16:05
 * Email  Freedom.JFL@Live.com
 */

public interface PermissionListener {

    void onGranted();

    void onDenied(List<String > deniedPermission);


}
