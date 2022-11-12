/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;


/**
 *
 * @author concu
 */

public class ChucVu implements Serializable {

   
    private Integer MaCV;

    
    private String TenCV;

    
    

    public ChucVu() {
    }

    public ChucVu(Integer MaCV, String TenCV) {
        this.MaCV = MaCV;
        this.TenCV = TenCV;
        
    }
    
    /**
     * @return the MaCV
     */
    public Integer getMaCV() {
        return MaCV;
    }

    /**
     * @param MaCV the MaCV to set
     */
    public void setMaCV(Integer MaCV) {
        this.MaCV = MaCV;
    }

    /**
     * @return the TenCV
     */
    public String getTenCV() {
        return TenCV;
    }

    /**
     * @param TenCV the TenCV to set
     */
    public void setTenCV(String TenCV) {
        this.TenCV = TenCV;
    }

   

}
