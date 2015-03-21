package com.example.romain.applisports2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PremierLeagueFragment extends Fragment {
	
	public PremierLeagueFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_premier_league, container, false);
         
        return rootView;
    }
}
