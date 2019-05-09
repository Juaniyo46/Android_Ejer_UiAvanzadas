package com.example.ej_android_uiavanzadas;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SitioWeb1 extends Fragment {


    public SitioWeb1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String url = "https://es.stackoverflow.com/questions/76458/webview-en-un-fragment-android-studio";
        WebView view = getActivity().findViewById(R.id.webView1);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
        // Inflate the layout for this fragment
        return view;
    }

}
