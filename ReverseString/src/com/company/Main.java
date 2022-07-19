package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter word to be reversed:");

        Scanner read=new Scanner(System.in);
        String str=read.nextLine();
        String reverse="";

        for (int i=str.length()-1;i>=0;i--)
        {
            reverse = new SingBuilder().append(reverse).append(str.charAt(i)).toString();
        }
            System.out.println("Reversed string is:");
            System.out.println(reverse);

        }

    }

