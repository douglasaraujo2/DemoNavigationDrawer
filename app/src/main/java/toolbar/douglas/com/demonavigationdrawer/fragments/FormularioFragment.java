package toolbar.douglas.com.demonavigationdrawer.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import toolbar.douglas.com.demonavigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FormularioFragment extends Fragment {
    private EditText etValor1;
    private EditText etValor2;
    private TextView tvResultado;
    private Integer resultado;

    public FormularioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View itemView = inflater.inflate(R.layout.fragment_formulario, container, false);
        // Inflate the layout for this fragment
        etValor1 = (EditText) itemView.findViewById(R.id.etValor1);
        etValor2 = (EditText) itemView.findViewById(R.id.etValor2);
        tvResultado = (TextView) itemView.findViewById(R.id.tvResultado);
        return itemView;
    }

    public void somar(View view) {
        Integer valor1;
        Integer valor2;
        valor1 = Integer.parseInt(etValor1.getText().toString());
        valor2 = Integer.parseInt(etValor2.getText().toString());
        resultado = valor1 + valor2;
    }

    public void subtrair(View view) {
        Integer valor1;
        Integer valor2;
        valor1 = Integer.parseInt(etValor1.getText().toString());
        valor2 = Integer.parseInt(etValor2.getText().toString());
        resultado = valor1 - valor2;
    }

    public void multiplicar(View view) {
        Integer valor1;
        Integer valor2;
        valor1 = Integer.parseInt(etValor1.getText().toString());
        valor2 = Integer.parseInt(etValor2.getText().toString());
        resultado = valor1 * valor2;
    }

    public void dividir(View view) {
        Integer valor1;
        Integer valor2;
        valor1 = Integer.parseInt(etValor1.getText().toString());
        valor2 = Integer.parseInt(etValor2.getText().toString());
        resultado = valor1 + valor2;
    }

    private void setResultado(Integer resultado) {
        tvResultado.setText(resultado);
    }
}
