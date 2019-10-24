
package pbo2.pkg10118079.latihan62.livingthing;


public class Human extends LivingThing{
    private String nama;


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        System.out.println(nama+" Sedang Berjalan"); 
       super.walk(nama); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
}
