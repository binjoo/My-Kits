package com.binjoo.ant;

import org.apache.tools.ant.ProjectComponent;

public class ReplaceFileTag extends ProjectComponent {
	private String reg;
	private String value;

	public String getReg() {
		return this.reg;
	}

	public void setReg(String paramString) {
		this.reg = paramString;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String paramString) {
		this.value = paramString;
	}

	public String toString() {
		return "reg:" + this.reg + " value:" + this.value;
	}
}
