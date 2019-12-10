package ejt.edu.tesoem.genita212.itic.gridviewbaseadaptereugenia212;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        GridView gvdatos;
        contenido contenido;
        contenido contenido2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvdatos=findViewById(R.id.gvcontenedor);

        ArrayList<String> arreglo= new ArrayList<String>();
        arreglo.add("Fernando");
        arreglo.add("Francisco");
        arreglo.add("Saul");
        arreglo.add("Guadalupe");
        arreglo.add("Roberto");
        arreglo.add("Angel");
        arreglo.add("Sabino");
        arreglo.add("Julisa");
        arreglo.add("Alma");
        arreglo.add("Alicia");
        arreglo.add("Joel");

        contenido= new contenido(this,arreglo);
        gvdatos.setAdapter(contenido);

    }
}
