package com.ultimate.ui.Dashboard;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ultimate.R;
import com.ultimate.ui.Dashboard.Graph.Graph;
import com.ultimate.ui.Dashboard.XYZ.XYZ;
import com.ultimate.ui.Home.Home;

public class Dashboard extends AppCompatActivity {

    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
//        getSupportActionBar().hide();


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener((BottomNavigationView.OnNavigationItemSelectedListener) item -> {

            switch (item.getItemId()) {
                case R.id.ultimate_Home: {
                    setFragment(new Home());
                    break;
                }

                case R.id.ultimate_xyz: {
                    setFragment(new XYZ());
                    break;
                }

                case R.id.ultimate_Graph: {
                    setFragment(new Graph());
                    break;
                }

                case R.id.ultimate_more: {
                    setFragment(new more());
                    break;
                }
//
                default:
                    Toast.makeText(this, "wrong choice", Toast.LENGTH_SHORT).show();
            }

            return true;
        });

    }

    void setFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_dash, fragment).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }



    }


