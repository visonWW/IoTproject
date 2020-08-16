package org.techtown.iotproject;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class lightActivity extends AppCompatActivity {
    private Button onoffButton;
    private int mBtnClickToggle;
//    토글변수
    Button addBtn;
    ToggleButton toggleButton;
    LinearLayout layout;
    Context context;
    int count=1;
    EditText editText;

//    전등 추가
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.light);

        addBtn = (Button)findViewById(R.id.addBtn);
        layout = (LinearLayout)findViewById(R.id.layout);
        context = this;

        addBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Button btn = new Button(context);
                ToggleButton toggleButton = new ToggleButton(context);
                btn.setText("Light" + String.valueOf(count));
                layout.addView(btn);
                layout.addView(toggleButton);
                count++;

            }
        });

//        토글버튼 생성
        onoffButton = findViewById(R.id.togglebtn);
        onoffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(mBtnClickToggle==1){
                    onoffButton.setText("OFF");
                    mBtnClickToggle=0;
                }
                else{
                    onoffButton.setText("ON");
                    mBtnClickToggle=1;
                }
            }

        });
    }


}


