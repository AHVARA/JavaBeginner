package com.practice.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.*;
import com.practice.restservice.ConfigValues;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class DynamoDbUtils {

  private static AmazonDynamoDB ddbClient;

  public DynamoDbUtils() {}

  public static void main(String[] args) throws IOException {

    scanTable("users");
  }

  private static void scanTable(String tableName) {
    ScanRequest scanRequest = new ScanRequest().withTableName(tableName);
    ScanResult result = getClient().scan(scanRequest);
    for (Map<String, AttributeValue> item : result.getItems()) {
      System.out.println(item);
    }
  }

  private static void listTables() {
    ListTablesResult listTablesResult = getClient().listTables();
    List<String> stringList = listTablesResult.getTableNames();
  }

  private static AmazonDynamoDB getClient() {
    if (ddbClient != null) {
      return ddbClient;
    } else {
      AWSCredentials credentials = null;
      try {
        credentials = new BasicAWSCredentials(ConfigValues.getAwsKey(), ConfigValues.getAwsSecret());
      } catch (IOException e) {
        e.printStackTrace();
      }
      ddbClient =
          AmazonDynamoDBClientBuilder.standard()
              .withCredentials(new AWSStaticCredentialsProvider(credentials))
              .withRegion(Regions.EU_WEST_1)
              .build();
      return ddbClient;
    }
  }
}
