package test.main;

import java.io.IOException;
import java.util.List;
import complexity.Turing;
import complexity.Turing.TuringException;
import complexity.Utils;

public class Main {
    public static void main(String[] args) throws Exception {
        String fileName = "src//complexity//add";
        Turing machine;
        List<Turing.Output> outputs;

        try {
            machine = new Turing(fileName);
            outputs = machine.run(true);
            System.out.println(outputs);

            if (!outputs.isEmpty()) {
                  String specificOutput = String.valueOf(outputs.getFirst());
                  System.out.println("Final Output is: " + specificOutput);
            }

            //System.out.println("The turing machine has " + machine.getTapesNumber() + " tapes");
            System.out.println("Time Complexity: " + machine.getStepCount());
            //System.out.println("Space Complexity: " + machine.getTotalWrittenCells());
        } catch(IOException | TuringException e) {
            System.out.println(e);
        }
    }
}