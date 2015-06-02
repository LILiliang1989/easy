package com.easycose.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class Upload {
	private static final long serialVersionUID = -4848248679889814408L;

	public static ArrayList<String> upload(List<File> Filedata,
			List<String> FiledataFileName, List<String> FiledataContentType, String savePath) {

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("utf-8");
        ArrayList<String> fileNameList = new ArrayList<String>();
		

		int size = Filedata.size();
		if (size == 0) {
			// should be modified to show message to customer
			System.out.println("upload failed");
		}

		for (int i = 0; i < size; i++) {
			String currentFileName = FiledataFileName.get(i);
			String newFileName = Tool.genLegalFilename(currentFileName);
			String currentFilePath = savePath + '/' + newFileName;
			System.out.println(currentFilePath);
			File file = new File(currentFilePath);
			try {
				// 复制文件到服务器目录
				FileUtils.copyFile(Filedata.get(i), file);
				// 只记录复制成功的文件名称
				fileNameList.add(currentFilePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return fileNameList;

	}

}