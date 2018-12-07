package File;

import java.io.*;
import java.util.ArrayList;

//Lớp xử lí những gì liên quan đến file.
public class FileTxt {
	//Ghi vào file
	public static void WriteFile(String s,String k){
		try{
			FileWriter writer=new FileWriter(s);
			writer.write(k);
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	//Đọc file và ghi vào array list
	public static void ReadFile(String s, ArrayList<String> list){
		try{
			File file=new File(s);
			FileReader read=new FileReader(file);
			BufferedReader reader=new BufferedReader(read);
			String line=null;
			while((line=reader.readLine())!=null){
				list.add(line);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	//Ghi dữ liệu từ array list vào file
	public static void WriteIntoFile(String s,ArrayList<String> list){
		String k=new String("");
		for(int i=0;i<list.size();i++){
			k+=list.get(i)+"\n";
		}
		WriteFile(s,k);
	}
}

