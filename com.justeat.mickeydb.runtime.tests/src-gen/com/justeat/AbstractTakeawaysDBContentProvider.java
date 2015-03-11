/*
 * Generated by Robotoworks Mechanoid
 */
package com.justeat;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import java.util.Set;
import com.robotoworks.mechanoid.db.MechanoidContentProvider;
import com.robotoworks.mechanoid.db.MechanoidSQLiteOpenHelper;
import com.robotoworks.mechanoid.db.DefaultContentProviderActions;
import com.robotoworks.mechanoid.db.ContentProviderActions;
import com.justeat.AbstractTakeawaysDBOpenHelper.Sources;
import com.justeat.RestaurantsRecord;

public abstract class AbstractTakeawaysDBContentProvider extends MechanoidContentProvider {

	public static final int RESTAURANTS = 0;
	public static final int RESTAURANTS_ID = 1;

	
	public static final int ALL_RESTAURANTS = 2;
	public static final int NUM_URI_MATCHERS = 3;

	@Override
    protected UriMatcher createUriMatcher() {
        final UriMatcher matcher = new UriMatcher(UriMatcher.NO_MATCH);
        final String authority = TakeawaysDBContract.CONTENT_AUTHORITY;

		matcher.addURI(authority, "restaurants", RESTAURANTS);
		matcher.addURI(authority, "restaurants/#", RESTAURANTS_ID);
		matcher.addURI(authority, "all_restaurants", ALL_RESTAURANTS);

		// User Actions
        return matcher;
    }
    
    @Override
    protected String[] createContentTypes() {
		String[] contentTypes = new String[NUM_URI_MATCHERS];

		contentTypes[RESTAURANTS] = TakeawaysDBContract.Restaurants.CONTENT_TYPE;
		contentTypes[RESTAURANTS_ID] = TakeawaysDBContract.Restaurants.ITEM_CONTENT_TYPE;
		contentTypes[ALL_RESTAURANTS] = TakeawaysDBContract.AllRestaurants.CONTENT_TYPE;
		
		return contentTypes;
    }

	@Override
	protected MechanoidSQLiteOpenHelper createOpenHelper(Context context) {
        return new TakeawaysDBOpenHelper(context);
	}
	
	@Override
	protected Set<Uri> getRelatedUris(Uri uri) {
		return TakeawaysDBContract.REFERENCING_VIEWS.get(uri);
	}
    
    @Override
    protected ContentProviderActions createActions(int id) {
    	switch(id) {
			case RESTAURANTS: 
				return createRestaurantsActions();
			case RESTAURANTS_ID:
				return createRestaurantsByIdActions();
			case ALL_RESTAURANTS:
				return createAllRestaurantsActions();
			default:
				throw new UnsupportedOperationException("Unknown id: " + id);
    	}
    }
    
    protected ContentProviderActions createRestaurantsByIdActions() {
    	return new DefaultContentProviderActions(Sources.RESTAURANTS, true, RestaurantsRecord.getFactory());
    }
    
    protected ContentProviderActions createRestaurantsActions() {
    	return new DefaultContentProviderActions(Sources.RESTAURANTS, false, RestaurantsRecord.getFactory());
    }
    
    protected ContentProviderActions createAllRestaurantsActions() {
    	return new DefaultContentProviderActions(Sources.ALL_RESTAURANTS, false, null);
    }
    
}
