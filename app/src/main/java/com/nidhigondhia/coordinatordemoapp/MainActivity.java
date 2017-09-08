package com.nidhigondhia.coordinatordemoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
    Button btnCollapsingToolbar;

    @BindView(R.id.btn2)
    Button btnCoordinatorBehaviours;

    @BindView(R.id.btn3)
    Button btnFabAndSnackBar;

    @BindView(R.id.btn4)
    Button btnFabFixToView;

    private Intent intentNavigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn1)
    public void submitCollapsingToolbar(View view) {
        // TODO navigate to activity...
        intentNavigate = new Intent(this,CollapsingToolbarAct.class);
        startActivity(intentNavigate);
    }

    @OnClick(R.id.btn2)
    public void submitCoordinatorBehaviours(View view) {
        // TODO navigate to activity...
        intentNavigate = new Intent(this,CoordinatorBehavioursAct.class);
        startActivity(intentNavigate);
    }

    @OnClick(R.id.btn3)
    public void submitFabAndSnackBar(View view) {
        // TODO navigate to activity...
        intentNavigate = new Intent(this,FabAndSnackBarAct.class);
        startActivity(intentNavigate);
    }

    @OnClick(R.id.btn4)
    public void submitFabFixToView(View view) {
        // TODO navigate to activity...
        intentNavigate = new Intent(this,FabFixToViewAct.class);
        startActivity(intentNavigate);
    }

}
