package com.rubens.modelo;

public class Usuario {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String senha) {
        this.password = senha;
    }

    public boolean equals(String login, String senha) {
        if (!this.login.equals(login)) {
            return false;
        }

        return this.password.equals(senha);
    }
}
