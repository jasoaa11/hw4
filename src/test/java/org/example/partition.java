package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class partition {
    @Test
    public void testGradeA() {
        Assertions.assertEquals('A', Main.letterGrade(96));
    }

    @Test
    public void testGradeB() {
        Assertions.assertEquals('B', Main.letterGrade(83));
    }

    @Test
    public void testGradeC() {
        Assertions.assertEquals('C', Main.letterGrade(76));
    }

    @Test
    public void testGradeD() {
        Assertions.assertEquals('D', Main.letterGrade(61));
    }

    @Test
    public void testGradeF() {
        Assertions.assertEquals('F', Main.letterGrade(35));
    }

    @Test
    public void testGradeX() {
        Assertions.assertEquals('X', Main.letterGrade(200));
        Assertions.assertEquals('X', Main.letterGrade(-1));
    }

}
