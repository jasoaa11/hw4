package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    

    public static char letterGrade(int score) {
        char grade;
        if (score < 0 || score > 100)
            grade = 'X';
        else if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else
            grade = 'F';
        return grade;
    }
}