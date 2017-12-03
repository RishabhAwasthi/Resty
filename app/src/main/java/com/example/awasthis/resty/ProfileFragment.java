package com.example.awasthis.resty;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private TextView pro_name,mail;
    private static String musername= MainActivity.getUsername();
    private static String memail=MainActivity.getEmail();





    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_profile, container, false);

        pro_name=(TextView)v.findViewById(R.id.pro_name);
        pro_name.setText(musername);
        mail=(TextView)v.findViewById(R.id.mail);
        mail.setText(memail);


        Button book=(Button)v.findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),MainActivity.class);
                startActivity(i);
            }
        });



        return v;

    }


}
