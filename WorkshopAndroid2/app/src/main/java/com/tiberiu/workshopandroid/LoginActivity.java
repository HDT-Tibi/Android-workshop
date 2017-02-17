package com.tiberiu.workshopandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by TiberiuH on 17-Feb-17.
 */

public class LoginActivity extends AppCompatActivity {


    public static final String MY_KEY = "MY KEY";

    public static Intent createIntent (Activity activity, String message){
        Intent intent = new Intent(activity, LoginActivity.class);
        intent.putExtra(MY_KEY, message);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);

        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);


        Intent intent = getIntent();
        if (intent != null)
        {
            String intentString = intent.getStringExtra("edittext_string");
            String text = intentString != null ? intentString: "No string here";

            intent.getIntExtra("int_value", -2);
        }
    }
}
