package com.practice.aws;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.practice.restservice.ConfigValues;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class S3Utils {
    public static void main(String[] args) throws IOException {
        // Enter file path
        listObjects("anj-pee-bucket");
    }
    public static void listObjects(String bucketName) throws IOException {
        ObjectListing objectListing = getClient().listObjects(bucketName);
        for (S3ObjectSummary os : objectListing.getObjectSummaries()) {
            os.getKey();
            System.out.println(os.getKey());
        }
    }
    public static void uploadObject(String bucket, File file) throws IOException {
        getClient()
                .putObject(
                        bucket,
                        Date.from(Instant.now()).toString().replaceAll("\\s+", "") + "_" + file.getName(),
                        file);
    }
    private static AmazonS3 getClient() throws IOException {
        AWSCredentials credentials =
                new BasicAWSCredentials(ConfigValues.getAwsKey(), ConfigValues.getAwsSecret());
        AmazonS3 s3client =
                AmazonS3ClientBuilder.standard()
                        .withCredentials(new AWSStaticCredentialsProvider(credentials))
                        .withRegion(Regions.EU_WEST_1)
                        .build();
        return s3client;
    }
}
