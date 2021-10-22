package com.ratz.mybonsaicorner.enums;

import java.util.stream.Stream;

public enum InterventionStatus {
    COMPLETED,IN_PROGRESS,NOT_DONE;

    private int codeNumber;

   InterventionStatus(int codeNumber){
        this.codeNumber = codeNumber;
    }

    InterventionStatus() {

    }

    public int getCodeNumber() {
        return codeNumber;
    }

    public static InterventionStatus of(int codeNumber) {
        return Stream.of(InterventionStatus.values())
                .filter(p -> p.getCodeNumber() == codeNumber)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
