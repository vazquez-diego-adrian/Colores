package avd.itics.tesoem.edu.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void entrar(View v) {
        Intent entrar = new Intent (this, AgregaActivity.class);
        startActivity(entrar);
        finish();

    }
    public void muestra(View v) {
        Intent muestra = new Intent (this, MostrarActivity.class);
        startActivity(muestra);
        finish();

    }
    public void desarrollador(View v) {
        Intent desarrollador = new Intent (this, DesarolladorActivity.class);
        startActivity(desarrollador);
        finish();

    }
}
