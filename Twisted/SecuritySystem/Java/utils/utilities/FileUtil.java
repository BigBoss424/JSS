/*
*   Created by: Aaron Jones
*   Date: 4/5/15
*   Description: This program will be used as a utility program to build the necessary functions for 
*   extracting and inputing different data types for the different file types. The main support I want to 
*   create first will be simply a text file. From there I plan on moving onto a .csv (Comma Seperated Values)
*   to allow files to be written, read , manipulated by the program itself. The end goal being common support for all
*   database values. 
*
*   Bugs: 
*
*
*   Fixes: 
* 
*
*
*/

import java.io.*;
import java.util.*;

public class FileUtil
{
      //Declare global variables
      private String path;
      private static Scanner fin = null;
      private static PrintStream fout = null;
      
      private static boolean connectInput(String filename)
      {
          try
          {
            filename = "test.txt";
            File file = new File(filename);
            fin = new Scanner(file);
            return true;
          }
          catch(FileNotFoundException e)
          {
            System.out.println("File was not found");
            if(filename != "test.txt")
            {
              System.out.println("File name is invalid");
              return false;
            } 
            else
            {
              System.out.println("Unknown error!");
              return false;
            }
            
          }
      }// end connectInput
      
      private static void disconnectInput()
      {
          String filename = "test.txt";
          connectInput(filename);
          
          fin.close();
      }
      
      private static String nextItem()
      {
            String item = null;
            
            if(fin.hasNext())
            {
              item = fin.nextLine();
            }
            else
              return null;
            return item;
      }
      
      private static void writeLine(String item)
      {
          while(fin.hasNextLine())
          {
            fout.println(item);
          }
          System.out.println(item);
      }
      
      private static int readData(String [] values)
      {
          String s = nextItem();
          int count = 0;
          while( s != null)
          {
             values[count] = s;
             count++;
             s = nextItem();
          }
          
            return count;
      }
      


}//end class
