package bruh.hackatons.trucker.api;

import bruh.hackatons.trucker.model.User;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(value = "user", tags = "user", description = "the user API")
@RequestMapping
public interface UserApi {

  Logger log = LoggerFactory.getLogger(UserApi.class);

  @ApiOperation(
      value = "Get user by user name",
      nickname = "getUserByName",
      notes = "",
      response = User.class,
      tags = {
        "user",
      })
  @ApiResponses(
      value = {
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "invalid username supplied"),
        @ApiResponse(code = 404, message = "User not found")
      })
  @RequestMapping(
      value = "/user/{username}",
      produces = {"application/json"},
      method = RequestMethod.GET)
  ResponseEntity<User> getUserByName(
      @ApiParam(
              value = "The name that needs to be fetched. Use user1 for testing.",
              required = true)
          @PathVariable("username")
          String username);
}
