package com.ske.snakebaddesign.models;

import android.graphics.Color;

/**
 * Created by TAWEESOFT on 3/16/16 AD.
 */
public class NormalSquare implements Square {

    private int color = Color.parseColor("#1dd2af");

    @Override
    public int getColor() {
        return color;
    }
}
