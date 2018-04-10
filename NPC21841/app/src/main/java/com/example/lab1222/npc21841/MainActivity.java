package com.example.lab1222.npc21841;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
        changeFragment(new OneFragment());
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.navigation_one:
                //Toast.makeText(this,"OwO",Toast.LENGTH_SHORT).show();
                changeFragment(new OneFragment());
                return true;
            case R.id.navigation_two:
                changeFragment(new TwoFragment());
                //Toast.makeText(this,"Owo",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.navigation_three:
                changeFragment(new ThreeFragment());
                //Toast.makeText(this,"owO",Toast.LENGTH_SHORT).show();
                return true;
        }
        return false;
    }

    public void changeFragment(Fragment newFragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.commit();

    }
}
