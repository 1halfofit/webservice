package com.bo;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WebServer {
    public String getValue(String msg) {
        return "服务器返回：" + msg;
    }

    public static void main(String[] args) {
        //发布服务器（"地址",实现类）
        Endpoint.publish("http://localhost:9999/Service/hello", new WebServer());
        System.out.println("发布成功！");
    }
}
