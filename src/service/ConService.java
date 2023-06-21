package service;
import java.util.*;
import model.Contact;

public interface ConService {
    String addContactToPhone(Long phoneId, Contact contact);

    // with stream (телефонду phoneId мн табып, ичинен контантактардын  арасынан contactName мн табып кайтарып берсин)

    Contact findContactByName(Long phoneId, String contactName);

    // with stream

  Contact findContactByPhoneNumber(Long phoneId, String phoneNumber);

// with stream (телефонду phoneId мн табып, ичинен контантактарды аттарын осуу тартибинде чыгарып берсин)

    List<Contact>sortContactsByName(Long phoneId);

    void deleteContactByNameFromPhone(Long phoneId, String contactName);

}
