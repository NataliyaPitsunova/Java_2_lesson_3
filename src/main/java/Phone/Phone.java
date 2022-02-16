package Phone;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Phone {


    private LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

    public Phone() {
        this.phoneBook = phoneBook;
    }

    public LinkedHashMap<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void add(String lastName, String phoneNumber) throws ParseException {
        if (phoneBook == null) {
            phoneBook = new LinkedHashMap<String, String>();
        }


        String phoneMask = "###-###-####";
        MaskFormatter maskFormatter = new MaskFormatter(phoneMask);
        maskFormatter.setValueContainsLiteralCharacters(false);
        String formatNumber = maskFormatter.valueToString(phoneNumber);

        phoneBook.put(formatNumber, lastName);
    }

    public void get(String lastName) {
        Boolean find = false;
        for (Map.Entry<String, String> user : phoneBook.entrySet()
        ) {
            if (user.getValue().equals(lastName)) {
                System.out.println(user.getKey() + " " + user.getValue());
                find = true;
            }
        }
        System.out.println();
        if (!find) {
            System.out.println("Абонента с такой фамилиейнет в справочнике");
        }
    }
}

