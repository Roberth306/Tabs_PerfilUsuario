package tk.roberthramirez.pestanyas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PersonalFragment extends Fragment {
    final public static String ARG_PERSONALFRAGMENT = "tk.roberthramirez.pestanyas.personalTAB";
    private ImageView ivFoto;
    private TextView tvNombre;
    private TextView tvApellido;
    private TextView tvFecha;
    private TextView tvDireccion;
    private TextView tvDNI;

    /*public static PersonalFragment newInstance(int sectionNumber) {
        PersonalFragment fragment = new PersonalFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PERSONALFRAGMENT, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }*/

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layaout = inflater.inflate(R.layout.fragment_personal, container, false);
        Persona persona = (Persona)getArguments().getSerializable(ARG_PERSONALFRAGMENT);
        tvNombre = layaout.findViewById(R.id.tvNombre);
        tvNombre.setText("Nombre: "+persona.getNombre());
        tvApellido = layaout.findViewById(R.id.tvApellido);
        tvApellido.setText("Apellidos: "+persona.getApellidos());
        tvFecha = layaout.findViewById(R.id.tvFecha);
        tvFecha.setText("Fecha Nacimiento: "+ persona.getFechaNac());
        tvDireccion = layaout.findViewById(R.id.tvDireccion);
        tvDireccion.setText("Direccion: "+persona.getDireccionPers());
        tvDNI = layaout.findViewById(R.id.tvDNI);
        tvDNI.setText(persona.getDNI());
        return layaout;
    }
}
