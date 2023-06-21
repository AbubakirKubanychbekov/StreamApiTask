package service;
import java.util.*;
import model.Phone;

public interface PhService {
    String addPhone(Phone phone);

    // with stream

    Phone getPhoneById(Long phoneId);

    // with stream

    Phone updatePhoneNameById(Long phoneId, String newName);

    // with stream

    List<Phone> getAllPhones();

    // with stream

    List<Phone> getAllPhonesByBrand(String brand);

    void deletePhoneById(Long phoneId);
}
