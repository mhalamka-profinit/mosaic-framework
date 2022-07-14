package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LogType {
    REQUEST("request"),
    RESPONSE("response"),
    ;

    private final String logType;
}
