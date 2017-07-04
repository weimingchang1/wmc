package com.example.wmc.jkbd.biz;

import com.example.wmc.jkbd.bean.Question;

/**
 * Created by wmc on 2017/7/2.
 */

public interface IExamBiz {
    void beginExam();
    Question getExam();
    Question nextQuestion();
    Question preQuestion();
    int commitExam();
    String getExamIndex();
}
