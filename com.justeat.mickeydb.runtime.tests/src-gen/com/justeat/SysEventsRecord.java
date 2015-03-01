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
import com.justeat.TakeawaysDBContract.SysEvents;
import com.justeat.TakeawaysDBContract.SysEvents.Builder;
import com.robotoworks.mechanoid.util.Closeables;
import com.robotoworks.mechanoid.db.ActiveRecord;
import com.robotoworks.mechanoid.db.ActiveRecordFactory;
import com.robotoworks.mechanoid.Mechanoid;
import com.robotoworks.mechanoid.db.AbstractValuesBuilder;

public class SysEventsRecord extends ActiveRecord implements Parcelable {

	private static ActiveRecordFactory<SysEventsRecord> sFactory = new ActiveRecordFactory<SysEventsRecord>() {
		@Override
		public SysEventsRecord create(Cursor c) {
			return fromCursor(c);
		}
		
		@Override
		public String[] getProjection() {
			return PROJECTION;
		}

        @Override
                    public Uri getContentUri() {
                        return SysEvents.CONTENT_URI;
                    }
                };

    			public static ActiveRecordFactory<SysEventsRecord> getFactory() {
		return sFactory;
	}

    public static final Parcelable.Creator<SysEventsRecord> CREATOR 
    	= new Parcelable.Creator<SysEventsRecord>() {
        public SysEventsRecord createFromParcel(Parcel in) {
            return new SysEventsRecord(in);
        }

        public SysEventsRecord[] newArray(int size) {
            return new SysEventsRecord[size];
        }
    };
    
    public static String[] PROJECTION = {
    	SysEvents._ID,
    	SysEvents.SESSION_ID,
    	SysEvents.EVENT_TYPE,
    	SysEvents.CONTENT,
    	SysEvents.TIMESTAMP
    };
    
    public interface Indices {
    	int _ID = 0;
    	int SESSION_ID = 1;
    	int EVENT_TYPE = 2;
    	int CONTENT = 3;
    	int TIMESTAMP = 4;
    }
    
    private long mSessionId;
    private boolean mSessionIdDirty;
    private long mEventType;
    private boolean mEventTypeDirty;
    private String mContent;
    private boolean mContentDirty;
    private long mTimestamp;
    private boolean mTimestampDirty;
    
    @Override
    protected String[] _getProjection() {
    	return PROJECTION;
    }
    
    public void setSessionId(long sessionId) {
    	mSessionId = sessionId;
    	mSessionIdDirty = true;
    }
    
    public long getSessionId() {
    	return mSessionId;
    }
    
    public void setEventType(long eventType) {
    	mEventType = eventType;
    	mEventTypeDirty = true;
    }
    
    public long getEventType() {
    	return mEventType;
    }
    
    public void setContent(String content) {
    	mContent = content;
    	mContentDirty = true;
    }
    
    public String getContent() {
    	return mContent;
    }
    
    public void setTimestamp(long timestamp) {
    	mTimestamp = timestamp;
    	mTimestampDirty = true;
    }
    
    public long getTimestamp() {
    	return mTimestamp;
    }
    
    
    public SysEventsRecord() {
    	super(SysEvents.CONTENT_URI);
	}
	
	private SysEventsRecord(Parcel in) {
    	super(SysEvents.CONTENT_URI);
    	
		setId(in.readLong());
		
		mSessionId = in.readLong();
		mEventType = in.readLong();
		mContent = in.readString();
		mTimestamp = in.readLong();
		
		boolean[] dirtyFlags = new boolean[4];
		in.readBooleanArray(dirtyFlags);
		mSessionIdDirty = dirtyFlags[0];
		mEventTypeDirty = dirtyFlags[1];
		mContentDirty = dirtyFlags[2];
		mTimestampDirty = dirtyFlags[3];
	}
	
	@Override
	public int describeContents() {
	    return 0;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(getId());
		dest.writeLong(mSessionId);
		dest.writeLong(mEventType);
		dest.writeString(mContent);
		dest.writeLong(mTimestamp);
		dest.writeBooleanArray(new boolean[] {
			mSessionIdDirty,
			mEventTypeDirty,
			mContentDirty,
			mTimestampDirty
		});
	}
	
	@Override
	protected AbstractValuesBuilder createBuilder() {
		Builder builder = SysEvents.newBuilder();

		if(mSessionIdDirty) {
			builder.setSessionId(mSessionId);
		}
		if(mEventTypeDirty) {
			builder.setEventType(mEventType);
		}
		if(mContentDirty) {
			builder.setContent(mContent);
		}
		if(mTimestampDirty) {
			builder.setTimestamp(mTimestamp);
		}
		
		return builder;
	}
	
    @Override
	public void makeDirty(boolean dirty){
		mSessionIdDirty = dirty;
		mEventTypeDirty = dirty;
		mContentDirty = dirty;
		mTimestampDirty = dirty;
	}

	@Override
	protected void setPropertiesFromCursor(Cursor c) {
		setId(c.getLong(Indices._ID));
		setSessionId(c.getLong(Indices.SESSION_ID));
		setEventType(c.getLong(Indices.EVENT_TYPE));
		setContent(c.getString(Indices.CONTENT));
		setTimestamp(c.getLong(Indices.TIMESTAMP));
	}
	
	public static SysEventsRecord fromCursor(Cursor c) {
	    SysEventsRecord item = new SysEventsRecord();
	    
		item.setPropertiesFromCursor(c);
		
		item.makeDirty(false);
		
	    return item;
	}
	
	public static SysEventsRecord fromBundle(Bundle bundle, String key) {
		bundle.setClassLoader(SysEventsRecord.class.getClassLoader());
		return bundle.getParcelable(key);
	}
	
	public static SysEventsRecord get(long id) {
	    Cursor c = null;
	    
	    ContentResolver resolver = Mechanoid.getContentResolver();
	    
	    try {
	        c = resolver.query(SysEvents.CONTENT_URI.buildUpon()
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
