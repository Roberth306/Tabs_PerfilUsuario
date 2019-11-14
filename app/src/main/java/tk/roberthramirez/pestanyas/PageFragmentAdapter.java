package tk.roberthramirez.pestanyas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageFragmentAdapter extends FragmentPagerAdapter {

    final private int N_PAGINAS=3;
    Persona persona = new Persona("Roberth", "Ramirez Castillo", "08/06/1999", "C/Cervantes", "4873695124S",
            "ROBERTH S.L.U", "B1234567", "C/Mayor, 30 03002 Alicante", "https://github.com/Roberth306",
            "r@gmail.com", "1234");

    public PageFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                PersonalFragment perF = new PersonalFragment();
                Bundle argsPerF = new Bundle();
                argsPerF.putSerializable(PersonalFragment.ARG_PERSONALFRAGMENT, persona);
                perF.setArguments(argsPerF);
                return perF;
            case 1:
                ProfesionalFragment proF = new ProfesionalFragment();
                Bundle argsProF = new Bundle();
                argsProF.putSerializable(ProfesionalFragment.ARG_PROFESIONALFRAGMENT, persona);
                proF.setArguments(argsProF);
                return proF;
            case 2:
                LoginFragment logF = new LoginFragment();
                Bundle argsLogF = new Bundle();
                argsLogF.putSerializable(LoginFragment.ARG_LOGIN_FRAGMENT, persona);
                logF.setArguments(argsLogF);
                return logF;
        }
        return null;//TODO poner el placeholder y quitar null
    }

    @Override
    public int getCount() {
        return N_PAGINAS;
    }
}
