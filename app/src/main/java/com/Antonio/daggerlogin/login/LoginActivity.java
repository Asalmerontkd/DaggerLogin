package com.Antonio.daggerlogin.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Antonio.daggerlogin.R;
import com.Antonio.daggerlogin.root.App;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity implements LoginActivityMVP.View{

    @Inject
    LoginActivityMVP.Presenter presenter;

    EditText firstName, lastName;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        firstName = findViewById(R.id.editText_Nombre);
        lastName = findViewById(R.id.editText_Apellido);
        loginButton = findViewById(R.id.button_Login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loginButtonClicked();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.setView(this);
        presenter.getCurrentUser();
    }

    @Override
    public String getFirstName() {
        return this.firstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return this.lastName.getText().toString();
    }

    @Override
    public void showUserNotAvailable() {
        Log.d("MY_VIEW", "Usuario no disponible");
        Toast.makeText(this, "Error el usuario no esta disponible", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showInputError() {
        Log.d("MY_VIEW", "Error de entrada");
        Toast.makeText(this, "Error, nombre o apellido no puede estar vacio", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showUserSaved() {
        Log.d("MY_VIEW", "Usuario salvado");
        Toast.makeText(this, "Usuario guardado correctamente", Toast.LENGTH_LONG).show();
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName.setText(lastName);
    }
}
