package com.company;
import java.util.ArrayList;
public class TodoFunction {
    ArrayList<String> todo=new ArrayList<String>();
//    To add task to todo list
    public void add(String task){
        todo.add(task);
    }
//    To remove task from the todo list
    public void remove(int index){
        String item=todo.get(index);
        todo.remove(index);
    }
//    To display the size of the todo list
    public void size(){
        System.out.println("The size of the todo list is "+ todo.size());
    }
//    To display each item in a todo list
    public void display(){
        for(int i=0;i< todo.size();i++){
            System.out.println("The "+ (i+1)+"th element is " +todo.get(i));
        }
    }
//    To update the list
    public void update(int index,String list){
        todo.set(index,list);
        System.out.println("List updated");
    }
//    To search a task is in the list
    public String search(String task){
        int index=todo.indexOf(task);
        if(index<0){
            return null;
        }else{
            return todo.get(index);
        }
    }
}
