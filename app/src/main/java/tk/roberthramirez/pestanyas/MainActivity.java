package tk.roberthramirez.pestanyas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private PageFragmentAdapter pageFragmentAdapter;
    private ViewPager mViewPager;
    private Button bCambiar;
    private LinearLayout linearContra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pageFragmentAdapter = new PageFragmentAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.zContainer);
        mViewPager.setAdapter(pageFragmentAdapter);

        TabLayout tabLayout = findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));


        //Mostrar Cambiar Contraseña
        /*bCambiar = findViewById(R.id.bCambiarContra);
        linearContra = findViewById(R.id.linearContra);

        bCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearContra.setVisibility(View.VISIBLE);
            }
        });*/
    }


}
