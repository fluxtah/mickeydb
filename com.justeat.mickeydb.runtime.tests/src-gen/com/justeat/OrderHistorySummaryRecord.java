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
import com.justeat.TakeawaysDBContract.OrderHistorySummary;
import com.justeat.TakeawaysDBContract.OrderHistorySummary.Builder;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.db.ActiveRecord;
import com.robotoworks.mechanoid.db.ActiveRecordFactory;
import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.db.AbstractValuesBuilder;

public class OrderHistorySummaryRecord extends ActiveRecord implements Parcelable {

	private static ActiveRecordFactory<OrderHistorySummaryRecord> sFactory = new ActiveRecordFactory<OrderHistorySummaryRecord>() {
		@Override
		public OrderHistorySummaryRecord create(Cursor c) {
			return fromCursor(c);
		}
		
		@Override
		public String[] getProjection() {
			return PROJECTION;
		}

        @Override
                    public Uri getContentUri() {
                        return OrderHistorySummary.CONTENT_URI;
                    }
                };

    			public static ActiveRecordFactory<OrderHistorySummaryRecord> getFactory() {
		return sFactory;
	}

    public static final Parcelable.Creator<OrderHistorySummaryRecord> CREATOR 
    	= new Parcelable.Creator<OrderHistorySummaryRecord>() {
        public OrderHistorySummaryRecord createFromParcel(Parcel in) {
            return new OrderHistorySummaryRecord(in);
        }

        public OrderHistorySummaryRecord[] newArray(int size) {
            return new OrderHistorySummaryRecord[size];
        }
    };
    
    public static String[] PROJECTION = {
    	OrderHistorySummary._ID,
    	OrderHistorySummary.BASKET_JEID,
    	OrderHistorySummary.PRODUCT_JEID,
    	OrderHistorySummary.ITEM_NAME,
    	OrderHistorySummary.UNIT_PRICE,
    	OrderHistorySummary.QUANTITY,
    	OrderHistorySummary.SORT_KEY,
    	OrderHistorySummary.DESCRIPTOR
    };
    
    public interface Indices {
    	int _ID = 0;
    	int BASKET_JEID = 1;
    	int PRODUCT_JEID = 2;
    	int ITEM_NAME = 3;
    	int UNIT_PRICE = 4;
    	int QUANTITY = 5;
    	int SORT_KEY = 6;
    	int DESCRIPTOR = 7;
    }
    
    private String mBasketJeid;
    private boolean mBasketJeidDirty;
    private String mProductJeid;
    private boolean mProductJeidDirty;
    private String mItemName;
    private boolean mItemNameDirty;
    private double mUnitPrice;
    private boolean mUnitPriceDirty;
    private long mQuantity;
    private boolean mQuantityDirty;
    private String mSortKey;
    private boolean mSortKeyDirty;
    private String mDescriptor;
    private boolean mDescriptorDirty;
    
    @Override
    protected String[] _getProjection() {
    	return PROJECTION;
    }
    
    public void setBasketJeid(String basketJeid) {
    	mBasketJeid = basketJeid;
    	mBasketJeidDirty = true;
    }
    
    public String getBasketJeid() {
    	return mBasketJeid;
    }
    public void setProductJeid(String productJeid) {
    	mProductJeid = productJeid;
    	mProductJeidDirty = true;
    }
    
    public String getProductJeid() {
    	return mProductJeid;
    }
    public void setItemName(String itemName) {
    	mItemName = itemName;
    	mItemNameDirty = true;
    }
    
    public String getItemName() {
    	return mItemName;
    }
    public void setUnitPrice(double unitPrice) {
    	mUnitPrice = unitPrice;
    	mUnitPriceDirty = true;
    }
    
    public double getUnitPrice() {
    	return mUnitPrice;
    }
    public void setQuantity(long quantity) {
    	mQuantity = quantity;
    	mQuantityDirty = true;
    }
    
    public long getQuantity() {
    	return mQuantity;
    }
    public void setSortKey(String sortKey) {
    	mSortKey = sortKey;
    	mSortKeyDirty = true;
    }
    
    public String getSortKey() {
    	return mSortKey;
    }
    public void setDescriptor(String descriptor) {
    	mDescriptor = descriptor;
    	mDescriptorDirty = true;
    }
    
    public String getDescriptor() {
    	return mDescriptor;
    }
    
    public OrderHistorySummaryRecord() {
    	super(OrderHistorySummary.CONTENT_URI);
	}
	
	private OrderHistorySummaryRecord(Parcel in) {
    	super(OrderHistorySummary.CONTENT_URI);
    	
		setId(in.readLong());
		
		mBasketJeid = in.readString();
		mProductJeid = in.readString();
		mItemName = in.readString();
		mUnitPrice = in.readDouble();
		mQuantity = in.readLong();
		mSortKey = in.readString();
		mDescriptor = in.readString();
		
		boolean[] dirtyFlags = new boolean[7];
		in.readBooleanArray(dirtyFlags);
		mBasketJeidDirty = dirtyFlags[0];
		mProductJeidDirty = dirtyFlags[1];
		mItemNameDirty = dirtyFlags[2];
		mUnitPriceDirty = dirtyFlags[3];
		mQuantityDirty = dirtyFlags[4];
		mSortKeyDirty = dirtyFlags[5];
		mDescriptorDirty = dirtyFlags[6];
	}
	
	@Override
	public int describeContents() {
	    return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(getId());
		dest.writeString(mBasketJeid);
		dest.writeString(mProductJeid);
		dest.writeString(mItemName);
		dest.writeDouble(mUnitPrice);
		dest.writeLong(mQuantity);
		dest.writeString(mSortKey);
		dest.writeString(mDescriptor);
		dest.writeBooleanArray(new boolean[] {
			mBasketJeidDirty,
			mProductJeidDirty,
			mItemNameDirty,
			mUnitPriceDirty,
			mQuantityDirty,
			mSortKeyDirty,
			mDescriptorDirty
		});
	}
	
	@Override
	protected AbstractValuesBuilder createBuilder() {
		Builder builder = OrderHistorySummary.newBuilder();

		if(mBasketJeidDirty) {
			builder.setBasketJeid(mBasketJeid);
		}
		if(mProductJeidDirty) {
			builder.setProductJeid(mProductJeid);
		}
		if(mItemNameDirty) {
			builder.setItemName(mItemName);
		}
		if(mUnitPriceDirty) {
			builder.setUnitPrice(mUnitPrice);
		}
		if(mQuantityDirty) {
			builder.setQuantity(mQuantity);
		}
		if(mSortKeyDirty) {
			builder.setSortKey(mSortKey);
		}
		if(mDescriptorDirty) {
			builder.setDescriptor(mDescriptor);
		}
		
		return builder;
	}
	
    @Override
	public void makeDirty(boolean dirty){
		mBasketJeidDirty = dirty;
		mProductJeidDirty = dirty;
		mItemNameDirty = dirty;
		mUnitPriceDirty = dirty;
		mQuantityDirty = dirty;
		mSortKeyDirty = dirty;
		mDescriptorDirty = dirty;
	}

	@Override
	protected void setPropertiesFromCursor(Cursor c) {
		setId(c.getLong(Indices._ID));
		setBasketJeid(c.getString(Indices.BASKET_JEID));
		setProductJeid(c.getString(Indices.PRODUCT_JEID));
		setItemName(c.getString(Indices.ITEM_NAME));
		setUnitPrice(c.getDouble(Indices.UNIT_PRICE));
		setQuantity(c.getLong(Indices.QUANTITY));
		setSortKey(c.getString(Indices.SORT_KEY));
		setDescriptor(c.getString(Indices.DESCRIPTOR));
	}
	
	public static OrderHistorySummaryRecord fromCursor(Cursor c) {
	    OrderHistorySummaryRecord item = new OrderHistorySummaryRecord();
	    
		item.setPropertiesFromCursor(c);
		
		item.makeDirty(false);
		
	    return item;
	}
	
	public static OrderHistorySummaryRecord fromBundle(Bundle bundle, String key) {
		bundle.setClassLoader(OrderHistorySummaryRecord.class.getClassLoader());
		return bundle.getParcelable(key);
	}
	
	public static OrderHistorySummaryRecord get(long id) {
	    Cursor c = null;
	    
	    ContentResolver resolver = Mechanoid.getContentResolver();
	    
	    try {
	        c = resolver.query(OrderHistorySummary.CONTENT_URI.buildUpon()
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
