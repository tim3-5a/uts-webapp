/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.phb.webapp.repo;
import lab.phb.webapp.entity.webapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ulfah
 */
@Repository
public interface webappRepo 
    extends JpaRepository<webapp, String>{    

}
