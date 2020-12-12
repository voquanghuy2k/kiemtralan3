package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class store_screen extends AppCompatActivity implements OnMapReadyCallback {
    Spinner spinner1_215;
    RecyclerView recycle_quan_215;
    iteammapAdapter iteammapAdapter_215;
    private GoogleMap gm_215;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_screen);
        createMap();
        Employee[] employees = EmployeeDataUtils.getEmployees();
        spinner1_215 = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<Employee> LTRadapter1 = new ArrayAdapter<Employee>(store_screen.this, R.layout.spinner_item, employees);
        LTRadapter1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner1_215.setAdapter(LTRadapter1);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.store);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.delivery:
                        startActivity(new Intent(getApplicationContext(),orderScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.store:
//                        startActivity(new Intent(getApplicationContext(),store_screen.class));
//                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(),account_screen.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        List<itemmap> mapquan = new ArrayList<>();
        mapquan.add(new itemmap("THE COFFE HOUSE nguyễn văn linh","22/4 Lê Đình Dương","16.047199","108.219955",R.drawable.thecoffee));
        mapquan.add(new itemmap("THE COFFE HOUSE nguyễn văn linh","22/4 Lê Đình Dương","16.047199","108.219955",R.drawable.thecoffee));
        mapquan.add(new itemmap("THE COFFE HOUSE nguyễn văn linh","22/4 Lê Đình Dương","16.047199","108.219955",R.drawable.thecoffee));
        mapquan.add(new itemmap("THE COFFE HOUSE nguyễn văn linh","22/4 Lê Đình Dương","16.047199","108.219955",R.drawable.thecoffee));
        mapquan.add(new itemmap("THE COFFE HOUSE nguyễn văn linh","22/4 Lê Đình Dương","16.047199","108.219955",R.drawable.thecoffee));

        setRecycle_mapquan(mapquan);

    }

    public void setRecycle_mapquan(List<itemmap> itemList ){
        recycle_quan_215=findViewById(R.id.recycle_quan);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recycle_quan_215.setLayoutManager(layoutManager);
        iteammapAdapter_215 = new iteammapAdapter(this,itemList);
        recycle_quan_215.setAdapter(iteammapAdapter_215);
    }
    public void createMap() {
        SupportMapFragment smf = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        smf.getMapAsync((OnMapReadyCallback) this);
    }
    @Override
    public void onResume() {
        super.onResume();
        createMap();
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng hcm = new LatLng(16.047199,108.219955);
        gm_215 = googleMap;
        gm_215.addMarker(new MarkerOptions().position(hcm).title("Hải Châu, Đà Nẵng"));
        CameraPosition cp = new CameraPosition.Builder().target(hcm).zoom(13).build();
        gm_215.animateCamera(CameraUpdateFactory.newCameraPosition(cp));
    }
}