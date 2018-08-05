package com.example.eunice.accountant;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransportFragment extends Fragment {

//    private TransportFragmentListener listener;
//
//
//    public interface TransportFragmentListener{
//        void onClickTransportNext();
//        void onAddBoughtItems();
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        listener = (TransportFragmentListener)context;
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        listener = null;
//    }

    public TransportFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_transport, container, false);
    }

}
