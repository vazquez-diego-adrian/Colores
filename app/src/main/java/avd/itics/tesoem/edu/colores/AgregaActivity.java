package avd.itics.tesoem.edu.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AgregaActivity extends AppCompatActivity{

     EditText txtInput;
     ArrayList<String> ad = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrega);

        txtInput = (EditText)findViewById(R.id.txtInput);

    }

    public void agregar(View v){
        String ingres = txtInput.getText().toString();
        if (ad.contains(ingres)) {
            Toast.makeText(this, "Llena bien el JODIDO recuadro", Toast.LENGTH_LONG).show();
        } else {
            Var.agregar(txtInput.getText().toString());
            txtInput.setText("");
            Toast.makeText(getApplicationContext(),"Registro exitoso, papi  " +ingres, Toast.LENGTH_LONG).show();
        }
    }
    public void muestra(View v) {
        Intent muestra = new Intent (this, MostrarActivity.class);
        startActivity(muestra);
        finish();

    }
    public void menu(View v) {
        Intent menu = new Intent (this, MainActivity.class);
        startActivity(menu);
        finish();

    }
}
