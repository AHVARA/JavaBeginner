package com.practice.restservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigValues {

    private static String getPropValues(String property) throws IOException {
        InputStream inputStream = null;
        String result = null;
        try {
            Properties prop = new Properties();
            String propFileName = "configuration.properties";

            inputStream = new FileInputStream("src/main/resources/" + propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }
            result = prop.getProperty(property);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            inputStream.close();
        }
        return result;
    }


    public static String getAwsKey() throws IOException {
        String key = getPropValues("aws_access_key");
        if(key.equals("null")) {
            throw new RuntimeException("You have not set your AWS keys in src/main/resources/config.properties. Please set them.");
        }
        return key;
    }
    public static String getAwsSecret() throws IOException {
        String key = getPropValues("aws_secret");
        if(key.equals("null")) {
            throw new RuntimeException("You have not set your AWS keys in src/main/resources/config.properties. Please set them.");
        }
        return key;
    }

    public static String getLocalFileUploadDirectory() {

        String key = null;
        try {
            key = getPropValues("picture_directory");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(key.equals("null")) {
            throw new RuntimeException("You have not set your `picture_directory` folder path in src/main/resources/config.properties. Please set it.");
        }
        return key;
    }
    }
