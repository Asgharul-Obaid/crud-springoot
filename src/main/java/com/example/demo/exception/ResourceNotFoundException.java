package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String resourceValue;
	private Object resourceField;
	
	
	
	public ResourceNotFoundException(String resourceName, String resourceValue, Object resourceField) {
		super();
		this.resourceName = resourceName;
		this.resourceValue = resourceValue;
		this.resourceField = resourceField;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceValue() {
		return resourceValue;
	}
	public void setResourceValue(String resourceValue) {
		this.resourceValue = resourceValue;
	}
	public Object getResourceField() {
		return resourceField;
	}
	public void setResourceField(Object resourceField) {
		this.resourceField = resourceField;
	}
	@Override
	public String toString() {
		return "ResourceNotFoundException [resourceName=" + resourceName + ", resourceValue=" + resourceValue
				+ ", resourceField=" + resourceField + "]";
	}

	
}
