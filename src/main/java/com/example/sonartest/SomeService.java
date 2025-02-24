package com.example.sonartest;

import com.example.sonartest.dto.TestRecord;

public class SomeService {
    public TestRecord createRecord(String id) {
        return new TestRecord(id, 0, null);
    }
}
