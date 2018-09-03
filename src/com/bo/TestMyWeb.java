package com.bo;

import com.service.myweb.Server;
import com.service.myweb.ServerService;

public class TestMyWeb {
    public static void main(String[] args) {
        ServerService serviceService = new ServerService();
        Server port = serviceService.getServicePort();
        String webService = port.getValue("ÎÒµÄwebService");
        System.out.println(webService);
    }
}
