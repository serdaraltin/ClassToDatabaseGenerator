package Model;

public class Model_User {

    private int Id;
    private String userName;
    private String password;
    private String passwordHash;

    private String tcNo;
    private String name, surName;
    private String city;
    private int cityCode;
    private String birthDate;
    private String phone;
    private String email;

    private String lastPasswordChange;
    private String lastLoginDate;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastPasswordChange() {
        return lastPasswordChange;
    }

    public void setLastPasswordChange(String lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Model_User() {
    }

    public Model_User(int Id, String userName, String password, String passwordHash, String tcNo, String name, String surName, String city, int cityCode, String birthDate, String phone, String email, String lastPasswordChange, String lastLoginDate) {
        this.Id = Id;
        this.userName = userName;
        this.password = password;
        this.passwordHash = passwordHash;
        this.tcNo = tcNo;
        this.name = name;
        this.surName = surName;
        this.city = city;
        this.cityCode = cityCode;
        this.birthDate = birthDate;
        this.phone = phone;
        this.email = email;
        this.lastPasswordChange = lastPasswordChange;
        this.lastLoginDate = lastLoginDate;
    }

    @Override
    public String toString() {
        return "Model_User{" + "Id=" + Id + ", userName=" + userName + ", password=" + password + ", passwordHash=" + passwordHash + ", tcNo=" + tcNo + ", name=" + name + ", surName=" + surName + ", city=" + city + ", cityCode=" + cityCode + ", birthDate=" + birthDate + ", phone=" + phone + ", email=" + email + ", lastPasswordChange=" + lastPasswordChange + ", lastLoginDate=" + lastLoginDate + '}';
    }

                            

}
