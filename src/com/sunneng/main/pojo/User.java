package com.sunneng.main.pojo;

public class User {
    private String  id; // id
    private String  userName; // 用户名
    private String  userNickName; // 昵称
    private Integer age; // 年龄
    private String  sex; // 性别
    private String  education; // 学历
    private String  userTypeId; // userType的关联id


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(String userTypeId) {
        this.userTypeId = userTypeId;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userNickName='" + userNickName + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", userTypeId='" + userTypeId + '\'' +
                '}';
    }
}
