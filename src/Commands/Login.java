package Commands;

import Classes.OptionsMenu;

public class Login extends Command{
    public Login() {
        super("login");
    }

    @Override
    public void execute(String[] arguments) {
        arguments=arguments[1].split(";");
        assert arguments.length==2;
        String user = arguments[0];
        String password = arguments[1];

        for (int i = 0; i < OptionsMenu.users.size(); i++) {
            if (user.equalsIgnoreCase(OptionsMenu.users.get(i).getUserName()) && password.equalsIgnoreCase(OptionsMenu.users.get(i).getPassword())){
                OptionsMenu.loggedUsed = OptionsMenu.users.get(i);
            }
        }

    }
}
