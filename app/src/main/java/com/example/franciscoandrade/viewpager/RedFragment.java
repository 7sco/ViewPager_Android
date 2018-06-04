package com.example.franciscoandrade.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {

    private TextView text;
    View view;

    public RedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_red, container, false);

        text= view.findViewById(R.id.text);
        String message = getArguments().getString("msg");
        text.setText(message);

        return view;
    }

    public Fragment newInstance(String s) {
        RedFragment f = new RedFragment();
        Bundle b = new Bundle();
        b.putString("msg", s);
        f.setArguments(b);

        return f;
    }
}
