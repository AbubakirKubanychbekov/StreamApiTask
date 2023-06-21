import db.DataBase;
import model.Contact;
import model.Phone;
import service.ConService;
import serviceImpl.ConServiceImpl;
import serviceImpl.PhServiceImpl;
import java.util.*;

public class Main {
    public static void main(String[] args) {

       Contact bilal = new Contact("Bilal",777787878);
       Contact amir = new Contact("Amir",777998877);
       Contact eldan = new Contact("Eldan",505779988);
       List<Contact>contacts1=new ArrayList<>(List.of(bilal,amir,eldan));
       List<Contact>contacts2=new ArrayList<>(List.of(bilal));
       List<Contact>contacts3=new ArrayList<>(List.of(amir));
       List<Contact>contacts4=new ArrayList<>(List.of(eldan));


        Phone samsung = new Phone(10L,"Samsung","s23",contacts1);
        List<Phone>phones=new ArrayList<>(List.of(samsung));


        DataBase dataBase=new DataBase(phones,contacts1);


        PhServiceImpl phService=new PhServiceImpl(dataBase);
        System.out.println(phService.addPhone(new Phone(20L, "Iphone", "14pro", contacts2)));
        System.out.println("==================================");
        System.out.println(phService.getPhoneById(10L));
        System.out.println(phService.getAllPhones());
        System.out.println("===============================");
        System.out.println(phService.getAllPhonesByBrand("14pro"));
        System.out.println("=================================");
        phService.deletePhoneById(10L);
        System.out.println(phService.getAllPhones());
        System.out.println("=====================");
        System.out.println(phService.updatePhoneNameById(10L, "Mi"));
        System.out.println(phService.getAllPhones());
        System.out.println("==================");
        phService.deletePhoneById(10L);
        System.out.println(phService.getAllPhones());

        System.out.println("-------------------------------------------");

        ConServiceImpl conService=new ConServiceImpl(dataBase);
//        System.out.println(conService.addContactToPhone(20L, amir));
//        System.out.println(phService.getAllPhones());
        conService.findContactByName(20L,"Bilal");
        System.out.println(phService.getAllPhones());


    }
}