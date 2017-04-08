package files;

import java.io.*;

public class Filelist {
	public static void main(String[] args){
		File f = new File("g:/csgo");
		tree(f);
	}
	
	public static void tree(File f){
		File[] childs = f.listFiles();
		for(int i=0;i<childs.length;i++){
			System.out.println(childs[i].getName());
			if(childs[i].isDirectory()){
				tree(childs[i]);
			}
		}
	}
	
}
