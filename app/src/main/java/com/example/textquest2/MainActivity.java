package com.example.textquest2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.factories.SituationStartFactory;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button buttonTop;
    private Button buttonCenter;
    private Button buttonBottom;
    private TextView title;
    private TextView content;
    private TextView happiness;
    private TextView satiety;
    private TextView energy;

    private MutableLiveData<ISituation> currentSituation;
    private Specifications specifications;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTop = findViewById(R.id.buttonTop);
        buttonCenter = findViewById(R.id.buttonCenter);
        buttonBottom = findViewById(R.id.buttonBottom);
        title=findViewById(R.id.title1);
        content=findViewById(R.id.content);
        happiness=findViewById(R.id.happiness);
        satiety=findViewById(R.id.satiety);
        energy=findViewById(R.id.energy);

        specifications=Specifications.getInstance();

        currentSituation=new MutableLiveData<>();
        currentSituation.observeForever(this::fillContent);
        currentSituation.setValue(new SituationStartFactory().create());

        initButtons();
    }

    private void fillContent(ISituation iSituation) {
        buttonTop.setVisibility(View.VISIBLE);
        buttonCenter.setVisibility(View.VISIBLE);
        buttonBottom.setVisibility(View.VISIBLE);

        title.setText(iSituation.getTitle());
        content.setText(iSituation.getContent());

        String[] buttonContent=iSituation.getButtonContent();

        switch (buttonContent.length){
            case 3:
                buttonTop.setText(buttonContent[0]);
                buttonCenter.setText(buttonContent[1]);
                buttonBottom.setText(buttonContent[2]);
                break;
            case 2:
                buttonTop.setText(buttonContent[0]);
                buttonCenter.setText(buttonContent[1]);
                buttonBottom.setVisibility(View.GONE);
                break;
            case 1:
                buttonTop.setText(buttonContent[0]);
                buttonCenter.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
                break;
            case 0:
                buttonTop.setVisibility(View.GONE);
                buttonCenter.setVisibility(View.GONE);
                buttonBottom.setVisibility(View.GONE);
                break;
        }

        specifications.changeValues(iSituation.getChangedValues());
        happiness.setText(String.valueOf(Specifications.getInstance().getHappiness()));
        satiety.setText(String.valueOf(Specifications.getInstance().getSatiety()));
        energy.setText(String.valueOf(Specifications.getInstance().getEnergy()));
    }

    private void initButtons(){
        buttonTop.setOnClickListener(v -> {
            String key = buttonTop.getText().toString();
            currentSituation.setValue(Objects.requireNonNull(currentSituation.getValue()).getWays().get(key).create());
        });
        buttonCenter.setOnClickListener(v -> {
            String key = buttonCenter.getText().toString();
            currentSituation.setValue(Objects.requireNonNull(currentSituation.getValue()).getWays().get(key).create());
        });
        buttonBottom.setOnClickListener(v -> {
            String key = buttonBottom.getText().toString();
            currentSituation.setValue(Objects.requireNonNull(currentSituation.getValue()).getWays().get(key).create());
        });
        findViewById(R.id.button4).setOnClickListener(v->{
            Specifications.getInstance().resetSpecifications();
            currentSituation.setValue(new SituationStartFactory().create());
        });

    }
}