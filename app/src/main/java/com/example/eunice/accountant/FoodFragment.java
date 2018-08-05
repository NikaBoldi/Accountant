package com.example.eunice.accountant;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;


public class FoodFragment extends Fragment {

    private EditText price_one;
    private EditText price_two;
    private EditText price_three;
    private EditText price_four;
    private EditText price_five;
    private EditText price_six;
    private Button spendDate;
    private Date mDate;
    private static final String DIALOG_DATE = "date";
    private static final int REQUEST_DATE = 0;
//    private FoodFragmentListener listener;


    public FoodFragment() {
    }

//    public interface FoodFragmentListener{
//        void onAddBoughtFoodItems();
//        void onClickFoodNext();
//
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        listener = (FoodFragmentListener)context;
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        listener = null;
//    }

    private void updateDate(){
        spendDate.setText(DateFormat.getDateInstance(0).format(mDate));
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_food, container, false);
        spendDate = v.findViewById(R.id.today_date);
        mDate = new Date();


        spendDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                DatePickerFragment date_dialog = DatePickerFragment.newInstance(mDate);
                date_dialog.setTargetFragment(FoodFragment.this, REQUEST_DATE);
                date_dialog.show(fm, DIALOG_DATE);
            }
        });

        updateDate();

        price_one = v.findViewById(R.id.price_1);
        price_two = v.findViewById(R.id.price_2);
        price_three = v.findViewById(R.id.price_3);
        price_four = v.findViewById(R.id.price_4);
        price_five = v.findViewById(R.id.price_5);
        price_six = v.findViewById(R.id.price_6);


        String price_1 = price_one.getText().toString();
        String price_2 = price_two.getText().toString();
        String price_3 = price_three.getText().toString();
        String price_4 = price_four.getText().toString();
        String price_5 = price_five.getText().toString();
        String price_6 = price_six.getText().toString();


        //  To get the total amount entered in by the user for food
        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != Activity.RESULT_OK) return;
        if (requestCode == REQUEST_DATE) {
            Date date = (Date) data.getSerializableExtra(DatePickerFragment.EXTRA_DATE);
            spendDate.setText(DateFormat.getDateInstance(0).format(date));
        }

    }

}
