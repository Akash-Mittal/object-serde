package com.am.bp.alf.innovations.object_serde;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.am.bp.alf.innovations.serde.LogMessage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import uk.co.jemos.podam.api.PodamFactoryImpl;

public class SerDeTest {
	Gson gson;
	PodamFactoryImpl podamFactoryImpl;

	@Before
	public void setup() {
		gson = new GsonBuilder().setPrettyPrinting().create();
		podamFactoryImpl = new PodamFactoryImpl();

	}

	@Test
	public void testGivenObjectCheckIfGetConvertedToJsonAndThenDesrializeBackToObject() {
		LogMessage logMessage = podamFactoryImpl.manufacturePojo(LogMessage.class);
		String serJson = gson.toJson(logMessage);
		assertNotNull(serJson);
		System.out.println(serJson);
		LogMessage deserLogMessageObject = gson.fromJson(serJson, LogMessage.class);
		assertNotNull(deserLogMessageObject);
		System.out.println(deserLogMessageObject);
	}

}
