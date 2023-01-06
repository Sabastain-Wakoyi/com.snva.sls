package utils;

import java.util.ArrayList;
import java.util.List;

public class ReadInfos {

    ArrayList<Record> list;

    //the default constructor

    public ReadInfos(){
        list = new ArrayList<>();
    }

    // 1 Add Student
    public void add(Record record){
        if(!find(record.getid())){
            list.add(record);
        }else{
            System.out.println("Student exist already");

        }
    }


    // 2 View all students
    public void view(){
        if(list.isEmpty()){
            System.out.println("No Student found");
        } for (Record record : list){
            System.out.println(record.toString());
        }

    }



}



