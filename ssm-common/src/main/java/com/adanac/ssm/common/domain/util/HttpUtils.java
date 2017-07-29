package com.adanac.ssm.common.domain.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Copyright: 2016 Haiziwang
 * *
 * Author:  Daniel Kong
 * Date:    2016-06-06
 * Desc:    Http 请求工具类
 */
public class HttpUtils {

    public static final String USER_AGENT_BROWSER = "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.80 Safari/537.36";
    public static final String USER_AGENT_ANDROID = "Mozilla/5.0 (Linux; Android 5.0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/45.0.2454.94 Mobile Safari/537.36";

    public static final String CONTENT_TYPE_WWW_FORM = "application/x-www-form-urlencoded; charset=UTF-8";
    public static final String CONTENT_TYPE_JSON = "application/json; charset=UTF-8";

    public static final String ACCEPT_TEXT_HTML = "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8";
    public static final String ACCEPT_JSON = "application/json, text/javascript, */*; q=0.01";

    public static final String METHOD_GET = "get";
    public static final String METHOD_POST = "post";

    public static final String PARAM_TYPE_HTML = "html";
    public static final String PARAM_TYPE_JSON = "json";
    private static final String CHARSET_UTF8 = "UTF-8";

    public static final int STATUS_CODE_OK = 200;

    private static class HeaderParam {
        private String userAgent;
        private String contentType;
        private String accept;

        public HeaderParam(String userAgent, String contentType, String accept) {
            this.userAgent = userAgent;
            this.contentType = contentType;
            this.accept = accept;
        }

        public String getUserAgent() {
            return userAgent;
        }

        public void setUserAgent(String userAgent) {
            this.userAgent = userAgent;
        }

        public String getContentType() {
            return contentType;
        }

        public void setContentType(String contentType) {
            this.contentType = contentType;
        }

        public String getAccept() {
            return accept;
        }

        public void setAccept(String accept) {
            this.accept = accept;
        }
    }

    /**
     * Get http header param
     *
     * @param paramType param type
     * @return header param
     */
    private static HeaderParam getHeaderParam(String paramType) {
        return ((paramType == null) || !(paramType.equals(PARAM_TYPE_JSON))) ?
                new HeaderParam(USER_AGENT_BROWSER, CONTENT_TYPE_WWW_FORM, ACCEPT_TEXT_HTML) :
                new HeaderParam(USER_AGENT_BROWSER, CONTENT_TYPE_JSON, ACCEPT_JSON);
    }

    /**
     * Create http headers
     *
     * @param paramType param type
     * @return http headers
     */
    private static Header[] getHeaders(String paramType) {
        Header[] headers = new Header[8];
        HeaderParam param = getHeaderParam(paramType);
        headers[0] = new BasicHeader("User-Agent", param.getUserAgent());
        headers[1] = new BasicHeader("Content-Type", param.getContentType());
        headers[2] = new BasicHeader("Connection", "keep-alive");
        headers[3] = new BasicHeader("Cache-Control", "no-cache");
        headers[4] = new BasicHeader("Accept", param.getAccept());
        headers[5] = new BasicHeader("Accept-Encoding", "gzip, deflate, sdch");
        headers[6] = new BasicHeader("Accept-Language", "zh-CN,zh;q=0.8,en;q=0.6,fr;q=0.4,de;q=0.2");
        headers[7] = new BasicHeader("Pragma", "no-cache");
        return headers;
    }

    /**
     * Send http request
     *
     * @param url       target url
     * @param urlParams url params
     * @param method    get or post
     * @param paramType accept text or json
     * @param body      payload
     * @return response content
     * @throws IOException
     */
    public static String sendHttpRequest(String url, List<NameValuePair> urlParams, String method, String paramType, String body) throws IOException {
        CloseableHttpClient httpclient = HttpClients.custom().build();
        CloseableHttpResponse response = null;
        String result = null;

        if (urlParams != null && urlParams.size() > 0)
            url = new StringBuilder(url).append("?").append(URLEncodedUtils.format(urlParams, CHARSET_UTF8)).toString();

        try {
            if (StringUtils.getValidString(method).equals(METHOD_POST)) {
                HttpPost httpPost = new HttpPost(url);
                httpPost.setHeaders(getHeaders(paramType));
                httpPost.setEntity(new StringEntity(StringUtils.getValidString(body), Charset.forName("UTF-8")));
                response = httpclient.execute(httpPost);
            } else {
                HttpGet httpGet = new HttpGet(url);
                httpGet.setHeaders(getHeaders(paramType));
                response = httpclient.execute(httpGet);
            }

            try {
                if (response.getStatusLine().getStatusCode() == STATUS_CODE_OK) {
                    HttpEntity entity = response.getEntity();
                    result = EntityUtils.toString(entity);
                }
            } finally {
                response.close();
            }
        } finally {
            httpclient.close();
        }
        return result;
    }

    /**
     * Send http get
     *
     * @param url       target url
     * @param urlParams url params
     * @param paramType accept text or json
     * @return response content
     * @throws IOException
     */
    public static String sendHttpGet(String url, List<NameValuePair> urlParams, String paramType) throws IOException {
        return sendHttpRequest(url, urlParams, METHOD_GET, paramType, null);
    }

    /**
     * Send http get
     *
     * @param url       target url
     * @param urlParams url params
     * @return response content
     * @throws IOException
     */
    public static String sendHttpGet(String url, List<NameValuePair> urlParams) throws IOException {
        return sendHttpGet(url, urlParams, PARAM_TYPE_JSON);
    }

    /**
     * Send http post
     *
     * @param url       target url
     * @param urlParams url params
     * @param paramType text or json
     * @param body      payload
     * @return response content
     * @throws IOException
     */
    public static String sendHttpPost(String url, List<NameValuePair> urlParams, String paramType, String body) throws IOException {
        return sendHttpRequest(url, urlParams, METHOD_POST, paramType, body);
    }

    /**
     * Send http post
     *
     * @param url           target url
     * @param urlParams     url params
     * @param paramType     text or json
     * @param payloadParams payload params
     * @return response content
     * @throws IOException
     */
    public static String sendHttpPost(String url, List<NameValuePair> urlParams, String paramType, JSONObject payloadParams) throws IOException {
        return sendHttpRequest(url, urlParams, METHOD_POST, paramType, payloadParams.toJSONString());
    }

    /**
     * Send http post
     *
     * @param url       target url
     * @param urlParams url params
     * @param body      payload
     * @return response content
     * @throws IOException
     */
    public static String sendHttpPost(String url, List<NameValuePair> urlParams, String body) throws IOException {
        return sendHttpPost(url, urlParams, PARAM_TYPE_JSON, body);
    }

    /**
     * Send http post
     *
     * @param url           target url
     * @param urlParams     url params
     * @param payloadParams payload params
     * @return response content
     * @throws IOException
     */
    public static String sendHttpPost(String url, List<NameValuePair> urlParams, JSONObject payloadParams) throws IOException {
        return sendHttpPost(url, urlParams, PARAM_TYPE_JSON, payloadParams);
    }

    /**
     * 连接Map中的参数键值对
     *
     * @param paramMap 参数map
     * @return 连接值
     */
    public static String buildParamsFromMap(Map<String, Object> paramMap) {
        StringBuilder sb = new StringBuilder();
        if (paramMap != null && !paramMap.isEmpty()) {
            int index = 0;
            for (String key : paramMap.keySet()) {
                sb.append(key).append("=").append(paramMap.get(key));
                if (index++ < paramMap.size() - 1)
                    sb.append("&");
            }
        }
        return sb.toString();
    }

    // Test case
    public static void main1(String[] args) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("a", 0);
        paramMap.put("b", "1");
        paramMap.put("c", 2L);
        System.out.println(buildParamsFromMap(paramMap));
    }

    // Test order cancel
    public static void main2(String[] args) {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        NameValuePair param1 = new BasicNameValuePair("billnumber", "80001008829091");
        NameValuePair param2 = new BasicNameValuePair("month", "201512");
        params.add(param1);
        params.add(param2);

        try {
            System.out.println(HttpUtils.sendHttpGet("http://192.168.1.93:1122/CancleOrder/CancleOrder.asmx/CancelOrderKwmsTest", params, HttpUtils.ACCEPT_TEXT_HTML));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main3(String[] args) {
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        NameValuePair param1 = new BasicNameValuePair("loginName", "19020906");
        params.add(param1);

        try {
            String resp = HttpUtils.sendHttpGet("http://172.172.178.17:8080/subscriber-web/emp/getEmpInfo.do", params);
            JSONObject respJson = JSON.parseObject(resp);
            JSONObject content = (JSONObject) respJson.get("content");
            JSONObject result = (JSONObject) content.get("result");
            JSONObject empInfo = (JSONObject) result.get("empInfo");
            System.out.println(JSON.toJSONString(empInfo));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        try {
//            String resp = HttpUtils.sendHttpGet("http://kwms.haiziwang.com/interface", params);
            String resp = HttpUtils.sendHttpGet("http://172.172.210.91:18080/interface", params);
            System.out.println(JSON.toJSONString(resp));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
