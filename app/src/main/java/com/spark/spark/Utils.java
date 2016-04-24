package com.spark.spark;

/**
 * Created by christianvazquez on 4/24/16.
 */
public class Utils {
    private Utils(){};
    public static int getIndexFromLabel(String label, String[] options) {
        int i = 0;
        for(String option: options){
            if(option.equals(label)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
