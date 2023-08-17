package guru.springframework.spring6webapp.services;

import guru.springframework.spring6webapp.domain.User;
import guru.springframework.spring6webapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//defining the business logic
@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;
    //getting all user records
    public List<User> getAllUser()
    {
        List<User> users = new ArrayList<User>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    //getting a specific record
    public User getUserById(Long id)
    {
        return userRepository.findById(id).get();
    }
    public void saveOrUpdate(User user)
    {
        userRepository.save(user);
    }
    //deleting a specific record
    public void delete(Long id)
    {
        userRepository.deleteById(id);
    }
}