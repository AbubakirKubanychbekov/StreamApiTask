package serviceImpl;

import db.DataBase;
import model.Contact;
import service.ConService;

import java.util.ArrayList;
import java.util.List;

public class ConServiceImpl implements ConService {
    private DataBase dataBase;

    public ConServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addContactToPhone(Long phoneId, Contact contact) {
        for (int i = 0; i < dataBase.getPhones().size(); i++) {
          if (dataBase.getPhones().get(i).getId().equals(phoneId)){
         //    dataBase.getPhones().get(i).setContacts();
          }
        }
        return "Contact is saved";
    }

    @Override
    public Contact findContactByName(Long phoneId, String contactName) {
        for (int i = 0; i < dataBase.getPhones().size(); i++) {
            dataBase.getPhones().get(i);
      if (dataBase.getPhones()!=null){
          return dataBase.getPhones().get(i).getContacts().stream()
                  .filter(contact -> contact.getName().equals(contactName))
                  .findFirst().orElse(null);
      }
        } return findContactByName(phoneId,contactName);

}

    @Override
    public Contact findContactByPhoneNumber(Long phoneId, String phoneNumber) {
        for (int i = 0; i <dataBase.getPhones().size() ; i++) {
            dataBase.getPhones().get(i);
            if (dataBase.getPhones()!=null){
                return dataBase.getPhones().get(i).getContacts().stream()
                        .filter(contact ->contact.getPhoneNumber())
            }
        }

        return null;
    }

    @Override
    public List<Contact> sortContactsByName(Long phoneId) {
        return null;
    }

    @Override
    public void deleteContactByNameFromPhone(Long phoneId, String contactName) {

    }
}
