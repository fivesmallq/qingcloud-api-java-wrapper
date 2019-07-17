package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class AddProjectResourceItemsResponse {
	private String action;
	private List<String> resource_ids;
	private Integer ret_code;
	private String message;
	private String resource_group_id;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<String> getResource_ids() {
		return resource_ids;
	}

	public void setResource_ids(List<String> resource_ids) {
		this.resource_ids = resource_ids;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getResource_group_id() {
		return resource_group_id;
	}

	public void setResource_group_id(String resource_group_id) {
		this.resource_group_id = resource_group_id;
	}

	public static AddProjectResourceItemsResponse fromJson(String jsonAddLoadBalancerListenersResponse){
		Gson gson = new Gson();
		AddProjectResourceItemsResponse addLoadBalancerListenersResponse = gson.fromJson(jsonAddLoadBalancerListenersResponse, AddProjectResourceItemsResponse.class);
		return addLoadBalancerListenersResponse;
	}

}
