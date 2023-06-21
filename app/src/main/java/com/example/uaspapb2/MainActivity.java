package com.example.uaspapb2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Canvas mCanvas;
    private Paint mPaint = new Paint();
    private Bitmap mBitmap;
    private Rect mRect = new Rect();
    private Rect Mbounds = new Rect();

    private static final int OFFSET = 50;
    private int mOffset = OFFSET;
    private static final int MULTIPLIER = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}