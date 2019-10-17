/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118043.latihan33.login;

/**
 *
 * @author user
 */
public class User {      
    private final String username = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword) {
        if((parUserName.equals(this.username)) && (parPassword.equals(this.password))){
            this.statusAkun = true;
        }else{
            this.statusAkun = false;
        }return this.statusAkun;
	}
    
    private void hasilLogin(boolean status, String parUserName) {
        status = this.statusAkun;                            
        if(status == true){
            System.out.println("********Hallo " + parUserName + "********"); 
        }else{
            System.out.println("Oooops, Username atau Password anda salah ");                    
	}
    }
	public void pengecekanLogin(String parUserName, String parPassword) {
            cekAkun(parUserName, parPassword);
            hasilLogin(statusAkun, parUserName);
	}

}