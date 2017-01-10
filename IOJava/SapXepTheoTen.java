/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuesday;

import java.util.Comparator;

/**
 *
 * @author iviettech
 */
public class SapXepTheoTen implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String name1=((SinhVien)o1).getName();
        String name2=((SinhVien)o2).getName();
        return name1.compareTo(name2); 
    }
    
}
