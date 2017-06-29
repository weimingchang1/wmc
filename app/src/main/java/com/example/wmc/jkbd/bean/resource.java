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
    private List<ResultBean> result;

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

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 60
         * question : 这个标志是何含义？
         * answer : 2
         * item1 : 车多路段
         * item2 : 慢行
         * item3 : 拥堵路段
         * item4 : 施工路段
         * explains : 慢行：此标志设在前方需要减速慢行的路段以前适当位置。
         * url : http://images.juheapi.com/jztk/c1c2subject1/60.jpg
         */

        private int id;
        private String question;
        private String answer;
        private String item1;
        private String item2;
        private String item3;
        private String item4;
        private String explains;
        private String url;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }

        public String getItem1() {
            return item1;
        }

        public void setItem1(String item1) {
            this.item1 = item1;
        }

        public String getItem2() {
            return item2;
        }

        public void setItem2(String item2) {
            this.item2 = item2;
        }

        public String getItem3() {
            return item3;
        }

        public void setItem3(String item3) {
            this.item3 = item3;
        }

        public String getItem4() {
            return item4;
        }

        public void setItem4(String item4) {
            this.item4 = item4;
        }

        public String getExplains() {
            return explains;
        }

        public void setExplains(String explains) {
            this.explains = explains;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
