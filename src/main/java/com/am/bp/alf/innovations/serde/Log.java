package com.am.bp.alf.innovations.serde;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString

public class Log {

    private EventType type;
    private LocalDate date;
    private String description;

}
