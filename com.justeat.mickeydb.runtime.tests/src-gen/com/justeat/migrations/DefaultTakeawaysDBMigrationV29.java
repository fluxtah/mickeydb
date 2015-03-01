/*
 * Generated by Robotoworks Mechanoid
 */
package com.justeat.migrations;

import android.database.sqlite.SQLiteDatabase;
import com.robotoworks.mechanoid.db.SQLiteMigration;

public class DefaultTakeawaysDBMigrationV29 extends SQLiteMigration {
	@Override
	public void onBeforeUp(SQLiteDatabase db) {}
	
	@Override
	public void up(SQLiteDatabase db) {
		db.execSQL(
			"alter table basket_items add column product_synonym text "
		);	
		db.execSQL(
			"alter table basket_items add column product_has_accessories boolean "
		);	
		db.execSQL(
			"alter table basket_items add column product_has_combo_options boolean "
		);	
		db.execSQL(
			"alter table orders add column delivery_charge real "
		);	
		db.execSQL(
			"alter table orders add column sub_total real "
		);	
		db.execSQL(
			"alter table orders add column discount real "
		);	
		db.execSQL(
			"alter table orders add column multibuy_discount real "
		);	
		db.execSQL(
			"create table order_history_items ( " +
			"_id integer primary key autoincrement, " +
			"basket_jeid text, " +
			"basket_item_jeid text, " +
			"restaurant_jeid integer, " +
			"menu_jeid integer, " +
			"category_jeid integer, " +
			"product_jeid integer, " +
			"is_complex boolean, " +
			"product_name text, " +
			"product_synonym text, " +
			"product_has_accessories boolean, " +
			"product_has_combo_options boolean, " +
			"description text, " +
			"product_price real, " +
			"total_price real, " +
			"is_tips boolean, " +
			"menu_sort_key text, " +
			"group_key text, " +
			"unique ( " +
			"basket_jeid, " +
			"basket_item_jeid, " +
			"restaurant_jeid " +
			") on conflict replace " +
			") "
		);	
		db.execSQL(
			"create table order_history_item_mealparts ( " +
			"_id integer primary key autoincrement, " +
			"basket_jeid text, " +
			"basket_item_jeid text, " +
			"mealpart_jeid integer, " +
			"mealpart_name text, " +
			"mealpart_group_jeid integer, " +
			"has_accessories boolean, " +
			"has_required_accessories boolean, " +
			"unique ( " +
			"basket_jeid, " +
			"basket_item_jeid, " +
			"mealpart_jeid, " +
			"mealpart_group_jeid " +
			") on conflict replace " +
			") "
		);	
		db.execSQL(
			"create table order_history_item_accessories ( " +
			"_id integer primary key autoincrement, " +
			"basket_jeid text, " +
			"basket_item_jeid text, " +
			"product_jeid integer, " +
			"accessory_jeid integer, " +
			"accessory_group_jeid integer, " +
			"accessory_name text, " +
			"accessory_required integer default(0), " +
			"mealpart_jeid integer default(0), " +
			"mealpart_group_jeid integer default(0), " +
			"unit_price real, " +
			"quantity integer, " +
			"unique ( " +
			"basket_jeid, " +
			"basket_item_jeid, " +
			"product_jeid, " +
			"accessory_jeid, " +
			"accessory_group_jeid, " +
			"accessory_required, " +
			"mealpart_jeid, " +
			"mealpart_group_jeid " +
			") on conflict replace " +
			") "
		);	
	}
	
	@Override
	public void onAfterUp(SQLiteDatabase db) {}
}