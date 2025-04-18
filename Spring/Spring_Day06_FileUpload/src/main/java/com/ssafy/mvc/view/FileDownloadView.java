package com.ssafy.mvc.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.AbstractView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component("fileDownloadView")
public class FileDownloadView extends AbstractView{
	//@Autowired
	private ResourceLoader resourceLoader;
	
	public FileDownloadView(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@Override
	protected void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// model에 파일 이름을 저장해서 view로 넘긴다.
		String fileName = (String)model.get("fileName");
		
		// img 폴더 안의 파일을 가져오기 위한 변수 및 파일 변수를 만든다.
		Resource resource = resourceLoader.getResource("classpath:/static/img");
		File file = new File(resource.getFile(), fileName);
		
		//////////////////////////////
		// 다운로드를 위한 설정
		fileName = new String(fileName.getBytes("UTF-8"), "ISO-8859-1");
		response.setHeader("Content-Disposition", "attachment; fileName=\""+fileName+"\";");
		response.setHeader("Content-Transfer-Encoding", "binary");
		//////////////////////////////
		
		// 파일을 다운로드 받게 한다.
		try(FileInputStream fis = new FileInputStream(file);
				OutputStream os = response.getOutputStream();){
			FileCopyUtils.copy(fis, os);
		}
		
		
	}
	
	
}
