package me.yogeshwar.maven.someproject;

import java.util.HashMap;

public class HashStore {
	HashMap<String, String> store;
	
	public HashStore() {
		super();
		this.store = new HashMap<String, String>();
	}

	public HashMap<String, String> getStore() {
		return store;
	}

	public void setStore(HashMap<String, String> store) {
		this.store = store;
	}
	
	public String get(String key) {
		return this.store.get(key);
	}
	public void put(String key, String value) {
		this.store.put(key, value);
	}
}
