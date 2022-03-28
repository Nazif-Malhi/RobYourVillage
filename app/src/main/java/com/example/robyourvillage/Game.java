package com.example.robyourvillage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class Game extends SurfaceView implements  SurfaceHolder.Callback {
    private GameLoop gameLoop;
    private Context context;

    public Game(Context context) {
        super(context);
        this.context = context;
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder Holder) {
    //Get Surface Holder and add callback
        SurfaceHolder surfaceHolder = getHolder();
        surfaceHolder.addCallback(this);
        gameLoop = new GameLoop(this, surfaceHolder);
        setFocusable(true);

    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
    public void drawUPS(Canvas canvas){
        String avgUPS = Double.toString(gameLoop.getAvg_UPS());
        Paint paint = new Paint();
        int color = ContextCompat.getColor(context, R.color.magneto);
        canvas.drawText("UPS" + avgUPS, 100, 20, paint);

    }
    public void drawFPS(Canvas canvas){
        String avgFPS = Double.toString(gameLoop.getAvg_UFS());
        Paint paint = new Paint();
        int color = ContextCompat.getColor(context, R.color.magneto);
        canvas.drawText("UPS" + avgFPS, 120, 30, paint);

    }
}
