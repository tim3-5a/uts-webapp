/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.phb.webapp.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author ulfah
 */
@Entity
public class webapp {
   
    @Id
    @Getter @Setter
    public String id;
    @Getter @Setter
    public String tgl_surat;
    @Getter @Setter
    public String judul; 
    @Getter @Setter
    public String tujuan; 
    
   
}
