package uk.co.gojoko.mosaic.framework.mosaics3uploaderlibrary.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountType {
    SAVINGS_ACCOUNT("savings"),
    LOAN_ACCOUNT("loan"),
    ;

    private final String accountType;

    public static AccountType fromInteger(int x) {
        return x >= AccountType.values().length ? null : AccountType.values()[x];
    }

}
