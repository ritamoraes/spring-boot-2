package com.tw.example.spring.issuesdashboard.utils;

import java.util.Arrays;

public enum Type {

    CLOSED("closed"),
    REOPENED("reopened"),
    SUBSCRIBED("subscribed"),
    UNSUBSCRIBED("unsubscribed"),
    MERGED("merged"),
    REFERENCED("referenced"),
    MENTIONED("mentioned"),
    ASSIGNED("assigned"),
    UNASSIGNED("unassigned"),
    MILESTONED("milestoned"),
    DEMILESTONED("demilestoned"),
    RENAMED("renamed"),
    LOCKED("locked"),
    UNLOCKED("unlocked"),
    HEAD_REF_DELETED("head_ref_deleted"),
    HEAD_RED_RESTORED("head_red_restored"),
    CONVERTED_NOTE_TO_ISSUE("converted_note_to_issue"),
    MOVED_COLUMNS_IN_PROJECT("moved_columns_in_project"),
    COMMENT_DELETED("comment_deleted"),
    REVIEW_REQUESTED("review_resquested"),
    UNLABELED("unlabeled"),
    LABELED("labeled");

    private String type;

    Type(String type) {
        this.type = type;
    }

    public static Type valueFrom(String type){

        for (Type value:values())
        {
            if(type.equals(value.type)){
                return value;
            }
        }
        throw new IllegalArgumentException(
          "'"+type+"' is a not valid  event type"
        );
    }
}
