package com.am.bp.alf.innovations.serde;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DataConfig {

    public static Gson getGSON() {
        return new GsonBuilder().setPrettyPrinting().create();
    }

}
