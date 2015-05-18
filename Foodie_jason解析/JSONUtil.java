package com.hmkcode.android;

import org.json.JSONObject;

public class JSONUtil {
	// 使用HTTP Get请求JSON数据
	// 如果出现异常或未接收到数据返回null
	public static JSONObject parse(String url) {
		url = url.trim();
		if (!url.startsWith("http://"))
			url = "http://" + url;
		try {
			String jsonStr = HttpUtil.getRequest(url);
			JSONObject json = new JSONObject(jsonStr);
			return json;
		} catch (Exception ex) {
			return null;
		}
	}
}
