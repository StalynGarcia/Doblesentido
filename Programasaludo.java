package com.stalyn.saludo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText saludos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        saludos = (EditText)findViewById(R.id.Name);
    }
    public void PogramaSaludo(View view){
        String elnombre = saludos.getText().toString();

        Toast.makeText(this, "Hola "+elnombre+" que tengas un buen día", Toast.LENGTH_SHORT).show();




    }

}
