/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COEN346_Pro_03;


import java.util.*;

import static java.util.zip.ZipFile.Source.release;
import static jdk.internal.access.SharedSecrets.lookup;
import static sun.security.util.SecurityProviderConstants.store;


public class VirtualMemoryUnit extends Thread{
    //attributes
    private Queue<Page> pageQueue = null;
    LinkedList list = new LinkedList();
    public VirtualMemoryUnit() {
    }

    // setter
    public void setPageQueue(Queue<Page> pageQueue) {
        this.pageQueue = pageQueue;
    }

    public void readCommands() {
        //api will read the commands
        Commands commands = null;
        int value;
        String id;
        if (commands.check()==store(id,value)) {
            recordCommands();//store(id,value)
        }

        if (commands.check() == release(id)) {
            recordCommands();//release(id)
        }

        if (commands.check() == lookup(id)) {
            recordCommands();//lookup(id)
        }

    }
    public void recordCommands() {
        LinkedList<Commands> list = new LinkedList<Commands>();


        String id = null;
        int value = 0;

        Commands commands = new Commands(id,value);
        Commands commandsid = new Commands(id);
    }
    public void printCommands(){

        LinkedList<Commands> list = new LinkedList<Commands>(Arrays.asList(1,2,3));//TODO: CHANGE IT TO COMMANDS

        System.out.println(list.get(0));//0th index

        for(Commands i : list) { 
            System.out.println(i);
        }

        Iterator<Commands> iter = list.iterator(); 
        while(iter.hasNext()){
            System.out.println(iter.next()); 
        }

    }

    public void searchCommands() {

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3)); // TODO: CHANGE IT TO COMMANDS
        System.out.println(list.contains(1)); //search if there's in in  "commands.txt" : true
        System.out.println(list.indexOf(1)); //if not,-1
    }
    

    @Override
    public void run() {
        //to do
    }
    
    
    
    
    
    
}
