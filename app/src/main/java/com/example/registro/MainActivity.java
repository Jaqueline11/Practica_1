package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.registro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText txt_nombre, txt_clave, txt_clave1;
    Button btn_registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*setContentView(R.layout.activity_main);*/
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        txt_nombre = binding.txtNombre;
        txt_clave = binding.txtClave;
        txt_clave1 = binding.txtClave2;
        btn_registrar = binding.btnRegistrar;

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrar();
            }
        });

    }

    public void registrar(){
        if (!txt_nombre.getText().toString().isEmpty() && !txt_clave.getText().toString().isEmpty() &&
        !txt_clave1.getText().toString().isEmpty()){
            if (txt_clave.getText().length()>4){
                if (txt_clave1.getText().toString().equals(txt_clave.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Registrado correctamente", Toast.LENGTH_SHORT).show();
                }else{
                Toast.makeText(getApplicationContext(),"Las claves no coinciden", Toast.LENGTH_SHORT).show();
            }
            }else{
                Toast.makeText(getApplicationContext(),"Clave minimo 5 caracteres", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getApplicationContext(),"Llenar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }
}