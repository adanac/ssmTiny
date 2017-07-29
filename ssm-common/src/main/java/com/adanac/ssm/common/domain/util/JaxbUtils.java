package com.adanac.ssm.common.domain.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-04-24
 * Desc:    jaxb 工具类
 */
public class JaxbUtils<T> {

    /**
     * 根据 xml 报文解析对应的 java bean
     */
    public static <T extends Object> T parseXmlBean(String xml, Class<T> clazz) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        StringReader reader = new StringReader(xml.trim());
        T t = (T) unmarshaller.unmarshal(reader);
        return t;
    }

    /**
     * 根据 bean 转换 xml 报文
     */
    public static <T extends Object> String beanToXml(T t) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(t.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);
        StringWriter writer = new StringWriter();
        marshaller.marshal(t, writer);
        return writer.toString();
    }
}
