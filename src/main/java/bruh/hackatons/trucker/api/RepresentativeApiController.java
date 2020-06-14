package bruh.hackatons.trucker.api;

import bruh.hackatons.trucker.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class RepresentativeApiController implements RepresentativeApi {

  private static final Logger log = LoggerFactory.getLogger(RepresentativeApiController.class);

  private final ObjectMapper objectMapper;

  @Autowired
  public RepresentativeApiController(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  public ResponseEntity<List<Order>> representativeOrderGet() {
    try {
      return new ResponseEntity<List<Order>>(
          objectMapper.readValue(
              "[ {  \"deliveryPoint\" : {    \"latitude\" : 5.962134,    \"longitude\" :"
                  + " 5.637377  },  \"truckerId\" : 1,  \"representativeId\" : 6,  \"id\" : 0, "
                  + " \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"shipDate\" :"
                  + " \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"placed\"}, { "
                  + " \"deliveryPoint\" : {    \"latitude\" : 5.962134,    \"longitude\" :"
                  + " 5.637377  },  \"truckerId\" : 1,  \"representativeId\" : 6,  \"id\" : 0, "
                  + " \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"shipDate\" :"
                  + " \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"placed\"} ]",
              List.class),
          HttpStatus.OK);
    } catch (IOException e) {
      log.error("Couldn't serialize response for content type application/json", e);
      return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  public ResponseEntity<Order> representativeOrderOrderIdGet(
      @ApiParam(value = "ID of order to return", required = true) @PathVariable("orderId")
          Long orderId) {
    try {
      return new ResponseEntity<Order>(
          objectMapper.readValue(
              "{  \"deliveryPoint\" : {    \"latitude\" : 5.962134,    \"longitude\" : 5.637377 "
                  + " },  \"truckerId\" : 1,  \"representativeId\" : 6,  \"id\" : 0, "
                  + " \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"shipDate\" :"
                  + " \"2000-01-23T04:56:07.000+00:00\",  \"status\" : \"placed\"}",
              Order.class),
          HttpStatus.OK);
    } catch (IOException e) {
      log.error("Couldn't serialize response for content type application/json", e);
      return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
