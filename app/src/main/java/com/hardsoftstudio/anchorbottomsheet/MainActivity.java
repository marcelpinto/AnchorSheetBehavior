package com.hardsoftstudio.anchorbottomsheet;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hardsoftstudio.widget.AnchorSheetBehavior;

public class MainActivity extends AppCompatActivity {

    private AnchorSheetBehavior<View> anchorBehavior;
    private TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = findViewById(R.id.panel_content);

        anchorBehavior = AnchorSheetBehavior.from(findViewById(R.id.anchor_panel));
        anchorBehavior.setHideable(true);
        anchorBehavior.setState(AnchorSheetBehavior.STATE_HIDDEN);
        anchorBehavior.setAnchorSheetCallback(new AnchorSheetBehavior.AnchorSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, @AnchorSheetBehavior.State int newState) {
                content.setText(newState == AnchorSheetBehavior.STATE_EXPANDED ? R.string.slide_me_down : R.string.slide_me_up);
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        int state = anchorBehavior.getState();
        if (state == AnchorSheetBehavior.STATE_COLLAPSED || state == AnchorSheetBehavior.STATE_HIDDEN) {
            super.onBackPressed();
        } else {
            anchorBehavior.setState(AnchorSheetBehavior.STATE_COLLAPSED);
        }
    }

    public void onTap(View view) {
        switch (anchorBehavior.getState()) {
            case AnchorSheetBehavior.STATE_ANCHOR:
                anchorBehavior.setState(AnchorSheetBehavior.STATE_EXPANDED);
                break;
            case AnchorSheetBehavior.STATE_COLLAPSED:
                anchorBehavior.setState(AnchorSheetBehavior.STATE_ANCHOR);
                break;
            case AnchorSheetBehavior.STATE_HIDDEN:
                anchorBehavior.setState(AnchorSheetBehavior.STATE_COLLAPSED);
                break;
            case AnchorSheetBehavior.STATE_EXPANDED:
                anchorBehavior.setState(AnchorSheetBehavior.STATE_ANCHOR);
                break;
            default:
                break;
        }
    }
}
