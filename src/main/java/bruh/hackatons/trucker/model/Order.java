package bruh.hackatons.trucker.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import java.time.Instant;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Order
 */
@Validated
public class Order   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("representativeId")
  private Long representativeId = null;

  @JsonProperty("truckerId")
  private Long truckerId = null;

  @JsonProperty("creationDate")
  private Instant creationDate = null;

  @JsonProperty("shipDate")
  private Instant shipDate = null;

  @JsonProperty("deliveryPoint")
  private OrderDeliveryPoint deliveryPoint = null;

  /**
   * Order Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    WAITING("waiting"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Order id(Long id) {
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

  public Order representativeId(Long representativeId) {
    this.representativeId = representativeId;
    return this;
  }

  /**
   * Get representativeId
   * @return representativeId
  **/
  @ApiModelProperty
  public Long getRepresentativeId() {
    return representativeId;
  }

  public void setRepresentativeId(Long representativeId) {
    this.representativeId = representativeId;
  }

  public Order truckerId(Long truckerId) {
    this.truckerId = truckerId;
    return this;
  }

  /**
   * Get truckerId
   * @return truckerId
  **/
  @ApiModelProperty
  public Long getTruckerId() {
    return truckerId;
  }

  public void setTruckerId(Long truckerId) {
    this.truckerId = truckerId;
  }

  public Order creationDate(Instant creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty
  @Valid
  public Instant getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Instant creationDate) {
    this.creationDate = creationDate;
  }

  public Order shipDate(Instant shipDate) {
    this.shipDate = shipDate;
    return this;
  }

  /**
   * Get shipDate
   * @return shipDate
  **/
  @ApiModelProperty

  @Valid

  public Instant getShipDate() {
    return shipDate;
  }

  public void setShipDate(Instant shipDate) {
    this.shipDate = shipDate;
  }

  public Order deliveryPoint(OrderDeliveryPoint deliveryPoint) {
    this.deliveryPoint = deliveryPoint;
    return this;
  }

  /**
   * Get deliveryPoint
   * @return deliveryPoint
  **/
  @ApiModelProperty

  @Valid

  public OrderDeliveryPoint getDeliveryPoint() {
    return deliveryPoint;
  }

  public void setDeliveryPoint(OrderDeliveryPoint deliveryPoint) {
    this.deliveryPoint = deliveryPoint;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Order Status
   * @return status
  **/
  @ApiModelProperty(value = "Order Status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.representativeId, order.representativeId) &&
        Objects.equals(this.truckerId, order.truckerId) &&
        Objects.equals(this.creationDate, order.creationDate) &&
        Objects.equals(this.shipDate, order.shipDate) &&
        Objects.equals(this.deliveryPoint, order.deliveryPoint) &&
        Objects.equals(this.status, order.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, representativeId, truckerId, creationDate, shipDate, deliveryPoint, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    representativeId: ").append(toIndentedString(representativeId)).append("\n");
    sb.append("    truckerId: ").append(toIndentedString(truckerId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    deliveryPoint: ").append(toIndentedString(deliveryPoint)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

