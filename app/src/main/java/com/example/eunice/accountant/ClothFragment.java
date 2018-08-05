package com.example.eunice.accountant;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClothFragment extends Fragment {


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
//    private ClothFragmentListener listener;


    public ClothFragment() {
        // Required empty public constructor
    }
//
//    public interface ClothFragmentListener{
//        void onClickClothNext();
//        void onAddBoughtClothItems();
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        listener = (ClothFragmentListener)context;
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        listener = null;
//    }

    private void updateDate(){
        spendDate.setText(DateFormat.getDateInstance(0).format(mDate));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_cloth, container, false);
        spendDate = v.findViewById(R.id.today_date);
        mDate = new Date();


        spendDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                DatePickerFragment date_dialog = DatePickerFragment.newInstance(mDate);
                date_dialog.setTargetFragment(ClothFragment.this, REQUEST_DATE);
                date_dialog.show(fm, DIALOG_DATE);
            }
        });

        updateDate();


        price_one = (EditText)v.findViewById(R.id.price_1);
        price_two = (EditText)v.findViewById(R.id.price_2);
        price_three = (EditText)v.findViewById(R.id.price_3);
        price_four = (EditText)v.findViewById(R.id.price_4);
        price_five = (EditText)v.findViewById(R.id.price_5);
        price_six = (EditText)v.findViewById(R.id.price_6);



        String price_1 = price_one.getText().toString();
        String price_2 = price_two.getText().toString();
        String price_3 = price_three.getText().toString();
        String price_4 = price_four.getText().toString();
        String price_5 = price_five.getText().toString();
        String price_6 = price_six.getText().toString();

//        double totalCloth = Double.parseDouble(price_1)+ Double.parseDouble(price_2)+ Double.parseDouble(price_3)+ Double.parseDouble(price_3)
//                + Double.parseDouble(price_4)+ Double.parseDouble(price_5)+ Double.parseDouble(price_6);
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
