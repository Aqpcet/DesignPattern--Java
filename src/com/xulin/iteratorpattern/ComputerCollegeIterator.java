package com.xulin.iteratorpattern;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    //必须知道Department的存放方式
    Department[] departments;

    //遍历的位置
    int position=0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    //判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (position>=departments.length||departments[position]==null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        Department department=departments[position];
        position+=1;

        return department;
    }

    //默认空实现
    @Override
    public void remove() {

    }
}
