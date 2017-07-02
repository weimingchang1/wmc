package com.example.wmc.jkbd;

import android.app.Application;
import android.util.Log;

import java.util.List;

import com.example.wmc.jkbd.bean.Examination;
import com.example.wmc.jkbd.bean.Question;
import com.example.wmc.jkbd.bean.resource;
import com.example.wmc.jkbd.biz.ExamBiz;
import com.example.wmc.jkbd.biz.IExamBiz;
import com.example.wmc.jkbd.utils.OkHttpUtils;
import com.example.wmc.jkbd.utils.ResultUtils;

/**
 * Created by Administrator on 2017/6/30.
 */

public class ExamApplication extends Application{
    Examination mExamInfo;
    List<Question> mExamList;
    private static ExamApplication instance;
    IExamBiz biz;
    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;
        biz=new ExamBiz();
        initData();
    }
    public static ExamApplication getInstance(){
        return instance;
    }

    private void initData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                biz.beginExam();
            }
        }).start();


    }

    public Examination getmExamInfo() {
        return mExamInfo;
    }

    public void setmExamInfo(Examination mExamInfo) {
        this.mExamInfo = mExamInfo;
    }

    public List<Question> getmExamList() {
        return mExamList;
    }

    public void setmExamList(List<Question> mExamList) {
        this.mExamList = mExamList;
    }
}
