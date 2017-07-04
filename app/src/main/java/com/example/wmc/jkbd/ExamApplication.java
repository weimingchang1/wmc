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
    public static String LOAD_EXAM_INFO="load_exam_info";
    public static String LOAD_EXAM_QUESTION="load_exam_question";
    public static String LOAD_DATA_SUCCESS="load_exam_success";
    Examination mExamInfo;
    List<Question> mExamList;
    private static ExamApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;

    }
    public static ExamApplication getInstance(){
        return instance;
    }



    public Examination getExamInfo() {
        return mExamInfo;
    }

    public void setExamInfo(Examination mExamInfo) {
        this.mExamInfo = mExamInfo;
    }

    public List<Question> getExamList() {
        return mExamList;
    }

    public void setExamList(List<Question> mExamList) {
        this.mExamList = mExamList;
    }


}
