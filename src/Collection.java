import java.util.*;
import java.io.*;

public class Collection{
	
   public static void main(String args[]) throws IOException{
      
	   BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
      System.out.println("How many elements you want to add to the array: ");
      
      int n = Integer.parseInt(in.readLine());
      String[] name = new String[n];
      
      for(int i = 0; i < n; i++){
         name[i] = in.readLine();
      }
      
      List<String> list = Arrays.asList(name); 
      System.out.println();
      for(String li: list){
         String str = li;
         System.out.print(str + " ");
      }
      
      
      // compare two file path
      File file1 = new File("C:/File/demo1.txt");
      File file2 = new File("C:/java/demo1.txt");
      if(file1.compareTo(file2) == 0) {
         System.out.println("Both paths are same!");
      } else {
         System.out.println("Paths are not same!");
      }
      
      // create new file
      try{
          File file = new File("C:/myfile.txt");
          if(file.createNewFile())
          System.out.println("Success!");
          else
          System.out.println("Error, file already exists.");
      }
      catch(IOException ioe) {
         ioe.printStackTrace();
      }
      
      // Last Modification date of a file 
      File file11 = new File("Main.java");
      Long lastModified = file11.lastModified();
      Date date = new Date(lastModified);
      System.out.println(date);
      
      // Check the file if exits
      File file21 = new File("C:/java.txt");
      System.out.println(file21.exists());
      
      
   }
}
