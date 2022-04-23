package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = "";
        while (true) {
            if (!(fileName = bufferedReader.readLine()).equals("exit")) {
                ReadThread readThread = new ReadThread(fileName);
                readThread.start();
            } else
                return;
        }
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            byte[] bytes = new byte[256];
            int aByte = 0;
            try (FileInputStream fis = new FileInputStream(fileName)) {
                while (fis.available() > 0) {
                    aByte = fis.read();
                    bytes[aByte]++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            int maxCount = bytes[0];
            int maxByte = 0;
            for (int i = 1; i < bytes.length; i++) {
                if (bytes[i]>maxCount){
                    maxCount = bytes[i];
                    maxByte = i;
                }
            }
            resultMap.put(fileName, maxByte);
        }
    }
}
