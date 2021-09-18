package com.example.layoutcomparedemo;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

public class TestRelativelayout extends RelativeLayout {

    private static final String TAG = "TestRelativelayout";

    public TestRelativelayout(Context context) {
        super(context);
    }

    public TestRelativelayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);

    }

    public TestRelativelayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    long timeMeasure,timeLayout,timeDraw;

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        timeMeasure = System.currentTimeMillis();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "onMeasureTime: " + (System.currentTimeMillis()-timeMeasure));
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        timeLayout = System.currentTimeMillis();
        super.onLayout(changed, l, t, r, b);
        Log.e(TAG, "onLayoutTime: " + (System.currentTimeMillis()-timeLayout));

    }

    @Override
    protected void onDraw(Canvas canvas) {
        timeDraw = System.currentTimeMillis();
        super.onDraw(canvas);
        Log.e(TAG, "onDrawTime: " + (System.currentTimeMillis()-timeDraw));
        Log.e(TAG, "totalTime: " + (System.currentTimeMillis()-timeMeasure));
    }

}
