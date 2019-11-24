package avd.itics.tesoem.edu.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class MostrarActivity extends AppCompatActivity {
    ArrayList<Var> colorsList;
    Button btnmenu;
    Spinner opcion;
    ArrayAdapter<String> ColorLife;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        btnmenu = (Button) findViewById(R.id.btnmenu);
        opcion = findViewById(R.id.opcion);
        ColorLife = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Var.miscolores());
        colorsList = new ArrayList<Var>();

        opcion.setAdapter(ColorLife);

    }
    public void menu(View v) {
        Intent menu = new Intent (this, MainActivity.class);
        startActivity(menu);
        finish();
    }
}
