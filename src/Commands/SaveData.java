package Commands;

import java.io.IOException;
import java.io.PrintWriter;

public class SaveData {

    public void execute(String[] arguments) {
        PrintWriter out = null;
        try{
            out = new PrintWriter(".src/main/resources/SportsManagementData.txt");

        } catch(IOException ex) {
            System.out.println("IOException al escribir: " + ex.getMessage());
        } finally {
            if (out != null){
                out.close();
            }
        }
    }

}
