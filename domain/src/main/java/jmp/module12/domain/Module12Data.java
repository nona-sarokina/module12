package jmp.module12.domain;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by user on 11.10.2016.
 */
public class Module12Data {

    List<String> itemDescriptions;

    public Module12Data() {
        itemDescriptions = new ArrayList<String>();
    }

    public List<String> getItemDescriptions() {
        return itemDescriptions;
    }

    public void addItem(String item) {
        this.itemDescriptions.add(item);
    }
}
