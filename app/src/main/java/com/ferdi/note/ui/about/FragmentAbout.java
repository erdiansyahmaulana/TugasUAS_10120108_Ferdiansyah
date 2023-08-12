package com.ferdi.note.ui.about;

/**
 Nama : Ferdiansyah Maulana
 Nim : 10120108
 Kelas : IF3


 */



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ferdi.note.DialogAbout;
import com.ferdi.catatan.R;

import androidx.fragment.app.Fragment;

public class FragmentAbout extends Fragment {
    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Linkedin, Maps;
    TextView Abouts;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_about, container, false);


        Abouts = root.findViewById(R.id.about);



        Abouts.setOnClickListener(view -> {
            DialogAbout DialogAbout = new DialogAbout();
            DialogAbout.show(requireFragmentManager(),"Reza Surya Nugraha");
        });

        return root;
    }
}

