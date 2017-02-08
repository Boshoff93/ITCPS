package com.example.wiehan.kate_app_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_Scenario_ScenFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scenario_scen_four);

        Button buttonContinue = (Button) findViewById(R.id.buttonContinue_Scen4);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Advance_Display_ScenFour.class);
                startActivity(intent);
            }
        });
    }

}
