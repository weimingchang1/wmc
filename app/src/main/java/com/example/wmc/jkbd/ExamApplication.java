package com.example.wmc.jkbd;

import android.app.Application;
import android.util.Log;

import java.util.List;

import com.example.wmc.jkbd.bean.Examination;
import com.example.wmc.jkbd.bean.Question;
import com.example.wmc.jkbd.utils.OkHttpUtils;

/**
 * Created by Administrator on 2017/6/30.
 */

public class ExamApplication extends Application{
    Examination mExamInfo;
    List<Question> mExamList;
    private static ExamApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance=this;

        initData();
    }
    public static ExamApplication getInstance(){
        return instance;
    }

    private void initData() {
        OkHttpUtils<Examination> utils=new OkHttpUtils<>(instance);
        String url="http://101.251.196.90:8080/JztkServer/examInfo";
        utils.url(url)
                .targetClass(Examination.class)
                .execute(new OkHttpUtils.OnCompleteListener<Examination>() {
                    @Override
                    public void onSuccess(Examination result) {
                        Log.e("main","result="+result);
                        mExamInfo=result;
                    }

                    @Override
                    public void onError(String error) {
                        Log.e("main","error="+error);
                    }
                });

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
