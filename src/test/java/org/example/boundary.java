package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class boundary {
    @Test
    public void test_99to101() {
        Assertions.assertEquals('X', Main.letterGrade(101));
        Assertions.assertEquals('A', Main.letterGrade(100));
        Assertions.assertEquals('A', Main.letterGrade(99));
    }
    @Test
    public void test_89to91() {
        Assertions.assertEquals('A', Main.letterGrade(91));
        Assertions.assertEquals('A', Main.letterGrade(90));
        Assertions.assertEquals('B', Main.letterGrade(89));
    }
    @Test
    public void test_79to81() {
        Assertions.assertEquals('B', Main.letterGrade(81));
        Assertions.assertEquals('B', Main.letterGrade(80));
        Assertions.assertEquals('C', Main.letterGrade(79));
    }
    @Test
    public void test_69to71() {
        Assertions.assertEquals('C', Main.letterGrade(71));
        Assertions.assertEquals('C', Main.letterGrade(70));
        Assertions.assertEquals('D', Main.letterGrade(69));
    }
    @Test
    public void test_59to61() {
        Assertions.assertEquals('D', Main.letterGrade(61));
        Assertions.assertEquals('D', Main.letterGrade(60));
        Assertions.assertEquals('F', Main.letterGrade(59));
    }
    @Test
    public void test_minus1to1() {
        Assertions.assertEquals('F', Main.letterGrade(1));
        Assertions.assertEquals('F', Main.letterGrade(0));
        Assertions.assertEquals('X', Main.letterGrade(-1));
    }

}