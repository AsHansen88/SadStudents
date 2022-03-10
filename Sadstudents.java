package com.company;

import java.util.Arrays;

public class Sadstudents {

  String Name;
  int LevelOfEngagement;
  int Grades [] = {-3, 00, 02, 4, 7, 10, 12};
  int ExpectedExamGrade;


    public int Dancelikecrazy(){
      int point = 10;
      int karakter = 1;

     LevelOfEngagement = point;
     ExpectedExamGrade = karakter;

     ExpectedExamGrade = Grades[1 + karakter];

     return ExpectedExamGrade;

    }

    public int shoulikeCrazy() {
      int point = 10;
      int karakter = 1;

      LevelOfEngagement = point;
      ExpectedExamGrade = karakter;

      ExpectedExamGrade = Grades[1 + karakter];

      return ExpectedExamGrade;

    }
      public int looklikeazombie(){
        int pointminus = -10;
        int karakterminus = -1;

        LevelOfEngagement = pointminus;
        ExpectedExamGrade = karakterminus;

        ExpectedExamGrade = Grades[1 + karakterminus];

        return ExpectedExamGrade;

    }

      public int ignoreTeacherInspirationalMoves() {

        int pointminus = -10;
        int karakterminus = -1;

        LevelOfEngagement = pointminus;
        ExpectedExamGrade = karakterminus;

        ExpectedExamGrade = Grades[1 + karakterminus];

        return ExpectedExamGrade;

      }

  @Override
  public String toString() {
    return "Sadstudents{" +
        "Name='" + Name + '\'' +
        ", LevelOfEngagement=" + LevelOfEngagement +
        ", Grades=" + Arrays.toString(Grades) +
        ", ExpectedExamGrade=" + ExpectedExamGrade +
        '}';
  }
}
