package com.gzeinnumer.windview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.ahmadnemati.wind.WindView;
import com.github.ahmadnemati.wind.enums.TrendType;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.windBtn);
        final WindView windView = findViewById(R.id.windView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                windView.setPressure(200.0f);
                windView.setPressureUnit(" in Hg");
                windView.setWindSpeed(100.0f);
                windView.setWindSpeedUnit(" km/h");
                windView.setTrendType(TrendType.UP);
            }
        });
    }
}
