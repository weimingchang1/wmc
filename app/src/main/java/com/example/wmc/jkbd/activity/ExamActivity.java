package com.example.wmc.jkbd.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.wmc.jkbd.ExamApplication;
import com.example.wmc.jkbd.R;
import com.example.wmc.jkbd.bean.Examination;

/**
 * Created by Administrator on 2017/6/29.
 */

public class ExamActivity extends AppCompatActivity {
    TextView tvExamInfo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        initView();
        initData();
    }

    private void initView() {
        tvExamInfo= (TextView) findViewById(R.id.tv_examinfo);
    }

    private void initData() {
        Examination examInfo = ExamApplication.getInstance().getmExamInfo();
        if(examInfo!=null){
            showData(examInfo);
        }
    }

    private void showData(Examination examInfo) {
        tvExamInfo.setText(examInfo.toString());
    }


}
