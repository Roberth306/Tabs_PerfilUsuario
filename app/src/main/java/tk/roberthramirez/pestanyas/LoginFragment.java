package tk.roberthramirez.pestanyas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {
    final public static String ARG_LOGIN_FRAGMENT = "tk.roberthramirez.pestanyas.loginTAB";
    private Button bCambiarContra;
    private Button bGuardarContra;
    private TextView tvUsuario;
    private EditText etContraAct;
    private EditText etContraNueva;
    private EditText etContraRep;

    private LinearLayout linearContra;

    /*public static LoginFragment newInstance(int sectionNumber) {
        LoginFragment fragment = new LoginFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_LOGIN_FRAGMENT, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layaout = inflater.inflate(R.layout.fragment_login,container,false);
        final Persona persona = (Persona)getArguments().getSerializable(ARG_LOGIN_FRAGMENT);
        bCambiarContra = layaout.findViewById(R.id.bCambiarContra);
        linearContra = layaout.findViewById(R.id.linearContra);


        bCambiarContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linearContra.getVisibility() == View.INVISIBLE){
                    linearContra.setVisibility(View.VISIBLE);
                }else {
                    linearContra.setVisibility(View.INVISIBLE);
                }

            }
        });

        bGuardarContra = layaout.findViewById(R.id.bGuardar);
        etContraAct = layaout.findViewById(R.id.etContraAct);
        etContraNueva = layaout.findViewById(R.id.etContraNueva);
        etContraRep = layaout.findViewById(R.id.etContraRep);

        bGuardarContra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = persona.cambiarContraseña(etContraAct.getText().toString(),etContraNueva.getText().toString(),etContraRep.getText().toString());
                Toast.makeText(getActivity(), res, Toast.LENGTH_SHORT).show();
            }
        });
        return layaout;
    }


}
