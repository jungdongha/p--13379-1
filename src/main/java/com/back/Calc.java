package com.back;

public class Calc {
    public static int run(String s) {



        String[] part = s.split(" ");
        //처음값
        int answer = Integer.parseInt(part[0]);

        //i는 1 3
        for(int i =1;i<part.length;i+=2) {
            String op = part[i];
            int nextNum = Integer.parseInt(part[i+1]);

            if(op.equals("+")) {
                answer += nextNum;
            }else if(op.equals("-")) {
                answer -= nextNum;
            }else if(op.equals("*")) {
                answer *= nextNum;
            }
            //곱하기의 우선순위를 올려야한다.
        }

        return answer;
    }
}
