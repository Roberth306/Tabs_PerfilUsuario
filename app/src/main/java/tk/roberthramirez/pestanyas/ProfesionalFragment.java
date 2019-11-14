package tk.roberthramirez.pestanyas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfesionalFragment extends Fragment {
    final public static String ARG_PROFESIONALFRAGMENT= "tk.roberthramirez.pestanyas.profesionalTAB";
    private TextView tvEmpresa;
    private TextView tvCif;
    private TextView tvDireccion;
    private TextView tvWeb;
    private TextView tvEmail;

    /*public static ProfesionalFragment newInstance(int sectionNumber) {
        ProfesionalFragment fragment = new ProfesionalFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PROFESIONALFRAGMENT, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layaout = inflater.inflate(R.layout.fragment_profesional,container, false);
        Persona persona = (Persona)getArguments().getSerializable(ARG_PROFESIONALFRAGMENT);
        tvEmpresa = layaout.findViewById(R.id.tvEmpresa);
        tvEmpresa.setText(persona.getEmpresa());
        tvCif =layaout.findViewById(R.id.tvCif);
        tvCif.setText("CIF: "+persona.getCif());
        tvDireccion = layaout.findViewById(R.id.tvDireccion);
        tvDireccion.setText("Direccion: "+persona.getDireccionEmpr());
        tvWeb = layaout.findViewById(R.id.tvWeb);
        tvWeb.setText("Página web: "+persona.getPaginaWeb());
        tvEmail = layaout.findViewById(R.id.tvEmail);
        tvEmail.setText("Email: "+persona.getEmail());

        return layaout;
    }
}
