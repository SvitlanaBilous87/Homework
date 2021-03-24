package com.company.hometask_19;

import java.util.Map;

public class MyEntry <K, V>{
    private K userAccount;
    private V userPassword;

    public MyEntry(K userAccount, V userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    public MyEntry() {
    }

    public K getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(K userAccount) {
        this.userAccount = userAccount;
    }

    public V getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(V userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "userAccount=" + userAccount +
                ", userPassword=" + userPassword +
                '}';
    }

    public void addNewElement(Map<K, V> map, MyEntry<K, V> myEntry){
    map.put(myEntry.getUserAccount(), myEntry.getUserPassword());
    }

    public void removeElementByKey(Map<K, V> map, K userAccount){
        if (map.containsKey(userAccount)){
            map.remove(userAccount);
        }
        else {
            System.out.println("There is no such element.");
        }
    }

    public void removeElementByValue(Map<K, V> map, V userPassword){
        if (map.containsValue(userPassword)){
            for (Map.Entry<K, V> entry : map.entrySet()){
                if (entry.getValue().equals(userPassword)){
                    map.remove(entry.getKey());
                }
            }
        }
        else {
            System.out.println("There is no such element.");
        }
    }

    public void printUserAccounts(Map<K, V> map){
        System.out.println("All user's accounts: " + map.keySet());
    }

    public void printUserPasswords(Map<K, V> map){
        System.out.println("All passwords: " + map.values());
    }

    public void printAllElements(Map<K, V> map){
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("User's account: "+entry.getKey() + " and password: "+entry.getValue());
        }
    }
}
