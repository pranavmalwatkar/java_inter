package internal;
import java.io.*;
public class java9 {
	public static void main(String args[]) {
		if(args.length==0) {
			System.out.println("Please provide at least one input file.");
		}
		String OutputFileName="output.txt";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(OutputFileName)))
		{
			for(String fileName:args) {
				File file=new File(fileName);
				if(!file.exists()) {
					System.out.println("File not found:"+fileName);
					continue;
				}
				try(BufferedReader reader=new BufferedReader(new FileReader(file))){
					String line;
					while ((line=reader.readLine())!=null) {
						writer.write(line);
						writer.newLine();
					}
				}catch(IOException e) {
					System.out.println(e);
				}
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
