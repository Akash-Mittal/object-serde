package com.am.bp.alf.innovations.serde;

import java.util.Map;

public class LogMessage extends Message<Log> {

    LogMessage(Map<String, String> headers, Log body) {
        super(headers, body);
    }

    private static final long serialVersionUID = 2804120722928102031L;

}
