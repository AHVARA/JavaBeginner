package com.practice.restservice.user;

import com.practice.aws.S3Utils;
import com.practice.restservice.fileUtils.FileUtils;

import java.io.File;
import java.io.IOException;

import static com.practice.restservice.S3_Buckets.USER_PROFILE_PICS;

public class UserResource {

  public static void main(String[] args) throws IOException {
    File[] files = FileUtils.getFiles();
    uploadPictures(files);
  }


  // uploads and deletes pics, add pictures to {{USER_HOME}}/Documents/S3Pictures
  public static void uploadPictures(File[] files) throws IOException {
    for (File file : files) {
      S3Utils.uploadObject(USER_PROFILE_PICS,file);
      FileUtils.deleteFiles(file);
    }
  }
}
