package cn.com;

import cn.com.webxml.ValidateEmailWebService;
import cn.com.webxml.ValidateEmailWebServiceSoap;

public class TestService {
    public static void main(String[] args) {
        //�ͻ�����֤����ʵ��
        ValidateEmailWebService service = new ValidateEmailWebService();
        ValidateEmailWebServiceSoap port = service.getPort(ValidateEmailWebServiceSoap.class);
        short i = port.validateEmailAddress("1084@q.com");
        System.out.println(i);
    }
}
