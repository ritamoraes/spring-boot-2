package com.tw.example.spring.issuesdashboard.github;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tw.example.spring.issuesdashboard.utils.Type;

import java.time.OffsetDateTime;

public class RepositoryEvent {

    private final Type type;

    private final OffsetDateTime creationTime;

    private final Actor actor;

    private final Issue issue;

    @JsonCreator
    public RepositoryEvent(@JsonProperty("event") String type,
                           @JsonProperty("created_at") OffsetDateTime creationTime,
                           @JsonProperty("actor") Actor actor,
                           @JsonProperty("issue") Issue issue) {
        this.type = Type.valueFrom(type);
        this.creationTime = creationTime;
        this.actor = actor;
        this.issue = issue;
    }

    public Type getType() {
        return type;
    }

    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public Actor getActor() {
        return actor;
    }

    public Issue getIssue() {
        return issue;
    }
}
