/*
 * Generated by Robotoworks Mechanoid
 */
package com.justeat.migrations;

import android.database.sqlite.SQLiteDatabase;
import com.robotoworks.mechanoid.db.SQLiteMigration;

public class DefaultTakeawaysDBMigrationV28 extends SQLiteMigration {
	@Override
	public void onBeforeUp(SQLiteDatabase db) {}
	
	@Override
	public void up(SQLiteDatabase db) {
		db.execSQL(
			"alter table basket_items add column group_key text "
		);	
	}
	
	@Override
	public void onAfterUp(SQLiteDatabase db) {}
}
