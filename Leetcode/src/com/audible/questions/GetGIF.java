package com.audible.questions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.io.FileWriter;

public class GetGIF {

	public static void createFile(String input, String inputFile) throws IOException {
		HashSet<String> result = new HashSet<String>();
		
		String rows[] = input.split("\n");
		
		for(String row : rows) {
			String rowarr[] = row.split(" ");
			String path = rowarr[6];
			
			String pathValues[] = path.split("/");
			String filename = pathValues[pathValues.length - 1];
			String fileext[] = filename.split("\\.");
		    String extension = "";
			
			if(fileext.length > 1 && (fileext[fileext.length - 1].equals("gif") || fileext[fileext.length - 1].equals("GIF"))) {
				extension = fileext[fileext.length - 1];
				
				rowarr[5] = rowarr[5].substring(1);

				if(rowarr[5].equals("GET") && rowarr[8].equals("200")){
					result.add(filename);
				}
			}
			
		}
		
		String name = "gifs_" + inputFile; 
		
		String output = "/Users/chetali.mahore/practice-workspace/Leetcode/src/com/audible/questions/" + name;
		
		File file = new File(output);
		  
		//Create the file
		if (file.createNewFile())
		{
		    System.out.println("File is created!");
		} else {
		    System.out.println("File already exists.");
		}
		 
		
		
		//Write Content
		FileWriter writer = new FileWriter(file);
//		writer.write("Test data");
//		writer.close();
		
		for(String str : result) {
			writer.write(str + "\n");
		}
		
		writer.close();
	}
	
	private static String readFile(String fileName) throws IOException {
	    BufferedReader br = new BufferedReader(new FileReader(fileName));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();

	        while (line != null) {
	            sb.append(line);
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
	
	
//	public static void getRequest(String filename) {
//		
//		HashSet<String> res = new HashSet<String>();
//		BufferedReader reader;
//		try {
//
//			reader = new BufferedReader(new FileReader(
//					"/Users/himanshuchhabra/Documents/workspace1/Personal/src/com/himanshu/amazon/input.txt"));
//			String line = reader.readLine();
//
//			while (line != null) {
//				if (line != "") {
//					String contents[] = line.split(" ");
//					if (contents.length == 10) {
//						String reqType = contents[5];
//						reqType = reqType.substring(1);
//						String filePath = contents[6];
//						String status = contents[8];
//
//						if (reqType.equals("GET") && status.equals("200")) {
//							String[] splitFile = filePath.split("/");
//							String name = splitFile[splitFile.length - 1];
//							String[] splitName = name.split("\\.");
//
//							if (splitName.length > 0 && splitName[splitName.length - 1].equalsIgnoreCase("gif")) {
//								res.add(name);
//							}
//						}
//					}
//				}
//				// read next line
//				line = reader.readLine();
//			}
//			reader.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		BufferedWriter bw = null;
//		FileWriter fw = null;
//
//		try {
//			String opFile = "gif"+filename ; //"/Users/himanshuchhabra/Documents/workspace1/Personal/src/com/himanshu/amazon/gif_input.txt";
//			File file = new File(opFile);
//			file.createNewFile();
//			fw = new FileWriter(file);
//			bw = new BufferedWriter(fw);
//
//			for (String cont : res) {
//				cont += "\n";
//				bw.write(cont);
//			}
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//
//		}
//
//	}
//	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String inputfile = "/Users/chetali.mahore/practice-workspace/Leetcode/src/com/audible/questions/input.txt";
		
		String filecontent = readFile(inputfile);
		
		String filename[] = inputfile.split("/");
		
		System.out.println(filename[filename.length - 1]);
		System.out.println(filecontent);
		
		createFile(filecontent, filename[filename.length - 1]);
	}

}
