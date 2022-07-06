package anton.converter.person.impl;

import anton.converter.person.Hobby;
import anton.converter.person.IGreeting;

import java.util.List;

public class IGreetingImpl implements IGreeting {
    private String firstName;
    private String secondName;
    private String lastName;
    private List<Hobby> hobby;
    private String bitBucketUrl;
    private String phone;
    private String courseExpectation;
    private String educationInfo;

    public IGreetingImpl(String firstName, String secondName, String lastName,
                         String bitBucketUrl, String phone, String courseExpectation,
                         String educationInfo, List<Hobby> hobby) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.bitBucketUrl = bitBucketUrl;
        this.phone = phone;
        this.courseExpectation = courseExpectation;
        this.educationInfo = educationInfo;
        this.hobby = hobby;
    }

    public IGreetingImpl() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBitBucketUrl(String bitBucketUrl) {
        this.bitBucketUrl = bitBucketUrl;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCourseExpectation(String courseExpectation) {
        this.courseExpectation = courseExpectation;
    }

    public void setEducationInfo(String educationInfo) {
        this.educationInfo = educationInfo;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSecondName() {
        return secondName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public List<Hobby> getHobbies() {
        return null;
    }

    @Override
    public String getBitBucketUrl() {
        return bitBucketUrl;
    }

    @Override
    public String getPhone() {
        return phone;
    }

    @Override
    public String getCourseExpectation() {
        return courseExpectation;
    }

    @Override
    public String getEducationInfo() {
        return educationInfo;
    }

    @Override
    public String toString() {
        return  "IGreetingImpl {" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hobby=" + hobby +
                ", bitBucketUrl='" + bitBucketUrl + '\'' +
                ", phone='" + phone + '\'' +
                ", courseExpectation='" + courseExpectation + '\'' +
                ", educationInfo='" + educationInfo + '\'' +
                '}';
    }
}