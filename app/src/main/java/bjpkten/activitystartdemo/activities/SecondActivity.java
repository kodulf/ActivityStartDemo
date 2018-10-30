package bjpkten.activitystartdemo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import bjpkten.activitystartdemo.R;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


    }

    public void jumpToThird(View view) {
            Intent intent = new Intent(this,ThirdActivity.class);

            startActivity(intent);
    }

    public void jumpToFirst(View view) {
        Intent intent = new Intent(this,MainActivity.class);

        startActivity(intent);
    }
}
