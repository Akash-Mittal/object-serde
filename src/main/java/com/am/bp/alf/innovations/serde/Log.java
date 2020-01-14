package com.am.bp.alf.innovations.serde;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Log {

    private EventType type;
    private LocalDate date;
    private String description;

}
