package com.example.lab5;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

public class MainActivity extends AppCompatActivity {

    private void logLifecycle(String event) {
        Log.e("MainActivity", event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 支持邊緣到邊緣顯示
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
        }

        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            // 獲取系統邊界的內邊距
            final int left = insets.getInsets(WindowInsetsCompat.Type.systemBars()).left;
            final int top = insets.getInsets(WindowInsetsCompat.Type.systemBars()).top;
            final int right = insets.getInsets(WindowInsetsCompat.Type.systemBars()).right;
            final int bottom = insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;

            // 設置視圖的內邊距
            v.setPadding(left, top, right, bottom);
            return insets;
        });

        logLifecycle("onCreate");

        ViewPager2 viewPager2 = findViewById(R.id.viewPager2);
        viewPager2.setAdapter(new ViewPagerAdapter(this)); // 傳入 Activity
        viewPager2.setOffscreenPageLimit(1);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logLifecycle("onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        logLifecycle("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logLifecycle("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logLifecycle("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logLifecycle("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logLifecycle("onDestroy");
    }
}
