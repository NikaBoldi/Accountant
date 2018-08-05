package com.example.eunice.accountant;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {
    private ImageView profilePics;
    private ImageButton camera;
    private EditText firstName;
    private EditText lastName;
    private EditText emailAddress;
    private EditText userName;
    private EditText password;
    private EditText confirmPassword;
    private Spinner timeFrame;
    private Button signUp;
    private SignUpListener listener;

    public SignUpFragment() {
        // Required empty public constructor
    }

    public interface SignUpListener{
        void onNewSignUp(EditText emailAddress, EditText Password);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (SignUpListener) context;
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
        View v = inflater.inflate(R.layout.fragment_sign_up, container, false);
        profilePics = (ImageView)v.findViewById(R.id.profile_image_sign_up);
        camera = (ImageButton)v.findViewById(R.id.profile_camera_button);
        firstName = (EditText)v.findViewById(R.id.first_name);
        lastName = (EditText)v.findViewById(R.id.last_name);
        userName = (EditText)v.findViewById(R.id.username_sign_up);
        emailAddress = (EditText)v.findViewById(R.id.email_address_sign_up);
        password = (EditText)v.findViewById(R.id.password_sign_up);
        confirmPassword = (EditText)v.findViewById(R.id.confirm_password_sign_up);
        timeFrame = (Spinner)v.findViewById(R.id.spinner_time_sign_up);
        signUp = (Button)v.findViewById(R.id.button_sign_up);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onNewSignUp(emailAddress, password);
            }
        });
        return v;
    }

}
