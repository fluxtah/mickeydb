/*
 * Generated by Robotoworks Mechanoid
 */
package com.justeat.migrations;

import android.database.sqlite.SQLiteDatabase;
import com.robotoworks.mechanoid.db.SQLiteMigration;

public class DefaultTakeawaysDBMigrationV11 extends SQLiteMigration {
	@Override
	public void onBeforeUp(SQLiteDatabase db) {}
	
	@Override
	public void up(SQLiteDatabase db) {
		db.execSQL(
			"drop view if exists order_summary "
		);	
		db.execSQL(
			"drop view if exists product_accessory_types "
		);	
		db.execSQL(
			"drop view if exists product_categories_with_count "
		);	
		db.execSQL(
			"drop view if exists products_in_basket "
		);	
	}
	
	@Override
	public void onAfterUp(SQLiteDatabase db) {}
}
