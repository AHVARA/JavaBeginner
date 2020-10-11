package com.practice.restservice.fileUtils;

import com.practice.restservice.ConfigValues;

import java.io.File;
// to get files in folder locally
public class FileUtils {

  public static File[] getFiles() {
    String folderPath = System.getProperty("user.home") + ConfigValues.getLocalFileUploadDirectory();
    final File folder = new File(folderPath);
    return folder.listFiles();
  }

  public static void deleteFiles(File file) {
    file.delete();
  }

}
