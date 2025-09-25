package com.example.servicity;


import static com.example.servicity.R.id.btn_registrar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.sql.Connection;

public class LoginActivity extends AppCompatActivity {

    EditText usuario,clave;

    TextView btn_registrar;

    Button btnregistrar;


    Button btn_ingrsar;

    Connection con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        usuario=(EditText) findViewById(R.id.txtusuario);
        clave=(EditText) findViewById(R.id.txtelave);
        btn_registrar=(TextView) findViewById(R.id.btn_registrar);
        btnregistrar=(Button) findViewById(R.id.btn_registrar);
        btn_ingrsar=findViewById(R.id.btn_ingresar);


        btn_ingrsar.setOnClickListener(v -> {
            String user = usuario.getText().toString().trim();
            String pass = clave.getText().toString().trim();

            // validaciones básicas de campos vacíos
            if (user.isEmpty()) {
                usuario.requestFocus();
                usuario.setError("Ingrese usuario");
                Toast.makeText(LoginActivity.this, "Ingrese usuario", Toast.LENGTH_SHORT).show();
                return;
            }
            if (pass.isEmpty()) {
                clave.requestFocus();
                clave.setError("Ingrese contraseña");
                Toast.makeText(LoginActivity.this, "Ingrese contraseña", Toast.LENGTH_SHORT).show();
                return;
            }

            // Validación pedida: usuario = AMD (ignorando mayúsculas), contraseña = 1234
            if (user.equalsIgnoreCase("AMD") && pass.equals("1234")) {
                // Mensaje de éxito por ahora
                Toast.makeText(LoginActivity.this, "Usuario y contraseña correctos", Toast.LENGTH_LONG).show();

                // Si en un futuro quieres abrir HomeActivity cuando exista, descomenta:
                // Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                // i.putExtra("usuario", user);
                // startActivity(i);
                // finish();
            } else {
                // Mensaje y marcar errores
                Toast.makeText(LoginActivity.this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();

                // opcional: marcar ambos campos con error para que el usuario corrija
                usuario.setError("Usuario incorrecto");
                clave.setError("Contraseña incorrecta");
            }
        });

        // Vincular el botón del login.xml
        Button btnRegistrateAhora = findViewById(R.id.btn_registrar);

// Darle acción al botón
        btnRegistrateAhora.setOnClickListener(v -> {
            // Ir a la pantalla de registro
            Intent intent = new Intent(LoginActivity.this, Registro.class);


            startActivity(intent);

        });

    }

}
