package NeTWORK;

import java.util.ArrayList;
import java.util.List;

public class SimpleAuthService implements AuthService {
    private static class UserData {
        private final String login;
        private final String password;
        private final String nickname;

        public UserData(String login, String password, String nickname) {
            this.login = login;
            this.password = password;
            this.nickname = nickname;
        }
    }

    private final List<UserData> users;

    public SimpleAuthService() {
        this.users = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            users.add(new UserData("login" + i, "pass" + i, "nick" + i));
            System.out.print("login" + i + "pass" + i + "nick" + i + "\n");
        }
    }

    @Override
    public String getNicknameByLoginAndPassword(String login, String password) {
        for (UserData o:users ) {
            if(o.login.equals(login) && o.password.equals(password)){
                return o.nickname;
            }
        }
        return null;
    }
}
