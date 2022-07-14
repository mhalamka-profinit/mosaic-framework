package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AuditData {
    private final Long iHubId;
    private final String service;
    private final String subService;
}
