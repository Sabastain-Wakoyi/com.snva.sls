package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    // 2 update student by id

    public  boolean find(int id){
        for (Record l : list){
            if(l.getid() == id){
                System.out.println(l);
                return true;
            }
        } return false;
    }

    //3
    //Find Record by name

    public Record findRecord(String Name){
        for (Record l : list){
            if(l.getName() == Name){
                return l;
            }
        }
        return  null;
    }

    //4 update student

    public void update(int id, Scanner input){
        if(find(id)) {
            Record rec = findRecord(id);
            System.out.println("New Student Id");
            int id = input.nextInt();

            System.out.println("Student Department");
            String Department = input.nextLine();

            System.out.println("Student Name");
            String Name = input.nextLine();

            rec.setId(id);
            rec.setDepartment(Department);
            rec.setName(Name);
            System.out.println("Record updated successfully");
        } else {
            System.out.println("Student Not Found");
        }

    }

    // 5
    //Delete
    public void delete(int recId){
        Record recordDel = null;
        for (Record ll: list){
            if(ll.getId() == recId){
                recordDel = ll;
            }
        }

        if (recordDel == null){
            System.out.println("Invalid id");
        } else {
            list.remove(recordDel);
            System.out.println("Record Removed");
        }
    }

    // 4 View all students
    public void view(){
        if(list.isEmpty()){
            System.out.println("No Student found");
        } for (Record record : list){
            System.out.println(record.toString());
        }

    }



}



