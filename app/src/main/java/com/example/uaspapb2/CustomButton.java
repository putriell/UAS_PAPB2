package com.example.uaspapb2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;

public class CustomButton extends AppCompatButton {
    private boolean isButtonClicked;
    public CustomButton(@NonNull Context context) {
        super(context);
        init();
    }

    public CustomButton(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }


    private void init() {
        setBackgroundColor(getResources().getColor(R.color.red));
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isButtonClicked == true){
                    setBackgroundColor(getResources().getColor(R.color.yellow));
                    isButtonClicked = false;
                }
                else{
                    setBackgroundColor(getResources().getColor(R.color.red));
                    isButtonClicked = true;
                }
            }
        });
    }


}
