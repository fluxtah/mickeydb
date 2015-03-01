/*
 * Generated by Robotoworks Mechanoid
 */
package com.justeat;

import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.net.Uri;
import com.justeat.TakeawaysDBContract.BasketItems;
import com.justeat.TakeawaysDBContract.BasketItems.Builder;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.db.ActiveRecord;
import com.robotoworks.mechanoid.db.ActiveRecordFactory;
import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.db.AbstractValuesBuilder;

public class BasketItemsRecord extends ActiveRecord implements Parcelable {

	private static ActiveRecordFactory<BasketItemsRecord> sFactory = new ActiveRecordFactory<BasketItemsRecord>() {
		@Override
		public BasketItemsRecord create(Cursor c) {
			return fromCursor(c);
		}
		
		@Override
		public String[] getProjection() {
			return PROJECTION;
		}

        @Override
                    public Uri getContentUri() {
                        return BasketItems.CONTENT_URI;
                    }
                };

    			public static ActiveRecordFactory<BasketItemsRecord> getFactory() {
		return sFactory;
	}

    public static final Parcelable.Creator<BasketItemsRecord> CREATOR 
    	= new Parcelable.Creator<BasketItemsRecord>() {
        public BasketItemsRecord createFromParcel(Parcel in) {
            return new BasketItemsRecord(in);
        }

        public BasketItemsRecord[] newArray(int size) {
            return new BasketItemsRecord[size];
        }
    };
    
    public static String[] PROJECTION = {
    	BasketItems._ID,
    	BasketItems.BASKET_ID,
    	BasketItems.BASKET_ITEM_JEID,
    	BasketItems.RESTAURANT_JEID,
    	BasketItems.MENU_JEID,
    	BasketItems.CATEGORY_JEID,
    	BasketItems.PRODUCT_JEID,
    	BasketItems.IS_COMPLEX,
    	BasketItems.PRODUCT_NAME,
    	BasketItems.DESCRIPTION,
    	BasketItems.PRODUCT_PRICE,
    	BasketItems.TOTAL_PRICE,
    	BasketItems.MENU_SORT_KEY,
    	BasketItems.STATUS,
    	BasketItems.RESULT,
    	BasketItems.IS_TIPS,
    	BasketItems.GROUP_KEY,
    	BasketItems.PRODUCT_SYNONYM,
    	BasketItems.PRODUCT_HAS_ACCESSORIES,
    	BasketItems.PRODUCT_HAS_COMBO_OPTIONS,
    	BasketItems.USER
    };
    
    public interface Indices {
    	int _ID = 0;
    	int BASKET_ID = 1;
    	int BASKET_ITEM_JEID = 2;
    	int RESTAURANT_JEID = 3;
    	int MENU_JEID = 4;
    	int CATEGORY_JEID = 5;
    	int PRODUCT_JEID = 6;
    	int IS_COMPLEX = 7;
    	int PRODUCT_NAME = 8;
    	int DESCRIPTION = 9;
    	int PRODUCT_PRICE = 10;
    	int TOTAL_PRICE = 11;
    	int MENU_SORT_KEY = 12;
    	int STATUS = 13;
    	int RESULT = 14;
    	int IS_TIPS = 15;
    	int GROUP_KEY = 16;
    	int PRODUCT_SYNONYM = 17;
    	int PRODUCT_HAS_ACCESSORIES = 18;
    	int PRODUCT_HAS_COMBO_OPTIONS = 19;
    	int USER = 20;
    }
    
    private long mBasketId;
    private boolean mBasketIdDirty;
    private String mBasketItemJeid;
    private boolean mBasketItemJeidDirty;
    private long mRestaurantJeid;
    private boolean mRestaurantJeidDirty;
    private long mMenuJeid;
    private boolean mMenuJeidDirty;
    private long mCategoryJeid;
    private boolean mCategoryJeidDirty;
    private long mProductJeid;
    private boolean mProductJeidDirty;
    private boolean mIsComplex;
    private boolean mIsComplexDirty;
    private String mProductName;
    private boolean mProductNameDirty;
    private String mDescription;
    private boolean mDescriptionDirty;
    private double mProductPrice;
    private boolean mProductPriceDirty;
    private double mTotalPrice;
    private boolean mTotalPriceDirty;
    private String mMenuSortKey;
    private boolean mMenuSortKeyDirty;
    private long mStatus;
    private boolean mStatusDirty;
    private long mResult;
    private boolean mResultDirty;
    private boolean mIsTips;
    private boolean mIsTipsDirty;
    private String mGroupKey;
    private boolean mGroupKeyDirty;
    private String mProductSynonym;
    private boolean mProductSynonymDirty;
    private boolean mProductHasAccessories;
    private boolean mProductHasAccessoriesDirty;
    private boolean mProductHasComboOptions;
    private boolean mProductHasComboOptionsDirty;
    private String mUser;
    private boolean mUserDirty;
    
    @Override
    protected String[] _getProjection() {
    	return PROJECTION;
    }
    
    public void setBasketId(long basketId) {
    	mBasketId = basketId;
    	mBasketIdDirty = true;
    }
    
    public long getBasketId() {
    	return mBasketId;
    }
    
    public void setBasketItemJeid(String basketItemJeid) {
    	mBasketItemJeid = basketItemJeid;
    	mBasketItemJeidDirty = true;
    }
    
    public String getBasketItemJeid() {
    	return mBasketItemJeid;
    }
    
    public void setRestaurantJeid(long restaurantJeid) {
    	mRestaurantJeid = restaurantJeid;
    	mRestaurantJeidDirty = true;
    }
    
    public long getRestaurantJeid() {
    	return mRestaurantJeid;
    }
    
    public void setMenuJeid(long menuJeid) {
    	mMenuJeid = menuJeid;
    	mMenuJeidDirty = true;
    }
    
    public long getMenuJeid() {
    	return mMenuJeid;
    }
    
    public void setCategoryJeid(long categoryJeid) {
    	mCategoryJeid = categoryJeid;
    	mCategoryJeidDirty = true;
    }
    
    public long getCategoryJeid() {
    	return mCategoryJeid;
    }
    
    public void setProductJeid(long productJeid) {
    	mProductJeid = productJeid;
    	mProductJeidDirty = true;
    }
    
    public long getProductJeid() {
    	return mProductJeid;
    }
    
    public void setIsComplex(boolean isComplex) {
    	mIsComplex = isComplex;
    	mIsComplexDirty = true;
    }
    
    public boolean getIsComplex() {
    	return mIsComplex;
    }
    
    public void setProductName(String productName) {
    	mProductName = productName;
    	mProductNameDirty = true;
    }
    
    public String getProductName() {
    	return mProductName;
    }
    
    public void setDescription(String description) {
    	mDescription = description;
    	mDescriptionDirty = true;
    }
    
    public String getDescription() {
    	return mDescription;
    }
    
    public void setProductPrice(double productPrice) {
    	mProductPrice = productPrice;
    	mProductPriceDirty = true;
    }
    
    public double getProductPrice() {
    	return mProductPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
    	mTotalPrice = totalPrice;
    	mTotalPriceDirty = true;
    }
    
    public double getTotalPrice() {
    	return mTotalPrice;
    }
    
    public void setMenuSortKey(String menuSortKey) {
    	mMenuSortKey = menuSortKey;
    	mMenuSortKeyDirty = true;
    }
    
    public String getMenuSortKey() {
    	return mMenuSortKey;
    }
    
    public void setStatus(long status) {
    	mStatus = status;
    	mStatusDirty = true;
    }
    
    public long getStatus() {
    	return mStatus;
    }
    
    public void setResult(long result) {
    	mResult = result;
    	mResultDirty = true;
    }
    
    public long getResult() {
    	return mResult;
    }
    
    public void setIsTips(boolean isTips) {
    	mIsTips = isTips;
    	mIsTipsDirty = true;
    }
    
    public boolean getIsTips() {
    	return mIsTips;
    }
    
    public void setGroupKey(String groupKey) {
    	mGroupKey = groupKey;
    	mGroupKeyDirty = true;
    }
    
    public String getGroupKey() {
    	return mGroupKey;
    }
    
    public void setProductSynonym(String productSynonym) {
    	mProductSynonym = productSynonym;
    	mProductSynonymDirty = true;
    }
    
    public String getProductSynonym() {
    	return mProductSynonym;
    }
    
    public void setProductHasAccessories(boolean productHasAccessories) {
    	mProductHasAccessories = productHasAccessories;
    	mProductHasAccessoriesDirty = true;
    }
    
    public boolean getProductHasAccessories() {
    	return mProductHasAccessories;
    }
    
    public void setProductHasComboOptions(boolean productHasComboOptions) {
    	mProductHasComboOptions = productHasComboOptions;
    	mProductHasComboOptionsDirty = true;
    }
    
    public boolean getProductHasComboOptions() {
    	return mProductHasComboOptions;
    }
    
    public void setUser(String user) {
    	mUser = user;
    	mUserDirty = true;
    }
    
    public String getUser() {
    	return mUser;
    }
    
    
    public BasketItemsRecord() {
    	super(BasketItems.CONTENT_URI);
	}
	
	private BasketItemsRecord(Parcel in) {
    	super(BasketItems.CONTENT_URI);
    	
		setId(in.readLong());
		
		mBasketId = in.readLong();
		mBasketItemJeid = in.readString();
		mRestaurantJeid = in.readLong();
		mMenuJeid = in.readLong();
		mCategoryJeid = in.readLong();
		mProductJeid = in.readLong();
		mIsComplex = (in.readInt() > 0);
		mProductName = in.readString();
		mDescription = in.readString();
		mProductPrice = in.readDouble();
		mTotalPrice = in.readDouble();
		mMenuSortKey = in.readString();
		mStatus = in.readLong();
		mResult = in.readLong();
		mIsTips = (in.readInt() > 0);
		mGroupKey = in.readString();
		mProductSynonym = in.readString();
		mProductHasAccessories = (in.readInt() > 0);
		mProductHasComboOptions = (in.readInt() > 0);
		mUser = in.readString();
		
		boolean[] dirtyFlags = new boolean[20];
		in.readBooleanArray(dirtyFlags);
		mBasketIdDirty = dirtyFlags[0];
		mBasketItemJeidDirty = dirtyFlags[1];
		mRestaurantJeidDirty = dirtyFlags[2];
		mMenuJeidDirty = dirtyFlags[3];
		mCategoryJeidDirty = dirtyFlags[4];
		mProductJeidDirty = dirtyFlags[5];
		mIsComplexDirty = dirtyFlags[6];
		mProductNameDirty = dirtyFlags[7];
		mDescriptionDirty = dirtyFlags[8];
		mProductPriceDirty = dirtyFlags[9];
		mTotalPriceDirty = dirtyFlags[10];
		mMenuSortKeyDirty = dirtyFlags[11];
		mStatusDirty = dirtyFlags[12];
		mResultDirty = dirtyFlags[13];
		mIsTipsDirty = dirtyFlags[14];
		mGroupKeyDirty = dirtyFlags[15];
		mProductSynonymDirty = dirtyFlags[16];
		mProductHasAccessoriesDirty = dirtyFlags[17];
		mProductHasComboOptionsDirty = dirtyFlags[18];
		mUserDirty = dirtyFlags[19];
	}
	
	@Override
	public int describeContents() {
	    return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(getId());
		dest.writeLong(mBasketId);
		dest.writeString(mBasketItemJeid);
		dest.writeLong(mRestaurantJeid);
		dest.writeLong(mMenuJeid);
		dest.writeLong(mCategoryJeid);
		dest.writeLong(mProductJeid);
		dest.writeInt(mIsComplex ? 1 : 0);
		dest.writeString(mProductName);
		dest.writeString(mDescription);
		dest.writeDouble(mProductPrice);
		dest.writeDouble(mTotalPrice);
		dest.writeString(mMenuSortKey);
		dest.writeLong(mStatus);
		dest.writeLong(mResult);
		dest.writeInt(mIsTips ? 1 : 0);
		dest.writeString(mGroupKey);
		dest.writeString(mProductSynonym);
		dest.writeInt(mProductHasAccessories ? 1 : 0);
		dest.writeInt(mProductHasComboOptions ? 1 : 0);
		dest.writeString(mUser);
		dest.writeBooleanArray(new boolean[] {
			mBasketIdDirty,
			mBasketItemJeidDirty,
			mRestaurantJeidDirty,
			mMenuJeidDirty,
			mCategoryJeidDirty,
			mProductJeidDirty,
			mIsComplexDirty,
			mProductNameDirty,
			mDescriptionDirty,
			mProductPriceDirty,
			mTotalPriceDirty,
			mMenuSortKeyDirty,
			mStatusDirty,
			mResultDirty,
			mIsTipsDirty,
			mGroupKeyDirty,
			mProductSynonymDirty,
			mProductHasAccessoriesDirty,
			mProductHasComboOptionsDirty,
			mUserDirty
		});
	}
	
	@Override
	protected AbstractValuesBuilder createBuilder() {
		Builder builder = BasketItems.newBuilder();

		if(mBasketIdDirty) {
			builder.setBasketId(mBasketId);
		}
		if(mBasketItemJeidDirty) {
			builder.setBasketItemJeid(mBasketItemJeid);
		}
		if(mRestaurantJeidDirty) {
			builder.setRestaurantJeid(mRestaurantJeid);
		}
		if(mMenuJeidDirty) {
			builder.setMenuJeid(mMenuJeid);
		}
		if(mCategoryJeidDirty) {
			builder.setCategoryJeid(mCategoryJeid);
		}
		if(mProductJeidDirty) {
			builder.setProductJeid(mProductJeid);
		}
		if(mIsComplexDirty) {
			builder.setIsComplex(mIsComplex);
		}
		if(mProductNameDirty) {
			builder.setProductName(mProductName);
		}
		if(mDescriptionDirty) {
			builder.setDescription(mDescription);
		}
		if(mProductPriceDirty) {
			builder.setProductPrice(mProductPrice);
		}
		if(mTotalPriceDirty) {
			builder.setTotalPrice(mTotalPrice);
		}
		if(mMenuSortKeyDirty) {
			builder.setMenuSortKey(mMenuSortKey);
		}
		if(mStatusDirty) {
			builder.setStatus(mStatus);
		}
		if(mResultDirty) {
			builder.setResult(mResult);
		}
		if(mIsTipsDirty) {
			builder.setIsTips(mIsTips);
		}
		if(mGroupKeyDirty) {
			builder.setGroupKey(mGroupKey);
		}
		if(mProductSynonymDirty) {
			builder.setProductSynonym(mProductSynonym);
		}
		if(mProductHasAccessoriesDirty) {
			builder.setProductHasAccessories(mProductHasAccessories);
		}
		if(mProductHasComboOptionsDirty) {
			builder.setProductHasComboOptions(mProductHasComboOptions);
		}
		if(mUserDirty) {
			builder.setUser(mUser);
		}
		
		return builder;
	}
	
    @Override
	public void makeDirty(boolean dirty){
		mBasketIdDirty = dirty;
		mBasketItemJeidDirty = dirty;
		mRestaurantJeidDirty = dirty;
		mMenuJeidDirty = dirty;
		mCategoryJeidDirty = dirty;
		mProductJeidDirty = dirty;
		mIsComplexDirty = dirty;
		mProductNameDirty = dirty;
		mDescriptionDirty = dirty;
		mProductPriceDirty = dirty;
		mTotalPriceDirty = dirty;
		mMenuSortKeyDirty = dirty;
		mStatusDirty = dirty;
		mResultDirty = dirty;
		mIsTipsDirty = dirty;
		mGroupKeyDirty = dirty;
		mProductSynonymDirty = dirty;
		mProductHasAccessoriesDirty = dirty;
		mProductHasComboOptionsDirty = dirty;
		mUserDirty = dirty;
	}

	@Override
	protected void setPropertiesFromCursor(Cursor c) {
		setId(c.getLong(Indices._ID));
		setBasketId(c.getLong(Indices.BASKET_ID));
		setBasketItemJeid(c.getString(Indices.BASKET_ITEM_JEID));
		setRestaurantJeid(c.getLong(Indices.RESTAURANT_JEID));
		setMenuJeid(c.getLong(Indices.MENU_JEID));
		setCategoryJeid(c.getLong(Indices.CATEGORY_JEID));
		setProductJeid(c.getLong(Indices.PRODUCT_JEID));
		setIsComplex(c.getInt(Indices.IS_COMPLEX) > 0);
		setProductName(c.getString(Indices.PRODUCT_NAME));
		setDescription(c.getString(Indices.DESCRIPTION));
		setProductPrice(c.getDouble(Indices.PRODUCT_PRICE));
		setTotalPrice(c.getDouble(Indices.TOTAL_PRICE));
		setMenuSortKey(c.getString(Indices.MENU_SORT_KEY));
		setStatus(c.getLong(Indices.STATUS));
		setResult(c.getLong(Indices.RESULT));
		setIsTips(c.getInt(Indices.IS_TIPS) > 0);
		setGroupKey(c.getString(Indices.GROUP_KEY));
		setProductSynonym(c.getString(Indices.PRODUCT_SYNONYM));
		setProductHasAccessories(c.getInt(Indices.PRODUCT_HAS_ACCESSORIES) > 0);
		setProductHasComboOptions(c.getInt(Indices.PRODUCT_HAS_COMBO_OPTIONS) > 0);
		setUser(c.getString(Indices.USER));
	}
	
	public static BasketItemsRecord fromCursor(Cursor c) {
	    BasketItemsRecord item = new BasketItemsRecord();
	    
		item.setPropertiesFromCursor(c);
		
		item.makeDirty(false);
		
	    return item;
	}
	
	public static BasketItemsRecord fromBundle(Bundle bundle, String key) {
		bundle.setClassLoader(BasketItemsRecord.class.getClassLoader());
		return bundle.getParcelable(key);
	}
	
	public static BasketItemsRecord get(long id) {
	    Cursor c = null;
	    
	    ContentResolver resolver = Mechanoid.getContentResolver();
	    
	    try {
	        c = resolver.query(BasketItems.CONTENT_URI.buildUpon()
			.appendPath(String.valueOf(id)).build(), PROJECTION, null, null, null);
	        
	        if(!c.moveToFirst()) {
	            return null;
	        }
	        
	        return fromCursor(c);
	    } finally {
	        Closeables.closeSilently(c);
	    }
	}
}
