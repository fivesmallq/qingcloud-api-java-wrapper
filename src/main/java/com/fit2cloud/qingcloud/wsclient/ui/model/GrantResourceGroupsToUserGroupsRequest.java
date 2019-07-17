package com.fit2cloud.qingcloud.wsclient.ui.model;

import com.fit2cloud.qingcloud.wsclient.domain.model.QingCloudCollaboration;

import java.util.List;

public class GrantResourceGroupsToUserGroupsRequest extends Request {
	private List<QingCloudCollaboration> rur_set;

	public List<QingCloudCollaboration> getRur_set() {
		return rur_set;
	}

	public void setRur_set(List<QingCloudCollaboration> rur_set) {
		this.rur_set = rur_set;
	}
}
