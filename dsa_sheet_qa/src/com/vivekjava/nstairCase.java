package com.vivekjava;

public class nstairCase {

    public static void main(String[] args) {
        nstairCase.countClimb(3);
    }

    public static int countClimb(long nstairCase){
        if (nstairCase<0){
            return 0;
        }

        if (nstairCase==0){
            return 1;
        }

       int ans =  countClimb(nstairCase-1)+countClimb(nstairCase-2);
        System.out.print(ans+" ");
        return ans;

    }
}
