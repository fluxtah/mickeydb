package com.justeat.mickeydb.generator

import com.justeat.mickeydb.generator.SqliteDatabaseSnapshot
import com.justeat.mickeydb.mickeyLang.ActionStatement
import com.justeat.mickeydb.mickeyLang.ContentUri
import com.justeat.mickeydb.mickeyLang.ContentUriParamSegment
import com.justeat.mickeydb.mickeyLang.MickeyFile

import static extension com.justeat.mickeydb.ModelUtil.*
import static extension com.justeat.mickeydb.Strings.*
import com.justeat.mickeydb.MickeyDatabaseModel

class ContentProviderGenerator {
		def CharSequence generate(MickeyDatabaseModel model) '''
			«var snapshot = model.snapshot»
			/*
			 * Generated by Robotoworks Mechanoid
			 */
			package «model.packageName»;
			
			import android.content.Context;
			import android.content.UriMatcher;
			import android.net.Uri;
			import java.util.Set;
			import com.robotoworks.mechanoid.db.MechanoidContentProvider;
			import com.robotoworks.mechanoid.db.MechanoidSQLiteOpenHelper;
			import com.robotoworks.mechanoid.db.DefaultContentProviderActions;
			import com.robotoworks.mechanoid.db.ContentProviderActions;
			import «model.packageName».Abstract«model.databaseName.pascalize»OpenHelper.Sources;
			«FOR tbl : snapshot.tables.filter([it.hasAndroidPrimaryKey])»
			import «model.packageName».«tbl.name.pascalize»Record;
			«ENDFOR»			
			
			public abstract class Abstract«model.databaseName.pascalize»ContentProvider extends MechanoidContentProvider {
			
				«var counter=-1»
				«FOR tbl : snapshot.tables»
				public static final int «tbl.name.underscore.toUpperCase» = «counter=counter+1»;
				«IF tbl.hasAndroidPrimaryKey»
				public static final int «tbl.name.underscore.toUpperCase»_ID = «counter=counter+1»;
				«ENDIF»
				«ENDFOR»

				«FOR vw : snapshot.views»
				public static final int «vw.name.underscore.toUpperCase» = «counter=counter+1»;
				«IF vw.hasAndroidPrimaryKey»
				public static final int «vw.name.underscore.toUpperCase»_ID = «counter=counter+1»;
				«ENDIF»				
				«ENDFOR»
				
				«FOR tbl : model.initTables»
				public static final int «tbl.name.underscore.toUpperCase» = «counter=counter+1»;
				«IF tbl.hasAndroidPrimaryKey»
				public static final int «tbl.name.underscore.toUpperCase»_ID = «counter=counter+1»;
				«ENDIF»
				«ENDFOR»
				«FOR vw : model.initViews»
				public static final int «vw.name.underscore.toUpperCase» = «counter=counter+1»;
				«IF vw.hasAndroidPrimaryKey»
				public static final int «vw.name.underscore.toUpperCase»_ID = «counter=counter+1»;
				«ENDIF»				
				«ENDFOR»
				«FOR a : model.actions»
				public static final int «(a as ActionStatement).uri.type.underscore.toUpperCase»_«(a as ActionStatement).name.underscore.toUpperCase» = «counter=counter+1»;
				«ENDFOR»		
				public static final int NUM_URI_MATCHERS = «counter + 1»;
			
				@Override
			    protected UriMatcher createUriMatcher() {
			        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
			        final String authority = «model.databaseName.pascalize»Contract.CONTENT_AUTHORITY;
			
					«FOR tbl : snapshot.tables»
					matcher.addURI(authority, "«tbl.name»", «tbl.name.underscore.toUpperCase»);
					«IF tbl.hasAndroidPrimaryKey»
					matcher.addURI(authority, "«tbl.name»/#", «tbl.name.underscore.toUpperCase»_ID);
					«ENDIF»
					«ENDFOR»
					«FOR vw : snapshot.views»
					matcher.addURI(authority, "«vw.name»", «vw.name.underscore.toUpperCase»);
					«IF vw.hasAndroidPrimaryKey»
					matcher.addURI(authority, "«vw.name»/#", «vw.name.underscore.toUpperCase»_ID);
					«ENDIF»
					«ENDFOR»
					«FOR tbl : model.initTables»
					matcher.addURI(authority, "«tbl.name»", «tbl.name.underscore.toUpperCase»);
					«IF tbl.hasAndroidPrimaryKey»
					matcher.addURI(authority, "«tbl.name»/#", «tbl.name.underscore.toUpperCase»_ID);
					«ENDIF»
					«ENDFOR»
					«FOR vw : model.initViews»
					matcher.addURI(authority, "«vw.name»", «vw.name.underscore.toUpperCase»);
					«IF vw.hasAndroidPrimaryKey»
					matcher.addURI(authority, "«vw.name»/#", «vw.name.underscore.toUpperCase»_ID);
					«ENDIF»
					«ENDFOR»

					// User Actions
					«FOR a : model.actions»
					matcher.addURI(authority, "«a.uri.asString»", «a.uri.type.underscore.toUpperCase»_«a.name.underscore.toUpperCase»); 
					«ENDFOR»
			        return matcher;
			    }
			    
			    @Override
			    protected String[] createContentTypes() {
					String[] contentTypes = new String[NUM_URI_MATCHERS];

					«FOR tbl : snapshot.tables»
					contentTypes[«tbl.name.underscore.toUpperCase»] = «model.databaseName.pascalize»Contract.«tbl.name.pascalize».CONTENT_TYPE;
					«IF tbl.hasAndroidPrimaryKey»
					contentTypes[«tbl.name.underscore.toUpperCase»_ID] = «model.databaseName.pascalize»Contract.«tbl.name.pascalize».ITEM_CONTENT_TYPE;
					«ENDIF»
					«ENDFOR»
					«FOR vw : snapshot.views»
					contentTypes[«vw.name.underscore.toUpperCase»] = «model.databaseName.pascalize»Contract.«vw.name.pascalize».CONTENT_TYPE;
					«IF vw.hasAndroidPrimaryKey»
					contentTypes[«vw.name.underscore.toUpperCase»_ID] = «model.databaseName.pascalize»Contract.«vw.name.pascalize».ITEM_CONTENT_TYPE;
					«ENDIF»
					«ENDFOR»	
					«FOR tbl : model.initTables»
					contentTypes[«tbl.name.underscore.toUpperCase»] = «model.databaseName.pascalize»Contract.«tbl.name.pascalize».CONTENT_TYPE;
					«IF tbl.hasAndroidPrimaryKey»
					contentTypes[«tbl.name.underscore.toUpperCase»_ID] = «model.databaseName.pascalize»Contract.«tbl.name.pascalize».ITEM_CONTENT_TYPE;
					«ENDIF»
					«ENDFOR»
					«FOR vw : model.initViews»
					contentTypes[«vw.name.underscore.toUpperCase»] = «model.databaseName.pascalize»Contract.«vw.name.pascalize».CONTENT_TYPE;
					«IF vw.hasAndroidPrimaryKey»
					contentTypes[«vw.name.underscore.toUpperCase»_ID] = «model.databaseName.pascalize»Contract.«vw.name.pascalize».ITEM_CONTENT_TYPE;
					«ENDIF»
					«ENDFOR»	
					«FOR a : model.actions»
					contentTypes[«a.uri.type.underscore.toUpperCase»_«a.name.underscore.toUpperCase»] = «a.generateContentTypeConstantReference(model.databaseName)»;
					«ENDFOR»
					
					return contentTypes;
			    }
			
				@Override
				protected MechanoidSQLiteOpenHelper createOpenHelper(Context context) {
			        return new «model.databaseName.pascalize»OpenHelper(context);
				}
				
				@Override
				protected Set<Uri> getRelatedUris(Uri uri) {
					return «model.databaseName.pascalize»Contract.REFERENCING_VIEWS.get(uri);
				}
			    
			    @Override
			    protected ContentProviderActions createActions(int id) {
			    	switch(id) {
						«FOR tbl : snapshot.tables»
						case «tbl.name.underscore.toUpperCase»: 
							return create«tbl.name.pascalize»Actions();
						«IF tbl.hasAndroidPrimaryKey»
						case «tbl.name.underscore.toUpperCase»_ID:
							return create«tbl.name.pascalize»ByIdActions();
						«ENDIF»
						«ENDFOR»
						«FOR vw : snapshot.views»
						case «vw.name.underscore.toUpperCase»:
							return create«vw.name.pascalize»Actions();
						«IF vw.hasAndroidPrimaryKey»
						case «vw.name.underscore.toUpperCase»_ID: 
							return create«vw.name.pascalize»ByIdActions();
						«ENDIF»
						«ENDFOR»
						«FOR tbl : model.initTables»
						case «tbl.name.underscore.toUpperCase»: 
							return create«tbl.name.pascalize»Actions();
						«IF tbl.hasAndroidPrimaryKey»
						case «tbl.name.underscore.toUpperCase»_ID:
							return create«tbl.name.pascalize»ByIdActions();
						«ENDIF»
						«ENDFOR»
						«FOR vw : model.initViews»
						case «vw.name.underscore.toUpperCase»:
							return create«vw.name.pascalize»Actions();
						«IF vw.hasAndroidPrimaryKey»
						case «vw.name.underscore.toUpperCase»_ID: 
							return create«vw.name.pascalize»ByIdActions();
						«ENDIF»
						«ENDFOR»
						«FOR a : model.actions»
						case «a.uri.type.underscore.toUpperCase»_«a.name.underscore.toUpperCase»:
							return create«a.name.pascalize»Actions();
						«ENDFOR»
						default:
							throw new UnsupportedOperationException("Unknown id: " + id);
			    	}
			    }
			    
			    «FOR tbl:snapshot.tables»
			    «IF tbl.hasAndroidPrimaryKey»
			    protected ContentProviderActions create«tbl.name.pascalize»ByIdActions() {
			    	return new DefaultContentProviderActions(Sources.«tbl.name.underscore.toUpperCase», true, «IF tbl.hasAndroidPrimaryKey»«tbl.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDIF»
			    protected ContentProviderActions create«tbl.name.pascalize»Actions() {
			    	return new DefaultContentProviderActions(Sources.«tbl.name.underscore.toUpperCase», false, «IF tbl.hasAndroidPrimaryKey»«tbl.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDFOR»
			    «FOR view:snapshot.views»
			    «IF view.hasAndroidPrimaryKey»
			    protected ContentProviderActions create«view.name.pascalize»ByIdActions() {
			    	return new DefaultContentProviderActions(Sources.«view.name.underscore.toUpperCase», true, «IF view.hasAndroidPrimaryKey»«view.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDIF»
			    protected ContentProviderActions create«view.name.pascalize»Actions() {
			    	return new DefaultContentProviderActions(Sources.«view.name.underscore.toUpperCase», false, «IF view.hasAndroidPrimaryKey»«view.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDFOR»
			    «FOR tbl:model.initTables»
			    «IF tbl.hasAndroidPrimaryKey»
			    protected ContentProviderActions create«tbl.name.pascalize»ByIdActions() {
			    	return new DefaultContentProviderActions(Sources.«tbl.name.underscore.toUpperCase», true, «IF tbl.hasAndroidPrimaryKey»«tbl.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDIF»
			    protected ContentProviderActions create«tbl.name.pascalize»Actions() {
			    	return new DefaultContentProviderActions(Sources.«tbl.name.underscore.toUpperCase», false, «IF tbl.hasAndroidPrimaryKey»«tbl.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDFOR»
			    «FOR view:model.initViews»
			    «IF view.hasAndroidPrimaryKey»
			    protected ContentProviderActions create«view.name.pascalize»ByIdActions() {
			    	return new DefaultContentProviderActions(Sources.«view.name.underscore.toUpperCase», true, «IF view.hasAndroidPrimaryKey»«view.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDIF»
			    protected ContentProviderActions create«view.name.pascalize»Actions() {
			    	return new DefaultContentProviderActions(Sources.«view.name.underscore.toUpperCase», false, «IF view.hasAndroidPrimaryKey»«view.name.pascalize»Record.getFactory()«ELSE»null«ENDIF»);
			    }
			    
			    «ENDFOR»
				«FOR a : model.actions»
				protected ContentProviderActions create«a.name.pascalize»Actions() {
					return new ContentProviderActions();
				}
				
				«ENDFOR»
			}
		'''
		
		def asString(ContentUri uri) {
			var builder = new StringBuilder()
			
			builder.append(uri.type)
			
			for(seg : uri.segments) {
				builder.append("/")
				if(seg instanceof ContentUriParamSegment) {
					var paramSeg = seg as ContentUriParamSegment
					
					if(paramSeg.num) {
						builder.append("#")
					} else {
						builder.append("*")
					}
					
				} else {
					builder.append(seg.name)
				}
			}
			
			return builder.toString
		}

	
		def generateContentTypeConstantReference(ActionStatement action, String databaseName) {
			return databaseName.pascalize + "Contract." + action.uri.type.pascalize + ".CONTENT_TYPE";
		}

			
		def CharSequence generateStub(MickeyDatabaseModel model, SqliteDatabaseSnapshot snapshot) '''
			/*******************************************************************************
			 * Copyright (c) 2012, Robotoworks Limited
			 * All rights reserved. This program and the accompanying materials
			 * are made available under the terms of the Eclipse Public License v1.0
			 * which accompanies this distribution, and is available at
			 * http://www.eclipse.org/legal/epl-v10.html
			 * 
			 *******************************************************************************/
			package «model.packageName»;
			
			import «model.packageName».Abstract«model.databaseName.pascalize»ContentProvider;
			
			public class «model.databaseName.pascalize»ContentProvider extends Abstract«model.databaseName.pascalize»ContentProvider {}
		'''
}