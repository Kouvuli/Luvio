package com.android.Luvio1.models;

import com.google.firebase.database.Exclude;

import java.io.Serializable;
import java.time.Year;

public class UserModel implements Serializable{
    @Exclude
    private String fsId;
    private String avatar;
    private String gender;
    private String firstName;
    private String lastName;
    private String birthday;
    private String star;
    private String aboutMe;
    public UserModel() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }
    public UserModel(String avatar, String gender, String firstName, String lastName, String birthday, String fsId, String star, String aboutMe) {
        this.avatar = avatar;
        this.gender=gender;
        this.firstName=firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.fsId = fsId;
        this.star = star;
        this.aboutMe = aboutMe;
    }

    public String getAvatar() {
        return avatar;
    }
    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getFsId() {
        return fsId;
    }

    public String getStar() {
        return star;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public String getAge() {
        String bd = this.getBirthday();
        String[] dateSplit = bd.split("/");
        Integer year = Year.now().getValue() - Integer.parseInt(dateSplit[2]);
        return year.toString();
    }


}
