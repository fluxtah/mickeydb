/**
 */
package com.justeat.mickeydb.mickeyLang.impl;

import com.justeat.mickeydb.mickeyLang.ColumnSource;
import com.justeat.mickeydb.mickeyLang.ContentUriQueryParam;
import com.justeat.mickeydb.mickeyLang.MickeyLangPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content Uri Query Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.ContentUriQueryParamImpl#isLike <em>Like</em>}</li>
 *   <li>{@link com.justeat.mickeydb.mickeyLang.impl.ContentUriQueryParamImpl#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentUriQueryParamImpl extends MinimalEObjectImpl.Container implements ContentUriQueryParam
{
  /**
   * The default value of the '{@link #isLike() <em>Like</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLike()
   * @generated
   * @ordered
   */
  protected static final boolean LIKE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLike() <em>Like</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLike()
   * @generated
   * @ordered
   */
  protected boolean like = LIKE_EDEFAULT;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected ColumnSource column;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContentUriQueryParamImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MickeyLangPackage.Literals.CONTENT_URI_QUERY_PARAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isLike()
  {
    return like;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLike(boolean newLike)
  {
    boolean oldLike = like;
    like = newLike;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CONTENT_URI_QUERY_PARAM__LIKE, oldLike, like));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSource getColumn()
  {
    if (column != null && column.eIsProxy())
    {
      InternalEObject oldColumn = (InternalEObject)column;
      column = (ColumnSource)eResolveProxy(oldColumn);
      if (column != oldColumn)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MickeyLangPackage.CONTENT_URI_QUERY_PARAM__COLUMN, oldColumn, column));
      }
    }
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColumnSource basicGetColumn()
  {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(ColumnSource newColumn)
  {
    ColumnSource oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MickeyLangPackage.CONTENT_URI_QUERY_PARAM__COLUMN, oldColumn, column));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__LIKE:
        return isLike();
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__COLUMN:
        if (resolve) return getColumn();
        return basicGetColumn();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__LIKE:
        setLike((Boolean)newValue);
        return;
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__COLUMN:
        setColumn((ColumnSource)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__LIKE:
        setLike(LIKE_EDEFAULT);
        return;
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__COLUMN:
        setColumn((ColumnSource)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__LIKE:
        return like != LIKE_EDEFAULT;
      case MickeyLangPackage.CONTENT_URI_QUERY_PARAM__COLUMN:
        return column != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (like: ");
    result.append(like);
    result.append(')');
    return result.toString();
  }

} //ContentUriQueryParamImpl
