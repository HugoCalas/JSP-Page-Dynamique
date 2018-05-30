package fr.wildcodeschool.githubtracker.model;

public class GithuberModel {
    String name;
    String email;
    String login;
    String avatarURL;
    int id;

    public GithuberModel(String name, String email, String login, String avatarURL, int id) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.avatarURL = avatarURL;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
