package com.example.samiasania.fragment_assinmnt;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by saMiA saNiA on 8/1/2017.
 */

public class FragmentOne extends Fragment {
    ListView listView;
    ArrayAdapter<String> adapter;
    String[] versions;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_one_layout,container,false);

        listView = (ListView)view.findViewById(R.id.list_view);
        versions = getResources().getStringArray(R.array.andriod versions versions);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.list_view_layout,R.id.row_item,versions);
        listView.setAdapter(adapter);
        return view;
    }
}
