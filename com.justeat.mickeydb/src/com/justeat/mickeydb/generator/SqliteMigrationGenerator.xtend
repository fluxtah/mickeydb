package com.justeat.mickeydb.generator

import com.google.inject.Inject
import com.justeat.mickeydb.generator.SqliteDatabaseStatementGenerator
import com.justeat.mickeydb.mickeyLang.MigrationBlock
import com.justeat.mickeydb.mickeyLang.MickeyFile

import static extension com.justeat.mickeydb.Strings.*
import java.math.BigDecimal

class SqliteMigrationGenerator {
	
		@Inject extension SqliteDatabaseStatementGenerator
		
		def CharSequence generate(MickeyFile model, String packageName, String databaseName, MigrationBlock migration, String version) '''
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package «packageName».migrations;
			
			import android.database.sqlite.SQLiteDatabase;
			import com.robotoworks.mechanoid.db.SQLiteMigration;
			
			public class Default«databaseName.pascalize»MigrationV«version.pascalize» extends SQLiteMigration {
				@Override
				public void onBeforeUp(SQLiteDatabase db) {}
				
				@Override
				public void up(SQLiteDatabase db) {
					«migration.statements.generateStatements»
				}
				
				@Override
				public void onAfterUp(SQLiteDatabase db) {}
			}
			'''
}