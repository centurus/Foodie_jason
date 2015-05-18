package com.hmkcode.android;

import org.json.JSONObject;

public class JSONUtil {
	// ʹ��HTTP Get����JSON����
	// ��������쳣��δ���յ����ݷ���null
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
