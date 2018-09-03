package com.service.translator;

public class Test {
    public static void main(String[] args) {
        TranslatorWebService translatorWebService = new TranslatorWebService();
        TranslatorWebServiceSoap port = translatorWebService.getPort(TranslatorWebServiceSoap.class);
        ArrayOfString spring = port.getEnCnTwoWayTranslator("people");
        System.out.println(spring.getString());
    }
}
