package Randoop;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;



public class Service {
	public static void main(String[] args) throws IOException {
		File folder = new File("./FolderTree");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
	//	  if (listOfFiles[i].isFile()) {
	//	    System.out.println("File " + listOfFiles[i].getName());
	//	  } 
	//  else 
		  if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory --> " + listOfFiles[i].getName());
		    
		    //VERIFICO CHE NON CI SIANO GIA' LIVELLI
			File level_folder = new File("./FolderTree/"+listOfFiles[i].getName()+"\\RobotTest\\RandoopTest\\02Level");
			if(level_folder.exists() == false) {
				File class_file = new File("./FolderTree/"+listOfFiles[i].getName()+"\\"+listOfFiles[i].getName()+"SourceCode\\"+listOfFiles[i].getName()+".java");
				System.out.println("file java --> " + class_file);
				file_testing(class_file);
			}
		    
		  }
		}
	}
		
	private static void file_testing(File class_file) throws IOException {

		//File class_file = new File("C:\\Users\\franc\\Downloads\\minimised_classes_2016\\subjects\\anonymised\\FTPFile.java");
    	int cov;
    	int ex_cov = 0;
    	int timelimit = 5;
    	int max_iter = 500;
    	int iter = 0;
    	int sat = 0;
    	int max_sat = 5;
    	
    	int maxlevel = 10;
    	int livello = 0;
    	
    	String[] result = null;
    	
    	File file = new File("classes/"+ class_file.getName());
    	
    	Path source = Path.of(class_file.getPath());
        Path destination = Path.of(file.getPath());
    	
    	Files.copy(source, destination,  StandardCopyOption.REPLACE_EXISTING);

    	File director = new File(".\\FolderTree\\" + class_file.getName().subSequence(0,class_file.getName().length()-5) + "\\RobotTest\\RandoopTest\\");

    	director.mkdir();
    	
    	do {
    		
    		
			result = RunRandoop.Run(class_file, timelimit, iter-1, iter);
			System.out.println(result[1]);

    		
    		cov = Coverage_Emma.LineCoverage(result[1]);
    		if(ex_cov >= cov) {
    			sat++;
    			System.out.println("uguale"+cov+ex_cov+sat);
    			//ex_cov = cov;
    			
    		} else {
    			livello++;
    			sat = 0;
    			System.out.println("diverso"+cov+ex_cov+sat);
    			File directory_level;
    			if(livello == 10) {
    				directory_level = new File(".\\FolderTree\\" + class_file.getName().subSequence(0,class_file.getName().length()-5) + "\\RobotTest\\RandoopTest\\" + livello +"Level");
    			} else {
    				directory_level = new File(".\\FolderTree\\" + class_file.getName().subSequence(0,class_file.getName().length()-5) + "\\RobotTest\\RandoopTest\\" + "0"+livello +"Level");

    			}
    			directory_level.mkdir();

    			
    			Path destinationFile = Path.of(directory_level.getPath());
    			System.out.println("Path directory livello --> " + destinationFile);
    			
    			for(int i=0; i<=iter; i++) {
    				File sourceFile = new File(".\\FolderTree\\"+class_file.getName().subSequence(0,class_file.getName().length()-5) + "\\RobotTest\\RandoopTest\\"+class_file.getName().subSequence(0,class_file.getName().length()-5)+"-"+i+"-dati_di_copertura\\"+class_file.getName().subSequence(0,class_file.getName().length()-5)+"_Test");
    				
    				System.out.println("Cartella dove stanno i regressionTest --> "+sourceFile);
        			
        			File[] files = sourceFile.listFiles();
        			
        			if (files != null) {
        	            for (File f : files) {
        	                if (f.isFile()) {

        	                    
        	                    String nomeFile = f.getName();
        	    				System.out.println(nomeFile);

        	                    String nomeSenzaEstensione = nomeFile.substring(0, nomeFile.lastIndexOf('.'));
        	    				System.out.println(nomeSenzaEstensione);

        	                    String estensione = nomeFile.substring(nomeFile.lastIndexOf('.'));
        	    				System.out.println(estensione);

        	                    
        	                    String nuovoNome = nomeSenzaEstensione + "_it"+iter +"_livello"+ livello + estensione;
        	    				System.out.println(nuovoNome);

        	                   
        	                    File nuovoFile = new File(f.getParent(), nuovoNome);
        	    				System.out.println(nuovoFile);

        	                    	f.renameTo(nuovoFile);
        	                        Path origine = nuovoFile.toPath();
        	        				System.out.println("origine--> " +origine);

        	                        Path destinazione = new File(directory_level.getPath(), nuovoNome).toPath();
        	        				System.out.println("dest--> " +destinazione);

        	                        
        	                        try {
        	                            Files.copy(origine, destinazione, StandardCopyOption.REPLACE_EXISTING);
        	                            System.out.println("File copiato: " + nuovoNome);
        	                        } catch (IOException e) {
        	                            System.out.println("Errore durante la copia del file: " + nuovoNome);
        	                            e.printStackTrace();
        	                        }

        	                    }
        	                }
        	            }
        	        }

    			ex_cov = cov;
    			
    		}
    		
    		System.out.println(result[1]);
    		System.out.println(cov);
    		iter++;
    		timelimit = timelimit +2;
    	}
    	while(iter < max_iter && sat < max_sat && livello < maxlevel);
		
    	
    	File classFile = new File("classes/"+ (String) class_file.getName().subSequence(0,class_file.getName().length()-5 )+".class");
    	File javaFile = new File("classes/"+ (String) class_file.getName().subSequence(0,class_file.getName().length()-5 )+".java");
    	
    	clearFolder();
    	classFile.delete();
    	javaFile.delete();
    	
	}
	
	private static void clearFolder() {
        File root = new File(".");
        System.out.println(root.getAbsolutePath());
        clearSubfolders(root);
    }

    private static void clearSubfolders(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    if (file.getName().contains("dati_di_copertura")) {
                        clearSubfolders(file); // Chiamata ricorsiva per eliminare le sottocartelle
                        deleteFolder(file); // Elimina la cartella corrente
                    } else {
                        clearSubfolders(file); // Chiamata ricorsiva per le sottocartelle senza eliminazione
                    }
                }
            }
        }
    }

    private static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteFolder(file); // Chiamata ricorsiva per eliminare le sottocartelle
                } else {
                    file.delete(); // Elimina il file nella cartella corrente
                }
            }
        }
        folder.delete(); // Elimina la cartella corrente
        System.out.println("Cartella eliminata: " + folder.getAbsolutePath());
    }
  }

