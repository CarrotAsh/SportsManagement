package Commands;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class LoadData {

    public void execute(String[] arguments) {
        BufferedReader in = null;
        try{
            in = new BufferedReader( new FileReader(".src/main/resources/SportsManagementData.txt"));

        } catch(IOException ex) {
            System.out.println("IOException al leer: " + ex.getMessage());
        } finally {
            if( in != null){
                try{
                    in.close();
                } catch (IOException ex){
                    System.out.println("IOException al cerrar: " + ex.getMessage());
                }
            }
        }
    }

}