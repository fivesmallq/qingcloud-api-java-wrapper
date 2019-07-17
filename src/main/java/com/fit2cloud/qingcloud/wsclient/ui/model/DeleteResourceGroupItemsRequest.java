package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class DeleteResourceGroupItemsRequest extends Request {
	private String resource_group;
	private String zone;
	private List<String> resources;

	public String getResource_group() {
		return resource_group;
	}

	public void setResource_group(String resource_group) {
		this.resource_group = resource_group;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public List<String> getResources() {
		return resources;
	}

	public void setResources(List<String> resources) {
		this.resources = resources;
	}
}
