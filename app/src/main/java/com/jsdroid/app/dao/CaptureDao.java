package com.jsdroid.app.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.jsdroid.app.entity.Capture;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CAPTURE".
*/
public class CaptureDao extends AbstractDao<Capture, Long> {

    public static final String TABLENAME = "CAPTURE";

    /**
     * Properties of entity Capture.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Image = new Property(1, String.class, "image", false, "IMAGE");
        public final static Property Nodes = new Property(2, String.class, "nodes", false, "NODES");
        public final static Property SelectIndex = new Property(3, String.class, "selectIndex", false, "SELECT_INDEX");
        public final static Property Name = new Property(4, String.class, "name", false, "NAME");
    }


    public CaptureDao(DaoConfig config) {
        super(config);
    }
    
    public CaptureDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CAPTURE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"IMAGE\" TEXT," + // 1: image
                "\"NODES\" TEXT," + // 2: nodes
                "\"SELECT_INDEX\" TEXT," + // 3: selectIndex
                "\"NAME\" TEXT);"); // 4: name
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CAPTURE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Capture entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(2, image);
        }
 
        String nodes = entity.getNodes();
        if (nodes != null) {
            stmt.bindString(3, nodes);
        }
 
        String selectIndex = entity.getSelectIndex();
        if (selectIndex != null) {
            stmt.bindString(4, selectIndex);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Capture entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String image = entity.getImage();
        if (image != null) {
            stmt.bindString(2, image);
        }
 
        String nodes = entity.getNodes();
        if (nodes != null) {
            stmt.bindString(3, nodes);
        }
 
        String selectIndex = entity.getSelectIndex();
        if (selectIndex != null) {
            stmt.bindString(4, selectIndex);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(5, name);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Capture readEntity(Cursor cursor, int offset) {
        Capture entity = new Capture( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // image
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // nodes
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // selectIndex
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // name
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Capture entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setImage(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setNodes(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSelectIndex(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Capture entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Capture entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Capture entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}