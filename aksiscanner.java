
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author usER
 */
public class aksiscanner {
   public static void main(String args[])

{
//membuat objek baru
classscanner scan=new classscanner();

scan.inputScanner();
System.out.println("\nNama Anda :" + scan.getnama());
System.out.println("Nilai Anda :" + scan.rata());
}           
}
