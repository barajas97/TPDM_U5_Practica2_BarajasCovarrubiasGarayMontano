package mx.edu.ittepic.miriambarajas.tpdm_u5_practica3_barajascovarrubiasgaraymontano;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {
    Spinner edificios;
    Button verEdificio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edificios = findViewById(R.id.sedificios);
        verEdificio = findViewById(R.id.edificios);

        verEdificio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eleccion();
            }
        });
    }

    public void eleccion(){
        int sel = edificios.getSelectedItemPosition();
        String[] descripciones = {" ", "En las áreas recreativas"};
        switch (sel){
            case 0:
                Toast.makeText(this, "Por favor, seleccione un edificio", Toast.LENGTH_LONG).show();
                break;
            case 1:
                Drawable imagen = getResources().getDrawable(R.drawable.licbi);
                mostrarEdificio("Áreas Recreativas", descripciones[1], imagen);
                break;
        }
    }

    public void mostrarEdificio(String edi, String descripcion, Drawable imagen){
        AlertDialog.Builder edificio = new AlertDialog.Builder(Main2Activity.this);
        final View contenido = getLayoutInflater().inflate(R.layout.infoedificio, null);
        edificio.setTitle("Información");
        edificio.setView(contenido);
        final TextView nombreE = contenido.findViewById(R.id.nombreedificio);
        final ImageView imagenE = contenido.findViewById(R.id.imagenedificio);
        final TextView descrE = contenido.findViewById(R.id.descripcionedificio);
        nombreE.setText(edi);
        imagenE.setImageDrawable(imagen);
        descrE.setText(descripcion);
        edificio.setPositiveButton("Aceptar", null)
                .show();
    }

}
