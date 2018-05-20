package com.example.boxiongsun.fadingimages;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fadeAway(View view) {
        ImageView sLarge = findViewById(R.id.snorlaxLarge);
        ImageView sSmall = findViewById(R.id.snorlaxSmall);

        rotate(sLarge);
        moveHorizontally(sLarge);

        updateAlpha(sLarge, 0, 2000);
        updateAlpha(sSmall, 1, 3000);
    }

    private void rotate(ImageView sLarge) {
       sLarge.animate().rotation(180).scaleX(0.5f).scaleY(0.5f);
    }

    private void moveHorizontally(ImageView sLarge) {
        sLarge.animate().translationX(500f).setDuration(2000);
    }

    private void updateAlpha(ImageView sLarge, int alpha, int duration) {
        // Alpha is a transparency setting from 0 to 1;
        // Duration is using mil-sec
        sLarge.animate().alpha(alpha).setDuration(duration);
    }



}
