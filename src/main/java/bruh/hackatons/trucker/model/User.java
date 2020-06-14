package bruh.hackatons.trucker.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
public class User   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("firstname")
  private String firstname = null;

  @JsonProperty("lastname")
  private String lastname = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  public User id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public User firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
  **/
  @ApiModelProperty(example = "Marcolho")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public User lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  **/
  @ApiModelProperty(example = "Bartholo")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "trucker@example.com", required = true)
  @NotNull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.firstname, user.firstname) &&
        Objects.equals(this.lastname, user.lastname) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.phone, user.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstname, lastname, email, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

