package com.fit2cloud.qingcloud.wsclient.ui.model;

import java.util.List;

public class AddProjectResourceItemsRequest extends Request {
	private String project_id;
	private String zone;

	public String getProject_id() {
		return project_id;
	}

	public void setProject_id(String project_id) {
		this.project_id = project_id;
	}

	private List<String> resources;


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
