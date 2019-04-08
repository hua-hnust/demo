package com.hnust.hua.file;

import java.io.*;

/**
 * Created by Administrator on 2019/3/11.
 */
public class FileOperation {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperation();
        fileOperation.readFile();
        fileOperation.writeFile();
        fileOperation.appendToFile();
    }


    private void readFile(){
        String fileName =  this.getClass().getResource("").getPath();
        try(FileReader reader = new FileReader(fileName+"test1.txt")){
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void writeFile(){
        String fileName =  this.getClass().getResource("").getPath();
        File writeName = new File(fileName + "test2.txt");
        try {
            writeName.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try(FileWriter writer = new FileWriter(fileName + "test2.txt");
            BufferedWriter out = new BufferedWriter(writer);){
            out.write("写入信信！！！\r\n");
            out.write("写入信息！！！\r\n");
            out.flush();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void appendToFile(){
        int[] array = new int[]{1,2};

        String fileName =  this.getClass().getResource("").getPath();
        BufferedWriter out = null;
        try{
            out = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(fileName + "test1.txt",true)));
            out.write("追加内容\r\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}