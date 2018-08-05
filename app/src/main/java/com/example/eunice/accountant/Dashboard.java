package com.example.eunice.accountant;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Dashboard extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    private TabLayout tabLayout;

    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        pager = findViewById(R.id.pager);

        tabLayout = findViewById(R.id.tablayout);


        tabLayout.addTab(tabLayout.newTab().setText(R.string.food).setIcon(R.drawable.ic_cake_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setText(R.string.shopping).setIcon(R.drawable.ic_shopping_cart_black_24dp), 1, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.phone).setIcon(R.drawable.ic_devices_black_24dp), 2, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.utensils).setIcon(R.drawable.ic_restaurant_black_24dp), 3, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.transport).setIcon(R.drawable.ic_directions_bus_black_24dp), 4 , true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.atm).setIcon(R.drawable.ic_local_atm_black_24dp),5, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.business).setIcon(R.drawable.ic_business_center_black_24dp), 6, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.electronics).setIcon(R.drawable.ic_kitchen_black_24dp), 7, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.events).setIcon(R.drawable.ic_event_black_24dp), 8, true);
        tabLayout.addTab(tabLayout.newTab().setText(R.string.miscellaneous).setIcon(R.drawable.ic_attach_money_black_24dp), 9, true);
        tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);


        Pager adapter = new Pager(getSupportFragmentManager(), tabLayout.getTabCount());
        pager.setAdapter(adapter);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        pager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
