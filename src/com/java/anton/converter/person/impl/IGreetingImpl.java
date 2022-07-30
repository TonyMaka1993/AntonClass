package anton.converter.person.impl;

import anton.converter.person.Hobby;
import anton.converter.person.IGreeting;

import java.util.List;

public class IGreetingImpl implements IGreeting {
    private final String firstName;
    private final String secondName;
    private final String lastName;
    private final List<Hobby> hobby;
    private final String bitBucketUrl;
    private final String phone;
    private final String courseExpectation;
    private final String educationInfo;

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