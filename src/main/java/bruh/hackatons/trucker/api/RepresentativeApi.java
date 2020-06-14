package bruh.hackatons.trucker.api;

import bruh.hackatons.trucker.model.Order;
import io.swagger.annotations.*;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "representative", tags = "representative", description = "the representative API")
@RequestMapping
public interface RepresentativeApi {

  Logger log = LoggerFactory.getLogger(RepresentativeApi.class);

  @ApiOperation(
      value = "Get all representative orders",
      nickname = "representativeOrderGet",
      notes = "Returns all orders from the representative",
      response = Order.class,
      responseContainer = "List",
      tags = {
        "representative",
      })
  @ApiResponses(
      value = {
        @ApiResponse(
            code = 200,
            message = "successful operation",
            response = Order.class,
            responseContainer = "List")
      })
  @RequestMapping(
      value = "/representative/order",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<List<Order>> representativeOrderGet();

  @ApiOperation(
      value = "Get order by id",
      nickname = "representativeOrderOrderIdGet",
      notes = "Returns an order from the representative",
      response = Order.class,
      tags = {
        "representative",
      })
  @ApiResponses(
      value = {
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 405, message = "Invalid order ID")
      })
  @RequestMapping(
      value = "/representative/order/{orderId}",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<Order> representativeOrderOrderIdGet(
      @ApiParam(value = "ID of order to return", required = true) @PathVariable("orderId")
          Long orderId);
}
