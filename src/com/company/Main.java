package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*int value=2;
        if(value==1) {
            System.out.println("Value was1");
        }else if(value==2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Was not 1 or 2");
        }
        int switchValue=6;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a "+switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                 break;
        }*/
        char newChar='E';
        switch (newChar){
            case 'A':
                System.out.println("This is A");
                break;
            case 'B':
                System.out.println("This is B");
                break;
            case 'C':
                System.out.println("This is C");
                break;
            case 'D':
                System.out.println("This is D");
                break;
            case 'E': case'F': case'G':
                System.out.println(newChar +" was found");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
