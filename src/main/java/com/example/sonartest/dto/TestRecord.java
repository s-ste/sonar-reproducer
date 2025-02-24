package com.example.sonartest.dto;

import jakarta.annotation.Nullable;

public record TestRecord(
        String foo,
        int bar,
        @Nullable String other
) {
}
