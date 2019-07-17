package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.google.gson.Gson;

import java.util.List;

public class DeleteResourceGroupItemsResponse {
	private String action;
	private Integer ret_code;
	private String message;
	private String resource_group_id;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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

	public static DeleteResourceGroupItemsResponse fromJson(String jsonAddLoadBalancerListenersResponse){
		Gson gson = new Gson();
		DeleteResourceGroupItemsResponse addLoadBalancerListenersResponse = gson.fromJson(jsonAddLoadBalancerListenersResponse, DeleteResourceGroupItemsResponse.class);
		return addLoadBalancerListenersResponse;
	}

}
