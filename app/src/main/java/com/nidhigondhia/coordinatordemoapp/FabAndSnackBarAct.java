package com.nidhigondhia.coordinatordemoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FabAndSnackBarAct extends AppCompatActivity {

    @BindView(R.id.showSnackbarButton)
    Button btnShowSnackBar;

    @BindView(R.id.coordinatorLayout)
    CoordinatorLayout mCoordinatorLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab_and_snack_bar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.showSnackbarButton)
    public void showSnackbar(View view) {

        /**
         * set the root View for the Snackbar to the CoordinatorLayout.
         * The CoordinatorLayout knows about the Snackbar and the FAB,
         * and the transition animation is handled automatically,
         * to make sure that both widgets do not overlap
         */
        Snackbar.make(mCoordinatorLayout,
                "This is a simple Snackbar", Snackbar.LENGTH_SHORT)
                .setAction("CLOSE", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Custom action
                    }
                }).show();
    }
}
