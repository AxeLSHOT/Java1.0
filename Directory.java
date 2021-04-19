package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Directory {
    private final Map<String, List<String>> directory_hm = new HashMap<>();

    public void add(String surname, String phone_number) {
        List<String> phone_number_list;
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
        } else {
            phone_number_list = new ArrayList<>();
        }
        phone_number_list.add(phone_number);
        directory_hm.put(surname, phone_number_list);
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }
}