package demoprova;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.*;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ByteArrayResource;

import servicedemo.Coverage_Emma;
import servicedemo.RandoopServiceDemo;


@RestController
public class ControllerDemo {
	
	
	
	private RandoopServiceDemo randoop = new RandoopServiceDemo();
	private Coverage_Emma Emma = new Coverage_Emma();
	/*
    @RequestMapping("/hello")
    public void hello() {
    	randoop.RunRandoop();
        //return "ok";
        
    } */
   // @PostMapping("/document/upload")
    //public void uploadFile(@RequestPart("file") MultipartFile file,@RequestBody FileUpload jsondata)
    //@PostMapping("/uploadClass")
	//public UploadClassResponse uploadClassUT(@RequestParam("class_file") MultipartFile class_file, @RequestParam("complexity") int compl)
	
	
/*	@GetMapping("/getFile")
    public MultipartFile GETFile(@RequestParam("class_file") MultipartFile class_file){

    	File file = new File("classes/"+ class_file.getOriginalFilename());

    	try (OutputStream os = new FileOutputStream(file)) {
    	    os.write(class_file.getBytes());
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	randoop.RunRandoop(class_file);
		return class_file;
		
    }
	
	*/
	@GetMapping("/getFile")
	public ResponseEntity<Resource> GETFile(@RequestParam("class_file") MultipartFile class_file) throws java.lang.ClassNotFoundException, IOException{
		
    	File file = new File("classes/"+ class_file.getOriginalFilename());
    	int cov;
    	int ex_cov = 0;
    	int timelimit = 5;
    	int max_iter = 3;
    	int iter = 0;
    	int sat = 0;
    	int max_sat = 5;
    	
    	int maxlevel = 10;
    	int livello = 0;
    	
    	String[] result = null;
    	String VecchioTimestamp = null;
    	try (OutputStream os = new FileOutputStream(file)) {
    	    os.write(class_file.getBytes());
    	} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	/*
    	  if(Integer.valueOf(level)==1) {
    		timelimit = 1;
    		max_iter = 1;
    		max_sat = 1;
    	}
    		
    	else if(Integer.valueOf(level)==2){
    		timelimit = 5;
    		max_iter = 15;
    		max_sat = 5;
    	}
    	else if(Integer.valueOf(level)==3){
    		timelimit = 10;
    		max_iter = 30;
    		max_sat = 10;
    	} 
    	*/
    	
    	File director = new File((class_file.getOriginalFilename().subSequence(0,class_file.getOriginalFilename().length()-5)+"_Livelli"));
		director.mkdir();
    	
    	do {
    		
    		result = randoop.RunRandoop(class_file, timelimit, VecchioTimestamp);
    		VecchioTimestamp = result[2];
    		cov = Emma.LineCoverage(result[1]);
    		if(ex_cov == cov) {
    			sat++;
    			System.out.println("uguale"+cov+ex_cov+sat);
    			ex_cov = cov;
    			
    		} else {
    			livello++;
    			sat = 0;
    			System.out.println("diverso"+cov+ex_cov+sat);
    			File directory = new File(class_file.getOriginalFilename().subSequence(0,class_file.getOriginalFilename().length()-5)+"_Livelli/livello"+livello);
    			directory.mkdir();
    			String path = directory.getAbsolutePath();
    			Path destinationFile = Paths.get(path);
    			System.out.println(destinationFile);

    			Path sourceFile = Paths.get(result[3]);
    			System.out.println(sourceFile);

    			Files.copy(sourceFile, destinationFile.resolve(sourceFile.getFileName()), StandardCopyOption.REPLACE_EXISTING);
    	
    			ex_cov = cov;
    			
    		}
    		
    		
    		System.out.println(result[1]);
    		System.out.println(cov);
    		iter++;
    		timelimit = timelimit +2;
    	}while(iter < max_iter && sat < max_sat && livello < maxlevel);
		
    	File directory = new File(class_file.getOriginalFilename().subSequence(0,class_file.getOriginalFilename().length()-5)+"_Livelli/livello87");
		directory.mkdir();
		String path = directory.getAbsolutePath();
		Path destinationFile = Paths.get(path);
    	Path sourceFile = Paths.get(result[0]);
		System.out.println(sourceFile);

		Files.copy(sourceFile, destinationFile.resolve(sourceFile.getFileName()), StandardCopyOption.REPLACE_EXISTING);

    	
    	File classFile = new File("classes/"+ (String) class_file.getOriginalFilename().subSequence(0,class_file.getOriginalFilename().length()-5 )+".class");
    	
    	classFile.delete();
    	file.delete();
		
    	
    	Resource resource = new UrlResource(new File(result[0]).toURI());
		System.out.println(result[0]);

		if (!resource.exists()) {
			throw new ClassNotFoundException("File not found ");
		}
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment; filename=\""+resource.getFilename()+"\"")
				.contentType(MediaType.valueOf("application/zip"))
				.body(resource);
	}
	
}
