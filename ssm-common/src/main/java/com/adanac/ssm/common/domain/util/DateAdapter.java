package com.adanac.ssm.common.domain.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-11-18
 */
public class DateAdapter extends XmlAdapter<String, Date> {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public Date unmarshal(String v) throws Exception {
        return dateFormat.parse(v);
    }

    @Override
    public String marshal(Date v) throws Exception {
        return dateFormat.format(v);
    }
}
