package com.xsy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    private String name;
    private Integer age;

    public static void main(String[] args) {
        Emp emp = new Emp("zs",10);
        //Emp emp = new Emp(10,"zs");
        System.out.println(emp);
    }
}
