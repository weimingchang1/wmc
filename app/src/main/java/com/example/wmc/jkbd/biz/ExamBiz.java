package com.example.wmc.jkbd.biz;

import com.example.wmc.jkbd.dao.ExamDao;
import com.example.wmc.jkbd.dao.IExamDao;

/**
 * Created by wmc on 2017/7/2.
 */

public class ExamBiz implements IExamBiz{
    IExamDao dao;

    public ExamBiz() {
        this.dao = new ExamDao();
    }

    @Override
    public void beginExam() {
        dao.loadExamInfo();
        dao.loadQuestionLists();
    }

    @Override
    public void nextQuestion() {

    }

    @Override
    public void preQuestion() {

    }

    @Override
    public void commitExam() {

    }
}
