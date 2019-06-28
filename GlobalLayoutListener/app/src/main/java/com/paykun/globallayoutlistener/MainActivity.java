package com.paykun.globallayoutlistener;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    Button btnGo;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Remember to add the contentview first or it will not be able to grab the rootview
        attachKeyboardListeners();

        editText=(EditText)findViewById(R.id.edittext);
        editText.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                Toast.makeText(MainActivity.this," Changed in edittext : ",Toast.LENGTH_SHORT).show();
            }
        });
        btnGo=(Button)findViewById(R.id.btn);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("HI");
            }
        });
    }

    @Override
    protected void onShowKeyboard(int keyboardHeight) {
        // Here we do whatever we want when the keyboard is up
        //randomView.setVisibility(View.GONE);
        Log.e(" show ", " on show keyboard : ");
    }

    @Override
    protected void onHideKeyboard() {
        // Here we do whatever we want when the keyboard is hidden
        //randomView.setVisibility(View.VISIBLE);
        Log.e(" hide ", " on show keyboard : ");
    }
}
