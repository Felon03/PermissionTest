package com.example.permissiontest;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void buttonClick(View view) {
        String[] permissionString = new String[] {Manifest.permission.CAMERA, Manifest.permission.ACCESS_FINE_LOCATION,
        Manifest.permission.CALL_PHONE};        // 所要申请的权限
        requestRuntimePermission(permissionString, new PermissionListener() {
            @Override
            public void onGranted() {
                Toast.makeText(MainActivity.this, "所有权限都允许了", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDenied(List<String> deniedPermission) {
                for (String permission : deniedPermission) {
                    Toast.makeText(MainActivity.this, "被拒绝权限：" + permission, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
