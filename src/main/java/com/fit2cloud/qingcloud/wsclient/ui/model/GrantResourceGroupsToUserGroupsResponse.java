package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudCollaboration;
import com.google.gson.Gson;

import java.util.List;

public class GrantResourceGroupsToUserGroupsResponse extends Request {
	private String action;
	private List<QingCloudCollaboration> rur_set;
	private Integer ret_code;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<QingCloudCollaboration> getRur_set() {
		return rur_set;
	}

	public void setRur_set(List<QingCloudCollaboration> rur_set) {
		this.rur_set = rur_set;
	}

	public Integer getRet_code() {
		return ret_code;
	}

	public void setRet_code(Integer ret_code) {
		this.ret_code = ret_code;
	}

	public static GrantResourceGroupsToUserGroupsResponse fromJson(String jsonDescribeImagesResponse){
		Gson gson = new Gson();
		GrantResourceGroupsToUserGroupsResponse grantResourceGroupsToUserGroupsResponse = gson.fromJson(jsonDescribeImagesResponse, GrantResourceGroupsToUserGroupsResponse.class);
		return grantResourceGroupsToUserGroupsResponse;
	}
}
