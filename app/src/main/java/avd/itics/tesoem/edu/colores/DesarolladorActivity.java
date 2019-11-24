package avd.itics.tesoem.edu.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DesarolladorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarollador);
    }
    public void BACK(View v) {
        Intent BACK = new Intent (this, MainActivity.class);
        startActivity(BACK);
        finish();

    }
}
