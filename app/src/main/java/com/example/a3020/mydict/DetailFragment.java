package com.example.a3020.mydict;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DetailFragment extends Fragment {

    private  String value = "";
    private TextView tvWord;
    private ImageButton btVol, btBookmark;
    private WebView bttranslate;




    public DetailFragment() {
        // Required empty public constructor
    }

    public static DetailFragment getNewInstance(String value)
    {
        DetailFragment detailFragment = new DetailFragment();
        detailFragment.value = value;
        return detailFragment;

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvWord = (TextView) view.findViewById(R.id.btnWord);
        bttranslate = (WebView) view.findViewById(R.id.wordTranslate);
        btVol = (ImageButton) view.findViewById(R.id.btnVol);
        btBookmark = (ImageButton) view.findViewById(R.id.btnBookmark);
        btBookmark.setTag(0);

        btBookmark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
              int i = (int) btBookmark.getTag();
              if(i==0)
              {
                  btBookmark.setImageResource(R.drawable.ic_bookmark_fill);
                  btBookmark.setTag(1);


              }
              else if(i==1)
              {
                  btBookmark.setImageResource(R.drawable.ic_bookmark_border);
                  btBookmark.setTag(0);

              }
            }
        });



    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }


}