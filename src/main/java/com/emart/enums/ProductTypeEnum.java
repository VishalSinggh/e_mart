package com.emart.enums;

public enum ProductTypeEnum {
	APPAREL("APPAREL"), COSMETICS("COSMETICS"), ELECTRONICS("ELECTRONICS"), FOODANDDRINKS("FOODANDDRINKS");
	
	private String source;
	
	ProductTypeEnum(String source){
		this.source=source;
	}
	
	public String getSource() {
		return source;
	}
}
