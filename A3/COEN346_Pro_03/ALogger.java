package COEN346_Pro_03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//output file:
//Clock: 1000, Process 2: Started.
//        Clock: 1010, Process 2, Store: Variable 1, Value: 5
//        Clock: 1730, Process 2, Store: Variable 2, Value: 3
//        Clock: 2000, Process 1: Started.
//        Clock: 2010, Process 1, Store: Variable 3, Value: 7
//        Clock: 3000, Process 2: Finished.
//        Clock: 3020, Memory Manager, SWAP: Variable 3 with Variable 1
//        Clock: 3030, Process 1, Lookup: Variable 3, Value: 7
//        Clock: 3100, Process 1, Lookup: Variable 2, Value: 3
//        Clock: 3800, Process 1, Release: Variable 1
//        Clock: 4000, Process 3: Started
//        Clock: 4200, Process 3, Store: Variable 1, Value 8
//        Clock: 4400, Memory Manager, SWAP: Variable 1 with Variable 3
//        Clock: 4410, Process 1, Lookup: Variable 1, Value 8
//        Clock: 5000, Process 1: Finished.
//        Clock: 7000, Process 3: Finished.

public class ALogger {

        BufferedWriter writer;
        Logger logger;

        ALogger () throws IOException {

            this.writer = new BufferedWriter(new FileWriter("output.txt"));


            this.logger = Logger.getLogger("MyLog");
            FileHandler fh;

            try {
                // This block configure the logger with handler and formatter
                fh = new FileHandler("output.txt");
                logger.addHandler(fh);
                SimpleFormatter formatter = new SimpleFormatter();
                fh.setFormatter(formatter);
            }catch (SecurityException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void info(String s) {
            try {
                System.out.println(s);
                this.writer.write(s + "\n");
            } catch (IOException e) {
            }
        }

        public void close() {
            try {
                this.writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

