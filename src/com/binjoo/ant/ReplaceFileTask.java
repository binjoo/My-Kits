package com.binjoo.ant;

import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.apache.tools.ant.Task;

public class ReplaceFileTask extends Task {
	private File file;
	private ArrayList<ReplaceFileTag> regList = new ArrayList<ReplaceFileTag>();

	public void setFile(File paramFile) {
		this.file = paramFile;
	}

	public void addToken(ReplaceFileTag paramReplaceFileTag) {
		this.regList.add(paramReplaceFileTag);
	}

	public void execute() {
		try {
			String str = FileUtils.readFileToString(this.file);
			for (int i = 0; i < this.regList.size(); i++) {
				ReplaceFileTag localReplaceFileTag = (ReplaceFileTag) this.regList
						.get(i);
				System.out.println(localReplaceFileTag);
				str = str.replaceAll(localReplaceFileTag.getReg(),
						localReplaceFileTag.getValue());
			}
			FileUtils.writeStringToFile(this.file, str);
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}
}
