package com.example.hanshin_ncs;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

public class Fragment2 extends Fragment {

    Context context;

    private View view;
    GridView gridView; //이미지를 위한 그리드 뷰

    //룸메이트 title
    String[] values = {
            "여성 룸메이트 구해요", "월세 반반구해요", "비흡연자 룸메", "조용한 룸메구해요.", "여성 룸메이트 구해요", "월세 반반구해요",
            "비흡연자 룸메", "조용한 룸메구해요.", "여성 룸메이트 구해요", "월세 반반구해요",
    };
    //룸메이트 방 사진
    int[] images = {
            R.drawable.room3, R.drawable.room2, R.drawable.room1, R.drawable.room2, R.drawable.room3, R.drawable.room1,
            R.drawable.room1, R.drawable.room2, R.drawable.room3, R.drawable.room1, R.drawable.room2, R.drawable.room3
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_2, container, false);

        context = container.getContext();

        //GridVuew (이미지)
        gridView = (GridView) view.findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(context, values, images);
        gridView.setAdapter(gridAdapter);

        return view;
    }
}