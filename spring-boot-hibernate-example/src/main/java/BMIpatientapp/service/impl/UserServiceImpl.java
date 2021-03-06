/**
 *
 */
package BMIpatientapp.service.impl;

import java.util.List;

import BMIpatientapp.model.UserDetails;
import BMIpatientapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import BMIpatientapp.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<UserDetails> getUserDetails() {
        return userDao.getUserDetails();

    }
    public List<UserDetails> setUserDetails(int id, String name, double height, double weight) {
        return userDao.setUserDetails( id,  name,  height,  weight);

    }

}
