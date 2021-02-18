/*
package com.Notifictations.Controller;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;


public class CreateTopic {

    public static void main(String[] args) {
        AmazonSNSClient snsClient = new AmazonSNSClient();
        String topicArn = createSNSTopic(snsClient);
    }

    public static String createSNSTopic(AmazonSNSClient snsClient) {
        CreateTopicRequest createTopic = new CreateTopicRequest("KoboldoSNSTopic");
        CreateTopicResult result = snsClient.createTopic(createTopic);
        System.out.println("Create topic request: " +
                snsClient.getCachedResponseMetadata(createTopic));
        System.out.println("Create topic result: " + result);
        return result.getTopicArn();
    }
}
*/
