package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Zhishu {


    public boolean judge(int num){
        int[] nums=new int[1000];
        //1-1000
        for (int i = 0; i <1000; i++) {
            nums[i]=i+1;
        }
        for (int i :nums) {
            if (num%i==0 && i!=1 && num!=i){
                return false;
            }
        }
        return true;
    }
}
