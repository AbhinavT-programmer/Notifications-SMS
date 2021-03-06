/*
package com.Notifictations.App;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
//import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.*;

import java.util.HashMap;
import java.util.Map;

public class SNS {

    public static void main(String[] args) {
        // Create a client
        BasicAWSCredentials creds = new BasicAWSCredentials("AKIA546RWDOOROAFPTVV", "562exoCCuHy29lLdAwwozp81i75rB8qWioJYOlAO");
        AmazonSNSClient snsClient = new AmazonSNSClient();
        //setDefaultSmsAttributes(snsClient);
        String message = "Welcome to Koboldo" +
                "Have a great day!";
        String phoneNumber = "+16508883955";
        snsClient.setRegion(Region.getRegion(Regions.US_EAST_1));


        //AmazonSNSClient snsClient = new AmazonSNSClient(creds);

        //<set SMS attributes>
        Map<String, MessageAttributeValue> smsAttributes =
                new HashMap<String, MessageAttributeValue>();
        smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue()
                .withStringValue("SenderID") //The sender ID shown on the device.
                .withDataType("String"));
        smsAttributes.put("AWS.SNS.SMS.MaxPrice", new MessageAttributeValue()
                .withStringValue("0.50") //Sets the max price to 0.50 USD.
                .withDataType("Number"));
        smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue()
                .withStringValue("Transactional") //Sets the type to promotional. Transactional
                .withDataType("String"));
        sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
    }

    public static void sendSMSMessage(AmazonSNSClient snsClient, String message,
                                      String phoneNumber, Map<String, MessageAttributeValue> smsAttributes) {
        PublishResult result = snsClient.publish(new PublishRequest()
                .withMessage(message)
                .withPhoneNumber(phoneNumber)
                .withMessageAttributes(smsAttributes));
        System.out.println(result); // Prints the message ID.
    }

    public static void setDefaultSmsAttributes(AmazonSNSClient snsClient) {
        SetSMSAttributesRequest setRequest = new SetSMSAttributesRequest()
                .addAttributesEntry("DefaultSenderID", "koboldo")
                .addAttributesEntry("MonthlySpendLimit", "1")
                .addAttributesEntry("DeliveryStatusIAMRole",
                        "arn:aws:sns:us-east-1:955533106077:KoboldoSNSTopic")
                .addAttributesEntry("DeliveryStatusSuccessSamplingRate", "100")
                .addAttributesEntry("DefaultSMSType", "Promotional")
                .addAttributesEntry("UsageReportS3Bucket", "sns-sms-daily-usage");
        snsClient.setSMSAttributes(setRequest);
        Map<String, String> myAttributes = snsClient.getSMSAttributes(new GetSMSAttributesRequest())
                .getAttributes();
        System.out.println("My SMS attributes:");
        for (String key : myAttributes.keySet()) {
            System.out.println(key + " = " + myAttributes.get(key));
        }
    }
}

*/
