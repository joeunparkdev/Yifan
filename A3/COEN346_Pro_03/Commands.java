package COEN346_Pro_03;

import java.util.LinkedList;

public class Commands {
    public Commands(String id, int value) {
    }
    public Commands(String id) {
    }
    public Commands(int value) {
    }

    public void check() {
        //read input file

//* a. Store (string variableId, unsigned int value):
// This instruction stores the given variable id and its value in the first unassigned spot in the memory.
//* b. Release (string variableId): This instruction removes the variable id and its value from the memory
// so the page which was holding this variable becomes available for further storage.
//* c. Lookup (string variableId): This instruction checks if the given variableId is stored in the memory
// and returns its value or -1 if it does not exist. If the Id exists in the main memory it returns its value.
// If the Id is not in the main memory but exists in disk space (i.e. page fault occurs), then it should move
// this variable into the memory and release the assigned page in the virtual memory.
// Notice that if no spot is available in the memory, program needs to swap this variable
// with the least recently accessed variable, i.e. the variable with smallest Last Access time, in the main memory.


    }
}
