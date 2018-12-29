package com.personal.revenant.taili.bean;

public class LoginBean {

    /**
     * meta : {"code":200,"msg":"OK"}
     * data : {"uid":1,"username":"seaguil","name":"刘二堡","avatar":"www.baidu.com","token":"zRDwRQz7lK-qC8J98-Z9Bw=="}
     */

    private MetaBean meta;
    private DataBean data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class MetaBean {
        /**
         * code : 200
         * msg : OK
         */

        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class DataBean {
        /**
         * uid : 1
         * username : seaguil
         * name : 刘二堡
         * avatar : www.baidu.com
         * token : zRDwRQz7lK-qC8J98-Z9Bw==
         */

        private int uid;
        private String username;
        private String name;
        private String avatar;
        private String token;

        public int getUid() {
            return uid;
        }

        public void setUid(int uid) {
            this.uid = uid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
