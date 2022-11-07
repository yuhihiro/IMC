package com.thaf.imc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculo(View view){

        TextView txtResult = (TextView)findViewById(R.id.txtResult);
        TextView valorNum = (TextView)findViewById(R.id.valorNum);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        float imc;
        int peso = Integer.parseInt(txtPeso.getText().toString());
        float alt = Float.parseFloat(txtAltura.getText().toString());

        imc = (peso / (alt * alt));
        DecimalFormat df = new DecimalFormat("0.##");
        String resul = df.format(imc);

        if (imc <= 18.5) {

            txtResult.setText("Abaixo do peso normal");
            valorNum.setText("IMC: "+ resul);

        } else if (imc > 18.5 && imc <= 25) {

            txtResult.setText("Peso normal");
            valorNum.setText("IMC: "+ resul);

        } else if (imc > 25 && imc <= 30) {

            txtResult.setText("Peso acima do normal");
            valorNum.setText("IMC: "+ resul);

        } else {

            txtResult.setText("Peso excessivo");
            valorNum.setText("IMC: "+ resul);
        }

    }
}