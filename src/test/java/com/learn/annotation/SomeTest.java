package com.learn.annotation;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class SomeTest {
    String testString = "testString";

    @Test
    public void testSomeClassAnnotation() {
        Some some = new Some();
        Comment comment = some.getClass().getAnnotation(Comment.class);
        assertTrue("Some".equals(comment.value()));
    }

}