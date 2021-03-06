package com.fit2cloud.qingcloud.wsclient.domain.model;

import java.util.List;

public class QingCloudLoadBalancerListenerDetail {
	
	private String loadbalancer_listener_id;
	private String loadbalancer_listener_name;
	private List<QingCloudLoadBalancerBackend> backends;
	private List<String> server_certificate_id;
	private String balance_mode;
	private String session_sticky;
	private String create_time;
	private Integer forwardfor;
	private String healthy_check_method;
	private String healthy_check_option;
	public String getLoadbalancer_listener_id() {
		return loadbalancer_listener_id;
	}
	public void setLoadbalancer_listener_id(String loadbalancer_listener_id) {
		this.loadbalancer_listener_id = loadbalancer_listener_id;
	}
	public String getLoadbalancer_listener_name() {
		return loadbalancer_listener_name;
	}
	public void setLoadbalancer_listener_name(String loadbalancer_listener_name) {
		this.loadbalancer_listener_name = loadbalancer_listener_name;
	}

	public List<String> getServer_certificate_id() {
		return server_certificate_id;
	}

	public void setServer_certificate_id(List<String> server_certificate_id) {
		this.server_certificate_id = server_certificate_id;
	}

	public List<QingCloudLoadBalancerBackend> getBackends() {
		return backends;
	}
	public void setBackends(List<QingCloudLoadBalancerBackend> backends) {
		this.backends = backends;
	}
	public String getBalance_mode() {
		return balance_mode;
	}
	public void setBalance_mode(String balance_mode) {
		this.balance_mode = balance_mode;
	}
	public String getSession_sticky() {
		return session_sticky;
	}
	public void setSession_sticky(String session_sticky) {
		this.session_sticky = session_sticky;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Integer getForwardfor() {
		return forwardfor;
	}
	public void setForwardfor(Integer forwardfor) {
		this.forwardfor = forwardfor;
	}
	public String getHealthy_check_method() {
		return healthy_check_method;
	}
	public void setHealthy_check_method(String healthy_check_method) {
		this.healthy_check_method = healthy_check_method;
	}
	public String getHealthy_check_option() {
		return healthy_check_option;
	}
	public void setHealthy_check_option(String healthy_check_option) {
		this.healthy_check_option = healthy_check_option;
	}
}
