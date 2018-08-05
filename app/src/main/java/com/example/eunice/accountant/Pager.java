package com.example.eunice.accountant;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Pager extends FragmentStatePagerAdapter{

    int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);

        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FoodFragment tab1 = new FoodFragment();
                return tab1;
            case 1:
                ClothFragment tab2 = new ClothFragment();
                return tab2;
            case 2:
                PhoneFragment tab3 = new PhoneFragment();
                return tab3;
            case 3:
                UtensilsFragment tab4 = new UtensilsFragment();
                return tab4;
            case 4:
                TransportFragment tab5 = new TransportFragment();
                return tab5;
            case 5:
                ATMFragment tab6 = new ATMFragment();
                return tab6;
            case 6:
                BusinessFragment tab7 = new BusinessFragment();
                return tab7;
            case 7:
                ElectronicsFragment tab8 = new ElectronicsFragment();
                return tab8;
            case 8:
                EventsFragment tab9 = new EventsFragment();
                return tab9;
            case 9:
                OtherFragment tab10 = new OtherFragment();
                return tab10;

                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
