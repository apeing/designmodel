package com.example.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        //for(初始化；判断条件；执行语句)
        for( Iterator iter = namesRepository.getIterator();iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
