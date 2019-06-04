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
    Drawable imagen;
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
        String[] descripciones = {"En esta área se encuentran las canchas deportivas de basquetbol, voleibol, futbol soccer, futbol americano, béisbol y el famoso súper domo",
            "Salones de impartición de clases preferentes a alumnos de II",
            "Encontramos el edificio de Administración donde están las oficinas de coordinación de las carreras, financieros, así como las oficinas de dirección y subdirección",
            "Diversos laboratorios químicos de uso preferente para alumnos de Química y Bioquímica",
            "Laboratorio de ingeniería industrial así como también el departamento de recursos materiales y servicio de almacén",
            "Ciencas básicas conocido como BASTÓN, se imparten las clases de las materias con enfoque matemático. Se encuentras las oficinas de los Mtros. De dichas materias",
            "Centro de información mejor conocido como BIBLIOTECA, es un espacio para que alumnos puedan consultar información, realizar trabajos y llevar acabo eventos académicos",
            "Extra escolares, se encuentran las oficinas encargadas de las actividades extra escolares y deportivas",
            "Laboratorios preferentes para alumnos de ingeniería civil y mecatrónica ",
            "Salones de impartición de clases",
            "Salones de impartición de clases preferentes a alumnos de arquitectura y civil",
             "Salones de impartición de clases, enfermería, oficina de titulación",
            "Salones de impartición de clases, cafetería y oficinas de maestros",
             "Salones de impartición de clases preferentes a alumnos de Admon",
            "Laboratorio de cómputo para impartir clases preferentes a alumnos de ISC e ITIC",
            "Salones de impartición de clases preferente para alumnos de mecatrónica",
            "Salones de impartición de clases preferentes a alumnos de Postgrados",
            "Diversos laboratorios químicos de uso preferente para alumnos de Química y Bioquímica",
            "Salones de impartición de clases preferentes a alumnos de IG",
            "Sala audiovisual y oficinas de la carrera de química y bioquimica",
            "Salones de impartición de clases preferentes a alumnos de IQ, IB",
            "Oficinas de cómite académico estudiantil y de recursos humanos",
            "Área designada a arquitectura",
            "Salones de clase así como las oficinas de ISC, Industrial, desarrollo académico, etc",
            "Salones de clases, oficinas de servicio social, residencias e inglés",
            "Salones de impartición de clases"
            };
        switch (sel){
            case 0:
                Toast.makeText(this, "Por favor, seleccione un edificio", Toast.LENGTH_LONG).show();
                break;
            case 1:
                imagen = getResources().getDrawable(R.drawable.ar);
                mostrarEdificio("Áreas Recreativas", descripciones[0], imagen);
                break;
            case 2:
                imagen = getResources().getDrawable(R.drawable.a);
                mostrarEdificio("Edificio A", descripciones[1], imagen);
                break;
            case 3:
                imagen = getResources().getDrawable(R.drawable.ad);
                mostrarEdificio("Edficio AD", descripciones[2], imagen);
                break;
            case 4:
                imagen = getResources().getDrawable(R.drawable.b);
                mostrarEdificio("Edificio B", descripciones[3], imagen);
                break;
            case 5:
                imagen = getResources().getDrawable(R.drawable.bb);
                mostrarEdificio("Edificio B II ", descripciones[4], imagen);
                break;
            case 6:
                imagen = getResources().getDrawable(R.drawable.cb);
                mostrarEdificio("Edificio CB", descripciones[5], imagen);
                break;
            case 7:
                imagen = getResources().getDrawable(R.drawable.ci);
                mostrarEdificio("Edificio CI", descripciones[6], imagen);
                break;
            case 8:
                imagen = getResources().getDrawable(R.drawable.ee);
                mostrarEdificio("Edificio EE", descripciones[7], imagen);
                break;
            case 9:
                imagen = getResources().getDrawable(R.drawable.f);
                mostrarEdificio("Edificio F", descripciones[8], imagen);
                break;
            case 10:
                imagen = getResources().getDrawable(R.drawable.g);
                mostrarEdificio("Edificio G", descripciones[9], imagen);
                break;
            case 11:
                imagen = getResources().getDrawable(R.drawable.h);
                mostrarEdificio("Edificio H", descripciones[10], imagen);
                break;
            case 12:
                imagen = getResources().getDrawable(R.drawable.j);
                mostrarEdificio("Edificio J", descripciones[11], imagen);
                break;
            case 13:
                imagen = getResources().getDrawable(R.drawable.k);
                mostrarEdificio("Edificio K", descripciones[12], imagen);
                break;
            case 14:
                imagen = getResources().getDrawable(R.drawable.l);
                mostrarEdificio("Edificio L", descripciones[13], imagen);
                break;
            case 15:
                imagen = getResources().getDrawable(R.drawable.lc);
                mostrarEdificio("Edificio LC", descripciones[14], imagen);
                break;
            case 16:
                imagen = getResources().getDrawable(R.drawable.licbi);
                mostrarEdificio("Edificio LICBI", descripciones[15], imagen);
                break;
            case 17:
                imagen = getResources().getDrawable(R.drawable.liia);
                mostrarEdificio("Edificio LIIA", descripciones[16], imagen);
                break;
            case 18:
                imagen = getResources().getDrawable(R.drawable.m);
                mostrarEdificio("Edificio M", descripciones[17], imagen);
                break;
            case 19:
                imagen = getResources().getDrawable(R.drawable.n);
                mostrarEdificio("Edificio N", descripciones[18], imagen);
                break;
            case 20:
                imagen = getResources().getDrawable(R.drawable.p);
                mostrarEdificio("Edificio P", descripciones[19], imagen);
                break;
            case 21:
                imagen = getResources().getDrawable(R.drawable.q);
                mostrarEdificio("Edificio Q", descripciones[20], imagen);
                break;
            case 22:
                imagen = getResources().getDrawable(R.drawable.s);
                mostrarEdificio("Edificio S", descripciones[21], imagen);
                break;
            case 23:
                imagen = getResources().getDrawable(R.drawable.ta);
                mostrarEdificio("Edificio TA", descripciones[22], imagen);
                break;
            case 24:
                imagen = getResources().getDrawable(R.drawable.ud);
                mostrarEdificio("Edificio UD", descripciones[23], imagen);
                break;
            case 25:
                imagen = getResources().getDrawable(R.drawable.uvp);
                mostrarEdificio("Edificio UVP", descripciones[24], imagen);
                break;
            case 26:
                imagen = getResources().getDrawable(R.drawable.x);
                mostrarEdificio("Edificio X", descripciones[25], imagen);
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
