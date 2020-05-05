package com.diogopinto.instagram.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import de.hdodenhof.circleimageview.CircleImageView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.diogopinto.instagram.R;
import com.diogopinto.instagram.activity.EditarPerfilActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    private TextView textSeguidores, textPublicacoes, textSeguindo;
    private CircleImageView avatarPerfil;
    private Button buttonEditarPerfil;
    private ProgressBar progressBar;
    private GridView gridViewPerfil;



    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_perfil, container, false);

        textPublicacoes = view.findViewById(R.id.textPublicacoes);
        textSeguidores = view.findViewById(R.id.textSeguidores);
        textSeguindo = view.findViewById(R.id.textSeguindo);
        buttonEditarPerfil = view.findViewById(R.id.buttonEditarPerfil);
        progressBar = view.findViewById(R.id.progressBarPerfil);
        gridViewPerfil = view.findViewById(R.id.gridViewPerfil);
        avatarPerfil = view.findViewById(R.id.avatarPerfil);

        //Abre edição de perfil
        buttonEditarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), EditarPerfilActivity.class);
                startActivity(i);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
