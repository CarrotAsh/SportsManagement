package Commands;

import Options.OptionsMenu;
import Classes.User;

import java.util.ArrayList;
import java.util.List;

public class Login extends Command {
    public Login() {
        super("login");
    }

    @Override
    public void execute(String[] arguments) {
        assert arguments.length == 2;
        arguments = arguments[1].split(";");
        assert arguments.length == 2; //userName;password

        List<User> users = new ArrayList<>();
        users.addAll(OptionsMenu.getAdministrators());
        users.addAll(OptionsMenu.getPlayers());

        boolean found = false;
        int i = 0;
        while (!found && i < users.size()) {
            if (arguments[0].equalsIgnoreCase(users.get(i).getUserName()) && arguments[1].equalsIgnoreCase(users.get(i).getPassword())) {
                OptionsMenu.setLoggedUser(users.get(i));
                found = true;
            }
            i++;
        }
        if (!found) {
            System.out.println("Error de login");
        }
    }
}
