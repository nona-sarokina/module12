package jmp.module12.service;

import jmp.module12.domain.Module12Data;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by user on 11.10.2016.
 */
@RequestScoped
@Named
public class Module12DataFiller {
    public static final String MODULE12_PROPERTIES = "module12.properties";
    public static final String COUNT = "count";
    public static final String TASK_PREFIX = "task";
    Module12Data data = new Module12Data();
    public void fill () {
        Properties properties = new Properties();
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(MODULE12_PROPERTIES)) {
            Reader reader = new InputStreamReader(inputStream, "UTF-8");
            try {
                properties.load(reader);
            } finally {
                reader.close();
            }
            int count = Integer.valueOf(String.valueOf(properties.get(COUNT)));
            for (int i = 1; i <= count; i++) {
                data.addItem(properties.getProperty(TASK_PREFIX + i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Module12Data getData() {
        return data;
    }

    public void setData(Module12Data data) {
        this.data = data;
    }
}