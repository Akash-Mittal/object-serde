package com.am.bp.alf.innovations.object_serde;

import org.junit.Before;
import org.junit.Test;

import com.am.bp.alf.innovations.serde.DataConfig;
import com.am.bp.alf.innovations.serde.LogMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import uk.co.jemos.podam.api.PodamFactoryImpl;

public class AppTest {
    Gson gson;
    PodamFactoryImpl podamFactoryImpl;

    @Before
    public void setup() {
        gson = new GsonBuilder().setPrettyPrinting().create();
        podamFactoryImpl = new PodamFactoryImpl();

    }

    /**
     * 
     */
    @Test
    public void testSerialization() {
        System.err.println(DataConfig.getGSON().toJson(podamFactoryImpl.manufacturePojo(LogMessage.class)));
    }

}
