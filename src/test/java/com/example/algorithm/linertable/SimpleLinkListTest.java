package com.example.algorithm.linertable;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.test.context.SmartContextLoader;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Bobo
 * @Date 2023/6/25
 */
class SimpleLinkListTest {
    static SimpleLinkList simpleLinkList;

    @BeforeAll
    static void setUp() {
        simpleLinkList = new SimpleLinkList();
    }

    @Test
    void insertNormal() {
        boolean isInsert = simpleLinkList.insert(1);
        assertEquals(true, isInsert);
    }

    @Test
    void traverse() {
//        simpleLinkList.traverse();
        System.out.println(simpleLinkList);
    }
}