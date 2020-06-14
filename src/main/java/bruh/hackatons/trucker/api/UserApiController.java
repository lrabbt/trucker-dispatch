package bruh.hackatons.trucker.api;

import bruh.hackatons.trucker.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserApiController implements UserApi {

  private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

  private final ObjectMapper objectMapper;

  @Autowired
  public UserApiController(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
  }

  public ResponseEntity<User> getUserByName(
      @ApiParam(
              value = "The name that needs to be fetched. Use user1 for testing.",
              required = true)
          @PathVariable("username")
          String username) {
    try {
      return new ResponseEntity<User>(
          objectMapper.readValue(
              "{  \"firstname\" : \"Marcolho\",  \"phone\" : \"phone\",  \"id\" : 0,  \"email\""
                  + " : \"trucker@example.com\",  \"lastname\" : \"Bartholo\"}",
              User.class),
          HttpStatus.OK);
    } catch (IOException e) {
      log.error("Couldn't serialize response for content type application/json", e);
      return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
