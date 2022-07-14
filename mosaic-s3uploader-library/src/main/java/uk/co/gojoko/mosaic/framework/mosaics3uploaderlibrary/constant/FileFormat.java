package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum FileFormat {
    JSON(".json"),
    CSV(".csv"),
    XML(".xml")
    ;

    private final String extension;
}
