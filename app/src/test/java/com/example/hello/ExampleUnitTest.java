package com.example.hello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void TestMin1() {
        assertEquals(1, MainActivity.min(1,2));
    }
    @Test
    public void TestMin2() {
        assertEquals(1, MainActivity.min(2,1));
    }
    @Test
    public void TestMin3() {
        assertEquals(-1, MainActivity.min(-1,2));
    }
    @Test
    public void TestMin4() {
        assertEquals(-2, MainActivity.min(-1,-2));
    }
    @Test
    public void TestMax1() {
        assertEquals(2, MainActivity.max(1,2));
    }
    @Test
    public void TestMax2() {
        assertEquals(2, MainActivity.max(2,1));
    }
    @Test
    public void TestMax3() {
        assertEquals(2, MainActivity.max(-1,2));
    }
    @Test
    public void TestMax4() {
        assertEquals(-1, MainActivity.max(-1,-2));
    }
}