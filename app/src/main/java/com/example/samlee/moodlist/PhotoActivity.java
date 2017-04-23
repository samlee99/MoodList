package com.example.samlee.moodlist;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;

import butterknife.BindView;

/**
 * Created by samlee on 4/12/17.
 */

public class PhotoActivity extends Activity {

    @BindView(R.id.cameraButton)
    Button cameraButton;
    @BindView(R.id.galleryButton)
    Button galleryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
    }
}
