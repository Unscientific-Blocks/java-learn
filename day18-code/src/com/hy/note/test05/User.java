package com.hy.note.test05;

import java.util.StringJoiner;

public class User implements Cloneable {
    private int id;
    private String username;
    private String password;
    private String image;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String image, int[] data) {
        this.data = data;
        this.id = id;
        this.image = image;
        this.password = password;
        this.username = username;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User id=" + id + ", username=" + username + ", password=" + password + ", image=" + image + ", data=" + arrToString(data);
    }

    public String arrToString(int[] data) {
        StringJoiner sj = new StringJoiner(",", "[" , "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

    @Override
    public User clone() throws CloneNotSupportedException {
        int[] newArr = new int[data.length];
        System.arraycopy(data, 0, newArr, 0, newArr.length);
        User user = (User) super.clone();
        user.data = newArr;
        return user;
    }
}
