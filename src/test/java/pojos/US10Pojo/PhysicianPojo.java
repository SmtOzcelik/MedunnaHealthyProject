package pojos.US10Pojo;


import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhysicianPojo {
    private String createdBy;
    private String createdDate;
    private Integer id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String phone;
    private String gender;
    private String bloodGroup;
    private String adress;
    private String description;
    private UserPojo user;
    private String speciality;
    private String country;
    private String cstate;
    private Double examFee;
    private String image;
    private String imageContentType;

    public PhysicianPojo(String createdBy, String createdDate, Integer id, String firstName, String lastName, String birthDate, String phone, String gender, String bloodGroup, String adress,  String description, UserPojo user, String speciality, String country, String cstate, Double examFee, String image, String imageContentType) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.adress = adress;
        this.description = description;
        this.user = user;
        this.speciality = speciality;
        this.country = country;
        this.cstate = cstate;
        this.examFee = examFee;
        this.image = image;
        this.imageContentType = imageContentType;
    }

  public PhysicianPojo() {
  }

  public String getCreatedBy() {
      return createdBy;
  }

  public void setCreatedBy(String createdBy) {
      this.createdBy = createdBy;
  }

  public String getCreatedDate() {
      return createdDate;
  }

  public void setCreatedDate(String createdDate) {
      this.createdDate = createdDate;
  }

  public int getId() {
      return id;
  }

  public void setId(int id) {
      this.id = id;
  }

  public String getFirstName() {
      return firstName;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public String getLastName() {
      return lastName;
  }

  public void setLastName(String lastName) {
      this.lastName = lastName;
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

  public String getGender() {
      return gender;
  }

  public void setGender(String gender) {
      this.gender = gender;
  }

  public String getBloodGroup() {
      return bloodGroup;
  }

  public void setBloodGroup(String bloodGroup) {
      this.bloodGroup = bloodGroup;
  }

  public String getAdress() {
      return adress;
  }

  public void setAdress(String adress) {
      this.adress = adress;
  }

  public String getDescription() {
      return description;
  }

  public void setDescription(String description) {
      this.description = description;
  }

  public UserPojo getUser() {
      return user;
  }

  public void setUser(UserPojo user) {
      this.user = user;
  }

  public String getSpeciality() {
      return speciality;
  }

  public void setSpeciality(String speciality) {
      this.speciality = speciality;
  }

  public String getCountry() {
      return country;
  }

  public void setCountry(String country) {
      this.country = country;
  }

  public String getCstate() {
      return cstate;
  }

  public void setCstate(String cstate) {
      this.cstate = cstate;
  }

  public double getExamFee() {
      return examFee;
  }

  public void setExamFee(double examFee) {
      this.examFee = examFee;
  }

  public String getImage() {
      return image;
  }

  public void setImage(String image) {
      this.image = image;
  }

  public String getImageContentType() {
      return imageContentType;
  }

  public void setImageContentType(String imageContentType) {
      this.imageContentType = imageContentType;
  }

  @Override
    public String toString() {
        return "PhysicianPojo{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                ", adress='" + adress + '\'' +
                ", description='" + description + '\'' +
                ", user=" + user +
                ", speciality='" + speciality + '\'' +
                ", country='" + country + '\'' +
                ", cstate='" + cstate + '\'' +
                ", examFee='" + examFee + '\'' +
                ", image='" + image + '\'' +
                ", imageContentType='" + imageContentType + '\'' +
                '}';
    }
}
