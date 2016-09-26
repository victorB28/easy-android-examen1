package com.examen.tecii.easyandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Android extends AppCompatActivity {

    public static int progress = 0;

    public static Activity context;
    public TextView title;
    public ImageView imageView;
    public Button goBtn;
    public Button nextBtn;
    public Button backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        context = this;
        imageView = (ImageView) findViewById(R.id.androidImageView);
        goBtn = (Button) findViewById(R.id.viewTopicBtn);
        nextBtn = (Button) findViewById(R.id.nextTopicBtn);
        backBtn = (Button) findViewById(R.id.lastTopicBtn);
        title = (TextView) findViewById(R.id.topic);
        setTopic(progress);
        setImageResource(progress);
        displayStateBtn(progress);
        centralBtn(progress);
        rightBtn(progress);
        leftBtn(progress);
        displayFinalBtn(progress);

    }

    public void setImageResource(int progress) {

        switch (progress) {
            case 0:
                imageView.setImageResource(R.drawable.unknownandroid);
                break;
            case 1:
                imageView.setImageResource(R.drawable.android25);
                break;
            case 2:
                imageView.setImageResource(R.drawable.android50);
                break;
            case 3:
                imageView.setImageResource(R.drawable.android75);
                break;
            case 4:
                imageView.setImageResource(R.drawable.androidwin);
        }
    }

    public void setTopic(int progress) {

        switch (progress) {
            case 0:
                title.setText("First Topic");
                break;
            case 1:
                title.setText("Second Topic");
                break;
            case 2:
                title.setText("Third Topic");
                break;
            case 3:
                title.setText("Fourth Topic");
                break;
            case 4:
                title.setText("Congratulations!");
        }
    }
    public void displayStateBtn(int progress) {

        if (progress != 0) {
            nextBtn.setVisibility(View.VISIBLE);
            backBtn.setVisibility(View.VISIBLE);
            goBtn.setVisibility(View.INVISIBLE);
        }

    }
    public void displayFinalBtn(int progress) {

        if (progress == 4) {
            nextBtn.setVisibility(View.INVISIBLE);
            backBtn.setVisibility(View.INVISIBLE);
            goBtn.setText("Exit");
            goBtn.setVisibility(View.VISIBLE);
        }

    }

    public void centralBtn(final int progress) {

        goBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (progress == 0) {
                        Intent tryFirstTopic = new Intent(getApplication(),FirstTopic.class);
                        startActivity(tryFirstTopic);
                }else{
                    if (progress == 4){
                        finish();
                    }
                }
            }

        });

    }

    public void rightBtn(final int progress) {

        nextBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (progress) {
                    case 0:
                        break;
                    case 1:
                        Intent trySecondTopic = new Intent(getApplication(), SecondTopic.class);
                        startActivity(trySecondTopic);
                        break;
                    case 2:
                        Intent tryThirdTopic = new Intent(getApplication(),ThirdTopic.class);
                        startActivity(tryThirdTopic);
                        break;
                    case 3:
                        Intent tryFourthTopic = new Intent(getApplication(),FourthTopic.class);
                        startActivity(tryFourthTopic);
                        break;
                }
            }
        });

    }

    public void leftBtn(final int progress) {

        backBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                switch (progress) {
                    case 0:
                        break;
                    case 1:
                        Intent reviewFirstTopic = new Intent(getApplication(),FirstTopic.class);
                        startActivity(reviewFirstTopic);
                        break;
                    case 2:
                        Intent reviewSecondTopic = new Intent(getApplication(),SecondTopic.class);
                        startActivity(reviewSecondTopic);
                        break;
                    case 3:
                        Intent reviewThirdTopic = new Intent(getApplication(),ThirdTopic.class);
                        startActivity(reviewThirdTopic);
                        break;

                }
            }

        });

    }


}
