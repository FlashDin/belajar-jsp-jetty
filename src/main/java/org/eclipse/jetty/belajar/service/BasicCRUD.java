package org.eclipse.jetty.belajar.service;


import org.eclipse.jetty.belajar.entity.Profile;
import org.eclipse.jetty.belajar.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasicCRUD {

    private List<User> datas = new ArrayList<>();
    private List<Profile> dataList = new ArrayList<>();
    private Map<String, Profile> dataMaps = new HashMap();

    public void initData() {
        dataList.add(new Profile("", "", 1, ""));
        dataList.add(new Profile("", "", 1, ""));
        dataList.add(new Profile("", "", 1, ""));

        dataMaps.put("1", new Profile("", "", 1, ""));
        dataMaps.put("2", new Profile("", "", 1, ""));
        dataMaps.put("3", new Profile("", "", 1, ""));
    }

    public List<Profile> save(Profile data) {
        dataList.add(data);
        return dataList;
    }

    public Map<String, Profile> saveUsingKey(String key, Profile data) {
        dataMaps.put(key, data);
        return dataMaps;
    }

    public List<Profile> getAll() {
        return dataList;
    }

    public Profile getDataByIndex(int index) {
        return dataList.get(index);
    }

    public Profile getDataByKey(String index) {
        return dataMaps.get(index);
    }

    public List<Profile> deleteByIndex(int index) {
        dataList.remove(index);
        return dataList;
    }

    public Map<String, Profile> deleteByKey(String index) {
        dataMaps.remove(index);
        return dataMaps;
    }

}
