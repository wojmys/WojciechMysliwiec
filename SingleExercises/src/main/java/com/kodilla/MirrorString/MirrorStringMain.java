package com.kodilla.MirrorString;

public class MirrorStringMain {
    public static void main(String[] args) {
        MirrorStringMain mirror = new MirrorStringMain();



        mirror.makeMirrorString("Adam");
    }
     public String makeMirrorString(String stringWord){

        String word = stringWord.substring(0,stringWord.length());
        String result="";
        for (int i=word.length()-1; i>=0;i--){
           result=result+word.charAt(i);
        }


        System.out.println(result);
        return result;
    }


}
