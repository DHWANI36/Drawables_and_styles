package com.example.dhwani_android.drawables_and_styles;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLaunchDemo(View v) {
        Class<? extends Activity> selectedDemo = null;
        switch (v.getId()) {
            case R.id.btnDrawables:
                selectedDemo = BasicDrawableActivity.class;
                break;
            case R.id.btnLayerList:
                selectedDemo = LayerListActivity.class;
                break;
            case R.id.btn9Patch:
                selectedDemo = NinePatchActivity.class;
                break;
            case R.id.btnStyles:
                selectedDemo = StylesActivity.class;
                break;
            case R.id.btnThemes:
                selectedDemo = ThemesActivity.class;
                break;
        }
        if (selectedDemo != null) {
            startActivity(new Intent(this, selectedDemo));
        } else {
            Toast.makeText(this, "Demo can't be found!", Toast.LENGTH_SHORT).show();
        }
    }

}
