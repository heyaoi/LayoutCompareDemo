package com.example.layoutcomparedemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Titleview extends ConstraintLayout {
    private static final String TAG = "Titleview";
    public Titleview(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.title_view,this);
    }

    public Titleview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.title_view,this);
    }

    public Titleview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
//        LayoutInflater.from(context).inflate(R.layout.title_view,this);
    }

/*    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Log.e(TAG, "onMeasure: " );
    }*/
}
