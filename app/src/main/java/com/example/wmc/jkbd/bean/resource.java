package com.example.wmc.jkbd.bean;

import java.util.List;

/**
 * Created by wmc on 2017/6/29.
 */

public class resource {
    /**
     * error_code : 0
     * reason : ok
     * result : [{"id":60,"question":"这个标志是何含义？","answer":"2","item1":"车多路段","item2":"慢行","item3":"拥堵路段","item4":"施工路段","explains":"慢行：此标志设在前方需要减速慢行的路段以前适当位置。","url":"http://images.juheapi.com/jztk/c1c2subject1/60.jpg"},{"id":70,"question":"这个标志是何含义？","answer":"3","item1":"高速公路下一出口预告","item2":"高速公路右侧出口预告","item3":"高速公路左侧出口预告","item4":"高速公路目的地预告","explains":"高速公路左侧出口预告：用于预告前方出口，在距离高速公路或城市快速路减速车道的渐变段起点处。出口预告标志应同时附着出口编号标志。查看高速公路标志大全：http://www.jszks.com/onepage/16721.html","url":"http://images.juheapi.com/jztk/c1c2subject1/70.jpg"}]
     */

    private int error_code;
    private String reason;
    private List<Question> result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Question> getResult() {
        return result;
    }

    public void setResult(List<Question> result) {
        this.result = result;
    }

}