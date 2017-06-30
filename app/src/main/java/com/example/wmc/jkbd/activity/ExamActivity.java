package com.example.wmc.jkbd.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.wmc.jkbd.ExamApplication;
import com.example.wmc.jkbd.R;
import com.example.wmc.jkbd.bean.Examination;

/**
 * Created by Administrator on 2017/6/29.
 */

public class ExamActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        initData();

    }

    private void initData() {
        Examination examination = ExamApplication.getInstance().getmExamInfo();
        if(examination!=null){
            showData(examination);
        }

    }

    private void showData(Examination examination) {
    }


}
