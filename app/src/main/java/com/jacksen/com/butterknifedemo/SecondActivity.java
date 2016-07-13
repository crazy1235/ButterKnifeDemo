package com.jacksen.com.butterknifedemo;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindColor;
import butterknife.BindDimen;
import butterknife.BindDrawable;
import butterknife.BindString;
import butterknife.BindView;

public class SecondActivity extends BaseActivity {

    @BindView(R.id.button2)
    Button btn;

    @BindView(R.id.image_view)
    ImageView imageView;

    @BindString(R.string.btn_name)
    String title;

    @BindDrawable(R.mipmap.beauty)
    Drawable beauty;

    @BindColor(R.color.colorPrimary)
    int color;

    @BindDimen(R.dimen.text_size)
    int size;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "haha", Toast.LENGTH_SHORT).show();
            }
        });


        btn.setText(title);
        btn.setTextColor(color);
        btn.setTextSize(size);


        imageView.setImageDrawable(beauty);

    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_second;
    }

}
