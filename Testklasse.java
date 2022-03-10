package com.company;


public class Testklasse {

  public static void main(String[] args) {

  Sadstudents et = new Sadstudents();
  Sadstudents to = new Sadstudents();
  Sadstudents tre = new Sadstudents();
  Sadstudents fire = new Sadstudents();


  et.Name = "Anders";
  et.looklikeazombie();

  to.Name = "Anders";
  to.Dancelikecrazy();

  tre.Name = "Anders";
  tre.shoulikeCrazy();

  fire.Name ="Anders";
  fire.ignoreTeacherInspirationalMoves();

  System.out.println(et);
  System.out.println(to);
  System.out.println(tre);
  System.out.println(fire);



  }
}

