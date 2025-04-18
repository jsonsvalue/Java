package com.ssafy.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class FileController {
	// Spring에서는 파일이나 클래스 등 자원을 업로드 할 때, ResourceLoader 인터페이스를 활용한다.
	
	// @Autowired
	private ResourceLoader resourceLoader;
	
	public FileController(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
	
	@GetMapping("/singleFileForm")
	public String singleFileForm() {
		return "singleFileForm";
	}
	
	@PostMapping("/singleFileUpload")
	public String SingleFileUpload(@RequestParam("file") MultipartFile file, Model model) throws IllegalStateException, IOException {
		// 파일이 있는지를 먼저 검사한다.
		if(file !=null && file.getSize() > 0) {
			String fileName = file.getOriginalFilename();
			// 임시 메모리에 파일을 저장한 후, 실제 서버에 파일을 저장해야 한다.
			
			// img 폴더를 변수에 저장한다.
			Resource resource= resourceLoader.getResource("classpath:/static/img");
			
			// 등록 받은 파일을 업로드한다.
			file.transferTo(new File(resource.getFile(), fileName));
			
			model.addAttribute("fileName", fileName);
		}
		
		
		System.out.println(file.getSize());
		
		return "result";
	}
	
	@GetMapping("/multipleFileForm")
	public String multipleFileForm() {
		return "multipleFileForm";
	}
	
	@PostMapping("/multipleFileUpload")
	public String multipleFileUpload(@RequestParam("files") MultipartFile[] files, Model model) throws IllegalStateException, IOException {
		for(MultipartFile file: files) {
			System.out.println(file.getOriginalFilename());
		}
		
		
		return "result";
	}
	
//	@GetMapping("/download")
//	public String fileDownload(@RequestParam("fileName") String fileName, Model model) {
//		model.addAttribute("fileName", fileName);
//		
//		return "fileDownloadView";
//	}
	
	@GetMapping("/download")
	protected void download(@RequestParam("fileName") String fileName, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// model에 파일 이름을 저장해서 view로 넘긴다.
		
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
