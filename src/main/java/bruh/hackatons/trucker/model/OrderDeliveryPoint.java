package bruh.hackatons.trucker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.springframework.validation.annotation.Validated;

/** OrderDeliveryPoint */
@Validated
public class OrderDeliveryPoint {
  @JsonProperty("latitude")
  private Float latitude = null;

  @JsonProperty("longitude")
  private Float longitude = null;

  public OrderDeliveryPoint latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * Get latitude
   *
   * @return latitude
   */
  @ApiModelProperty
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public OrderDeliveryPoint longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   *
   * @return longitude
   */
  @ApiModelProperty
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDeliveryPoint orderDeliveryPoint = (OrderDeliveryPoint) o;
    return Objects.equals(this.latitude, orderDeliveryPoint.latitude)
        && Objects.equals(this.longitude, orderDeliveryPoint.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDeliveryPoint {\n");

    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
