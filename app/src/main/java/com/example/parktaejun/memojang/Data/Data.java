package com.example.parktaejun.memojang.Data;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by parktaejun on 2017. 7. 31..
 */

public class Data {
    private Drawable image;
    private String title;
    private String content;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
