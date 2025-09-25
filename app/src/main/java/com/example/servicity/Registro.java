package com.example.servicity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    EditText etNombre, etCorreo, etContrasena, etConfirmarContrasena;
    Button btnRegistrar;
    TextView tvYaTengoCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro); // 👈 este es tu XML de registro

        // Vincular los elementos del XML
        etNombre = findViewById(R.id.etNombre);
        etCorreo = findViewById(R.id.etCorreo);
        etContrasena = findViewById(R.id.etContrasena);
        etConfirmarContrasena = findViewById(R.id.etConfirmarContrasena);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        tvYaTengoCuenta = findViewById(R.id.tvYaTengoCuenta);

        // Acción cuando se presione el botón "Registrarme"
        btnRegistrar.setOnClickListener(v -> {
            String nombre = etNombre.getText().toString().trim();
            String correo = etCorreo.getText().toString().trim();
            String contrasena = etContrasena.getText().toString().trim();
            String confirmar = etConfirmarContrasena.getText().toString().trim();

            if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || confirmar.isEmpty()) {
                etNombre.setError("Completa todos los campos");
                return;
            }

            if (!contrasena.equals(confirmar)) {
                etConfirmarContrasena.setError("Las contraseñas no coinciden");
                return;
            }

            // Aquí iría la lógica de guardar en BD o API
            // Por ahora solo mostramos que funciona
            // Puedes usar Toast para confirmar
            // Toast.makeText(this, "Usuario registrado: " + nombre, Toast.LENGTH_SHORT).show();
        });

        // Volver al login si ya tiene cuenta
        tvYaTengoCuenta.setOnClickListener(v -> {
            Intent intent = new Intent(Registro.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
