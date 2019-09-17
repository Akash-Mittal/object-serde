package com.am.bp.alf.innovations.serde;

import java.io.Serializable;

//@Getter
//@Setter
//@Builder
//@ToString
public class Message<P> implements Serializable {

    private static final long serialVersionUID = 4545422833269408050L;
    private P body;

    public P getBody() {
        return body;
    }

    public void setBody(P body) {
        this.body = body;
    }

}
