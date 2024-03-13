package campalans.m8.ballskotlin;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class BallAnimationExample extends Activity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout container = findViewById(R.id.container);
        container.addView(new MyAnimationView(this));
    }
}
