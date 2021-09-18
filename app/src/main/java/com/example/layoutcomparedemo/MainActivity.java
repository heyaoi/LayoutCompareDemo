package com.example.layoutcomparedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    RootView rootView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

//        setContentView(new ContentLinearlayout(MainActivity.this));


        rootView = new RootView(this);
        setContentView(rootView);

/*

        rootView.postDelayed(new Runnable() {
            @Override
            public void run() {
                ContentLinearlayout contentLinearlayout = new ContentLinearlayout(MainActivity.this);
                rootView.addView(contentLinearlayout);
            }
        },100);
*/

//        recycleLinearlayout(0);

        recycleRelativelayout(0);

    }

    private void recycleLinearlayout(int i){
        Log.e(TAG, "recyleTest: " + i);

        if (i == 100){
            return;
        } else {
            int i1 = ++i;
            rootView.postDelayed(new Runnable() {
                @Override
                public void run() {
                    ContentLinearlayout contentLinearlayout = new ContentLinearlayout(MainActivity.this);
                    rootView.addView(contentLinearlayout);

                    rootView.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            rootView.removeAllViews();
                            recycleLinearlayout(i1);
                        }
                    },100);
                }
            },100);
        }

    }

    private void recycleRelativelayout(int i){
        if (i == 100){
            return;
        } else {
            int i1 = ++i;
            rootView.postDelayed(() -> {
                ContentRelativelayout contentRelativelayout = new ContentRelativelayout(MainActivity.this);
                rootView.addView(contentRelativelayout);

                rootView.postDelayed(() -> {
                    rootView.removeAllViews();
                    recycleRelativelayout(i1);
                },500);
            },500);
        }
    }

/*    @SuppressLint("WrongConstant")
    private void recycle(int i){

        Log.e(TAG, "recycle: " + i );
        if (i == 100){
            return;
        }
        int i1 = ++i;
        rootView.postDelayed(() -> {
            ContentLinearlayout contentLinearlayout = new ContentLinearlayout(MainActivity.this);
            rootView.addView(contentLinearlayout, new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            rootView.postDelayed(() -> {
                rootView.removeView(contentLinearlayout);
                recycle(i1);
            },1000);
        },1000);
    }*/

}