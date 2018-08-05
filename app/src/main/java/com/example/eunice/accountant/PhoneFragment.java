package com.example.eunice.accountant;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class PhoneFragment extends Fragment {

    private EditText price_one;
    private EditText price_two;
    private EditText price_three;
    private EditText price_four;
    private EditText price_five;
    private EditText price_six;
//    private PhoneFragmentListener listener;
//
//
//    public interface PhoneFragmentListener{
//            void onClickPhone();
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        listener = (PhoneFragmentListener)context;
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        listener = null;
//    }

    public PhoneFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v = inflater.inflate(R.layout.fragment_phone, container, false);
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

//        double totalPhone = Double.parseDouble(price_1)+ Double.parseDouble(price_2)+ Double.parseDouble(price_3)+ Double.parseDouble(price_3)
//                + Double.parseDouble(price_4)+ Double.parseDouble(price_5)+ Double.parseDouble(price_6);
          return v;
    }

}
