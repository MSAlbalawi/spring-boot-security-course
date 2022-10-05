package com.example.demo.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.example.demo.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {

    // the student permission will be empty because there is no permission for it
    // we cannot keep pram empty, so we using google guava Set
    STUDENT(Sets.newHashSet()),

    // the admin will take the four permissions
    ADMIN(Sets.newHashSet(STUDENT_READ,STUDENT_WRITE,COURSE_READ,COURSE_WRITE)),

    ADMINTRAINEE(Sets.newHashSet(COURSE_READ,STUDENT_READ));
    // we are using Set collection from guava
    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
