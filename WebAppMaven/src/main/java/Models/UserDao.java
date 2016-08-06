/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author SDIRI
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {

  /**
   * Spring Data JPA kullanarak adress`e göre bulma işlemi yapar.
   */
  public User findByAddress(String address);
  
  /**
   * Spring Data JPA kullanarak name`e göre bulma işlemi yapar.
   */
  public User findByName(String name);
  
  /**
   * Spring Data JPA kullanarak surname`e göre bulma işlemi yapar.
   */
  public User findBySurname(String surname);
}