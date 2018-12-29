package com.personal.revenant.taili.bean;

public class DoorResultBean {


    /**
     * meta : {"code":200,"msg":"OK"}
     * data : http://172.16.1.74:8080/files/images/ba831c16d87c494db67be7914d0d4835.jpeg,http://172.16.1.74:8080/files/images/aa091e173e0f465ba7c6b25bfe2080bc.jpeg
     */

    private MetaBean meta;
    private String data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
}
