package com;
public class Puppy{
   public Puppy(String name){
      //�������������һ��������name
      System.out.println("С���������� : " + name ); 
   }
   public static void main(String []args){
      // �������佫����һ��Puppy����
      @SuppressWarnings("unused")
	Puppy Mypuppy = new Puppy( "tommy" );
   }
}