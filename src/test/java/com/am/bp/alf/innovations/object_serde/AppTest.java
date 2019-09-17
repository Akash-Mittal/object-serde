package com.am.bp.alf.innovations.object_serde;

import org.junit.Before;
import org.junit.Test;

import com.am.bp.alf.innovations.serde.LogMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import junit.framework.Assert;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class AppTest {
    Gson gson;
    PodamFactoryImpl podamFactoryImpl;

    @Before
    public void setup() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        podamFactoryImpl = new PodamFactoryImpl();

    }

    @Test
    public void testSerialization() {
        LogMessage logMessage = podamFactoryImpl.manufacturePojo(LogMessage.class);
        String serJson = gson.toJson(logMessage);
        Assert.assertNotNull(serJson);
        System.out.println(serJson);
        LogMessage deserLogMessageObject = gson.fromJson(serJson, LogMessage.class);
        Assert.assertNotNull(deserLogMessageObject);
        Assert.assertEquals(logMessage.getBody().getDescription(), deserLogMessageObject.getBody().getDescription());
        System.out.println(deserLogMessageObject);
    }

}
