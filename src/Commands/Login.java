package Commands;

import Classes.OptionsMenu;
import Classes.User;

import java.util.ArrayList;
import java.util.List;

public class Login extends Command{
    public Login() {
        super("login");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length==2;
        arguments=arguments[1].split(";");
        assert arguments.length==2;
        String user = arguments[0];
        String password = arguments[1];
        List<User> users = new ArrayList<>();
        users.addAll(OptionsMenu.administrators);
        users.addAll(OptionsMenu.players);
        boolean found = false;
        int i = 0;
        while (!found && i<users.size()){
            if (user.equalsIgnoreCase(users.get(i).getUserName()) && password.equalsIgnoreCase(users.get(i).getPassword())){
                OptionsMenu.loggedUser = users.get(i);
                found=true;
            }
            i++;
        }
    }
}