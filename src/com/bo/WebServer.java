package com.bo;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class WebServer {
    public String getValue(String msg) {
        return "���������أ�" + msg;
    }

    public static void main(String[] args) {
        //������������"��ַ",ʵ���ࣩ
        Endpoint.publish("http://localhost:9999/Service/hello", new WebServer());
        System.out.println("�����ɹ���");
    }
}
