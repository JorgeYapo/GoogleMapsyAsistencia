package jlyv.upeu.edu.pe.googlemaps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    Context contex;

    private Button button;

    @BindView(R.id.txtUsuario)
    TextView txtUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        contex=getApplication();


    }

    @OnClick(R.id.btnLogin)
    public void irPaginaPrincipal(){

        Toast.makeText(this, String.valueOf(txtUsuario.getText()),
                Toast.LENGTH_SHORT).show();

        Intent intent=new Intent();
        intent.setClass(contex, HomeActivity.class);
        startActivity(intent);
    }
}
