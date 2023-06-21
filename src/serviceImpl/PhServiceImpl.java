package serviceImpl;

import db.DataBase;
import model.Phone;
import service.PhService;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class PhServiceImpl implements PhService {
    private  DataBase dataBase;

    public PhServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addPhone(Phone phone) {
        dataBase.getPhones().add(phone);
        return dataBase.getPhones()+"phone saved";
    }

    @Override
    public Phone getPhoneById(Long phoneId) {
        dataBase.getPhones().stream()
                .filter(p -> p.getId().equals(phoneId)).findFirst();

        return dataBase.getPhones().stream().findFirst().get();
    }

    @Override
    public Phone updatePhoneNameById(Long phoneId, String newName) {
     List<Phone>phones=new ArrayList<>();
     phones.addAll(dataBase.getPhones());
     phones.stream()
             .filter(phone -> phone.getId().equals(phoneId))
             .findFirst().ifPresent(phone -> phone.setName(newName));
        return getPhoneById(phoneId);
    }


    @Override
    public List<Phone> getAllPhones() {
        return dataBase.getPhones();
    }

    @Override
    public List<Phone> getAllPhonesByBrand(String brand) {
        List<Phone> list = dataBase.getPhones().stream().filter(phone -> phone.getBrand().equals(brand)).toList();
        return list ;
    }

    @Override
    public void deletePhoneById(Long phoneId) {
        for (int i = 0; i < dataBase.getPhones().size(); i++) {
            if (dataBase.getPhones().get(i).getId().equals(phoneId)){
                System.out.println(dataBase.getPhones().remove(i));
            }
        }

    }
}
