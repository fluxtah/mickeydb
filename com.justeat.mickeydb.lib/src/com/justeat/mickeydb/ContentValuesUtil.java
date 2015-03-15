/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.justeat.mickeydb;

import java.util.Map;

import android.content.ContentValues;

public class ContentValuesUtil {
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, boolean value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}

	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, byte value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, byte[] value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, double value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, float value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, int value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, long value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, short value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}

	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, String value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value);
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value);
		}
	}
	
	/**
	 * <p>Puts a value into ContentValues using a mapped key provided by map.</p>
	 * 
	 * <p>The following rules apply:</p>
	 * <ul>
	 * <li>If the map is null, or does not contain the key, then the original key is used as the key for the value</li>
	 * <li>If the map contains the key, but the value is null, then the value is not added to ContentValues at all</li>
	 * <li>In all other cases, the mapped key (the value in the map) is used as the key for the given value</li>
	 * </ul>
	 * 
	 * @param key The original key
	 * @param map The map that might contain a mapping to the original key
	 * @param values The values to put the key (or mapped key) and value into
	 * @param value The value to put into values
	 */
	public static void putMapped(String key, Map<String, String> map, ContentValues values, Object value) {
		if(map == null || !map.containsKey(key)) {
			values.put(key, value.toString());
		}
		
		String alias = map.get(key);
		
		if(alias != null) {
			values.put(alias, value.toString());
		}
	}
}
