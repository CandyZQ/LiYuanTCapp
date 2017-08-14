package com.liyuaninc.liyuan.spinmenu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.liyuaninc.liyuan.R;
import com.liyuaninc.liyuan.help.opmodehelp;

/*
 */
public class Fragment7 extends Fragment {
    private Button goopmodehelp;
    private Button goopmodehelp2;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frament_7, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        goopmodehelp=(Button) getView().findViewById(R.id.opmodehelp);
        goopmodehelp2 = (Button) getView().findViewById(R.id.opmodehel2);
        goopmodehelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),opmodehelp.class);
                startActivity(intent);

            }
        });
        goopmodehelp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getActivity(),com.liyuaninc.liyuan.help.opmodeedit.opmode.class);
                startActivity(intent2);
            }
        });

    }

    public static Fragment7 newInstance() {
        Fragment7 fragment7 = new Fragment7();
        return fragment7;
    }
}

