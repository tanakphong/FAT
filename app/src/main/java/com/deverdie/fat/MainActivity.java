package com.deverdie.fat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mDispR1;
    private TextView mDispR2;
    private TextView mDispR3;
    private TextView mDispR4;
    private Button mBtnR1C1;
    private Button mBtnR1C2;
    private Button mBtnR1C3;
    private Button mBtnR1C4;
    private Button mBtnR2C1;
    private Button mBtnR2C2;
    private Button mBtnR2C3;
    private Button mBtnR2C4;
    private Button mBtnR3C1;
    private Button mBtnR3C2;
    private Button mBtnR3C3;
    private Button mBtnR3C4;
    private Button mBtnR4C1;
    private Button mBtnR4C2;
    private Button mBtnR4C3;
    private Button mBtnR4C4;
    private Button mBtnR5C1;
    private Button mBtnR5C2;
    private Button mBtnR5C3;
    private Button mBtnR5C4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        registerButtonOnClick();

    }

    private void bindView() {

        mDispR1 = (TextView) findViewById(R.id.txtDispRow1);
        mDispR2 = (TextView) findViewById(R.id.txtDispRow2);
        mDispR3 = (TextView) findViewById(R.id.txtDispRow3);
        mDispR4 = (TextView) findViewById(R.id.txtDispRow4);

        mBtnR1C1 = (Button) findViewById(R.id.btnR1C1);
        mBtnR1C2 = (Button) findViewById(R.id.btnR1C2);
        mBtnR1C3 = (Button) findViewById(R.id.btnR1C3);
        mBtnR1C4 = (Button) findViewById(R.id.btnR1C4);

        mBtnR2C1 = (Button) findViewById(R.id.btnR2C1);
        mBtnR2C2 = (Button) findViewById(R.id.btnR2C2);
        mBtnR2C3 = (Button) findViewById(R.id.btnR2C3);
        mBtnR2C4 = (Button) findViewById(R.id.btnR2C4);

        mBtnR3C1 = (Button) findViewById(R.id.btnR3C1);
        mBtnR3C2 = (Button) findViewById(R.id.btnR3C2);
        mBtnR3C3 = (Button) findViewById(R.id.btnR3C3);
        mBtnR3C4 = (Button) findViewById(R.id.btnR3C4);

        mBtnR4C1 = (Button) findViewById(R.id.btnR4C1);
        mBtnR4C2 = (Button) findViewById(R.id.btnR4C2);
        mBtnR4C3 = (Button) findViewById(R.id.btnR4C3);
        mBtnR4C4 = (Button) findViewById(R.id.btnR4C4);

        mBtnR5C1 = (Button) findViewById(R.id.btnR5C1);
        mBtnR5C2 = (Button) findViewById(R.id.btnR5C2);
        mBtnR5C3 = (Button) findViewById(R.id.btnR5C3);
        mBtnR5C4 = (Button) findViewById(R.id.btnR5C4);

    }

    private void registerButtonOnClick() {

        mBtnR1C1.setOnClickListener(buttonClickListener);
        mBtnR1C2.setOnClickListener(buttonClickListener);
        mBtnR1C3.setOnClickListener(buttonClickListener);
        mBtnR1C4.setOnClickListener(buttonClickListener);

        mBtnR2C1.setOnClickListener(buttonClickListener);
        mBtnR2C2.setOnClickListener(buttonClickListener);
        mBtnR2C3.setOnClickListener(buttonClickListener);
        mBtnR2C4.setOnClickListener(buttonClickListener);

        mBtnR3C1.setOnClickListener(buttonClickListener);
        mBtnR3C2.setOnClickListener(buttonClickListener);
        mBtnR3C3.setOnClickListener(buttonClickListener);
        mBtnR3C4.setOnClickListener(buttonClickListener);

        mBtnR4C1.setOnClickListener(buttonClickListener);
        mBtnR4C2.setOnClickListener(buttonClickListener);
        mBtnR4C3.setOnClickListener(buttonClickListener);
        mBtnR4C4.setOnClickListener(buttonClickListener);

        mBtnR5C1.setOnClickListener(buttonClickListener);
        mBtnR5C2.setOnClickListener(buttonClickListener);
        mBtnR5C3.setOnClickListener(buttonClickListener);
        mBtnR5C4.setOnClickListener(buttonClickListener);

    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnR1C1:
                    mDispR1.setText(mDispR1.getText().toString() + getResources().getString(R.string.btnR1C1));
                    break;
                case R.id.btnR1C2:
                    mDispR2.setText(mDispR2.getText().toString() + getResources().getString(R.string.btnR1C2));
                    break;
                case R.id.btnR1C3:
                    mDispR3.setText(mDispR3.getText().toString() + getResources().getString(R.string.btnR1C3));
                    break;
                case R.id.btnR1C4:
                    mDispR3.setText(mDispR4.getText().toString() + getResources().getString(R.string.btnR1C4));
                    break;
                case R.id.btnR2C1:
                    mDispR1.setText(mDispR1.getText().toString() + getResources().getString(R.string.btnR2C1));
                    break;
                case R.id.btnR2C2:
                    mDispR2.setText(mDispR2.getText().toString() + getResources().getString(R.string.btnR2C2));
                    break;
                case R.id.btnR2C3:
                    mDispR3.setText(mDispR3.getText().toString() + getResources().getString(R.string.btnR2C3));
                    break;
                case R.id.btnR2C4:
                    mDispR3.setText(mDispR4.getText().toString() + getResources().getString(R.string.btnR2C4));
                    break;
                case R.id.btnR3C1:
                    mDispR1.setText(mDispR1.getText().toString() + getResources().getString(R.string.btnR3C1));
                    break;
                case R.id.btnR3C2:
                    mDispR2.setText(mDispR2.getText().toString() + getResources().getString(R.string.btnR3C2));
                    break;
                case R.id.btnR3C3:
                    mDispR3.setText(mDispR3.getText().toString() + getResources().getString(R.string.btnR3C3));
                    break;
                case R.id.btnR3C4:
                    mDispR3.setText(mDispR4.getText().toString() + getResources().getString(R.string.btnR3C4));
                    break;
                case R.id.btnR4C1:
                    mDispR1.setText(mDispR1.getText().toString() + getResources().getString(R.string.btnR4C1));
                    break;
                case R.id.btnR4C2:
                    mDispR2.setText(mDispR2.getText().toString() + getResources().getString(R.string.btnR4C2));
                    break;
                case R.id.btnR4C3:
                    mDispR3.setText(mDispR3.getText().toString() + getResources().getString(R.string.btnR4C3));
                    break;
                case R.id.btnR4C4:
                    mDispR3.setText(mDispR4.getText().toString() + getResources().getString(R.string.btnR4C4));
                    break;
                case R.id.btnR5C1:
                    mDispR1.setText(mDispR1.getText().toString() + getResources().getString(R.string.btnR5C1));
                    break;
                case R.id.btnR5C2:
                    mDispR2.setText(mDispR2.getText().toString() + getResources().getString(R.string.btnR5C2));
                    break;
                case R.id.btnR5C3:
                    mDispR3.setText(mDispR3.getText().toString() + getResources().getString(R.string.btnR5C3));
                    break;
                case R.id.btnR5C4:
                    mDispR3.setText(mDispR4.getText().toString() + getResources().getString(R.string.btnR5C4));
                    break;
            }
        }
    };
}
