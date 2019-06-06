package com.trimindtech.training.day08BookRental;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.List;

public class FileUtil {
    private String filePath;

    public FileUtil(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void writeLinesToFile(List<Book> lines) {
        //create stream
        // create buffered writer
        // for each line, append to file
        for (Book book : lines) {
            try (FileWriter fileWriter = new FileWriter(this.filePath)) {
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


                String str = book.getTitle();
                bufferedWriter.write(str + "\t");
                System.out.println("a");
            } catch (Exception e) {
                System.out.println("enter the valid path");
            }

        }



    

  /*  public List<String> readLinesFromFile(){
        return null;
    }*/


    }
}
