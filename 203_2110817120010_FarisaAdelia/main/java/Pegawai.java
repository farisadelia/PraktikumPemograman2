/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pegawai {
     public String nama;
//baris ini terjadi eror karena pada file main, terjadi karena variabel asal adalah char     
//  public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
    return nama;
}
    public String getAsal() {
    return asal;
}
//Pada baris ini terjadi error karena didalam parameter jabatan tidak ada, kita dapat mengisi parameternya dan mengganti variabel j
//public void setJabatan(){
// this.jabatan = j;
public void setJabatan( String jabatan) {
this.jabatan = jabatan;   
}   
}
