package Randoop;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;



public class RunRandoop {
	
	public static String[] Run( File class_file,int timelimit, int vecchioiter, int iter) {
		//String name = "XMLParser";	
		//String name= (String) class_file.getOriginalFilename().subSequence(0,class_file.getOriginalFilename().length()-5 );
		String name = (String) class_file.getName().subSequence(0,class_file.getName().length()-5 );
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        String currentDate = dtf.format(now); 
        currentDate = currentDate.replace("/","-");
        currentDate =  currentDate.replace(" ", "--");
        currentDate =  currentDate.replace(":", "-");
        String zip_ritorno = null;
        String xml_ritorno = null;
        String cartella_ritorno = null;

        Random r = new Random();
        int low = 0;
        int high = 230000;
        int seed = r.nextInt(high-low) + low;
        System.out.println("Random seed " + seed);
        
        
		try {
			//"C:\Users\hp\Desktop\demo\XMLParser-2023-05-26--15-55-05-dati_di_copertura\coveragetot.xml"

			zip_ritorno = (".\\"+name+"-"+iter+"-dati_di_copertura\\"+name+"_Test.zip");
			cartella_ritorno = (".\\"+name+"-"+iter+"-dati_di_copertura\\"+name+"_Test");
			File f = new File(zip_ritorno);
			
			xml_ritorno = (".\\"+name+"-"+iter+"-dati_di_copertura\\coveragetot.xml");
			Process p=Runtime.getRuntime().exec("cmd /c start \"\" robot.bat "+" "+name+" "+timelimit+" "+iter+" "+seed+" "+vecchioiter );
			
			while(!f.exists())
				Thread.sleep(100);
			

			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
		String[] ritorno = {zip_ritorno,xml_ritorno, currentDate, cartella_ritorno};
		return ritorno;

	}
}
