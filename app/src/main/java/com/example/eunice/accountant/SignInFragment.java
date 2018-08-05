package com.example.eunice.accountant;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignInFragment extends Fragment {

    private static final String SIGN_UP = "sign_up";
    private static final String FORGOT_PASSWORD = "forgot_password";
    private EditText mUsername;
    private AutoCompleteTextView mEmail;
    private EditText mPassword;
    private Button mSignIn;
    private TextView mSignUp;
    private TextView mForgot;
    private SignInListener listener;


    public SignInFragment() {
        // Required empty public constructor
    }

    public interface SignInListener{
        void onSignIn(AutoCompleteTextView Email, EditText Password);
        void onSignUp();
        void onForgotPassword(AutoCompleteTextView Email);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (SignInListener)context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_sign_in, container, false);
        mUsername = (EditText) v.findViewById(R.id.username);
        mEmail = (AutoCompleteTextView) v.findViewById(R.id.email_address);
        mPassword = (EditText) v.findViewById(R.id.password);
        mSignIn = (Button) v.findViewById(R.id.sign_in);
        mSignUp = (TextView) v.findViewById(R.id.sign_up);
        mForgot = (TextView) v.findViewById(R.id.forgot);

        mSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                listener.onSignIn(mEmail, mPassword);
            }
        });
        mSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onSignUp();
            }
        });

        mForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onForgotPassword(mEmail);
            }
        });
        return v;
    }

}
