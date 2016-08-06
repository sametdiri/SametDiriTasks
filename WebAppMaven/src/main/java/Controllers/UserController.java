package Controllers;

import Models.User;
import Models.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author Sdiri
 */
@Controller
@RequestMapping("/UserControl")
public class UserController {

  // ------------------------
  // PUBLIC METHODS
  // ------------------------
  
  /**
   * /create  --> Create a new user.
   * 
   * @param address User's address
   * @param name User's name
   * @param surname User's name

   * @return if the user is succesfully created or not.
   */
  @RequestMapping("/create")
  @ResponseBody
  public String create(String address, String name, String surname) {
    User user = null;
    try {
      user = new User(address, name, surname);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Kullanıcı ekleme hatası \'" + ex.toString() + "\'";
    }
    return "Kullanıcı oluşturuldu. Kullanıcı ID = " + user.getId();
  }
  
  /**
   * /delete  --> Delete the user by id.
   * 
   * @param id The id of the user to delete
   * @return if the user is succesfully deleted or not.
   */
  @RequestMapping("/delete")
  @ResponseBody
  public String delete(long id) {
    try {
      User user = new User(id);
      userDao.delete(user);
    }
    catch (Exception ex) {
      return "Kullanıcı silme hatası: \'" + ex.toString() + "\'";
    }
    return "Kullanıcı silindi.";
  }
  
  /**
   * /get-by-address  --> Return the id for the user having the passed address.
   * 
   * @param address The address to search in the database.
   * @return The user id or a message error if the user is not found.
   */
  @RequestMapping("/get-by-address")
  @ResponseBody
  public String getByAddress(String address) {
    String userId;
    try {
      User user = userDao.findByAddress(address);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "Kullanıcı bulunamadı.";
    }
    return "Kullanıcı ID:" + userId;
  }
  
  @RequestMapping("/get-by-name")
  @ResponseBody
  public String getByName(String name) {
    String userId;
    try {
      User user = userDao.findByName(name);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "Kullanıcı bulunamadı.";
    }
    return "Kullanıcı ID:" + userId;
  }
  
  @RequestMapping("/get-by-surname")
  @ResponseBody
  public String getBySurname(String surname) {
    String userId;
    try {
      User user = userDao.findBySurname(surname);
      userId = String.valueOf(user.getId());
    }
    catch (Exception ex) {
      return "Kullanıcı bulunamadı.";
    }
    return "Kullanıcı ID:" + userId;
  }
  
  /**
   * /update  --> Update the name, surname and address by id
   * 
   * @param id The id for the user to update.
   * @param address The new address.
   * @param name The new name.
   * @param surname The new surname
   * @return if the user is succesfully updated or not.
   */
  @RequestMapping("/update")
  @ResponseBody
  public String updateUser(long id, String address, String name, String surname) {
    try {
      User user = userDao.findOne(id);
      user.setAddress(address);
      user.setName(name);
      user.setSurname(surname);
      userDao.save(user);
    }
    catch (Exception ex) {
      return "Güncelleme hatası: \'" + ex.toString() + "\'";
    }
    return "Kullancı güncellendi.";
  }
  
  @RequestMapping("/list")
  @ResponseBody
  public String getList(){
      return "<h1>Works!</h1>";
  }
  /*public Iterable<User> getUsers(){
      Iterable<User> user;
        user = userDao.findAll();
        return user;
    
  }*/

  // ------------------------
  // PRIVATE FIELDS
  // ------------------------

  @Autowired
  private UserDao userDao;
  
} // class UserController