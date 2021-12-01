package com.emart.enums;

public enum ProductTypeEnum {
	APPAREL("A"), COSMETICS("C"), ELECTRONICS("E"), FOODANDDRINKS("F");
	
	private String source;
	
	ProductTypeEnum(String source){
		this.source=source;
	}
	
	public String getSource() {
		return source;
	}
}
