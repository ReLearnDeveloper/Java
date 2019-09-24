/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestfriendsarraylist;

import java.util.Objects;

/**
 *
 * @author mtsguest
 */
public class BestFriend {
    private String firstName;
    private String lastName;
    private String nickName;
    private String cellPhone;
    private String email;

    public BestFriend(String firstName, String lastName, String nickName, String cellPhone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.cellPhone = cellPhone;
        this.email = email;
    }
    
    public BestFriend(String firstName, String lastName, String nickName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "BestFriend{" + "firstName=" + firstName + ", lastName=" + lastName + ", nickName=" + nickName + ", cellPhone=" + cellPhone + ", email=" + email + '}';
    }

   

    @Override
    public boolean equals(Object obj) {
        final BestFriend other;
        
        if (this == obj) {
            return true;
        }
        
        if (obj == null) {
            return false;
        }
       
        if (obj instanceof BestFriend)
        {
           other = (BestFriend) obj;

           if ( (this.firstName.equals(other.firstName)) &&
              (this.lastName.equals(other.lastName)) &&  
              (this.nickName.equals(other.nickName)))
                return true;
           else
                return false;
        }
        else
        {
            return false;
        }
        
      
       
    }
    
}
