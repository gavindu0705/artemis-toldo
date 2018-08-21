package com.dxy.artemis.toldo.batch.http;

import java.util.Map;

/**
 * http请求结果
 */
public class HttpResult {
	private int status;
	private Map<String, String> headers;
	private String body;
	private String sign;
	private Integer timestamp;
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return String.format("HttpResult: {status:%s, headers:%s, body:%s}", status, headers, body);
	}

}
