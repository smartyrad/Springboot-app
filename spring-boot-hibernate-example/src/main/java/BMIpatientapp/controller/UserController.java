package BMIpatientapp.controller;

import java.util.List;

import BMIpatientapp.model.UserDetails;
import BMIpatientapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;


import static org.springframework.web.bind.annotation.RequestMethod.GET;



@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value = "/smarita", method = RequestMethod.GET)
    public ResponseEntity<List<UserDetails>> userDetails() {

        List<UserDetails> userDetails = userService.getUserDetails();
        return new ResponseEntity<List<UserDetails>>(userDetails, HttpStatus.OK);
    }

    @RequestMapping(value = "/insertdata", method = GET)
    public ResponseEntity<List<UserDetails>> userDetail(@RequestParam("id") int id,
                                                        @RequestParam("name") String name,
                                                        @RequestParam("height") double height,
                                                        @RequestParam("weight") double weight){
        List<UserDetails> userDetails = userService.setUserDetails(id, name, height, weight);
        return new ResponseEntity<List<UserDetails>>(userDetails, HttpStatus.OK);
    }

}
